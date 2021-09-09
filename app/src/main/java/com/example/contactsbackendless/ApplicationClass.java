package com.example.contactsbackendless;

import android.app.Application;
import com.backendless.Backendless;

public class ApplicationClass extends Application {

    public static final String APPLICATION_ID = "8E777D82-A4A2-417C-AA3D-C5DE50838A0E";//got from https://develop.backendless.com/TestApp?period=month
    public static final String API_KEY = "F4320A37-A8F6-48FE-A841-E2DD8B2BD07A";
    public static final String SERVER_URL = "http://api.backendless.com";
    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(),APPLICATION_ID,API_KEY);


    }
}
