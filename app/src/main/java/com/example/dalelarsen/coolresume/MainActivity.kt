package com.example.dalelarsen.coolresume

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var workHistory = findViewById<Button>(R.id.work_history_button)
        workHistory.setOnClickListener {
            var workHistoryIntent = Intent(getApplicationContext(), WorkHistoryActivity::class.java)
            startActivity(workHistoryIntent)
        }

        var callButton = findViewById<Button>(R.id.call_button)
        callButton.setOnClickListener {
            var callIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:8596536345"))
            startActivity(callIntent)
        }

        var emailButton = findViewById<Button>(R.id.email_button)
        emailButton.setOnClickListener {
            var emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setType("plain/text")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, "dalerlarsen@gmail.com")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Nice Resume")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "I really enjoyed your resume....")
            startActivity(emailIntent)
        }

    }
}
