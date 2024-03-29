package com.sujanmaharjan008.notification.model;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;

public class Channel {
    Context context;
    public final static String CHANNEL_1 = "Channel_1";
    public final static String CHANNEL_2 = "Channel_2";

    public Channel(Context context) {
        this.context = context;
    }

    public void createChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel1 = new NotificationChannel(CHANNEL_1, "Channel_1", NotificationManager.IMPORTANCE_HIGH);
            channel1.setDescription("This is channel 1");
            NotificationChannel channel2 = new NotificationChannel(CHANNEL_2, "Channel_2", NotificationManager.IMPORTANCE_LOW);
            channel2.setDescription("This is channel 2");

            NotificationManager manager = context.getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel1);
            manager.createNotificationChannel(channel2);
        }
    }
}
