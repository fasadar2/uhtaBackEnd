package com.example.uhta.repos1;

import com.example.uhta.entity.uhtaDb.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttributeRepository extends JpaRepository<Attribute, Integer> {
    @Query("select a.id,a.title,a.description from Attribute as a ")
    List<Attribute> getAttributes();
}