package com.exceptions.exception.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exceptions.exception.Repository.userRepo;
import com.exceptions.exception.models.CustomUser;

@RestController
public class UserController {

    @Autowired
    private userRepo repo;


    @GetMapping("/id/{id}")
    public CustomUser getcustomuser(@PathVariable Integer id){
        return repo.findById(id).get();
    }

    @GetMapping("/allUsers")
    public List<CustomUser> allusers(){
        return repo.findAll();
    }

    @PutMapping("/deleteuser/{id}")
    public String delete(@PathVariable Integer id){

        repo.deleteById(id);
        if(repo.findById(id).isPresent()){
            return "Deletion failed";
        }else{
            return "Deleted";
        }
    }

    @PostMapping("/insertuser")
    public CustomUser insertUser(@RequestBody CustomUser userinsert){
        return repo.save(userinsert);
        
    }

    @PutMapping("/updateuser")
    public CustomUser updateuser(@RequestBody CustomUser userUpdate){
        if(repo.findById(userUpdate.getId()).isPresent()==false){
            return repo.save(userUpdate);
        }else{
            CustomUser one=repo.findById(userUpdate.getId()).get();
            if(userUpdate.getPassword()!=null && !userUpdate.getPassword().isEmpty()){ one.setPassword(userUpdate.getPassword());}
           
            if(userUpdate.getUsername()!=null && !userUpdate.getUsername().isEmpty()){  one.setRolename(userUpdate.getRolename());}
            if(userUpdate.getUsername()!=null && !userUpdate.getUsername().isEmpty()){ one.setUsername(userUpdate.getUsername());}
            return repo.save(one);

        }
    }

    @GetMapping("/logincheck/{username}/{password}")
    public boolean logincheck(@PathVariable String username , @PathVariable String password){
        CustomUser two=repo.findAll().stream().filter(c->c.getUsername().equalsIgnoreCase(username)).findFirst().get();

        if(two.getUsername().equalsIgnoreCase(username) && two.getPassword().equalsIgnoreCase(password)){
            return true;
        }else{
            return false;
    }
}
}
