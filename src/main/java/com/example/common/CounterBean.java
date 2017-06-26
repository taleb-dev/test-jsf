package com.example.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class CounterBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int name) {
        this.count = name;
    }
}
