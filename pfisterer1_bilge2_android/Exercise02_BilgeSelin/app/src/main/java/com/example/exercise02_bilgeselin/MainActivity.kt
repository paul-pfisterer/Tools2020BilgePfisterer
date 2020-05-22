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
        Log.i("TAG", "onCreateisUsed")

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
        Log.i("TAG", "onStartisUsed")
    }

    override fun onResume() {
        super.onResume()
        // log information to check life circles
        Log.i("TAG", "onResumeisUsed")
    }

    override fun onPause() {
        super.onPause()
        // log information to check life circles
        Log.i("TAG", "onPauseisUsed")
    }

    override fun onStop() {
        super.onStop()
        // log information to check life circles
        Log.i("TAG", "onStopisUsed")
    }

    override fun onDestroy() {
        super.onDestroy()
        // log information to check life circles
        Log.i("TAG", "onDestroyisUsed")

    }

    override fun onRestart() {
        super.onRestart()
        // log information to check life circles
        Log.i("TAG", "onRestartisUsed")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        // saves the number to our key variable in order to be able
        // to recover it on next onCreate(...) call
        outState.putInt(key, textView.text.toString().toInt())
    }


    fun thisIsANewMethod() {
        //2 bearbeitungsschritt
        // This is my ned Code line

        Log.i("test", "Github message")
    }
}
