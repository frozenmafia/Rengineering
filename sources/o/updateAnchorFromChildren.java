package o;

import android.content.Context;
import o.StableIdStorage;
/* loaded from: classes5.dex */
public final /* synthetic */ class updateAnchorFromChildren implements StableIdStorage.SharedPoolStableIdStorage.valueOf {
    public static final /* synthetic */ updateAnchorFromChildren ag$a = new updateAnchorFromChildren();

    private /* synthetic */ updateAnchorFromChildren() {
    }

    @Override // o.StableIdStorage.SharedPoolStableIdStorage.valueOf
    public final String ag$a(Object obj) {
        return r1.getPackageManager().getInstallerPackageName(((Context) obj).getPackageName());
    }
}
