package o;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import o.FingerprintManagerCompat;
/* loaded from: classes3.dex */
public interface hasEnrolledFingerprints {
    public static final hasEnrolledFingerprints ah$a = new hasEnrolledFingerprints() { // from class: o.$default$setTooltipText
        @Override // o.hasEnrolledFingerprints
        public void ah$a() {
        }

        @Override // o.hasEnrolledFingerprints
        public long valueOf() {
            return SystemClock.elapsedRealtime();
        }

        @Override // o.hasEnrolledFingerprints
        public long values() {
            return SystemClock.uptimeMillis();
        }

        @Override // o.hasEnrolledFingerprints
        public FingerprintManagerCompat.CryptoObject values(Looper looper, Handler.Callback callback) {
            return new SupportSubMenu(new Handler(looper, callback));
        }
    };

    void ah$a();

    long valueOf();

    long values();

    FingerprintManagerCompat.CryptoObject values(Looper looper, Handler.Callback callback);
}
