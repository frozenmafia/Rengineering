package o;

import java.util.List;
/* loaded from: classes.dex */
public final class isContentView {
    public static final isContentView ag$a = new isContentView();
    private static getDrawerViewAbsoluteGravity ah$a;

    private isContentView() {
    }

    public final getDrawerViewAbsoluteGravity ag$a(setDrawerListener setdrawerlistener, String str, String str2, List<? extends isDrawerView<?>> list) {
        runAnimators.ag$a(setdrawerlistener, "networkClient");
        runAnimators.ag$a(str, "baseUrl");
        runAnimators.ag$a(str2, "appType");
        runAnimators.ag$a(list, "listOfAdapter");
        getDrawerViewAbsoluteGravity getdrawerviewabsolutegravity = ah$a;
        if (getdrawerviewabsolutegravity == null) {
            synchronized (this) {
                getdrawerviewabsolutegravity = new getDrawerViewAbsoluteGravity(setdrawerlistener, str, str2, list);
                ah$a = getdrawerviewabsolutegravity;
            }
        }
        return getdrawerviewabsolutegravity;
    }
}
