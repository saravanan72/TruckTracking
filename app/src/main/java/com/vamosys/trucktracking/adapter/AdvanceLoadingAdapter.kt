package com.vamosys.trucktracking.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vamosys.trucktracking.R
import com.vamosys.trucktracking.model.LoadingPoints

class AdvanceLoadingAdapter(val items : List<LoadingPoints>, val context: Context): RecyclerView.Adapter<AdvanceLoadingAdapter.LoadingViewholder>() {

    class LoadingViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val stepperImgvw = itemView.findViewById<ImageView>(R.id.loading_card_stepper_imgvw)
        val topVertRule = itemView.findViewById<View>(R.id.loading_item_top_dashview)
        val bottomVertRule = itemView.findViewById<View>(R.id.loading_item_bottom_dashview)
        val titleView = itemView.findViewById<TextView>(R.id.loading_item_titlebar)
        val locationView = itemView.findViewById<TextView>(R.id.loading_item_location_txtvw)
        val dateTimeView = itemView.findViewById<TextView>(R.id.loading_item_datetime_txtvw)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LoadingViewholder {
        return LoadingViewholder(LayoutInflater.from(context).inflate(R.layout.layout_loading_item, parent, false))
    }

    override fun onBindViewHolder(holder: LoadingViewholder, position: Int) {
        holder.titleView.text = getItemCount(position).title
        holder.locationView.text = getItemCount(position).location
        holder.dateTimeView.text = getItemCount(position).date

        holder.stepperImgvw.setImageResource(if (position == 0)R.drawable.ic_start_group else R.drawable.shape_small_circle_black)
        holder.topVertRule.visibility = if(position == 0) View.GONE else View.VISIBLE
        holder.bottomVertRule.visibility = if(position == (items.size - 1)) View.GONE else View.VISIBLE
    }

    override fun getItemCount(): Int {
        return items.size
    }


    fun getItemCount(position: Int): LoadingPoints{
        return items.get(position)
    }
}