package com.dreampay.cards;

import android.os.Bundle;
import com.dreampay.commons.constants.Constants;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class CardWebViewActivity$transactionType$2 extends Lambda implements Styleable.ArcMotion<CardTransactionType> {
    final /* synthetic */ CardWebViewActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWebViewActivity$transactionType$2(CardWebViewActivity cardWebViewActivity) {
        super(0);
        this.this$0 = cardWebViewActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final CardTransactionType invoke() {
        Bundle extras = this.this$0.getIntent().getExtras();
        Serializable serializable = extras == null ? null : extras.getSerializable(Constants.Navigation.TRANSACTION_TYPE);
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.dreampay.cards.CardTransactionType");
        return (CardTransactionType) serializable;
    }
}
