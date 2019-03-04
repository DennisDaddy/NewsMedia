package org.dennis.newsmedia

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        signInButton.setOnClickListener {

            if (userPassword.text.toString() == "secret") {
                d("daniel", "password correct")

                val sharedPrefs = getSharedPreferences("production", Context.MODE_PRIVATE)
                with(sharedPrefs.edit()){
                    putBoolean("is_signed_in", true)
                    commit()
                }
                startActivity(Intent(this, MainActivity::class.java))


            } else {
                d("daniel", "password incorrect")
            }
        }
    }
}