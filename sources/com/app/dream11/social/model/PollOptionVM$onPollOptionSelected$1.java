package com.app.dream11.social.model;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.setLargeIcon;
import o.setOngoing;
/* loaded from: classes6.dex */
public final class PollOptionVM$onPollOptionSelected$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ setLargeIcon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PollOptionVM$onPollOptionSelected$1(setLargeIcon setlargeicon) {
        super(0);
        this.this$0 = setlargeicon;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Styleable.ChangeBounds changeBounds;
        setOngoing setongoing = this.this$0.invoke().get();
        if (setongoing == null) {
            return;
        }
        changeBounds = this.this$0.HaptikSDK$b;
        changeBounds.invoke(Integer.valueOf(setongoing.ag$a()));
    }
}
