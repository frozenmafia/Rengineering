package o;

import o.add;
/* loaded from: classes6.dex */
public abstract class setBreadCrumbShortTitle implements setReorderingAllowed {
    private static final String TAG = "JSPackagerClient";

    @Override // o.setReorderingAllowed
    public abstract void onNotification(Object obj);

    @Override // o.setReorderingAllowed
    public final void onRequest(Object obj, add.Cdefault cdefault) {
        cdefault.ah$a("Request is not supported");
        FragmentActivity.values(TAG, "Request is not supported");
    }
}
