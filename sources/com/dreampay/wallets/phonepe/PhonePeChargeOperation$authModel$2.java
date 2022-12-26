package com.dreampay.wallets.phonepe;

import com.dreampay.commons.AuthModel;
import com.dreampay.commons.ExtensionsKt;
import kotlin.jvm.internal.Lambda;
import o.BackStackRecord;
import o.Styleable;
/* loaded from: classes4.dex */
public final class PhonePeChargeOperation$authModel$2 extends Lambda implements Styleable.ArcMotion<AuthModel> {
    final /* synthetic */ BackStackRecord this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhonePeChargeOperation$authModel$2(BackStackRecord backStackRecord) {
        super(0);
        this.this$0 = backStackRecord;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final AuthModel invoke() {
        return ExtensionsKt.asAuthModel(this.this$0.values());
    }
}
