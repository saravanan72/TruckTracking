package com.vamosys.trucktracking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (findViewById<TextView>(R.id.truck_pickup_location)).setOnClickListener({
            startActivity(Intent(MainActivity@this, AddPickupLocationActivity::class.java))
        })

        (findViewById<TextView>(R.id.loading_point_advance_view)).setOnClickListener({
            startActivity(Intent(MainActivity@this, AdvancedLoadingPointActivity::class.java))
        })

        val spinner = findViewById<Spinner>(R.id.truck_duration_spinner)
        var spinnerAdapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(MainActivity@this, R.array.duration, android.R.layout.simple_spinner_item)
        spinner.adapter = spinnerAdapter

    }
}