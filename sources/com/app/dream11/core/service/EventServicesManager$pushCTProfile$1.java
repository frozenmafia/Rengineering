package com.app.dream11.core.service;

import com.app.dream11.dream11.AppConstants;
import com.app.dream11.integration.EventTracker;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.hasVisibleItems;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
public final class EventServicesManager$pushCTProfile$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $value;
    final /* synthetic */ hasVisibleItems this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventServicesManager$pushCTProfile$1(hasVisibleItems hasvisibleitems, String str) {
        super(0);
        this.this$0 = hasvisibleitems;
        this.$value = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        hasVisibleItems.values(this.this$0, EventTracker.CLEVERTAP).ah$a(AppConstants.EventKeys.CT_PUSH_PROFILE, this.$value);
    }
}
