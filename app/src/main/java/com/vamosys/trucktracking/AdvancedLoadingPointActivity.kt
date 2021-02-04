package com.vamosys.trucktracking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.vamosys.trucktracking.adapter.AdvanceLoadingAdapter
import com.vamosys.trucktracking.model.LoadingPoints
import com.vamosys.trucktracking.utils.Constants

class AdvancedLoadingPointActivity : AppCompatActivity() {
    lateinit var adapter: AdvanceLoadingAdapter
    var list: List<LoadingPoints> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advanced_loading_point)
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        window.setBackgroundDrawableResource(android.R.color.transparent)
        list = Constants.list
        Log.d("TAG", "onCreate: "+list.size)
        adapter = AdvanceLoadingAdapter(list, this)
        findViewById<RecyclerView>(R.id.loding_point_recyclerview).adapter = adapter


        var addNewLocBtn = findViewById<TextView>(R.id.add_new_location_btn)
        addNewLocBtn.setOnClickListener({
            if ((addNewLocBtn.text.toString()).equals("Save")){
                Toast.makeText(AdvancedLoadingPointActivity@this, "New Loading Point Added Successfuly!", Toast.LENGTH_SHORT).show()
                finish()
            }else{
                addNewLocBtn.text = "Save"
                findViewById<LinearLayout>(R.id.add_new_location_layout).visibility = View.VISIBLE
            }
        })

        findViewById<ImageView>(R.id.loading_point_close_imgvw).setOnClickListener({
            finish()
        })

    }
}