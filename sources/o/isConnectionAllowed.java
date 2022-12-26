package o;

import android.webkit.ValueCallback;
/* loaded from: classes3.dex */
public final /* synthetic */ class isConnectionAllowed implements ValueCallback {
    public static final /* synthetic */ isConnectionAllowed ah$a = new isConnectionAllowed();

    private /* synthetic */ isConnectionAllowed() {
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        isSideAnchor.ag$a((Boolean) obj);
    }
}
