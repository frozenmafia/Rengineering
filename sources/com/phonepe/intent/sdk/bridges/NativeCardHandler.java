package com.phonepe.intent.sdk.bridges;

import android.webkit.JavascriptInterface;
import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import o.__string;
import o.handleException;
/* loaded from: classes7.dex */
public class NativeCardHandler implements handleException {
    public static final String TAG = "NativeCardHandler";

    @Override // o.handleException
    public void init(jmjou jmjouVar, jmjou.chmha chmhaVar) {
        __string __stringVar = (__string) chmhaVar.irjuc("nativeCardCallback", null);
    }

    @Override // o.handleException
    public boolean isCachingAllowed() {
        return false;
    }

    @JavascriptInterface
    public void onCardTransaction(String str, String str2, String str3) {
    }
}
