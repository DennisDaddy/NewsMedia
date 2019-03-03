package org.dennis.newsmedia

import android.content.Context
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log.d
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val sharedPrefs = getSharedPreferences("production", Context.MODE_PRIVATE)
        val isSignedIn = sharedPrefs.getBoolean("is_signed_in", false)
        d("daniel", "is user signed in? $isSignedIn")
        if(!isSignedIn){
            d("daniel", "going to login screen")
        }else{
            d("daniel", "user is signed in, display news")
        }

    }
}
