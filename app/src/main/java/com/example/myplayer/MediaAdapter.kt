package com.example.myplayer

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.view_media_item.view.*

class MediaAdapter(val items: List<MediaItem>, val listener: OnMediaClickListener)
    : RecyclerView.Adapter<MediaAdapter.MediaHolder>() {

    interface OnMediaClickListener {
        fun onClick(mediaItem: MediaItem)
    }


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MediaHolder {
        val view = parent.inflate(R.layout.view_media_item)
        val holder = MediaHolder(view)

        return holder
    }


    override fun getItemCount(): Int = items.size


    override fun onBindViewHolder(holder: MediaHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { listener.onClick(item) }
    }


    class MediaHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: MediaItem) = with(itemView) {
            txv_media.text = item.title
            iv_media_thumb.loadUrl(item.thumbUrl)

            iv_media_video.visibility = when (item.type) {
                MediaItem.Type.VIDEO -> View.VISIBLE
                MediaItem.Type.PHOTO -> View.GONE
            }
        }
    }
}
