package com.dreampay.cards;

import com.dreampay.commons.AuthModel;
import com.dreampay.commons.ExtensionsKt;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class CardWebViewActivity$authModel$2 extends Lambda implements Styleable.ArcMotion<AuthModel> {
    final /* synthetic */ CardWebViewActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWebViewActivity$authModel$2(CardWebViewActivity cardWebViewActivity) {
        super(0);
        this.this$0 = cardWebViewActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final AuthModel invoke() {
        return ExtensionsKt.asAuthModel(CardWebViewActivity.toString(this.this$0));
    }
}
