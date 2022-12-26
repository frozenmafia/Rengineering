package com.app.dream11.onboarding;

import com.app.dream11Pro.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reserveEndViewTransition;
/* loaded from: classes3.dex */
final class OnBoardingActivity$contestBeforeCTList$2 extends Lambda implements Styleable.ArcMotion<ArrayList<String>> {
    final /* synthetic */ OnBoardingActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBoardingActivity$contestBeforeCTList$2(OnBoardingActivity onBoardingActivity) {
        super(0);
        this.this$0 = onBoardingActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final ArrayList<String> invoke() {
        return reserveEndViewTransition.values(this.this$0.getString(R.string.res_0x7f120b52), this.this$0.getString(R.string.res_0x7f120648), this.this$0.getString(R.string.res_0x7f1202e4));
    }
}
