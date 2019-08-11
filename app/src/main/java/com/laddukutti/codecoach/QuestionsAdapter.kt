package com.laddukutti.codecoach

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.laddukutti.codecoach.data.Questions

class QuestionsAdapter(val questionList: ArrayList<Questions>) : RecyclerView.Adapter<QuestionsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(v)

    }

    override fun getItemCount(): Int {
        return questionList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val question: Questions = questionList[position]
        holder.tv_title.text = question.title
        holder.tv_description.text = question.description
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tv_title = itemView.findViewById(R.id.tv_title) as TextView
        val tv_description = itemView.findViewById(R.id.tv_description) as TextView

    }
}