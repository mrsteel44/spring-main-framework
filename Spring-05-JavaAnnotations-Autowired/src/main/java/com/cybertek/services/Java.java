package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Autowired
    private OfficeHours officeHours;
/*
    //Constructor injection
    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
*/

    /*
    //Setter injection
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

     */

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Java lessons hour is :"+  (31 + officeHours.getHours()));
    }
}
