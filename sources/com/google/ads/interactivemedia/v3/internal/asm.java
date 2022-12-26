package com.google.ads.interactivemedia.v3.internal;

import android.os.RemoteException;
import android.util.Log;
/* loaded from: classes4.dex */
public final class asm {
    final /* synthetic */ asn a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f701b;
    private int c;
    private int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ asm(asn asnVar, byte[] bArr) {
        this.a = asnVar;
        this.f701b = bArr;
    }

    public final void a() {
        synchronized (this) {
            try {
                asn asnVar = this.a;
                if (asnVar.f702b) {
                    asnVar.a.h(this.f701b);
                    this.a.a.g(this.c);
                    this.a.a.f(this.d);
                    this.a.a.j();
                    this.a.a.e();
                }
            } catch (RemoteException e) {
                Log.d("GASS", "Clearcut log failed", e);
            }
        }
    }

    public final void b(int i) {
        this.d = i;
    }

    public final void c(int i) {
        this.c = i;
    }
}
