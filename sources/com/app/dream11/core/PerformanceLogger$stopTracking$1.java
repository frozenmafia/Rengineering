package com.app.dream11.core;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Compatibility;
import o.Styleable;
import o.attachCompleter;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
public final class PerformanceLogger$stopTracking$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Compatibility.Api15Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceLogger$stopTracking$1(Compatibility.Api15Impl api15Impl) {
        super(0);
        this.this$0 = api15Impl;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        attachCompleter attachcompleter;
        NewEvents ag$a;
        attachcompleter = this.this$0.ah$a;
        if (attachcompleter == null) {
            return;
        }
        ag$a = this.this$0.ag$a();
        attachcompleter.values(ag$a, EventTracker.IN_HOUSE);
    }
}
