package com.app.dream11.fclogin;

import com.app.dream11.core.factory.ServiceFactory;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.findRealOwner;
/* loaded from: classes3.dex */
final class FCLoginLoaderActivity$prefs$2 extends Lambda implements Styleable.ArcMotion<findRealOwner> {
    public static final FCLoginLoaderActivity$prefs$2 INSTANCE = new FCLoginLoaderActivity$prefs$2();

    FCLoginLoaderActivity$prefs$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final findRealOwner invoke() {
        return ServiceFactory.values().device.ah$a().HaptikSDK$e().valueOf();
    }
}
