package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class bsa {
    final Unsafe a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bsa(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract byte a(long j);

    public abstract double b(Object obj, long j);

    public abstract float c(Object obj, long j);

    public abstract void d(long j, byte[] bArr, long j2, long j3);

    public abstract void e(Object obj, long j, boolean z);

    public abstract void f(Object obj, long j, byte b2);

    public abstract void g(Object obj, long j, double d);

    public abstract void h(Object obj, long j, float f);

    public abstract boolean i(Object obj, long j);

    public final int j(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int k(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public final int l(Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final long m(Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final long n(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final Object o(Object obj, long j) {
        return this.a.getObject(obj, j);
    }

    public final void p(Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public final void q(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public final void r(Object obj, long j, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }

    public final boolean s() {
        Unsafe unsafe = this.a;
        if (unsafe != null) {
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
                return true;
            } catch (Throwable th) {
                Logger.getLogger(bsb.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        return false;
    }

    public final boolean t() {
        Field G;
        Unsafe unsafe = this.a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                G = bsb.G();
                return G != null;
            } catch (Throwable th) {
                Logger.getLogger(bsb.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        return false;
    }
}
