package com.example.quiz

import android.content.Context
import android.util.AttributeSet
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.FrameLayout

class VatomWebView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {

    private val webView: WebView

    init {
        webView = WebView(context)
        webView.webViewClient = WebViewClient()
        val url = "https://www.google.com/"
        webView.loadUrl(url)
        webView.settings.javaScriptEnabled = true


        addView(webView)
    }
}
