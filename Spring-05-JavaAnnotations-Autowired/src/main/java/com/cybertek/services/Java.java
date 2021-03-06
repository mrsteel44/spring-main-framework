package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    //Field injection
    @Autowired
    private ExtraSessions extraSessions;
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
        System.out.println("Weekly Java lessons hour is :"+  (31 + extraSessions.getHours()));
    }
}
