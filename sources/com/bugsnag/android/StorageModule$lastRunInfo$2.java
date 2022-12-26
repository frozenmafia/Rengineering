package com.bugsnag.android;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.checkPaneVisibility;
import o.setHasTransientState;
/* loaded from: classes3.dex */
public final class StorageModule$lastRunInfo$2 extends Lambda implements Styleable.ArcMotion<setHasTransientState> {
    final /* synthetic */ checkPaneVisibility this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageModule$lastRunInfo$2(checkPaneVisibility checkpanevisibility) {
        super(0);
        this.this$0 = checkpanevisibility;
    }

    @Override // o.Styleable.ArcMotion
    public final setHasTransientState invoke() {
        setHasTransientState valueOf = this.this$0.valueOf().valueOf();
        this.this$0.valueOf().ag$a(new setHasTransientState(0, false, false));
        return valueOf;
    }
}
