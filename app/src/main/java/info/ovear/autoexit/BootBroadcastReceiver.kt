package info.ovear.autoexit

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

/**
 * 开机自启动
 * Created by Heretic on 2018/2/3.
 */
class BootBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.i("autoexit", "Received boot completed broadcast")
        val startActivityIntent = Intent(context, MainActivity::class.java)
        startActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivityIntent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT)
        context.startActivity(startActivityIntent)
    }
}
