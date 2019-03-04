package org.dennis.newsmedia

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log.d
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val stories = mutableListOf<Story>()
        for (i in 1..30){
            stories.add(Story("Breaking news here!","story text realy long....text","Daniel Malone"))

        }
        storiesRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = StoriesAdapter(stories)
        }


        val sharedPrefs = getSharedPreferences("production", Context.MODE_PRIVATE)
        val isSignedIn = sharedPrefs.getBoolean("is_signed_in", false)
        d("daniel", "is user signed in? $isSignedIn")
        if(!isSignedIn){
            d("daniel", "going to login screen")
            startActivity(Intent(this, LoginActivity::class.java))
        }else{
            d("daniel", "user is signed in, display news")
        }

    }
}
