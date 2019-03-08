package com.example.myplayer

interface Callback {
    fun onCallback(result: String)
}


fun doAsync(x: Int, callback: (String) -> Unit){
    //Background
    callback("finished")
}

fun test() {
    doAsync(20) { result -> print(result) }
}