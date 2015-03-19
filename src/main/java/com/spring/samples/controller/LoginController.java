package com.spring.samples.controller;

import com.spring.samples.view.beans.UserBean;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
public class LoginController {

    @RequestMapping(value="/login", method= RequestMethod.GET)
     public ModelAndView showLoginPage(){
        UserBean userBean = new UserBean();
        userBean.userName = "user";
        return new ModelAndView("login", new ModelMap("user", userBean));
    }

    @RequestMapping(value="/loginSuccess", method=RequestMethod.GET)
    public ModelAndView loginSuccess(){
        UserBean userBean = new UserBean();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(!(authentication instanceof AnonymousAuthenticationToken)){
            userBean.isAuthenticated = authentication.isAuthenticated();
            UserDetails principal = (UserDetails)authentication.getPrincipal();
            userBean.userName = principal.getUsername();
            Collection<? extends GrantedAuthority> authorities = principal.getAuthorities();
            for (GrantedAuthority authority : authorities){
                userBean.userRoles.add(authority.getAuthority());
            }
        }
        return new ModelAndView("login", new ModelMap("user", userBean));
    }
}
