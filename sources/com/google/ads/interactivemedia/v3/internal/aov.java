package com.google.ads.interactivemedia.v3.internal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public final class aov {
    private final anl a;

    /* renamed from: b  reason: collision with root package name */
    private final String f662b;
    private final String c;
    private final Class[] e;
    private volatile Method d = null;
    private final CountDownLatch f = new CountDownLatch(1);

    public aov(anl anlVar, String str, String str2, Class... clsArr) {
        this.a = anlVar;
        this.f662b = str;
        this.c = str2;
        this.e = clsArr;
        anlVar.j().submit(new aou(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(aov aovVar) {
        CountDownLatch countDownLatch;
        Class loadClass;
        try {
            anl anlVar = aovVar.a;
            loadClass = anlVar.h().loadClass(aovVar.c(anlVar.r(), aovVar.f662b));
        } catch (amx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = aovVar.f;
        } catch (Throwable th) {
            aovVar.f.countDown();
            throw th;
        }
        if (loadClass == null) {
            countDownLatch = aovVar.f;
        } else {
            aovVar.d = loadClass.getMethod(aovVar.c(aovVar.a.r(), aovVar.c), aovVar.e);
            if (aovVar.d == null) {
                countDownLatch = aovVar.f;
            }
            countDownLatch = aovVar.f;
        }
        countDownLatch.countDown();
    }

    private final String c(byte[] bArr, String str) throws amx, UnsupportedEncodingException {
        return new String(this.a.e().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.d != null) {
            return this.d;
        }
        try {
            if (this.f.await(2L, TimeUnit.SECONDS)) {
                return this.d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
