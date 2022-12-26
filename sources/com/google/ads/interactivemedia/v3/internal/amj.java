package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* loaded from: classes4.dex */
public final class amj {

    /* renamed from: b  reason: collision with root package name */
    protected volatile Boolean f637b;
    private final anl e;
    private static final ConditionVariable c = new ConditionVariable();
    protected static volatile asn a = null;
    private static volatile Random d = null;

    public amj(anl anlVar) {
        this.e = anlVar;
        anlVar.j().execute(new ami(this, 0));
    }

    public static final int d() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : f().nextInt();
        } catch (RuntimeException unused) {
            return f().nextInt();
        }
    }

    private static Random f() {
        if (d == null) {
            synchronized (amj.class) {
                if (d == null) {
                    d = new Random();
                }
            }
        }
        return d;
    }

    public final void c(int i, int i2, long j, String str, Exception exc) {
        try {
            c.block();
            if (!this.f637b.booleanValue() || a == null) {
                return;
            }
            afg j2 = aff.j();
            j2.a(this.e.a.getPackageName());
            j2.e(j);
            if (str != null) {
                j2.b(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                j2.f(stringWriter.toString());
                j2.d(exc.getClass().getName());
            }
            asm a2 = a.a(((aff) j2.aX()).aw());
            a2.b(i);
            if (i2 != -1) {
                a2.c(i2);
            }
            a2.a();
        } catch (Exception unused) {
        }
    }

    public final void e(int i, long j, String str) {
        c(i, -1, j, str, null);
    }
}
