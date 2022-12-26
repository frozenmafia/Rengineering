package o;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import sun.misc.Unsafe;
/* loaded from: classes5.dex */
public final class lambda$insert$4 {
    private static final int HaptikSDK$a;
    private static final long HaptikSDK$b;
    private static final long HaptikSDK$c;
    private static final long HaptikSDK$d;
    private static final long ICustomTabsCallback;
    private static final long a;
    private static final long ag$a;
    private static final long ah$a;
    private static final long ah$b;
    private static final long extraCallback;
    private static final long getInitSettings;
    private static final long invoke;
    private static final long isLogoutPending;
    static final boolean toString;
    private static final long valueOf;
    static final long values;
    private static final Unsafe ak$b = ah$a();
    private static final Class<?> ak = cacheReferenceLineAndClear.valueOf();
    private static final boolean aj$a = ag$a(Long.TYPE);
    private static final boolean HaptikSDK$e = ag$a(Integer.TYPE);
    private static final valueOf onXdkEvent = invoke();
    private static final boolean getSignupData = ah$b();
    private static final boolean HaptikWebView = HaptikSDK$c();

    static {
        long valueOf2 = valueOf(byte[].class);
        values = valueOf2;
        ah$a = valueOf(boolean[].class);
        ag$a = values(boolean[].class);
        HaptikSDK$d = valueOf(int[].class);
        getInitSettings = values(int[].class);
        a = valueOf(long[].class);
        isLogoutPending = values(long[].class);
        ah$b = valueOf(float[].class);
        HaptikSDK$c = values(float[].class);
        HaptikSDK$b = valueOf(double[].class);
        invoke = values(double[].class);
        ICustomTabsCallback = valueOf(Object[].class);
        extraCallback = values(Object[].class);
        valueOf = ah$a(values());
        HaptikSDK$a = (int) (7 & valueOf2);
        toString = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private lambda$insert$4() {
    }

    public static boolean valueOf() {
        return HaptikWebView;
    }

    public static <T> T toString(Class<T> cls) {
        try {
            return (T) ak$b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long valueOf(Field field) {
        return onXdkEvent.valueOf(field);
    }

    private static int valueOf(Class<?> cls) {
        if (HaptikWebView) {
            return onXdkEvent.ah$a(cls);
        }
        return -1;
    }

    private static int values(Class<?> cls) {
        if (HaptikWebView) {
            return onXdkEvent.toString(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int HaptikSDK$b(Object obj, long j) {
        return onXdkEvent.valueOf(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void values(Object obj, long j, int i) {
        onXdkEvent.toString(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void valueOf(Object obj, long j, float f) {
        onXdkEvent.values(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double invoke(Object obj, long j) {
        return onXdkEvent.values(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void toString(Object obj, long j, double d) {
        onXdkEvent.ag$a(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void valueOf(Object obj, long j, Object obj2) {
        onXdkEvent.ag$a(obj, j, obj2);
    }

    public static void values(byte[] bArr, long j, byte b2) {
        onXdkEvent.toString((Object) bArr, values + j, b2);
    }

    public static byte valueOf(long j) {
        return onXdkEvent.ah$a(j);
    }

    public static long toString(long j) {
        return onXdkEvent.toString(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe ah$a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: o.lambda$insert$4.1
                @Override // java.security.PrivilegedExceptionAction
                /* renamed from: valueOf */
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

    private static valueOf invoke() {
        final Unsafe unsafe = ak$b;
        if (unsafe == null) {
            return null;
        }
        if (cacheReferenceLineAndClear.ah$a()) {
            if (aj$a) {
                return new valueOf(unsafe) { // from class: o.lambda$insert$4$ag$a
                    @Override // o.lambda$insert$4.valueOf
                    public byte ah$a(long j) {
                        throw new UnsupportedOperationException();
                    }

                    @Override // o.lambda$insert$4.valueOf
                    public long toString(long j) {
                        throw new UnsupportedOperationException();
                    }

                    @Override // o.lambda$insert$4.valueOf
                    public byte toString(Object obj, long j) {
                        return lambda$insert$4.toString ? lambda$insert$4.HaptikSDK$e(obj, j) : lambda$insert$4.getInitSettings(obj, j);
                    }

                    @Override // o.lambda$insert$4.valueOf
                    public void toString(Object obj, long j, byte b2) {
                        if (lambda$insert$4.toString) {
                            lambda$insert$4.ah$a(obj, j, b2);
                        } else {
                            lambda$insert$4.ag$a(obj, j, b2);
                        }
                    }

                    @Override // o.lambda$insert$4.valueOf
                    public boolean ah$a(Object obj, long j) {
                        return lambda$insert$4.toString ? lambda$insert$4.HaptikSDK$d(obj, j) : lambda$insert$4.HaptikWebView(obj, j);
                    }

                    @Override // o.lambda$insert$4.valueOf
                    public void ah$a(Object obj, long j, boolean z) {
                        if (lambda$insert$4.toString) {
                            lambda$insert$4.values(obj, j, z);
                        } else {
                            lambda$insert$4.toString(obj, j, z);
                        }
                    }

                    @Override // o.lambda$insert$4.valueOf
                    public float ag$a(Object obj, long j) {
                        return Float.intBitsToFloat(valueOf(obj, j));
                    }

                    @Override // o.lambda$insert$4.valueOf
                    public void values(Object obj, long j, float f) {
                        toString(obj, j, Float.floatToIntBits(f));
                    }

                    @Override // o.lambda$insert$4.valueOf
                    public double values(Object obj, long j) {
                        return Double.longBitsToDouble(HaptikSDK$c(obj, j));
                    }

                    @Override // o.lambda$insert$4.valueOf
                    public void ag$a(Object obj, long j, double d) {
                        toString(obj, j, Double.doubleToLongBits(d));
                    }

                    @Override // o.lambda$insert$4.valueOf
                    public void ah$a(long j, byte[] bArr, long j2, long j3) {
                        throw new UnsupportedOperationException();
                    }
                };
            }
            if (HaptikSDK$e) {
                return new toString(unsafe);
            }
            return null;
        }
        return new values(unsafe);
    }

    private static boolean HaptikSDK$c() {
        Unsafe unsafe = ak$b;
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
            if (cacheReferenceLineAndClear.ah$a()) {
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
            java.util.logging.Logger logger = java.util.logging.Logger.getLogger(lambda$insert$4.class.getName());
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean ah$b() {
        Unsafe unsafe = ak$b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (values() == null) {
                return false;
            }
            if (cacheReferenceLineAndClear.ah$a()) {
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
            java.util.logging.Logger logger = java.util.logging.Logger.getLogger(lambda$insert$4.class.getName());
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean ag$a(Class<?> cls) {
        if (cacheReferenceLineAndClear.ah$a()) {
            try {
                Class<?> cls2 = ak;
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

    private static Field values() {
        Field ag$a2;
        if (!cacheReferenceLineAndClear.ah$a() || (ag$a2 = ag$a(Buffer.class, "effectiveDirectAddress")) == null) {
            Field ag$a3 = ag$a(Buffer.class, "address");
            if (ag$a3 == null || ag$a3.getType() != Long.TYPE) {
                return null;
            }
            return ag$a3;
        }
        return ag$a2;
    }

    private static long ah$a(Field field) {
        valueOf valueof;
        if (field == null || (valueof = onXdkEvent) == null) {
            return -1L;
        }
        return valueof.valueOf(field);
    }

    private static Field ag$a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static abstract class valueOf {
        Unsafe valueOf;

        public abstract float ag$a(Object obj, long j);

        public abstract void ag$a(Object obj, long j, double d);

        public abstract byte ah$a(long j);

        public abstract void ah$a(long j, byte[] bArr, long j2, long j3);

        public abstract void ah$a(Object obj, long j, boolean z);

        public abstract boolean ah$a(Object obj, long j);

        public abstract byte toString(Object obj, long j);

        public abstract long toString(long j);

        public abstract void toString(Object obj, long j, byte b2);

        public abstract double values(Object obj, long j);

        public abstract void values(Object obj, long j, float f);

        /* JADX INFO: Access modifiers changed from: package-private */
        public valueOf(Unsafe unsafe) {
            this.valueOf = unsafe;
        }

        public final long valueOf(Field field) {
            return this.valueOf.objectFieldOffset(field);
        }

        public final int valueOf(Object obj, long j) {
            return this.valueOf.getInt(obj, j);
        }

        public final void toString(Object obj, long j, int i) {
            this.valueOf.putInt(obj, j, i);
        }

        public final long HaptikSDK$c(Object obj, long j) {
            return this.valueOf.getLong(obj, j);
        }

        public final void toString(Object obj, long j, long j2) {
            this.valueOf.putLong(obj, j, j2);
        }

        public final Object invoke(Object obj, long j) {
            return this.valueOf.getObject(obj, j);
        }

        public final void ag$a(Object obj, long j, Object obj2) {
            this.valueOf.putObject(obj, j, obj2);
        }

        public final int ah$a(Class<?> cls) {
            return this.valueOf.arrayBaseOffset(cls);
        }

        public final int toString(Class<?> cls) {
            return this.valueOf.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class values extends valueOf {
        values(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.lambda$insert$4.valueOf
        public byte ah$a(long j) {
            return this.valueOf.getByte(j);
        }

        @Override // o.lambda$insert$4.valueOf
        public long toString(long j) {
            return this.valueOf.getLong(j);
        }

        @Override // o.lambda$insert$4.valueOf
        public byte toString(Object obj, long j) {
            return this.valueOf.getByte(obj, j);
        }

        @Override // o.lambda$insert$4.valueOf
        public void toString(Object obj, long j, byte b2) {
            this.valueOf.putByte(obj, j, b2);
        }

        @Override // o.lambda$insert$4.valueOf
        public boolean ah$a(Object obj, long j) {
            return this.valueOf.getBoolean(obj, j);
        }

        @Override // o.lambda$insert$4.valueOf
        public void ah$a(Object obj, long j, boolean z) {
            this.valueOf.putBoolean(obj, j, z);
        }

        @Override // o.lambda$insert$4.valueOf
        public float ag$a(Object obj, long j) {
            return this.valueOf.getFloat(obj, j);
        }

        @Override // o.lambda$insert$4.valueOf
        public void values(Object obj, long j, float f) {
            this.valueOf.putFloat(obj, j, f);
        }

        @Override // o.lambda$insert$4.valueOf
        public double values(Object obj, long j) {
            return this.valueOf.getDouble(obj, j);
        }

        @Override // o.lambda$insert$4.valueOf
        public void ag$a(Object obj, long j, double d) {
            this.valueOf.putDouble(obj, j, d);
        }

        @Override // o.lambda$insert$4.valueOf
        public void ah$a(long j, byte[] bArr, long j2, long j3) {
            this.valueOf.copyMemory((Object) null, j, bArr, lambda$insert$4.values + j2, j3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class toString extends valueOf {
        toString(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.lambda$insert$4.valueOf
        public byte ah$a(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.lambda$insert$4.valueOf
        public long toString(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.lambda$insert$4.valueOf
        public byte toString(Object obj, long j) {
            return lambda$insert$4.toString ? lambda$insert$4.HaptikSDK$e(obj, j) : lambda$insert$4.getInitSettings(obj, j);
        }

        @Override // o.lambda$insert$4.valueOf
        public void toString(Object obj, long j, byte b2) {
            if (lambda$insert$4.toString) {
                lambda$insert$4.ah$a(obj, j, b2);
            } else {
                lambda$insert$4.ag$a(obj, j, b2);
            }
        }

        @Override // o.lambda$insert$4.valueOf
        public boolean ah$a(Object obj, long j) {
            return lambda$insert$4.toString ? lambda$insert$4.HaptikSDK$d(obj, j) : lambda$insert$4.HaptikWebView(obj, j);
        }

        @Override // o.lambda$insert$4.valueOf
        public void ah$a(Object obj, long j, boolean z) {
            if (lambda$insert$4.toString) {
                lambda$insert$4.values(obj, j, z);
            } else {
                lambda$insert$4.toString(obj, j, z);
            }
        }

        @Override // o.lambda$insert$4.valueOf
        public float ag$a(Object obj, long j) {
            return Float.intBitsToFloat(valueOf(obj, j));
        }

        @Override // o.lambda$insert$4.valueOf
        public void values(Object obj, long j, float f) {
            toString(obj, j, Float.floatToIntBits(f));
        }

        @Override // o.lambda$insert$4.valueOf
        public double values(Object obj, long j) {
            return Double.longBitsToDouble(HaptikSDK$c(obj, j));
        }

        @Override // o.lambda$insert$4.valueOf
        public void ag$a(Object obj, long j, double d) {
            toString(obj, j, Double.doubleToLongBits(d));
        }

        @Override // o.lambda$insert$4.valueOf
        public void ah$a(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte HaptikSDK$e(Object obj, long j) {
        return (byte) ((HaptikSDK$b(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getInitSettings(Object obj, long j) {
        return (byte) ((HaptikSDK$b(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ah$a(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int HaptikSDK$b2 = HaptikSDK$b(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        values(obj, j2, ((~(255 << i)) & HaptikSDK$b2) | ((b2 & 255) << i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ag$a(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b2 & 255) << i;
        values(obj, j2, ((~(255 << i)) & HaptikSDK$b(obj, j2)) | i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean HaptikSDK$d(Object obj, long j) {
        return HaptikSDK$e(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean HaptikWebView(Object obj, long j) {
        return getInitSettings(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void values(Object obj, long j, boolean z) {
        ah$a(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toString(Object obj, long j, boolean z) {
        ag$a(obj, j, z ? (byte) 1 : (byte) 0);
    }
}
