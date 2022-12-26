package com.dreampay.ui.card;

import android.content.Context;
import android.content.Intent;
import com.dreampay.commons.constants.Constants;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class VscFlowActivity$ag$a {
    public /* synthetic */ VscFlowActivity$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    private VscFlowActivity$ag$a() {
    }

    public final Intent toString(Context context, String str, String str2, String str3, int i) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(str3, "cardToken");
        Intent intent = new Intent(context, VscFlowActivity.class);
        intent.putExtra(Constants.Navigation.BASE_64_OF_REQUEST, str);
        intent.putExtra(Constants.Navigation.CHECKSUM, str2);
        intent.putExtra(Constants.Navigation.CARD_TOKEN, str3);
        intent.putExtra(Constants.Navigation.SFA_MAX_ELIGIBLE_AMOUNT, i);
        return intent;
    }
}
