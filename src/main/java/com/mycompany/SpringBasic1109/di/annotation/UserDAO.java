package com.mycompany.springbasic1109.di.annotation;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value = "singleton")
public class UserDAO {
    @Autowired
    private Users users;
    
    public Users queryUsers() {
        return users;
    }
    public Boolean isExistByName(String name) {
        Boolean isExist = users.getNames()
                .stream()
                .anyMatch(e -> e.equalsIgnoreCase(name));
        return isExist;
    }
}
