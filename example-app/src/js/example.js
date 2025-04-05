import { WebviewCache } from 'capacitor-android-webview-cache';

window.testEcho = () => {
    const inputValue = document.getElementById("echoInput").value;
    WebviewCache.echo({ value: inputValue })
}
