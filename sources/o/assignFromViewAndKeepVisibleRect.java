package o;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.p003firebaseauthapi.zzi;
import com.google.firebase.FirebaseApp;
/* loaded from: classes5.dex */
public final class assignFromViewAndKeepVisibleRect {
    private static final com.google.android.gms.common.logging.Logger ah$b = new com.google.android.gms.common.logging.Logger("TokenRefresher", "FirebaseAuth:");
    final Runnable HaptikSDK$c;
    final HandlerThread ag$a;
    volatile long ah$a;
    private final FirebaseApp invoke;
    volatile long toString;
    final Handler valueOf;
    final long values;

    public assignFromViewAndKeepVisibleRect(FirebaseApp firebaseApp) {
        ah$b.v("Initializing TokenRefresher", new Object[0]);
        FirebaseApp firebaseApp2 = (FirebaseApp) com.google.android.gms.common.internal.Preconditions.checkNotNull(firebaseApp);
        this.invoke = firebaseApp2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.ag$a = handlerThread;
        handlerThread.start();
        this.valueOf = new zzi(handlerThread.getLooper());
        this.HaptikSDK$c = new setSmoothScrollbarEnabled(this, firebaseApp2.ah$a());
        this.values = 300000L;
    }

    public final void ag$a() {
        this.valueOf.removeCallbacks(this.HaptikSDK$c);
    }

    public final void values() {
        com.google.android.gms.common.logging.Logger logger = ah$b;
        long j = this.toString;
        long j2 = this.values;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Scheduling refresh for ");
        sb.append(j - j2);
        logger.v(sb.toString(), new Object[0]);
        ag$a();
        long currentTimeMillis = DefaultClock.getInstance().currentTimeMillis();
        this.ah$a = Math.max((this.toString - currentTimeMillis) - this.values, 0L) / 1000;
        this.valueOf.postDelayed(this.HaptikSDK$c, this.ah$a * 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void valueOf() {
        long j;
        int i = (int) this.ah$a;
        if (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) {
            long j2 = this.ah$a;
            j = j2 + j2;
        } else {
            j = i != 960 ? 30L : 960L;
        }
        this.ah$a = j;
        this.toString = DefaultClock.getInstance().currentTimeMillis() + (this.ah$a * 1000);
        com.google.android.gms.common.logging.Logger logger = ah$b;
        long j3 = this.toString;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Scheduling refresh for ");
        sb.append(j3);
        logger.v(sb.toString(), new Object[0]);
        this.valueOf.postDelayed(this.HaptikSDK$c, this.ah$a * 1000);
    }
}
