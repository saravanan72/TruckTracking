package com.vamosys.trucktracking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.core.content.res.ResourcesCompat

class AddPickupLocationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_pickup_location)
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        window.setBackgroundDrawableResource(android.R.color.transparent)
        title = "Pickup Location"

        val toolbar: Toolbar = findViewById<Toolbar>(R.id.add_pickup_location_toolbar)
        for (i in 0..toolbar.childCount){
            val lview = toolbar.getChildAt(0)
            if(lview is TextView){
                lview.setTypeface(ResourcesCompat.getFont(this, R.font.oppins_semi_bold))
            }
        }

        findViewById<TextView>(R.id.add_pickup_location_save_btn).setOnClickListener({
            Toast.makeText(AddPickupLocationActivity@this, "New Location Added Successfuly!", Toast.LENGTH_SHORT).show()
            finish()
        })
        findViewById<ImageView>(R.id.add_pickup_location_close_imgvw).setOnClickListener({
            finish()
        })
    }
}