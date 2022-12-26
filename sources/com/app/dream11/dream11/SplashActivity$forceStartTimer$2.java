package com.app.dream11.dream11;

import java.util.Timer;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes3.dex */
final class SplashActivity$forceStartTimer$2 extends Lambda implements Styleable.ArcMotion<Timer> {
    public static final SplashActivity$forceStartTimer$2 INSTANCE = new SplashActivity$forceStartTimer$2();

    SplashActivity$forceStartTimer$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final Timer invoke() {
        return new Timer();
    }
}
