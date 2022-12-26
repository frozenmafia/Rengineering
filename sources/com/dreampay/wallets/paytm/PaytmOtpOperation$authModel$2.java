package com.dreampay.wallets.paytm;

import com.dreampay.commons.AuthModel;
import com.dreampay.commons.ExtensionsKt;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.writeUnsignedInt;
/* loaded from: classes4.dex */
public final class PaytmOtpOperation$authModel$2 extends Lambda implements Styleable.ArcMotion<AuthModel> {
    final /* synthetic */ writeUnsignedInt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaytmOtpOperation$authModel$2(writeUnsignedInt writeunsignedint) {
        super(0);
        this.this$0 = writeunsignedint;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final AuthModel invoke() {
        return ExtensionsKt.asAuthModel(this.this$0.values());
    }
}
