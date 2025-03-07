package com.example.lessson17

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    private lateinit var mainButton: Button
    private lateinit var imageButton: Button
    private lateinit var infoButton: Button
    private lateinit var createCounterButton: Button
    private lateinit var openMapButton: Button
    private lateinit var openWebButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        Log.d(TAG, "onCreate")

        mainButton = findViewById(R.id.counter_button)
        imageButton = findViewById(R.id.image_button)
        infoButton = findViewById(R.id.info_button)
        createCounterButton = findViewById(R.id.create_counter_button)
        openMapButton = findViewById(R.id.open_map)
        openWebButton = findViewById(R.id.open_web)
    }

    fun setIntent(view: View) {
        startNewActivity(
            when (view.id) {
                R.id.counter_button -> Intent(this, CounterActivity::class.java)
                R.id.info_button -> Intent(this, InfoActivity::class.java)
                R.id.image_button -> Intent(this, ImageActivity::class.java)
                R.id.create_counter_button -> Intent(this, CreateCounterActivity::class.java)
                R.id.open_map -> Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("geo:-0.45609946,-90.26607513")
                )
                R.id.open_web -> Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("http://developer.android.com")
                )
                else -> return
            }
        )
    }

    private fun startNewActivity(intent: Intent) {
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    companion object {
        private const val TAG = "MenuActivity lifecycle"
    }
}

