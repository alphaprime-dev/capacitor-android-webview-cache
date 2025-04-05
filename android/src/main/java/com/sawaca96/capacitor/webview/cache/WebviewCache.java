package com.sawaca96.capacitor.webview.cache;

import android.util.Log;
import android.webkit.WebView;
import android.app.Activity;

public class WebviewCache {
    
    private WebView webView;
    private Activity activity;
    
    public WebviewCache(WebView webView, Activity activity) {
        this.webView = webView;
        this.activity = activity;
    }
    
    public void clearCache() {
        Log.i("WebviewCache", "Clearing cache");
        if (webView != null && activity != null) {
            activity.runOnUiThread(() -> {
                webView.clearCache(true);
                Log.i("WebviewCache", "Cache cleared successfully");
            });
        } else {
            if (webView == null) {
                Log.e("WebviewCache", "WebView is null");
            }
            if (activity == null) {
                Log.e("WebviewCache", "Activity is null");
            }
        }
    }
}