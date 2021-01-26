package com.mycompany.springbasic1109.di.byname;

public class OracleProgrammer {
    private String name;
    private Language javabc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getJavabc() {
        return javabc;
    }

    public void setJavabc(Language javabc) {
        this.javabc = javabc;
    }

    @Override
    public String toString() {
        return "OracleProgrammer{" + "name=" + name + ", javabc=" + javabc + '}';
    }
    
}
