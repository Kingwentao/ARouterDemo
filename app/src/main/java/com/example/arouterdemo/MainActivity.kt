package com.example.arouterdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.alibaba.android.arouter.launcher.ARouter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ARouter.getInstance().inject(this)
        findViewById<TextView>(R.id.btnSkipLogin).setOnClickListener {
            Log.d("MainActivity", "onCreate: ")
            ARouter.getInstance().build("/app/login_activity").navigation()
        }
    }
}