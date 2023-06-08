package com.example.xtendtv_webview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mytodo.R
import kotlinx.android.synthetic.main.single_card.view.*

class HabitsAdapter(val habits:List<Habit>) : RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>(){
    class HabitViewHolder(val card:View):RecyclerView.ViewHolder(card)

    override fun onBindViewHolder(holder: HabitViewHolder, position: Int) {
        if(holder!=null){
            val habit=habits[position]
            holder.card.iv_title.text=habit.tile
            holder.card.iv_description.text=habit.Discription
            holder.card.iv_icon.setImageResource(habit.img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.single_card,parent,false)
        return HabitViewHolder(view)
    }

    override fun getItemCount() = habits.size


}