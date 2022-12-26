package o;

import com.google.common.hash.Funnel;
import com.google.common.hash.HashCode;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes7.dex */
public interface ConcatAdapter extends findRelativeAdapterPositionIn {
    HashCode ag$a();

    ConcatAdapter ag$a(int i);

    ConcatAdapter ag$a(long j);

    ConcatAdapter ag$a(CharSequence charSequence, Charset charset);

    ConcatAdapter ah$a(CharSequence charSequence);

    ConcatAdapter ah$a(ByteBuffer byteBuffer);

    ConcatAdapter toString(byte[] bArr, int i, int i2);

    ConcatAdapter valueOf(byte b2);

    <T> ConcatAdapter valueOf(T t, Funnel<? super T> funnel);

    /* loaded from: classes5.dex */
    public final class Config {

        /* loaded from: classes7.dex */
        public abstract class Builder {
            Builder() {
            }
        }

        public static int ag$a(String str, int i) {
            if (i > 0) {
                return i;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
            sb.append(str);
            sb.append(" (");
            sb.append(i);
            sb.append(") must be > 0");
            throw new IllegalArgumentException(sb.toString());
        }

        /* loaded from: classes7.dex */
        public final class StableIdMode {
            private static final Map<Class<?>, Class<?>> ag$a;
            private static final Map<Class<?>, Class<?>> ah$a;

            static {
                LinkedHashMap linkedHashMap = new LinkedHashMap(16);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
                valueOf(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
                valueOf(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
                valueOf(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
                valueOf(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
                valueOf(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
                valueOf(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
                valueOf(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
                valueOf(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
                valueOf(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
                ah$a = Collections.unmodifiableMap(linkedHashMap);
                ag$a = Collections.unmodifiableMap(linkedHashMap2);
            }

            private static void valueOf(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
                map.put(cls, cls2);
                map2.put(cls2, cls);
            }

            public static Set<Class<?>> ag$a() {
                return ag$a.keySet();
            }

            public static <T> Class<T> valueOf(Class<T> cls) {
                markViewHoldersUpdated.toString(cls);
                Class<T> cls2 = (Class<T>) ah$a.get(cls);
                return cls2 == null ? cls : cls2;
            }

            public static <T> Class<T> values(Class<T> cls) {
                markViewHoldersUpdated.toString(cls);
                Class<T> cls2 = (Class<T>) ag$a.get(cls);
                return cls2 == null ? cls : cls2;
            }
        }

        public static void ag$a(boolean z) {
            if (!z) {
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            }
        }

        public static void valueOf(boolean z, double d, RoundingMode roundingMode) {
            if (z) {
                return;
            }
            String valueOf = String.valueOf(roundingMode);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 83);
            sb.append("rounded value is out of range for input ");
            sb.append(d);
            sb.append(" and rounding mode ");
            sb.append(valueOf);
            throw new ArithmeticException(sb.toString());
        }

        public static void valueOf(boolean z, String str, int i, int i2) {
            if (z) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("overflow: ");
            sb.append(str);
            sb.append("(");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(")");
            throw new ArithmeticException(sb.toString());
        }
    }
}
