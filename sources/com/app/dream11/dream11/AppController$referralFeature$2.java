package com.app.dream11.dream11;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.instantiateActivityCompat;
/* loaded from: classes3.dex */
public final class AppController$referralFeature$2 extends Lambda implements Styleable.ArcMotion<instantiateActivityCompat> {
    public static final AppController$referralFeature$2 INSTANCE = new AppController$referralFeature$2();

    AppController$referralFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final instantiateActivityCompat invoke() {
        return DreamApplication.valueOf().aj$a().ICustomTabsCallback$Stub$Proxy();
    }
}
