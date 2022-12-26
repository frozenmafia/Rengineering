package com.phonepe.intent.sdk.widgets;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.phonepe.intent.sdk.api.PhonePe;
import com.phonepe.intent.sdk.api.PhonePeInitException;
import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import o.beginAsyncSectionFallback;
/* loaded from: classes7.dex */
public class PhWebView extends WebView {

    /* renamed from: irjuc  reason: collision with root package name */
    public jmjou f1419irjuc;

    public PhWebView(Context context) {
        super(context);
        try {
            irjuc(PhonePe.getObjectFactory());
        } catch (PhonePeInitException e) {
            beginAsyncSectionFallback.valueOf("PhWebView", e.getMessage(), e);
        }
    }

    public PhWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            irjuc(PhonePe.getObjectFactory());
        } catch (PhonePeInitException e) {
            beginAsyncSectionFallback.valueOf("PhWebView", e.getMessage(), e);
        }
    }

    public PhWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            irjuc(PhonePe.getObjectFactory());
        } catch (PhonePeInitException e) {
            beginAsyncSectionFallback.valueOf("PhWebView", e.getMessage(), e);
        }
    }

    public final void irjuc(jmjou jmjouVar) {
        beginAsyncSectionFallback.values("PhWebView", "initialization started ..");
        this.f1419irjuc = jmjouVar;
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setAppCacheEnabled(true);
        getSettings().setCacheMode(-1);
        requestFocus(130);
        setBackgroundColor(-1);
        if (Build.VERSION.SDK_INT >= 19 && beginAsyncSectionFallback.valueOf((Boolean) this.f1419irjuc.toString("com.phonepe.android.sdk.Debuggable"))) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        beginAsyncSectionFallback.values("PhWebView", "initialization completed.");
    }
}
