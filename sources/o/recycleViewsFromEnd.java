package o;

import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import o.StableIdStorage;
/* loaded from: classes5.dex */
public final /* synthetic */ class recycleViewsFromEnd implements StableIdStorage.SharedPoolStableIdStorage.valueOf {
    public static final /* synthetic */ recycleViewsFromEnd ah$a = new recycleViewsFromEnd();

    private /* synthetic */ recycleViewsFromEnd() {
    }

    @Override // o.StableIdStorage.SharedPoolStableIdStorage.valueOf
    public final String ag$a(Object obj) {
        return FirebaseCommonRegistrar.valueOf((Context) obj);
    }
}
