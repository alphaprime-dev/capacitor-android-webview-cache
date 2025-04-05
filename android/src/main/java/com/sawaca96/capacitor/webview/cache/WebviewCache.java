package com.sawaca96.capacitor.webview.cache;

import android.util.Log;
import android.webkit.WebView;

public class WebviewCache {
    
    private WebView webView;
    
    public WebviewCache(WebView webView) {
        this.webView = webView;
    }
    
    public void clearCache() {
        Log.i("WebviewCache", "Clearing cache");
        if (webView != null) {
            webView.clearCache(true);
            Log.i("WebviewCache", "Cache cleared successfully");
        } else {
            Log.e("WebviewCache", "WebView is null");
        }
    }
}