package com.app.dream11.notifications.usersubscribednotification;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.createAlignedConstraints$ag$a;
import o.isHeightMeasuredTooSmall;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class UserSubScribedNotificationItemData$onItemClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ isHeightMeasuredTooSmall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSubScribedNotificationItemData$onItemClick$1(isHeightMeasuredTooSmall isheightmeasuredtoosmall) {
        super(0);
        this.this$0 = isheightmeasuredtoosmall;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        createAlignedConstraints$ag$a values = this.this$0.values();
        if (values == null) {
            return;
        }
        values.toString(this.this$0);
    }
}
