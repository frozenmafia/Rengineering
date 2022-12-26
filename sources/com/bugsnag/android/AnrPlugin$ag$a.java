package com.bugsnag.android;

import o.paneTitleProperty;
import o.postOnAnimation;
import o.runAnimators;
import o.setSystemGestureExclusionRects;
/* loaded from: classes6.dex */
final class AnrPlugin$ag$a implements setSystemGestureExclusionRects {
    public static final AnrPlugin$ag$a ah$a = new AnrPlugin$ag$a();

    AnrPlugin$ag$a() {
    }

    @Override // o.setSystemGestureExclusionRects
    public final boolean valueOf(postOnAnimation postonanimation) {
        runAnimators.valueOf(postonanimation, "it");
        paneTitleProperty panetitleproperty = postonanimation.HaptikSDK$b().get(0);
        runAnimators.toString(panetitleproperty, "error");
        panetitleproperty.values("AnrLinkError");
        panetitleproperty.ah$a("Native library could not be linked. Bugsnag will not report ANRs. See https://docs.bugsnag.com/platforms/android/anr-link-errors");
        return true;
    }
}
