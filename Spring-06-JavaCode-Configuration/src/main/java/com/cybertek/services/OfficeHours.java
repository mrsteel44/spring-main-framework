package com.cybertek.services;

import com.cybertek.interfaces.ExstraSessions;

public class OfficeHours implements ExstraSessions {
    @Override
    public int getHours() {
        return 4;
    }
}
