package com.fancode.payment.components.fcPayment;

import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.util.LinkedHashMap;
import java.util.Map;
import o.isSynced;
import o.removeObservers;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class FCPaymentWebviewActivity extends AppCompatActivity {
    public removeObservers ag$a;
    public Map<Integer, View> values = new LinkedHashMap();

    public final removeObservers ag$a() {
        removeObservers removeobservers = this.ag$a;
        if (removeobservers != null) {
            return removeobservers;
        }
        runAnimators.valueOf("binding");
        return null;
    }

    public final void values(removeObservers removeobservers) {
        runAnimators.ag$a(removeobservers, "<set-?>");
        this.ag$a = removeobservers;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, isSynced.valueOf.activity_payment_webview);
        runAnimators.ah$a(contentView, "setContentView(this, R.l…activity_payment_webview)");
        values((removeObservers) contentView);
        values();
    }

    private final void values() {
        WebSettings settings = ag$a().toString.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        ag$a().toString.setWebViewClient(new WebViewClient());
        CookieSyncManager createInstance = CookieSyncManager.createInstance(ag$a().toString.getContext());
        runAnimators.ah$a(createInstance, "createInstance(binding.wvPayment.context)");
        CookieManager cookieManager = CookieManager.getInstance();
        runAnimators.ah$a(cookieManager, "getInstance()");
        cookieManager.setAcceptCookie(true);
        cookieManager.removeSessionCookie();
        cookieManager.setCookie("https://fancode.com", "__refreshToken=eyJhbGciOiJSUzUxMiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjEzNTE2MjUxMCwiaWF0IjoxNjI2NDYzNTU2LCJleHAiOjE2NDIwMTU1NTZ9.1taSb6zlTrpOjgqKYYggQU48lUbdGyoEH13EWaxu0njFD5SrcGUBXYcWKnfz_vqXLg38i_DvSuTdTIp4nW3q7RMucqpmk_3NCSkqvWkUjfGkj5joXO1hgSYDAp5WCy3y-hP9NWzNyXdkYwBgjBGZ-tnBgSJnNt9ZdIZHFJ0o3ppXLx9j9oyp2jNMoyrfTZv1XAqMwsqpDJNdNxC1Tc85-5G5-v2UGLz42mSRNNlUu__dOvTMjzdugl5Got3V7qorh_0G9XdEyURtKgfbrGuC_PtGebbfAQKdOqZStXB2JhORAQJfZvObq7lV0wCBtv8fWnCjNf7U2RpWyAyzRp0dSA ; Domain=fancode.com");
        createInstance.sync();
        ag$a().toString.loadUrl("https://fancode.com/payment/35992");
    }
}
