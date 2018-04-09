package com.example.admin.broadcastreceivers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyStaticReceiver extends BroadcastReceiver {

    public static final String TAG = "MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: ");

        switch (intent.getAction()) {
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                boolean status = intent.getBooleanExtra("state", false);

                Toast.makeText(context, "Airplane mode " + status, Toast.LENGTH_SHORT).show();

                break;
        }
    }
}
