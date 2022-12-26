package com.dreampay.cards;

import android.os.Bundle;
import com.dreampay.commons.constants.Constants;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class CardWebViewActivity$isNewCard$2 extends Lambda implements Styleable.ArcMotion<Boolean> {
    final /* synthetic */ CardWebViewActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWebViewActivity$isNewCard$2(CardWebViewActivity cardWebViewActivity) {
        super(0);
        this.this$0 = cardWebViewActivity;
    }

    @Override // o.Styleable.ArcMotion
    public /* synthetic */ Boolean invoke() {
        return Boolean.valueOf(invoke2());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, boolean] */
    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2() {
        Bundle extras = this.this$0.getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        return extras.getBoolean(Constants.Navigation.IS_NEW_CARD);
    }
}
