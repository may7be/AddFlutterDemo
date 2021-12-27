package com.zhao.addflutterdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.tv_hi).setOnClickListener(View.OnClickListener {
            startActivity(
                FlutterActivity.createDefaultIntent(this)
            )
        })

    }
}
