package com.dreampay.cards;

import com.dreampay.commons.cards.ConsentType;
import com.dreampay.commons.constants.Constants;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class CardWebViewActivity$consentType$2 extends Lambda implements Styleable.ArcMotion<ConsentType> {
    final /* synthetic */ CardWebViewActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWebViewActivity$consentType$2(CardWebViewActivity cardWebViewActivity) {
        super(0);
        this.this$0 = cardWebViewActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final ConsentType invoke() {
        ConsentType serializableExtra = this.this$0.getIntent().getSerializableExtra(Constants.Navigation.CONSENT_TYPE);
        if (serializableExtra == null) {
            serializableExtra = ConsentType.NONE;
        }
        return (ConsentType) serializableExtra;
    }
}
