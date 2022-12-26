package com.appsamurai.storyly.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes3.dex */
public final class k$a extends Lambda implements Styleable.ArcMotion<DisplayMetrics> {
    public static final k$a a = new k$a();

    public k$a() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public DisplayMetrics invoke() {
        return Resources.getSystem().getDisplayMetrics();
    }
}
