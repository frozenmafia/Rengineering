package com.dreampay.upi;

import com.dreampay.commons.constants.Constants;
import com.dreampay.commons.upi.UPI;
import java.io.Serializable;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class UpiActivity$flow$2 extends Lambda implements Styleable.ArcMotion<UPI> {
    final /* synthetic */ UpiActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpiActivity$flow$2(UpiActivity upiActivity) {
        super(0);
        this.this$0 = upiActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final UPI invoke() {
        Serializable serializableExtra = this.this$0.getIntent().getSerializableExtra(Constants.Navigation.UPI_TYPE);
        UPI upi = serializableExtra instanceof UPI ? (UPI) serializableExtra : null;
        return upi == null ? UPI.UPI_INTENT : upi;
    }
}
