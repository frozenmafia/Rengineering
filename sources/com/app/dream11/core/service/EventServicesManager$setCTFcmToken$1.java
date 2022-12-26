package com.app.dream11.core.service;

import com.app.dream11.integration.EventTracker;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getVisibleItems;
import o.hasVisibleItems;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
public final class EventServicesManager$setCTFcmToken$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ hasVisibleItems this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventServicesManager$setCTFcmToken$1(hasVisibleItems hasvisibleitems) {
        super(0);
        this.this$0 = hasvisibleitems;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((getVisibleItems) hasVisibleItems.values(this.this$0, EventTracker.CLEVERTAP)).ah$b();
    }
}
