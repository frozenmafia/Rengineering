package o;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import easypay.actions.EasypayBrowserFragment;
/* loaded from: classes5.dex */
public class openPane extends WebChromeClient {
    private EasypayBrowserFragment toString;

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return false;
    }

    public openPane(EasypayBrowserFragment easypayBrowserFragment) {
        this.toString = easypayBrowserFragment;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (str.equals("https://secure4.arcot.com/acspage/cap?RID=40147&VAA=B")) {
            jsResult.confirm();
            return true;
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }
}
