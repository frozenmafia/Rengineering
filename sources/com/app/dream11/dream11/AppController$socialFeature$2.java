package com.app.dream11.dream11;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getCategory;
/* loaded from: classes3.dex */
public final class AppController$socialFeature$2 extends Lambda implements Styleable.ArcMotion<getCategory> {
    public static final AppController$socialFeature$2 INSTANCE = new AppController$socialFeature$2();

    AppController$socialFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final getCategory invoke() {
        return DreamApplication.valueOf().aj$a().postMessage();
    }
}
