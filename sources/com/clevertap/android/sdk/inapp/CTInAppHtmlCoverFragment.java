package com.clevertap.android.sdk.inapp;

import android.widget.RelativeLayout;
/* loaded from: classes4.dex */
public class CTInAppHtmlCoverFragment extends CTInAppBaseFullHtmlFragment {
    @Override // com.clevertap.android.sdk.inapp.CTInAppBaseFullHtmlFragment
    protected RelativeLayout.LayoutParams HaptikSDK$b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(11, this.invoke.getId());
        layoutParams.addRule(10, this.invoke.getId());
        int valueOf = valueOf(40) / 4;
        layoutParams.setMargins(0, valueOf, valueOf, 0);
        return layoutParams;
    }
}
