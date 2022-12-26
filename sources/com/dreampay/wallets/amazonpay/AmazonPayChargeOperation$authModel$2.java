package com.dreampay.wallets.amazonpay;

import com.dreampay.commons.AuthModel;
import com.dreampay.commons.ExtensionsKt;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.savePngAttributes;
/* loaded from: classes4.dex */
public final class AmazonPayChargeOperation$authModel$2 extends Lambda implements Styleable.ArcMotion<AuthModel> {
    final /* synthetic */ savePngAttributes this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonPayChargeOperation$authModel$2(savePngAttributes savepngattributes) {
        super(0);
        this.this$0 = savepngattributes;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final AuthModel invoke() {
        return ExtensionsKt.asAuthModel(this.this$0.values());
    }
}
