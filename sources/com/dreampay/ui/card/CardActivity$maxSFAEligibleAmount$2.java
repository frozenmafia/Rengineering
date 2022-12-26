package com.dreampay.ui.card;

import android.os.Bundle;
import com.dreampay.commons.constants.Constants;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class CardActivity$maxSFAEligibleAmount$2 extends Lambda implements Styleable.ArcMotion<Integer> {
    final /* synthetic */ CardActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardActivity$maxSFAEligibleAmount$2(CardActivity cardActivity) {
        super(0);
        this.this$0 = cardActivity;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public /* synthetic */ Integer invoke2() {
        return Integer.valueOf(invoke());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Integer, int] */
    @Override // o.Styleable.ArcMotion
    public final Integer invoke() {
        Bundle extras = this.this$0.getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        return extras.getInt(Constants.Navigation.SFA_MAX_ELIGIBLE_AMOUNT);
    }
}
