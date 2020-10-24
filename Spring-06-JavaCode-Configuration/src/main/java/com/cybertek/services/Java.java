package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExstraSessions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
public class Java implements Course {
    private ExstraSessions exstraSessions;

    public Java(ExstraSessions exstraSessions) {
        this.exstraSessions = exstraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Java lessons hour is :" + (30 + exstraSessions.getHours()));
    }

    @Value("JD1")
    private String batch;

    @Value("${instructor}")
    private String instructor;

    @Value("${days}")
    private String[] days;

    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
