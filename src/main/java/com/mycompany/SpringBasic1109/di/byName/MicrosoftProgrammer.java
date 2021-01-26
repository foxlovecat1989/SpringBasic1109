package com.mycompany.springbasic1109.di.byname;

public class MicrosoftProgrammer {
    private String name;
    private Language vbcd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getVbcd() {
        return vbcd;
    }

    public void setVbcd(Language vbcd) {
        this.vbcd = vbcd;
    }

    @Override
    public String toString() {
        return "MicrosoftProgrammer{" + "name=" + name + ", vbcd=" + vbcd + '}';
    }
    
}
