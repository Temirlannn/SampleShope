package com.itacademy.myapplication.Adapters

import android.icu.util.ULocale
import android.os.Bundle
import android.telecom.InCallService
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.itacademy.myapplication.Fragments.VideoFragment
import com.itacademy.myapplication.R
import com.itacademy.myapplication.models.Cotegory
import java.util.*
import kotlin.collections.ArrayList

class CategoryAdapter(private val array: ArrayList<Cotegory>, private val context: FragmentActivity) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
         class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
             val title = view.findViewById<TextView>(R.id.categoryTextView)
         }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_item_cell, parent)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = array[position]
        holder.title.text = holder.itemView.context.getString(item.name)
        val fragment = VideoFragment()
        val a = Cotegory(1,10)
        a.id // 1
        a.name // 10
        holder.itemView.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("category", item.id)
            context.supportFragmentManager.beginTransaction ()
                .replace(R.id.container, VideoFragment::class.java, bundle )
                .addToBackStack(null)
                .commit()
            }
        }
    override fun getItemCount(): Int {
        return array.size
    }
}
