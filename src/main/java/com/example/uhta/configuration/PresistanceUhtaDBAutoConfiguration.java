package com.example.uhta.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@PropertySources({@PropertySource(value ="classpath:persistence-multiple-db-boot1.properties" )})
@EnableJpaRepositories(
        basePackages = "com.example.uhta.repos1",
        entityManagerFactoryRef = "uhtaDbEntityManager",
        transactionManagerRef = "uhtaDbTransactionManager")
public class PresistanceUhtaDBAutoConfiguration {
    @Autowired
    private Environment env;

    @Bean
    public LocalContainerEntityManagerFactoryBean uhtaDbEntityManager() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(uhtaDbDataSource());
        em.setPackagesToScan(
                new String[] { "com.example.uhta.entity.uhtaDb" });

        HibernateJpaVendorAdapter vendorAdapter
                = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto",
                env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect",
                env.getProperty("hibernate.dialect")
        );
        properties.put("hibernate.type.preferred_instant_jdbc_type","TIMESTAMP");
        em.setJpaPropertyMap(properties);

        return em;
    }


    @Bean
    public DataSource uhtaDbDataSource() {

        DriverManagerDataSource dataSource
                = new DriverManagerDataSource();
        dataSource.setDriverClassName(
                env.getProperty("spring.datasource.driverClassName"));
        dataSource.setUrl(env.getProperty("uhtaDb.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));
        return dataSource;
    }


    @Bean
    public PlatformTransactionManager uhtaDbTransactionManager() {

        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                uhtaDbEntityManager().getObject());
        return transactionManager;
    }
}