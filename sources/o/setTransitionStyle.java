package o;

import o.add;
/* loaded from: classes6.dex */
public abstract class setTransitionStyle implements setReorderingAllowed {
    private static final String TAG = "JSPackagerClient";

    @Override // o.setReorderingAllowed
    public abstract void onRequest(Object obj, add.Cdefault cdefault);

    @Override // o.setReorderingAllowed
    public final void onNotification(Object obj) {
        FragmentActivity.values(TAG, "Notification is not supported");
    }
}
