package o;

import android.app.Activity;
import com.dreampay.commons.ResponseListener;
import com.dreampay.commons.constants.Constants;
import com.dreampay.nonui.DreamPay;
/* loaded from: classes.dex */
public final class removeEntry {
    public static final removeEntry ah$a = new removeEntry();

    private removeEntry() {
    }

    public final void values(String str, String str2, String str3, ResponseListener<String> responseListener) {
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(str3, "bankCode");
        runAnimators.ag$a(responseListener, "listener");
        DreamPay.getNetBanking().createOrder(str, str2, str3, responseListener);
    }

    public final void toString(Activity activity, String str, String str2, String str3, int i) {
        runAnimators.ag$a(activity, com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(str3, "bankCode");
        DreamPay.getNetBanking().payWithBank(activity, str, str2, str3, i);
    }
}
