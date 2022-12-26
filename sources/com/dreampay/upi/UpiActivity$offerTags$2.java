package com.dreampay.upi;

import android.os.Bundle;
import com.dreampay.commons.constants.Constants;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class UpiActivity$offerTags$2 extends Lambda implements Styleable.ArcMotion<ArrayList<String>> {
    final /* synthetic */ UpiActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpiActivity$offerTags$2(UpiActivity upiActivity) {
        super(0);
        this.this$0 = upiActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final ArrayList<String> invoke() {
        Bundle extras = this.this$0.getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        return extras.getStringArrayList(Constants.Navigation.OFFER_TAGS);
    }
}
