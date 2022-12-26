package o;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.internal.p003firebaseauthapi.zzwq;
import com.google.firebase.FirebaseApp;
/* loaded from: classes5.dex */
public final class hasValidAnchor {
    private final assignFromViewAndKeepVisibleRect ag$a;
    private volatile int toString;
    private volatile boolean valueOf;

    public hasValidAnchor(FirebaseApp firebaseApp) {
        Context ag$a = firebaseApp.ag$a();
        assignFromViewAndKeepVisibleRect assignfromviewandkeepvisiblerect = new assignFromViewAndKeepVisibleRect(firebaseApp);
        this.valueOf = false;
        this.toString = 0;
        this.ag$a = assignfromviewandkeepvisiblerect;
        BackgroundDetector.initialize((Application) ag$a.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new BackgroundDetector.BackgroundStateChangeListener() { // from class: o.LinearLayoutManager.SavedState.1
            @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
            public final void onBackgroundStateChanged(boolean z) {
                if (z) {
                    hasValidAnchor.ah$a(hasValidAnchor.this, true);
                    hasValidAnchor.this.ah$a();
                    return;
                }
                hasValidAnchor.ah$a(hasValidAnchor.this, false);
                if (hasValidAnchor.values(hasValidAnchor.this)) {
                    hasValidAnchor.toString(hasValidAnchor.this).values();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ag$a() {
        return this.toString > 0 && !this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean ah$a(hasValidAnchor hasvalidanchor, boolean z) {
        hasvalidanchor.valueOf = z;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ assignFromViewAndKeepVisibleRect toString(hasValidAnchor hasvalidanchor) {
        return hasvalidanchor.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean values(hasValidAnchor hasvalidanchor) {
        return hasvalidanchor.ag$a();
    }

    public final void ah$a() {
        this.ag$a.ag$a();
    }

    public final void valueOf(zzwq zzwqVar) {
        if (zzwqVar == null) {
            return;
        }
        long zzb = zzwqVar.zzb();
        if (zzb <= 0) {
            zzb = 3600;
        }
        long zzc = zzwqVar.zzc();
        assignFromViewAndKeepVisibleRect assignfromviewandkeepvisiblerect = this.ag$a;
        assignfromviewandkeepvisiblerect.toString = zzc + (zzb * 1000);
        assignfromviewandkeepvisiblerect.ah$a = -1L;
        if (ag$a()) {
            this.ag$a.values();
        }
    }

    public final void ag$a(int i) {
        if (i > 0 && this.toString == 0) {
            this.toString = i;
            if (ag$a()) {
                this.ag$a.values();
            }
        } else if (i == 0 && this.toString != 0) {
            this.ag$a.ag$a();
        }
        this.toString = i;
    }
}
