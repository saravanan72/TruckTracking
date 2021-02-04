package com.vamosys.trucktracking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup

class AddPickupLocationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_pickup_location)
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        window.setBackgroundDrawableResource(android.R.color.transparent)
        title = "Pickup Location"
    }
}