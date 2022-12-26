package com.bugsnag.android;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.checkPaneVisibility;
import o.notifyViewAccessibilityStateChangedIfNeeded;
/* loaded from: classes3.dex */
public final class StorageModule$internalDeviceId$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ checkPaneVisibility this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageModule$internalDeviceId$2(checkPaneVisibility checkpanevisibility) {
        super(0);
        this.this$0 = checkpanevisibility;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        notifyViewAccessibilityStateChangedIfNeeded HaptikSDK$b;
        HaptikSDK$b = this.this$0.HaptikSDK$b();
        return HaptikSDK$b.ah$a();
    }
}
