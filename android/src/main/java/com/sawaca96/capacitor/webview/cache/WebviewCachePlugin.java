package com.sawaca96.capacitor.webview.cache;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import android.webkit.WebView;
import android.app.Activity;

@CapacitorPlugin(name = "WebviewCache")
public class WebviewCachePlugin extends Plugin {

    private WebviewCache implementation;

    @Override
    public void load() {
        WebView webView = getBridge().getWebView();
        Activity activity = getActivity();
        implementation = new WebviewCache(webView, activity);
    }
    
    @PluginMethod
    public void clearCache(PluginCall call) {
        try {
            if (implementation == null) {
                call.reject("WebviewCache implementation is null");
                return;
            }
            implementation.clearCache();
            call.resolve();
        } catch (Exception e) {
            call.reject("Failed to clear cache", e);
        }
    }
}