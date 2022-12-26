package o;

import com.google.android.gms.internal.measurement.zzef;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;
/* loaded from: classes7.dex */
public final class findOnePartiallyOrCompletelyInvisibleChild implements Callable {
    final /* synthetic */ FirebaseAnalytics ag$a;

    public findOnePartiallyOrCompletelyInvisibleChild(FirebaseAnalytics firebaseAnalytics) {
        this.ag$a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        zzef zzefVar;
        zzefVar = this.ag$a.zzb;
        return zzefVar.zzl();
    }
}
