package com.dreampay.nonui;

import android.app.Activity;
import com.dreampay.commons.ResponseListener;
import com.dreampay.commons.constants.Constants;
import o.getRetryDelay;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class NetBankingOps {
    public static final NetBankingOps ah$a = new NetBankingOps();

    private NetBankingOps() {
    }

    public final void createOrder(String str, String str2, String str3, ResponseListener<String> responseListener) {
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(str3, "bankCode");
        runAnimators.ag$a(responseListener, "listener");
        getRetryDelay.toString.valueOf(str, str2, str3, responseListener);
    }

    public final void payWithBank(Activity activity, String str, String str2, String str3, int i) {
        runAnimators.ag$a(activity, com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(str3, "bankCode");
        getRetryDelay.toString.ah$a(activity, str, str2, str3, i);
    }
}
