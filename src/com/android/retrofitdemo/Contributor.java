package com.android.retrofitdemo;

public class Contributor {

    String login;
    int contributions;

    @Override
    public String toString() {
        return login + ", " + contributions;
    }


}
