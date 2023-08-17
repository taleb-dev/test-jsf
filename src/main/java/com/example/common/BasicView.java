package com.example.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "dtBasicView")
@ViewScoped
public class BasicView implements Serializable {

    private User newUser = new User();
    public List<User> getUsers() {
        return UserService.getUsers();
    }

    public void deleteUser(User user) {
        System.out.println("deleteUser: " + user);
        UserService.remove(user);
    }

    public void addUser() {
        System.out.println("addUser: " + newUser);
        UserService.add(newUser);
    }

    public User getNewUser() {
        return newUser;
    }

    public void setNewUser(User newUser) {
        this.newUser = newUser;
    }
}
