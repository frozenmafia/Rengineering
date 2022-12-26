package com.google.ads.interactivemedia.v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
/* loaded from: classes4.dex */
public final class agu {
    private static final agu a = new agu();

    /* renamed from: b  reason: collision with root package name */
    private Context f550b;
    private BroadcastReceiver c;
    private boolean d;
    private boolean e;
    private agy f;

    private agu() {
    }

    public static agu a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(agu aguVar, boolean z) {
        if (aguVar.e != z) {
            aguVar.e = z;
            if (aguVar.d) {
                aguVar.h();
                if (aguVar.f != null) {
                    if (aguVar.f()) {
                        ahn.c().h();
                    } else {
                        ahn.c().g();
                    }
                }
            }
        }
    }

    private final void h() {
        boolean z = this.e;
        for (agm agmVar : ags.a().c()) {
            ahc h = agmVar.h();
            if (h.k()) {
                agx.a().b(h.a(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    public final void c(Context context) {
        this.f550b = context.getApplicationContext();
    }

    public final void d() {
        this.c = new agt(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f550b.registerReceiver(this.c, intentFilter);
        this.d = true;
        h();
    }

    public final void e() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f550b;
        if (context != null && (broadcastReceiver = this.c) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.c = null;
        }
        this.d = false;
        this.e = false;
        this.f = null;
    }

    public final boolean f() {
        return !this.e;
    }

    public final void g(agy agyVar) {
        this.f = agyVar;
    }
}
