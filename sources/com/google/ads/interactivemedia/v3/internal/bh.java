package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
/* loaded from: classes4.dex */
public class bh {
    private int a = Integer.MAX_VALUE;

    /* renamed from: b  reason: collision with root package name */
    private int f829b = Integer.MAX_VALUE;
    private int c = Integer.MAX_VALUE;
    private int d = Integer.MAX_VALUE;
    private int e = Integer.MAX_VALUE;
    private int f = Integer.MAX_VALUE;
    private boolean g = true;
    private avb h = avb.o();
    private avb i = avb.o();
    private int j = Integer.MAX_VALUE;
    private int k = Integer.MAX_VALUE;
    private avb l = avb.o();
    private avb m = avb.o();
    private int n = 0;

    /* renamed from: o  reason: collision with root package name */
    private HashMap f830o = new HashMap();
    private HashSet p = new HashSet();

    public void q(Context context) {
        CaptioningManager captioningManager;
        if (cp.a >= 19) {
            if ((cp.a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.n = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.m = avb.p(cp.O(locale));
                }
            }
        }
    }

    public bh r(int i, int i2) {
        this.e = i;
        this.f = i2;
        this.g = true;
        return this;
    }

    public void s(Context context) {
        Point y = cp.y(context);
        r(y.x, y.y);
    }
}
