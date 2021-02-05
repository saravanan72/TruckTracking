package com.vamosys.trucktracking

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.widget.AppCompatSpinner
import androidx.appcompat.widget.Toolbar
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById<Toolbar>(R.id.create_plan_toolbar)
        for (i in 0..toolbar.childCount){
            val lview = toolbar.getChildAt(0)
            if(lview is TextView){
                // throws "java.lang.RuntimeException: Font asset not found font/oppins_semi_bold.ttf"
                //lview.setTypeface(Typeface.createFromAsset(assets, "font/oppins_semi_bold.ttf"))
                // So I try this approach
                lview.setTypeface(ResourcesCompat.getFont(this, R.font.oppins_semi_bold))
            }
        }


        (findViewById<TextView>(R.id.truck_pickup_location)).setOnClickListener({
            startActivity(Intent(MainActivity@this, AddPickupLocationActivity::class.java))
        })

        (findViewById<TextView>(R.id.loading_point_advance_view)).setOnClickListener({
            startActivity(Intent(MainActivity@this, AdvancedLoadingPointActivity::class.java))
        })

        (findViewById<TextView>(R.id.unloading_point_advance_view)).setOnClickListener({
            startActivity(Intent(MainActivity@this, AdvancedLoadingPointActivity::class.java))
        })

        /*val spinner = findViewById<AppCompatSpinner>(R.id.truck_duration_spinner)
        var spinnerAdapter: ArrayAdapter<CharSequence> =
                ArrayAdapter.createFromResource(MainActivity@this,
                        R.array.duration,
                        android.R.layout.simple_spinner_item)
        spinner.adapter = spinnerAdapter*/

    }
}