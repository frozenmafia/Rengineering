package com.bugsnag.android;

import com.bugsnag.android.NdkPlugin;
import o.paneTitleProperty;
import o.postOnAnimation;
import o.runAnimators;
import o.setSystemGestureExclusionRects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class NdkPlugin$ag$a implements setSystemGestureExclusionRects {
    public static final NdkPlugin$ag$a values = new NdkPlugin$ag$a();

    NdkPlugin$ag$a() {
    }

    @Override // o.setSystemGestureExclusionRects
    public final boolean valueOf(postOnAnimation postonanimation) {
        NdkPlugin.toString unused;
        runAnimators.valueOf(postonanimation, "it");
        paneTitleProperty panetitleproperty = postonanimation.HaptikSDK$b().get(0);
        runAnimators.toString(panetitleproperty, "error");
        panetitleproperty.values("NdkLinkError");
        unused = NdkPlugin.Companion;
        panetitleproperty.ah$a("Native library could not be linked. Bugsnag will not report NDK errors. See https://docs.bugsnag.com/platforms/android/ndk-link-errors");
        return true;
    }
}
