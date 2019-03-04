package org.dennis.newsmedia

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class StoriesAdapter(private val stories: List<Story>) :RecyclerView.Adapter<StoriesAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.story_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = stories.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(view: View) :RecyclerView.ViewHolder(view) {

    }
}