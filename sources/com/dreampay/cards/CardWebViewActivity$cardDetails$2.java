package com.dreampay.cards;

import android.os.Bundle;
import com.dreampay.commons.cards.CardDetails;
import com.dreampay.commons.constants.Constants;
import java.io.Serializable;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class CardWebViewActivity$cardDetails$2 extends Lambda implements Styleable.ArcMotion<CardDetails> {
    final /* synthetic */ CardWebViewActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWebViewActivity$cardDetails$2(CardWebViewActivity cardWebViewActivity) {
        super(0);
        this.this$0 = cardWebViewActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final CardDetails invoke() {
        Bundle extras = this.this$0.getIntent().getExtras();
        Serializable serializable = extras == null ? null : extras.getSerializable(Constants.Navigation.CARD_DETAILS);
        if (serializable instanceof CardDetails) {
            return (CardDetails) serializable;
        }
        return null;
    }
}
