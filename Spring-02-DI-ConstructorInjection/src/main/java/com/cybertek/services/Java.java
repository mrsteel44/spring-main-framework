package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

public class Java implements Course {

    //OfficeHours officeHours;
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }
//    @Override
//    public void getTeachingHours() {
//        System.out.println("Weekly Teaching Hours :"+ (20+officeHours.getHours()));
//    }



    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions){
        this.extraSessions = extraSessions;
    }

        public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours :"+ ( 20+ extraSessions.getHours()));
    }





}
