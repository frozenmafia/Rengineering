package com.dreampay.upi;

import android.os.Bundle;
import com.dreampay.commons.constants.Constants;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class UpiWebViewActivity$vpa$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ UpiWebViewActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpiWebViewActivity$vpa$2(UpiWebViewActivity upiWebViewActivity) {
        super(0);
        this.this$0 = upiWebViewActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        String string;
        Bundle extras = this.this$0.getIntent().getExtras();
        return (extras == null || (string = extras.getString(Constants.Navigation.VPA)) == null) ? "" : string;
    }
}
