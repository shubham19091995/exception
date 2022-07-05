package com.exceptions.exception.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.exceptions.exception.models.CustomUser;
@Component
public interface userRepo extends JpaRepository<CustomUser,Integer> {
    
}
