package com.exceptions.exception.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exceptions.exception.Repository.repo;
import com.exceptions.exception.exceptions.ErrorMessage;
import com.exceptions.exception.models.product;

@RestController
public class Controller {


    @Autowired
    public repo customre;

    @GetMapping("/id/{value}")
    public ResponseEntity<product> getvalue(@PathVariable Integer value) throws ErrorMessage{
        if(value==9){
            Date date=new Date();
            throw new ErrorMessage(505, date, "Data Pass","");
        }
return ResponseEntity.of(customre.findById(value));

    }
}
