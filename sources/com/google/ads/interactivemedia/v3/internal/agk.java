package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public final class agk {
    private final WebView a;

    /* renamed from: b  reason: collision with root package name */
    private final List f541b = new ArrayList();
    private final Map c = new HashMap();
    private final String d;
    private final String e;
    private final agl f;
    private final bdh g;

    private agk(bdh bdhVar, WebView webView, String str, String str2, agl aglVar, byte[] bArr, byte[] bArr2) {
        this.g = bdhVar;
        this.a = webView;
        this.f = aglVar;
        this.e = str;
        this.d = str2;
    }

    public final WebView a() {
        return this.a;
    }

    public final agl b() {
        return this.f;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final List e() {
        return Collections.unmodifiableList(this.f541b);
    }

    public final Map f() {
        return Collections.unmodifiableMap(this.c);
    }

    public final bdh h() {
        return this.g;
    }

    public static agk g(bdh bdhVar, WebView webView, String str, String str2) {
        if (str2.length() <= 256) {
            return new agk(bdhVar, webView, str, str2, agl.JAVASCRIPT, null, null);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }
}
