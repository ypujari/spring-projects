package com.spring.samples.brokers;

import com.spring.samples.domain.User;
import com.spring.samples.factories.UserFactory;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class UserBroker {

    public Collection<User> getAllUsers(){
        return UserFactory.getAllUsers();
    }
}
