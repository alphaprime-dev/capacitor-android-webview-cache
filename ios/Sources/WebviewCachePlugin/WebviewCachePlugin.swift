import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(WebviewCachePlugin)
public class WebviewCachePlugin: CAPPlugin, CAPBridgedPlugin {
    public let identifier = "WebviewCachePlugin"
    public let jsName = "WebviewCache"
    public let pluginMethods: [CAPPluginMethod] = [
        CAPPluginMethod(name: "clearCache", returnType: CAPPluginReturnPromise)
    ]
    private let implementation = WebviewCache()

    @objc func clearCache(_ call: CAPPluginCall) {
        do {
            try implementation.clearCache()
            call.resolve()
        } catch let error as NSError {
            call.reject(error.localizedDescription)
        }
    }
}
