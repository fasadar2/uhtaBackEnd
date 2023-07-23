package com.example.uhta.SubRepos;

import com.example.uhta.entity.uhtaDb.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserById(Integer id);
}