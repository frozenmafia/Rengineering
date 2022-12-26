package com.app.dream11.dream11;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SplashActivity$getRelevantAction$1$1$1 extends Lambda implements Styleable.ChangeBounds<Map<String, Serializable>, setAnimationMatrix> {
    public static final SplashActivity$getRelevantAction$1$1$1 INSTANCE = new SplashActivity$getRelevantAction$1$1$1();

    SplashActivity$getRelevantAction$1$1$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Map<String, Serializable> map) {
        invoke2(map);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, Serializable> map) {
        runAnimators.ag$a(map, "$this$trackEvent");
        map.put("screen", "Invite Deeplink");
    }
}
