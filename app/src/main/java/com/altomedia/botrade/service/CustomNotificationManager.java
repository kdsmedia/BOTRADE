package com.altomedia.botrade.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;

import com.altomedia.botrade.R;

/**
 * Created by macadmin on 12/19/17.
 */

public class CustomNotificationManager {
   public static int NOTIFICATION_ID_SERVICE_RUNNER = 10005;
   private static final String CHANNEL_ID = "trader_robo_service";
   Context context;
   CustomNotificationManager(Context context){
       this.context = context;
   }

    public void showNotification(int NOTIFICATION_ID) {
        NotificationCompat.Builder mBuilder =  buildNotification();
//        Intent intent = new Intent(this, MainActivity.class);
//        PendingIntent pi = PendingIntent.getActivity(this,0,intent,Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        mBuilder.setContentIntent(pi);
        NotificationManager mNotificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(NOTIFICATION_ID, mBuilder.build());
    }

    private NotificationCompat.Builder buildNotification() {
        createNotificationChannel();
        return new NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_stat_trader) // notification icon
                .setContentTitle("TraderRobo!") // title for notification
                .setContentText("Caution trading is automated, please do a manual check.") // message for notification
                .setPriority(Notification.PRIORITY_MAX)
                .setOngoing(true)
                .setAutoCancel(false); // clear notification after click
    }

    private void createNotificationChannel() {
        // Required on Android 8.0+ (API 26+): notifications must be posted to a channel.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationManager nm =
                    (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_ID,
                    "Trader service",
                    NotificationManager.IMPORTANCE_HIGH);
            channel.setDescription("Robot trader service status");
            nm.createNotificationChannel(channel);
        }
    }

}
