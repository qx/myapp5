package com.example.myapp5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import org.apache.commons.lang3.time.FastDateFormat;

import java.util.Date;

/**
 * Created by Administrator on 2014/5/15.
 */
public class RepeatingAlarm extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "repeating_received", Toast.LENGTH_SHORT)
                .show();
        System.out.println("****repeat");
        MyData.getInstance().stringBuffer.append("repeat<" + getNow4AlarmCheck() + ">");
    }


    private static String getNow4AlarmCheck() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        return fdf.format(new Date());
    }
}