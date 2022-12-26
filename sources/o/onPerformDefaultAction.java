package o;

import com.app.dream11.dream11.AppConstants;
import com.app.dream11.model.ErrorModel;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class onPerformDefaultAction {
    private static onPerformDefaultAction ag$a;
    List<addTransitionListener> ah$a = new ArrayList();

    public void ag$a() {
    }

    public static onPerformDefaultAction valueOf() {
        if (ag$a == null) {
            ag$a = new onPerformDefaultAction();
        }
        return ag$a;
    }

    public boolean ah$a(ErrorModel.Error error, boolean z) {
        return values(error.getHttpCode(), error.getMsgCode(), error.getApiEndPoint(), z);
    }

    private boolean values(int i, String str, String str2, boolean z) {
        boolean z2 = i == AppConstants.getSignupData && (AppConstants.HaptikSDK$d.equalsIgnoreCase(str) || AppConstants.HaptikWebView.equalsIgnoreCase(str));
        if (z || str2 == null || !str2.contains("/refreshToken")) {
            return z2;
        }
        return false;
    }

    public boolean toString(boolean z, String str) {
        return z && str != null && str.contains("logoutFromAllDevices");
    }
}
