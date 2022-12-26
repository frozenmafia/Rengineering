package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.C;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes4.dex */
public final class ln implements Handler.Callback {
    private final ll a;
    private lq e;
    private long f;
    private boolean g;
    private boolean h;
    private boolean i;
    private final wm j;
    private final TreeMap d = new TreeMap();
    private final Handler c = cp.B(this);

    /* renamed from: b  reason: collision with root package name */
    private final aah f1156b = new aah();

    public ln(lq lqVar, ll llVar, wm wmVar) {
        this.e = lqVar;
        this.a = llVar;
        this.j = wmVar;
    }

    private final void i() {
        if (this.g) {
            this.h = true;
            this.g = false;
            ((kx) this.a).a.j();
        }
    }

    public final lm b() {
        return new lm(this, this.j);
    }

    public final void d() {
        this.i = true;
        this.c.removeCallbacksAndMessages(null);
    }

    public final void e(lq lqVar) {
        this.h = false;
        this.f = C.TIME_UNSET;
        this.e = lqVar;
        Iterator it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.e.h) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(long j) {
        lq lqVar = this.e;
        boolean z = false;
        if (lqVar.d) {
            if (this.h) {
                return true;
            }
            Map.Entry ceilingEntry = this.d.ceilingEntry(Long.valueOf(lqVar.h));
            if (ceilingEntry != null && ((Long) ceilingEntry.getValue()).longValue() < j) {
                long longValue = ((Long) ceilingEntry.getKey()).longValue();
                this.f = longValue;
                ((kx) this.a).a.i(longValue);
                z = true;
            }
            if (z) {
                i();
            }
            return z;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(boolean z) {
        if (this.e.d) {
            if (this.h) {
                return true;
            }
            if (z) {
                i();
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.g = true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.i) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        lk lkVar = (lk) message.obj;
        long j = lkVar.a;
        long j2 = lkVar.f1154b;
        TreeMap treeMap = this.d;
        Long valueOf = Long.valueOf(j2);
        Long l = (Long) treeMap.get(valueOf);
        if (l == null) {
            this.d.put(valueOf, Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.d.put(valueOf, Long.valueOf(j));
        }
        return true;
    }
}
