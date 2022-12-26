package com.dreampay.wallets.mobikwik;

import com.dreampay.commons.AuthModel;
import com.dreampay.commons.ExtensionsKt;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setLatLong;
/* loaded from: classes4.dex */
public final class MobikwikUnlinkOperation$authModel$2 extends Lambda implements Styleable.ArcMotion<AuthModel> {
    final /* synthetic */ setLatLong this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobikwikUnlinkOperation$authModel$2(setLatLong setlatlong) {
        super(0);
        this.this$0 = setlatlong;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final AuthModel invoke() {
        return ExtensionsKt.asAuthModel(this.this$0.values());
    }
}
