package com.example.parsegram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("M6L8Gn4mqSc0JWdWZlAKiZCMz66mjnVMohdWARcC")
                .clientKey("4Jt8LgX7Dd92sbPRiRch8yxUhwpbn5yUSYMOTyWL")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
