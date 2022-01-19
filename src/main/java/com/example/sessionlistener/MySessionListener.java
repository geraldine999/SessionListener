package com.example.sessionlistener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se)  {
        System.out.println("SESSION "+se.getSession().getId()+" CREATED");

    }


    public void sessionDestroyed(HttpSessionEvent se)  {
        System.out.println("SESSION "+se.getSession().getId()+" DESTROYED");

    }
}
