package o;

import com.sendbird.android.constant.StringSet;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public final class getCloseLock {
    private boolean ag$a;
    private long ah$a;
    private long toString;
    private final internalInitInvalidationTracker valueOf = internalInitInvalidationTracker.values();

    public static getCloseLock valueOf() {
        return new getCloseLock();
    }

    public static getCloseLock values() {
        return new getCloseLock().ag$a();
    }

    getCloseLock() {
    }

    public getCloseLock ag$a() {
        assertNotMainThread.valueOf(!this.ag$a, "This stopwatch is already running.");
        this.ag$a = true;
        this.toString = this.valueOf.ag$a();
        return this;
    }

    public getCloseLock ah$a() {
        long ag$a = this.valueOf.ag$a();
        assertNotMainThread.valueOf(this.ag$a, "This stopwatch is already stopped.");
        this.ag$a = false;
        this.ah$a += ag$a - this.toString;
        return this;
    }

    private long HaptikSDK$a() {
        return this.ag$a ? (this.valueOf.ag$a() - this.toString) + this.ah$a : this.ah$a;
    }

    public String toString() {
        long HaptikSDK$a = HaptikSDK$a();
        TimeUnit valueOf = valueOf(HaptikSDK$a);
        return String.format(Locale.ROOT, "%.4g %s", Double.valueOf(HaptikSDK$a / TimeUnit.NANOSECONDS.convert(1L, valueOf)), values(valueOf));
    }

    private static TimeUnit valueOf(long j) {
        if (TimeUnit.DAYS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.DAYS;
        }
        if (TimeUnit.HOURS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.HOURS;
        }
        if (TimeUnit.MINUTES.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MINUTES;
        }
        if (TimeUnit.SECONDS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.SECONDS;
        }
        if (TimeUnit.MILLISECONDS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MILLISECONDS;
        }
        if (TimeUnit.MICROSECONDS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MICROSECONDS;
        }
        return TimeUnit.NANOSECONDS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.getCloseLock$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            valueOf = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                valueOf[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                valueOf[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                valueOf[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                valueOf[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                valueOf[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static String values(TimeUnit timeUnit) {
        switch (AnonymousClass2.valueOf[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return StringSet.s;
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }
}
