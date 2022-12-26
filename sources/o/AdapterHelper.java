package o;

import com.sendbird.android.constant.StringSet;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface AdapterHelper {

    /* loaded from: classes7.dex */
    public abstract class UpdateOp<K, V> implements cmdToString<K, V> {

        /* loaded from: classes7.dex */
        public interface toString {
            void ag$a(long j);

            void ah$a();

            void ah$a(int i);

            onRemoved valueOf();

            void valueOf(int i);

            void valueOf(long j);
        }

        protected UpdateOp() {
        }
    }

    /* loaded from: classes7.dex */
    public final class Callback {
        private final onDispatchSecondPass ag$a;
        private boolean ah$a;
        private long valueOf;
        private long values;

        public static Callback ag$a() {
            return new Callback();
        }

        public static Callback ah$a() {
            return new Callback().valueOf();
        }

        Callback() {
            onDispatchSecondPass ondispatchsecondpass;
            ondispatchsecondpass = onDispatchSecondPass.valueOf;
            this.ag$a = ondispatchsecondpass;
        }

        public Callback valueOf() {
            markViewHoldersUpdated.ah$a(!this.ah$a, "This stopwatch is already running.");
            this.ah$a = true;
            this.valueOf = this.ag$a.values();
            return this;
        }

        public Callback values() {
            long values = this.ag$a.values();
            markViewHoldersUpdated.ah$a(this.ah$a, "This stopwatch is already stopped.");
            this.ah$a = false;
            this.values += values - this.valueOf;
            return this;
        }

        private long HaptikSDK$a() {
            return this.ah$a ? (this.ag$a.values() - this.valueOf) + this.values : this.values;
        }

        public long ag$a(TimeUnit timeUnit) {
            return timeUnit.convert(HaptikSDK$a(), TimeUnit.NANOSECONDS);
        }

        public String toString() {
            String format;
            long HaptikSDK$a = HaptikSDK$a();
            TimeUnit values = values(HaptikSDK$a);
            format = String.format(Locale.ROOT, "%.4g", Double.valueOf(HaptikSDK$a / TimeUnit.NANOSECONDS.convert(1L, values)));
            String callback = toString(values);
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 1 + String.valueOf(callback).length());
            sb.append(format);
            sb.append(com.dreampay.commons.constants.Constants.WHITE_SPACE);
            sb.append(callback);
            return sb.toString();
        }

        private static TimeUnit values(long j) {
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

        /* renamed from: o.AdapterHelper$Callback$1 */
        /* loaded from: classes7.dex */
        public static /* synthetic */ class AnonymousClass1 {
            static final /* synthetic */ int[] ah$a;

            static {
                int[] iArr = new int[TimeUnit.values().length];
                ah$a = iArr;
                try {
                    iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    ah$a[TimeUnit.MICROSECONDS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    ah$a[TimeUnit.MILLISECONDS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    ah$a[TimeUnit.SECONDS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    ah$a[TimeUnit.MINUTES.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    ah$a[TimeUnit.HOURS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    ah$a[TimeUnit.DAYS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
            }
        }

        private static String toString(TimeUnit timeUnit) {
            switch (AnonymousClass1.ah$a[timeUnit.ordinal()]) {
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
}
