package o;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p003firebaseauthapi.zzwq;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import o.LinearLayoutManager;
/* loaded from: classes7.dex */
public final class maybeExecuteBackgroundRunnable implements LinearLayoutManager.SavedState {
    final /* synthetic */ FirebaseAuth values;

    public maybeExecuteBackgroundRunnable(FirebaseAuth firebaseAuth) {
        this.values = firebaseAuth;
    }

    @Override // o.calculateDtToFit
    public final void toString(zzwq zzwqVar, FirebaseUser firebaseUser) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzwqVar);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(firebaseUser);
        firebaseUser.toString(zzwqVar);
        FirebaseAuth.ag$a(this.values, firebaseUser, zzwqVar, true, true);
    }

    @Override // o.assignCoordinateFromPadding
    public final void values(Status status) {
        if (status.getStatusCode() == 17011 || status.getStatusCode() == 17021 || status.getStatusCode() == 17005 || status.getStatusCode() == 17091) {
            this.values.valueOf();
        }
    }
}
