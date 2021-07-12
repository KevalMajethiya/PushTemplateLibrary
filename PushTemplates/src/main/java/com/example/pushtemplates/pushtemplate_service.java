package com.example.pushtemplates;
import android.app.Service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.pushtemplates.TemplateRenderer;
import com.clevertap.pushtemplates.Utils;


public class pushtemplate_service extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        TemplateRenderer.setDebugLevel(3);
        Context context = getApplicationContext();
        Bundle bundle = intent.getExtras();


        if (Utils.isForPushTemplates(bundle)) {
            TemplateRenderer.createNotification(context, bundle);
        }

        else {
            CleverTapAPI.createNotification(context, bundle);
        }		return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }

}
