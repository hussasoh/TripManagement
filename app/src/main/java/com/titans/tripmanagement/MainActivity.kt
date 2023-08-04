package com.titans.tripmanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lbl = this.findViewById<TextView>(R.id.lblName) as TextView
        lbl.setText("Sohaib Hussain")
    }
}