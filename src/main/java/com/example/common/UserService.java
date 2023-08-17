package com.example.common;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;


public class UserService {
    private static List<User> users = new ArrayList<>();

static  {
    users.add(new User("Taleb", 29));
    users.add(new User("Anhar", 27));

}
    public static List<User> getUsers() {
        return users;
    }

    public static void remove(User user) {
        users.remove(user);
    }

    public static void add(User newUser) {
        users.add(newUser);
    }
}
