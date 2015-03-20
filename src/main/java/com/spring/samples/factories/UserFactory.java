package com.spring.samples.factories;

import com.spring.samples.domain.User;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;

@Component
public class UserFactory {
    private static Map<String, User> usersMap = newHashMap();

    public static Collection<User> getAllUsers(){
        usersMap.put("user", getUser("user", "user@test.mail.com"));
        usersMap.put("user1", getUser("user1", "user1@test.mail.com"));
        usersMap.put("user2", getUser("user2", "user2@test.mail.com"));
        return usersMap.values();
    }

    private static User getUser(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        return user;
    }
}
