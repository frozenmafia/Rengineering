package o;

import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.common.primitives.Longs;
import o.LocationManagerCompat;
/* loaded from: classes3.dex */
public final class GnssStatusWrapper implements LocationManagerCompat.Api30Impl {
    private long HaptikSDK$a;
    private float HaptikSDK$b;
    private long HaptikSDK$c;
    private final float HaptikSDK$d;
    private final float HaptikSDK$e;
    private final long HaptikWebView;
    private long a;
    private float ag$a;
    private final float ah$a;
    private long ah$b;
    private long ak;
    private float getInitSettings;
    private long getSignupData;
    private final long invoke;
    private long isLogoutPending;
    private final long onXdkEvent;
    private long toString;
    private final float valueOf;
    private long values;

    private static long values(long j, long j2, float f) {
        return (((float) j) * f) + ((1.0f - f) * ((float) j2));
    }

    /* loaded from: classes3.dex */
    public static final class toString {
        private float values = 0.97f;
        private float toString = 1.03f;
        private long ah$a = 1000;
        private float HaptikSDK$b = 1.0E-7f;
        private long valueOf = getElevationDegrees.ah$a(20L);
        private long HaptikSDK$a = getElevationDegrees.ah$a(500L);
        private float ag$a = 0.999f;

        public GnssStatusWrapper valueOf() {
            return new GnssStatusWrapper(this.values, this.toString, this.ah$a, this.HaptikSDK$b, this.valueOf, this.HaptikSDK$a, this.ag$a);
        }
    }

    private GnssStatusWrapper(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.ah$a = f;
        this.valueOf = f2;
        this.HaptikWebView = j;
        this.HaptikSDK$e = f3;
        this.invoke = j2;
        this.onXdkEvent = j3;
        this.HaptikSDK$d = f4;
        this.ah$b = C.TIME_UNSET;
        this.ak = C.TIME_UNSET;
        this.getSignupData = C.TIME_UNSET;
        this.HaptikSDK$a = C.TIME_UNSET;
        this.getInitSettings = f;
        this.HaptikSDK$b = f2;
        this.ag$a = 1.0f;
        this.HaptikSDK$c = C.TIME_UNSET;
        this.values = C.TIME_UNSET;
        this.toString = C.TIME_UNSET;
        this.a = C.TIME_UNSET;
        this.isLogoutPending = C.TIME_UNSET;
    }

    @Override // o.LocationManagerCompat.Api30Impl
    public void values(createWithBitmap$HaptikSDK$b createwithbitmap_haptiksdk_b) {
        float f;
        float f2;
        this.ah$b = getElevationDegrees.ah$a(createwithbitmap_haptiksdk_b.HaptikSDK$b);
        this.getSignupData = getElevationDegrees.ah$a(createwithbitmap_haptiksdk_b.values);
        this.HaptikSDK$a = getElevationDegrees.ah$a(createwithbitmap_haptiksdk_b.toString);
        if (createwithbitmap_haptiksdk_b.ah$b != -3.4028235E38f) {
            f = createwithbitmap_haptiksdk_b.ah$b;
        } else {
            f = this.ah$a;
        }
        this.getInitSettings = f;
        if (createwithbitmap_haptiksdk_b.ag$a != -3.4028235E38f) {
            f2 = createwithbitmap_haptiksdk_b.ag$a;
        } else {
            f2 = this.valueOf;
        }
        this.HaptikSDK$b = f2;
        if (this.getInitSettings == 1.0f && f2 == 1.0f) {
            this.ah$b = C.TIME_UNSET;
        }
        ah$a();
    }

    @Override // o.LocationManagerCompat.Api30Impl
    public void ag$a(long j) {
        this.ak = j;
        ah$a();
    }

    @Override // o.LocationManagerCompat.Api30Impl
    public void values() {
        long j = this.toString;
        if (j == C.TIME_UNSET) {
            return;
        }
        long j2 = j + this.onXdkEvent;
        this.toString = j2;
        long j3 = this.HaptikSDK$a;
        if (j3 != C.TIME_UNSET && j2 > j3) {
            this.toString = j3;
        }
        this.HaptikSDK$c = C.TIME_UNSET;
    }

    @Override // o.LocationManagerCompat.Api30Impl
    public float toString(long j, long j2) {
        if (this.ah$b == C.TIME_UNSET) {
            return 1.0f;
        }
        ag$a(j, j2);
        if (this.HaptikSDK$c != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.HaptikSDK$c < this.HaptikWebView) {
            return this.ag$a;
        }
        this.HaptikSDK$c = SystemClock.elapsedRealtime();
        values(j);
        long j3 = j - this.toString;
        if (Math.abs(j3) < this.invoke) {
            this.ag$a = 1.0f;
        } else {
            this.ag$a = getElevationDegrees.toString((this.HaptikSDK$e * ((float) j3)) + 1.0f, this.getInitSettings, this.HaptikSDK$b);
        }
        return this.ag$a;
    }

    @Override // o.LocationManagerCompat.Api30Impl
    public long valueOf() {
        return this.toString;
    }

    private void ah$a() {
        long j = this.ah$b;
        if (j != C.TIME_UNSET) {
            long j2 = this.ak;
            if (j2 != C.TIME_UNSET) {
                j = j2;
            }
            long j3 = this.getSignupData;
            if (j3 != C.TIME_UNSET && j < j3) {
                j = j3;
            }
            long j4 = this.HaptikSDK$a;
            if (j4 != C.TIME_UNSET && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.values == j) {
            return;
        }
        this.values = j;
        this.toString = j;
        this.a = C.TIME_UNSET;
        this.isLogoutPending = C.TIME_UNSET;
        this.HaptikSDK$c = C.TIME_UNSET;
    }

    private void ag$a(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.a;
        if (j4 == C.TIME_UNSET) {
            this.a = j3;
            this.isLogoutPending = 0L;
            return;
        }
        long max = Math.max(j3, values(j4, j3, this.HaptikSDK$d));
        this.a = max;
        this.isLogoutPending = values(this.isLogoutPending, Math.abs(j3 - max), this.HaptikSDK$d);
    }

    private void values(long j) {
        long j2 = this.a + (this.isLogoutPending * 3);
        if (this.toString > j2) {
            float ah$a = (float) getElevationDegrees.ah$a(this.HaptikWebView);
            this.toString = Longs.ah$a(j2, this.values, this.toString - (((this.ag$a - 1.0f) * ah$a) + ((this.HaptikSDK$b - 1.0f) * ah$a)));
            return;
        }
        long ah$a2 = getElevationDegrees.ah$a(j - (Math.max(0.0f, this.ag$a - 1.0f) / this.HaptikSDK$e), this.toString, j2);
        this.toString = ah$a2;
        long j3 = this.HaptikSDK$a;
        if (j3 == C.TIME_UNSET || ah$a2 <= j3) {
            return;
        }
        this.toString = j3;
    }
}
