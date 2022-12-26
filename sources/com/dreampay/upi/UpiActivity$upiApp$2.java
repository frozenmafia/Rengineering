package com.dreampay.upi;

import android.os.Bundle;
import com.dreampay.commons.constants.Constants;
import com.dreampay.commons.upi.UpiApp;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class UpiActivity$upiApp$2 extends Lambda implements Styleable.ArcMotion<UpiApp> {
    final /* synthetic */ UpiActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpiActivity$upiApp$2(UpiActivity upiActivity) {
        super(0);
        this.this$0 = upiActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final UpiApp invoke() {
        Bundle extras = this.this$0.getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        return (UpiApp) extras.getParcelable(Constants.Navigation.SELECTED_UPI_APP);
    }
}
