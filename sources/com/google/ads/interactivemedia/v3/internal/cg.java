package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes4.dex */
public final class cg {
    private static cg a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f996b = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    private final Object d = new Object();
    private int e = 0;

    private cg(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        cp.au(context, new cf(this), intentFilter);
    }

    public static cg b(Context context) {
        cg cgVar;
        synchronized (cg.class) {
            if (a == null) {
                a = new cg(context);
            }
            cgVar = a;
        }
        return cgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(cg cgVar, int i) {
        synchronized (cgVar.d) {
            if (cgVar.e == i) {
                return;
            }
            cgVar.e = i;
            Iterator it = cgVar.c.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                xq xqVar = (xq) weakReference.get();
                if (xqVar != null) {
                    xqVar.b(i);
                } else {
                    cgVar.c.remove(weakReference);
                }
            }
        }
    }

    public final int a() {
        int i;
        synchronized (this.d) {
            i = this.e;
        }
        return i;
    }

    public final void d(xq xqVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.c.remove(weakReference);
            }
        }
        this.c.add(new WeakReference(xqVar));
        this.f996b.post(new jb(this, xqVar, 1, (byte[]) null));
    }
}
