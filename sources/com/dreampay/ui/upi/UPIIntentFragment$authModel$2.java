package com.dreampay.ui.upi;

import com.dreampay.commons.AuthModel;
import com.dreampay.commons.ExtensionsKt;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class UPIIntentFragment$authModel$2 extends Lambda implements Styleable.ArcMotion<AuthModel> {
    final /* synthetic */ UPIIntentFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UPIIntentFragment$authModel$2(UPIIntentFragment uPIIntentFragment) {
        super(0);
        this.this$0 = uPIIntentFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final AuthModel invoke() {
        String HaptikSDK$a;
        HaptikSDK$a = this.this$0.HaptikSDK$a();
        return ExtensionsKt.asAuthModel(HaptikSDK$a);
    }
}
