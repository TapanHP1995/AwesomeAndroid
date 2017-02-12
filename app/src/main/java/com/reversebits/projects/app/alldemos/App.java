package com.reversebits.projects.app.alldemos;

import android.app.Application;
import android.content.Context;


public class App extends Application {

    public App(){}


    private static Context context; //See the warning

    public static Context getContext() {
        return context;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        context = base;
        instance = this;
    }

    //Using singleton pattern to get application context
    private static App instance;

    public static App getInstance() {
        return instance;
    }


}

