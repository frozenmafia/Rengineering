package com.app.dream11.dream11;

import com.app.dream11Pro.R;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.loadFont;
/* loaded from: classes6.dex */
public final class AppPermissionsDialogUtils$Companion$getAlertBottomSheetDialog$1 extends Lambda implements Styleable.ArcMotion<Void> {
    final /* synthetic */ BaseActivity $activity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppPermissionsDialogUtils$Companion$getAlertBottomSheetDialog$1(BaseActivity baseActivity) {
        super(0);
        this.$activity = baseActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final Void invoke() {
        BaseActivity baseActivity = this.$activity;
        baseActivity.executeActivityFlowState(loadFont.ah$a(baseActivity.getString(R.string.res_0x7f12060d), this.$activity.getString(R.string.res_0x7f120cae)));
        return null;
    }
}
