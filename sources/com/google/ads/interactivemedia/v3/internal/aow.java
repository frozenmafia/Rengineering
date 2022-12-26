package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
/* loaded from: classes4.dex */
public abstract class aow implements Callable {
    protected final anl a;

    /* renamed from: b  reason: collision with root package name */
    protected final String f663b;
    protected final String c;
    protected Method d;
    protected final int e;
    protected final int f;
    protected final age g;

    public aow(anl anlVar, String str, String str2, age ageVar, int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        getClass().getSimpleName();
        this.a = anlVar;
        this.f663b = str;
        this.c = str2;
        this.g = ageVar;
        this.e = i;
        this.f = i2;
    }

    protected abstract void a() throws IllegalAccessException, InvocationTargetException;

    @Override // java.util.concurrent.Callable
    public /* synthetic */ Object call() throws Exception {
        f();
        return null;
    }

    public void f() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method i2 = this.a.i(this.f663b, this.c);
            this.d = i2;
            if (i2 == null) {
                return;
            }
            a();
            amj d = this.a.d();
            if (d == null || (i = this.e) == Integer.MIN_VALUE) {
                return;
            }
            d.c(this.f, i, (System.nanoTime() - nanoTime) / 1000, null, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
