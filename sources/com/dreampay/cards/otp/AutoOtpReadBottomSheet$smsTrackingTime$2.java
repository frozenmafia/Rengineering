package com.dreampay.cards.otp;

import android.os.Bundle;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AutoOtpReadBottomSheet$smsTrackingTime$2 extends Lambda implements Styleable.ArcMotion<Long> {
    final /* synthetic */ AutoOtpReadBottomSheet this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoOtpReadBottomSheet$smsTrackingTime$2(AutoOtpReadBottomSheet autoOtpReadBottomSheet) {
        super(0);
        this.this$0 = autoOtpReadBottomSheet;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public /* synthetic */ Long invoke2() {
        return Long.valueOf(invoke());
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Long, long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Long, long] */
    @Override // o.Styleable.ArcMotion
    public final Long invoke() {
        Bundle arguments = this.this$0.getArguments();
        Long valueOf = arguments == null ? null : Long.valueOf(arguments.getLong("time"));
        return valueOf == null ? System.currentTimeMillis() : valueOf.longValue();
    }
}
