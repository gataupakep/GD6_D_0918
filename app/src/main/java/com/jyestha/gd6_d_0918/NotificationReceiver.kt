package com.jyestha.gd6_d_0918

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class NotificationReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent) {
        val message = intent.getStringExtra("ToastMessage")
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}