package com.example.myplayer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso


fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}


fun MediaAdapter.MediaHolder.toast(message: String) = itemView.context.toast(message)


fun ViewGroup.inflate(layoutRes: Int): View {
    val inflater = LayoutInflater.from(context)
    return inflater.inflate(layoutRes, this, false)
}


fun ImageView.loadUrl(thumbUrl: String) {
    Picasso.with(context).load(thumbUrl).into(this)
}

inline fun <reified T : View> View.find(idRes: Int): T {
    return findViewById(idRes)
}


inline fun <reified T : View> MediaAdapter.MediaHolder.find(idRes: Int): T {
    return itemView.find(idRes)
}
