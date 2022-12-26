package com.app.dream11.react;

import com.app.dream11.core.factory.ServiceFactory;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.findRealOwner;
/* loaded from: classes.dex */
final class Dream11ReactBridge$prefs$2 extends Lambda implements Styleable.ArcMotion<findRealOwner> {
    public static final Dream11ReactBridge$prefs$2 INSTANCE = new Dream11ReactBridge$prefs$2();

    Dream11ReactBridge$prefs$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final findRealOwner invoke() {
        return ServiceFactory.values().device.ah$a().HaptikSDK$e().valueOf();
    }
}
