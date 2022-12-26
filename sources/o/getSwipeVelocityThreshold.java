package o;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import sun.misc.Unsafe;
/* loaded from: classes7.dex */
public final class getSwipeVelocityThreshold {
    private static final int HaptikSDK$a;
    private static final long HaptikSDK$b;
    private static final long HaptikSDK$c;
    private static final long HaptikSDK$d;
    private static final boolean HaptikSDK$e;
    private static final boolean HaptikWebView;
    private static final long ICustomTabsCallback;
    private static final long a;
    private static final long ag$a;
    static final boolean ah$a;
    private static final long ah$b;
    private static final boolean aj$a;
    private static final toString ak;
    private static final long ak$a;
    private static final java.util.logging.Logger ak$b = java.util.logging.Logger.getLogger(getSwipeVelocityThreshold.class.getName());
    private static final Unsafe extraCallback = values();
    private static final boolean getInitSettings;
    private static final long getSignupData;
    private static final long invoke;
    private static final Class<?> isLogoutPending;
    private static final long onXdkEvent;
    static final long toString;
    private static final long valueOf;
    private static final long values;

    static {
        Class<?> cls;
        cls = setSpanSizeLookup.ah$a;
        isLogoutPending = cls;
        aj$a = toString(Long.TYPE);
        getInitSettings = toString(Integer.TYPE);
        ak = ah$b();
        HaptikWebView = HaptikSDK$a();
        HaptikSDK$e = HaptikSDK$b();
        long values2 = values(byte[].class);
        toString = values2;
        valueOf = values(boolean[].class);
        values = ag$a(boolean[].class);
        HaptikSDK$d = values(int[].class);
        getSignupData = ag$a(int[].class);
        onXdkEvent = values(long[].class);
        a = ag$a(long[].class);
        invoke = values(float[].class);
        HaptikSDK$b = ag$a(float[].class);
        ah$b = values(double[].class);
        HaptikSDK$c = ag$a(double[].class);
        ICustomTabsCallback = values(Object[].class);
        ak$a = ag$a(Object[].class);
        ag$a = ag$a(valueOf());
        HaptikSDK$a = (int) (7 & values2);
        ah$a = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private getSwipeVelocityThreshold() {
    }

    public static <T> T valueOf(Class<T> cls) {
        try {
            return (T) extraCallback.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static long values(Field field) {
        return ak.ah$a(field);
    }

    private static int values(Class<?> cls) {
        if (HaptikSDK$e) {
            return ak.values(cls);
        }
        return -1;
    }

    private static int ag$a(Class<?> cls) {
        if (HaptikSDK$e) {
            return ak.ah$a(cls);
        }
        return -1;
    }

    public static int HaptikSDK$c(Object obj, long j) {
        return ak.ah$a(obj, j);
    }

    public static void values(Object obj, long j, int i) {
        ak.ag$a(obj, j, i);
    }

    public static long invoke(Object obj, long j) {
        return ak.HaptikSDK$c(obj, j);
    }

    public static void values(Object obj, long j, long j2) {
        ak.values(obj, j, j2);
    }

    public static boolean values(Object obj, long j) {
        return ak.toString(obj, j);
    }

    public static void ag$a(Object obj, long j, boolean z) {
        ak.values(obj, j, z);
    }

    public static float HaptikSDK$b(Object obj, long j) {
        return ak.ag$a(obj, j);
    }

    public static void values(Object obj, long j, float f) {
        ak.ah$a(obj, j, f);
    }

    public static double ah$b(Object obj, long j) {
        return ak.valueOf(obj, j);
    }

    public static void valueOf(Object obj, long j, double d) {
        ak.toString(obj, j, d);
    }

    public static Object HaptikSDK$a(Object obj, long j) {
        return ak.ah$b(obj, j);
    }

    public static void ag$a(Object obj, long j, Object obj2) {
        ak.ag$a(obj, j, obj2);
    }

    public static byte values(byte[] bArr, long j) {
        return ak.values(bArr, toString + j);
    }

    public static void values(byte[] bArr, long j, byte b2) {
        ak.ah$a((Object) bArr, toString + j, b2);
    }

    public static void valueOf(long j, byte[] bArr, long j2, long j3) {
        ak.ah$a(j, bArr, j2, j3);
    }

    public static byte valueOf(long j) {
        return ak.ah$a(j);
    }

    public static Unsafe values() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: o.getSwipeVelocityThreshold.1
                @Override // java.security.PrivilegedExceptionAction
                /* renamed from: ah$a */
                public Unsafe run() throws Exception {
                    Field[] declaredFields;
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    private static toString ah$b() {
        Unsafe unsafe = extraCallback;
        if (unsafe == null) {
            return null;
        }
        if (setSpanSizeLookup.valueOf()) {
            if (aj$a) {
                return new valueOf(unsafe);
            }
            if (getInitSettings) {
                return new toString(unsafe) { // from class: o.getSwipeVelocityThreshold$ag$a
                    @Override // o.getSwipeVelocityThreshold.toString
                    public byte ah$a(long j) {
                        throw new UnsupportedOperationException();
                    }

                    @Override // o.getSwipeVelocityThreshold.toString
                    public long ag$a(long j) {
                        throw new UnsupportedOperationException();
                    }

                    @Override // o.getSwipeVelocityThreshold.toString
                    public byte values(Object obj, long j) {
                        return getSwipeVelocityThreshold.ah$a ? getSwipeVelocityThreshold.getInitSettings(obj, j) : getSwipeVelocityThreshold.HaptikWebView(obj, j);
                    }

                    @Override // o.getSwipeVelocityThreshold.toString
                    public void ah$a(Object obj, long j, byte b2) {
                        if (getSwipeVelocityThreshold.ah$a) {
                            getSwipeVelocityThreshold.ah$a(obj, j, b2);
                        } else {
                            getSwipeVelocityThreshold.values(obj, j, b2);
                        }
                    }

                    @Override // o.getSwipeVelocityThreshold.toString
                    public boolean toString(Object obj, long j) {
                        return getSwipeVelocityThreshold.ah$a ? getSwipeVelocityThreshold.HaptikSDK$e(obj, j) : getSwipeVelocityThreshold.HaptikSDK$d(obj, j);
                    }

                    @Override // o.getSwipeVelocityThreshold.toString
                    public void values(Object obj, long j, boolean z) {
                        if (getSwipeVelocityThreshold.ah$a) {
                            getSwipeVelocityThreshold.toString(obj, j, z);
                        } else {
                            getSwipeVelocityThreshold.values(obj, j, z);
                        }
                    }

                    @Override // o.getSwipeVelocityThreshold.toString
                    public float ag$a(Object obj, long j) {
                        return Float.intBitsToFloat(ah$a(obj, j));
                    }

                    @Override // o.getSwipeVelocityThreshold.toString
                    public void ah$a(Object obj, long j, float f) {
                        ag$a(obj, j, Float.floatToIntBits(f));
                    }

                    @Override // o.getSwipeVelocityThreshold.toString
                    public double valueOf(Object obj, long j) {
                        return Double.longBitsToDouble(HaptikSDK$c(obj, j));
                    }

                    @Override // o.getSwipeVelocityThreshold.toString
                    public void toString(Object obj, long j, double d) {
                        values(obj, j, Double.doubleToLongBits(d));
                    }

                    @Override // o.getSwipeVelocityThreshold.toString
                    public void ah$a(long j, byte[] bArr, long j2, long j3) {
                        throw new UnsupportedOperationException();
                    }
                };
            }
            return null;
        }
        return new values(unsafe);
    }

    private static boolean HaptikSDK$b() {
        Unsafe unsafe = extraCallback;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (setSpanSizeLookup.valueOf()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            java.util.logging.Logger logger = ak$b;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean HaptikSDK$a() {
        Unsafe unsafe = extraCallback;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (valueOf() == null) {
                return false;
            }
            if (setSpanSizeLookup.valueOf()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            java.util.logging.Logger logger = ak$b;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean toString(Class<?> cls) {
        if (setSpanSizeLookup.valueOf()) {
            try {
                Class<?> cls2 = isLogoutPending;
                cls2.getMethod("peekLong", cls, Boolean.TYPE);
                cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
                cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
                cls2.getMethod("peekInt", cls, Boolean.TYPE);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
                cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    private static Field valueOf() {
        Field ah$a2;
        if (!setSpanSizeLookup.valueOf() || (ah$a2 = ah$a(Buffer.class, "effectiveDirectAddress")) == null) {
            Field ah$a3 = ah$a(Buffer.class, "address");
            if (ah$a3 == null || ah$a3.getType() != Long.TYPE) {
                return null;
            }
            return ah$a3;
        }
        return ah$a2;
    }

    private static long ag$a(Field field) {
        toString tostring;
        if (field == null || (tostring = ak) == null) {
            return -1L;
        }
        return tostring.ah$a(field);
    }

    private static Field ah$a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* loaded from: classes7.dex */
    public static abstract class toString {
        Unsafe ah$a;

        public abstract float ag$a(Object obj, long j);

        public abstract long ag$a(long j);

        public abstract byte ah$a(long j);

        public abstract void ah$a(long j, byte[] bArr, long j2, long j3);

        public abstract void ah$a(Object obj, long j, byte b2);

        public abstract void ah$a(Object obj, long j, float f);

        public abstract void toString(Object obj, long j, double d);

        public abstract boolean toString(Object obj, long j);

        public abstract double valueOf(Object obj, long j);

        public abstract byte values(Object obj, long j);

        public abstract void values(Object obj, long j, boolean z);

        public toString(Unsafe unsafe) {
            this.ah$a = unsafe;
        }

        public final long ah$a(Field field) {
            return this.ah$a.objectFieldOffset(field);
        }

        public final int ah$a(Object obj, long j) {
            return this.ah$a.getInt(obj, j);
        }

        public final void ag$a(Object obj, long j, int i) {
            this.ah$a.putInt(obj, j, i);
        }

        public final long HaptikSDK$c(Object obj, long j) {
            return this.ah$a.getLong(obj, j);
        }

        public final void values(Object obj, long j, long j2) {
            this.ah$a.putLong(obj, j, j2);
        }

        public final Object ah$b(Object obj, long j) {
            return this.ah$a.getObject(obj, j);
        }

        public final void ag$a(Object obj, long j, Object obj2) {
            this.ah$a.putObject(obj, j, obj2);
        }

        public final int values(Class<?> cls) {
            return this.ah$a.arrayBaseOffset(cls);
        }

        public final int ah$a(Class<?> cls) {
            return this.ah$a.arrayIndexScale(cls);
        }
    }

    /* loaded from: classes7.dex */
    public static final class values extends toString {
        values(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public byte ah$a(long j) {
            return this.ah$a.getByte(j);
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public long ag$a(long j) {
            return this.ah$a.getLong(j);
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public byte values(Object obj, long j) {
            return this.ah$a.getByte(obj, j);
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public void ah$a(Object obj, long j, byte b2) {
            this.ah$a.putByte(obj, j, b2);
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public boolean toString(Object obj, long j) {
            return this.ah$a.getBoolean(obj, j);
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public void values(Object obj, long j, boolean z) {
            this.ah$a.putBoolean(obj, j, z);
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public float ag$a(Object obj, long j) {
            return this.ah$a.getFloat(obj, j);
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public void ah$a(Object obj, long j, float f) {
            this.ah$a.putFloat(obj, j, f);
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public double valueOf(Object obj, long j) {
            return this.ah$a.getDouble(obj, j);
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public void toString(Object obj, long j, double d) {
            this.ah$a.putDouble(obj, j, d);
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public void ah$a(long j, byte[] bArr, long j2, long j3) {
            this.ah$a.copyMemory((Object) null, j, bArr, getSwipeVelocityThreshold.toString + j2, j3);
        }
    }

    /* loaded from: classes7.dex */
    public static final class valueOf extends toString {
        valueOf(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public byte ah$a(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public long ag$a(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public byte values(Object obj, long j) {
            return getSwipeVelocityThreshold.ah$a ? getSwipeVelocityThreshold.getInitSettings(obj, j) : getSwipeVelocityThreshold.HaptikWebView(obj, j);
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public void ah$a(Object obj, long j, byte b2) {
            if (getSwipeVelocityThreshold.ah$a) {
                getSwipeVelocityThreshold.ah$a(obj, j, b2);
            } else {
                getSwipeVelocityThreshold.values(obj, j, b2);
            }
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public boolean toString(Object obj, long j) {
            return getSwipeVelocityThreshold.ah$a ? getSwipeVelocityThreshold.HaptikSDK$e(obj, j) : getSwipeVelocityThreshold.HaptikSDK$d(obj, j);
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public void values(Object obj, long j, boolean z) {
            if (getSwipeVelocityThreshold.ah$a) {
                getSwipeVelocityThreshold.toString(obj, j, z);
            } else {
                getSwipeVelocityThreshold.values(obj, j, z);
            }
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public float ag$a(Object obj, long j) {
            return Float.intBitsToFloat(ah$a(obj, j));
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public void ah$a(Object obj, long j, float f) {
            ag$a(obj, j, Float.floatToIntBits(f));
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public double valueOf(Object obj, long j) {
            return Double.longBitsToDouble(HaptikSDK$c(obj, j));
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public void toString(Object obj, long j, double d) {
            values(obj, j, Double.doubleToLongBits(d));
        }

        @Override // o.getSwipeVelocityThreshold.toString
        public void ah$a(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }
    }

    public static byte getInitSettings(Object obj, long j) {
        return (byte) ((HaptikSDK$c(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte HaptikWebView(Object obj, long j) {
        return (byte) ((HaptikSDK$c(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static void ah$a(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int HaptikSDK$c2 = HaptikSDK$c(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        values(obj, j2, ((~(255 << i)) & HaptikSDK$c2) | ((b2 & 255) << i));
    }

    public static void values(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b2 & 255) << i;
        values(obj, j2, ((~(255 << i)) & HaptikSDK$c(obj, j2)) | i2);
    }

    public static boolean HaptikSDK$e(Object obj, long j) {
        return getInitSettings(obj, j) != 0;
    }

    public static boolean HaptikSDK$d(Object obj, long j) {
        return HaptikWebView(obj, j) != 0;
    }

    public static void toString(Object obj, long j, boolean z) {
        ah$a(obj, j, z ? (byte) 1 : (byte) 0);
    }

    public static void values(Object obj, long j, boolean z) {
        values(obj, j, z ? (byte) 1 : (byte) 0);
    }
}
