package com.qa.main;

public final class SingletonClass {
    private static SingletonClass INSTANCE;

    private String info = "Default information";

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        // this is our static creation method
        // makes the singular instance of the class

        if (INSTANCE == null) {
            INSTANCE = new SingletonClass();
        }
        return INSTANCE;
    }

    public static void setInstance(SingletonClass instance) {
        INSTANCE = instance;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
