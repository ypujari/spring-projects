package com.spring.samples.view.beans;

import java.util.ArrayList;
import java.util.List;

public class UserBean {
    public String userName;
    public List<String> userRoles = new ArrayList<String>();
    public boolean isAuthenticated;
}
