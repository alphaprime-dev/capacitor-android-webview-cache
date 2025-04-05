package com.sawaca96.capacitor.webview.cache;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import android.webkit.WebView;

@CapacitorPlugin(name = "WebviewCache")
public class WebviewCachePlugin extends Plugin {

    private WebviewCache implementation;

    @Override
    public void load() {
        WebView webView = getBridge().getWebView();
        implementation = new WebviewCache(webView);
    }
    
    @PluginMethod
    public void clearCache(PluginCall call) {
        try {
            implementation.clearCache();
            call.resolve();
        } catch (Exception e) {
            call.reject("Failed to clear cache", e);
        }
    }
}