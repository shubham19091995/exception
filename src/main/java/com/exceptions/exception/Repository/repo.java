package com.exceptions.exception.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.exceptions.exception.models.product;
@Component
public interface repo extends JpaRepository<product,Integer> {
}
