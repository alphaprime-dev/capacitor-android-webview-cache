import Foundation

@objc public class WebviewCache: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
