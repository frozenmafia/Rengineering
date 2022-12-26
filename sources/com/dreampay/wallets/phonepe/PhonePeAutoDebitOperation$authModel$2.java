package com.dreampay.wallets.phonepe;

import com.dreampay.commons.AuthModel;
import com.dreampay.commons.ExtensionsKt;
import kotlin.jvm.internal.Lambda;
import o.ExifInterface;
import o.Styleable;
/* loaded from: classes4.dex */
public final class PhonePeAutoDebitOperation$authModel$2 extends Lambda implements Styleable.ArcMotion<AuthModel> {
    final /* synthetic */ ExifInterface.ExifTag this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhonePeAutoDebitOperation$authModel$2(ExifInterface.ExifTag exifTag) {
        super(0);
        this.this$0 = exifTag;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final AuthModel invoke() {
        return ExtensionsKt.asAuthModel(this.this$0.ah$a());
    }
}
