import Foundation

@objc public class WebviewCache: NSObject {
    @objc public func clearCache() throws {
        throw NSError(domain: "WebviewCachePlugin", code: 0, userInfo: [NSLocalizedDescriptionKey: "Not implemented on ios."])
    }
}
