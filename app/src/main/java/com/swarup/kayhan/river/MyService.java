package com.swarup.kayhan.river;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by Kayhan on 3/15/2015.
 */
public class MyService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
//        Toast.makeText(getApplicationContext(),"Testing Background",Toast.LENGTH_SHORT).show();

        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        int i=1;
        while(i>10){


                Toast.makeText(getApplicationContext(),"Testing Background",Toast.LENGTH_SHORT).show();
//                Thread.sleep(1000);
                i++;

        }
        Toast.makeText(getApplicationContext(),"Testing Background",Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        return Service.START_STICKY;
    }
}
