package com.tutorialspoint;

/**
 * Created by ulmasov_im on 16.05.2016.
 */

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}