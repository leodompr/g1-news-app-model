package com.leodomprdevs.g1copiaapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi


class WebOn : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val url = intent.getStringExtra("url")

        if (url != null) {
            webViewSetup(url)
        }



    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun webViewSetup(url : String){
        val wb_view : WebView = findViewById(R.id.wbView)
        wb_view.webViewClient = WebViewClient()

        wb_view.apply {
            loadUrl(url)
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true }

        }}

