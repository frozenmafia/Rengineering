package com.dreampay.wallets.paytm;

import com.dreampay.commons.AuthModel;
import com.dreampay.commons.ExtensionsKt;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.seek;
/* loaded from: classes4.dex */
public final class PaytmChargeOperation$authModel$2 extends Lambda implements Styleable.ArcMotion<AuthModel> {
    final /* synthetic */ seek this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaytmChargeOperation$authModel$2(seek seekVar) {
        super(0);
        this.this$0 = seekVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final AuthModel invoke() {
        return ExtensionsKt.asAuthModel(this.this$0.valueOf());
    }
}
