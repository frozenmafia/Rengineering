package com.dreampay.wallets.phonepe;

import com.dreampay.commons.AuthModel;
import com.dreampay.commons.ExtensionsKt;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getBreadCrumbShortTitle;
/* loaded from: classes4.dex */
public final class PhonePeUnlinkOperation$authModel$2 extends Lambda implements Styleable.ArcMotion<AuthModel> {
    final /* synthetic */ getBreadCrumbShortTitle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhonePeUnlinkOperation$authModel$2(getBreadCrumbShortTitle getbreadcrumbshorttitle) {
        super(0);
        this.this$0 = getbreadcrumbshorttitle;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final AuthModel invoke() {
        return ExtensionsKt.asAuthModel(this.this$0.values());
    }
}
