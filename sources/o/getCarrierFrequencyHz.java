package o;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.TimestampAdjuster;
/* loaded from: classes3.dex */
public final class getCarrierFrequencyHz {
    private long ag$a;
    private final ThreadLocal<Long> ah$a = new ThreadLocal<>();
    private long valueOf;
    private long values;

    public getCarrierFrequencyHz(long j) {
        HaptikSDK$a(j);
    }

    public void toString(boolean z, long j) throws InterruptedException {
        synchronized (this) {
            FingerprintManagerCompat.ah$a(this.valueOf == TimestampAdjuster.MODE_SHARED);
            if (this.values != C.TIME_UNSET) {
                return;
            }
            if (z) {
                this.ah$a.set(Long.valueOf(j));
            } else {
                while (this.values == C.TIME_UNSET) {
                    wait();
                }
            }
        }
    }

    public long valueOf() {
        long j;
        synchronized (this) {
            j = this.valueOf;
            if (j == Long.MAX_VALUE || j == TimestampAdjuster.MODE_SHARED) {
                j = C.TIME_UNSET;
            }
        }
        return j;
    }

    public long values() {
        long valueOf;
        synchronized (this) {
            long j = this.ag$a;
            if (j != C.TIME_UNSET) {
                valueOf = j + this.values;
            } else {
                valueOf = valueOf();
            }
        }
        return valueOf;
    }

    public long ag$a() {
        long j;
        synchronized (this) {
            j = this.values;
        }
        return j;
    }

    public void HaptikSDK$a(long j) {
        synchronized (this) {
            this.valueOf = j;
            this.values = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
            this.ag$a = C.TIME_UNSET;
        }
    }

    public long valueOf(long j) {
        synchronized (this) {
            if (j == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            long j2 = this.ag$a;
            if (j2 != C.TIME_UNSET) {
                long ag$a = ag$a(j2);
                long j3 = (4294967296L + ag$a) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - ag$a) < Math.abs(j - ag$a)) {
                    j = j4;
                }
            }
            return toString(ah$a(j));
        }
    }

    public long toString(long j) {
        synchronized (this) {
            if (j == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            if (this.values == C.TIME_UNSET) {
                long j2 = this.valueOf;
                if (j2 == TimestampAdjuster.MODE_SHARED) {
                    j2 = ((Long) FingerprintManagerCompat.toString(this.ah$a.get())).longValue();
                }
                this.values = j2 - j;
                notifyAll();
            }
            this.ag$a = j;
            return j + this.values;
        }
    }

    public static long ah$a(long j) {
        return (j * 1000000) / 90000;
    }

    public static long values(long j) {
        return ag$a(j) % 8589934592L;
    }

    public static long ag$a(long j) {
        return (j * 90000) / 1000000;
    }
}
