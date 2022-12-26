package com.clevertap.android.sdk.inapp;

import android.view.View;
/* loaded from: classes4.dex */
class CTInAppBaseFragment$ah$a implements View.OnClickListener {
    final /* synthetic */ CTInAppBaseFragment ah$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CTInAppBaseFragment$ah$a(CTInAppBaseFragment cTInAppBaseFragment) {
        this.ah$a = cTInAppBaseFragment;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.ah$a.toString(((Integer) view.getTag()).intValue());
    }
}
