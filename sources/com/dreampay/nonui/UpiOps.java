package com.dreampay.nonui;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.apxor.androidsdk.core.ce.Constants;
import com.dreampay.commons.ResponseListener;
import com.dreampay.commons.constants.Constants;
import com.dreampay.commons.upi.UPI;
import com.dreampay.commons.upi.UpiApp;
import com.dreampay.commons.upi.UpiAppsResponse;
import com.dreampay.commons.upi.UpiAvailability;
import com.dreampay.commons.upi.UpiCollectAvailability;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;
import o.getInitCallback;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class UpiOps {
    public static final UpiOps ah$a = new UpiOps();

    private UpiOps() {
    }

    public final void init(Application application) {
        runAnimators.ag$a(application, MimeTypes.BASE_TYPE_APPLICATION);
        getInitCallback.ah$a.toString(application);
    }

    public final void shouldShowUpiSDK(UPI upi, String str, String str2, ResponseListener<UpiAvailability> responseListener) {
        runAnimators.ag$a(upi, "upi");
        runAnimators.ag$a(responseListener, "responseListener");
        getInitCallback.toString(getInitCallback.ah$a, upi, responseListener, str == null ? "" : str, str2 == null ? "" : str2, null, 16, null);
    }

    public final void payWithGPay(Activity activity, String str, String str2, List<String> list, int i) {
        runAnimators.ag$a(activity, Constants.ACTIVITY);
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        getInitCallback.ah$a.ah$a(activity, str, str2, list, i);
    }

    public final void payWithPhonePe(Activity activity, String str, String str2, List<String> list, int i) {
        runAnimators.ag$a(activity, com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        getInitCallback.ah$a.ag$a(activity, str, str2, list, i);
    }

    public final void getUpiAppsList(Context context, String str, String str2, ResponseListener<UpiAppsResponse> responseListener) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(responseListener, "responseListener");
        getInitCallback.ah$a.toString(context, str, str2, responseListener);
    }

    public final void payWithUpiApp(Activity activity, String str, String str2, UpiApp upiApp, int i) {
        runAnimators.ag$a(activity, com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(upiApp, "upiApp");
        getInitCallback.ah$a.toString(activity, str, str2, upiApp, i);
    }

    public final Intent getVpaIntent(Activity activity, String str, String str2, String str3, int i) {
        runAnimators.ag$a(activity, com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(str3, Constants.Navigation.VPA);
        return getInitCallback.ah$a.ah$a(activity, str, str2, str3, i);
    }

    public final void getUpiCollectAvailability(String str, String str2, ResponseListener<UpiCollectAvailability> responseListener) {
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(responseListener, "responseListener");
        getInitCallback.ah$a.ag$a(str, str2, responseListener);
    }
}
