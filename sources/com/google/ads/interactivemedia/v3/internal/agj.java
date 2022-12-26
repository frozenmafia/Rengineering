package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
/* loaded from: classes4.dex */
public abstract class agj {
    public abstract void a(View view, ago agoVar, String str);

    public abstract void b();

    public abstract void c(View view);

    public abstract void d();

    public abstract void e();

    public static agj f(lu luVar, agk agkVar) {
        if (agh.c()) {
            return new agm(luVar, agkVar, null, null);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
