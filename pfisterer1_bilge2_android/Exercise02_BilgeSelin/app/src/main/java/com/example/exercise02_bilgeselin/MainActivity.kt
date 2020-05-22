package com.example.exercise02_bilgeselin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // val for saving key
    private val key = "number"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // log information to check life circles
        Log.i("TAG", "onCreateWasCalled()")

        // app starts and creates random number
        if(savedInstanceState == null){
            val number = Random.nextInt()
            textView.text = "$number"

        // if phone is turned it saves number and doesnt create a new one
        } else {
            textView.text = "${savedInstanceState.getInt(key)}"
        }
    }

    override fun onStart() {
        super.onStart()
        // log information to check life circles
        Log.i("TAG", "onStartWasCalled()")
    }

    override fun onResume() {
        super.onResume()
        // log information to check life circles
        Log.i("TAG", "onResumeWasCalled()")
    }

    override fun onPause() {
        super.onPause()
        // log information to check life circles
        Log.i("TAG", "onPauseWasCalled()")
    }

    override fun onStop() {
        super.onStop()
        // log information to check life circles
        Log.i("TAG", "onStopWasCalled()")
    }

    override fun onDestroy() {
        super.onDestroy()
        // log information to check life circles
        Log.i("TAG", "onDestroyWasCalled()")

    }

    override fun onRestart() {
        super.onRestart()
        // log information to check life circles
        Log.i("TAG", "onRestartWasCalled()")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        // saves the number to our key variable in order to be able
        // to recover it on next onCreate(...) call
        outState.putInt(key, textView.text.toString().toInt())
    }


    fun thisIsANewMethod() {

    }
}
