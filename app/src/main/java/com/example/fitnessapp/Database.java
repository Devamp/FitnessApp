package com.example.fitnessapp;

import android.provider.ContactsContract;

import java.util.Hashtable;

public class Database {

    Hashtable database;
    String username;
    int exerciseID;


    public Database(String user, int exerciseID){
        this.username = user;
        this.exerciseID = exerciseID;
    }


}
