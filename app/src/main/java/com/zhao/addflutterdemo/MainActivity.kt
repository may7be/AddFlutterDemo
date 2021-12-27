package com.zhao.addflutterdemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_jump).setOnClickListener(View.OnClickListener {
            startActivity(
//                FlutterActivity.createDefaultIntent(this)
                FlutterActivity.withCachedEngine(EngineId).build(this)
            )
        })

    }
}
