package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import java.util.List;
/* loaded from: classes4.dex */
public final class aiz extends WebView {
    public aiz(Context context, CompanionData companionData, List list, aln alnVar) {
        super(context);
        if (Build.VERSION.SDK_INT >= 21) {
            getSettings().setJavaScriptEnabled(true);
        }
        getSettings().setSupportMultipleWindows(true);
        setWebChromeClient(new aiy(context, alnVar, list));
        if (companionData.type() == com.google.ads.interactivemedia.v3.impl.data.az.Html) {
            loadData(Base64.encodeToString(companionData.src().getBytes(), 1), "text/html", "base64");
        } else if (companionData.type() == com.google.ads.interactivemedia.v3.impl.data.az.IFrame) {
            loadUrl(companionData.src());
        } else {
            String valueOf = String.valueOf(companionData.type());
            throw new IllegalArgumentException("Companion type " + valueOf + " is not valid for a CompanionWebView");
        }
    }
}
