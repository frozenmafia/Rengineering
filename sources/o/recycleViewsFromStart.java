package o;

import android.content.Context;
import o.StableIdStorage;
/* loaded from: classes5.dex */
public final /* synthetic */ class recycleViewsFromStart implements StableIdStorage.SharedPoolStableIdStorage.valueOf {
    public static final /* synthetic */ recycleViewsFromStart values = new recycleViewsFromStart();

    private /* synthetic */ recycleViewsFromStart() {
    }

    @Override // o.StableIdStorage.SharedPoolStableIdStorage.valueOf
    public final String ag$a(Object obj) {
        return ((Context) obj).getApplicationInfo();
    }
}
