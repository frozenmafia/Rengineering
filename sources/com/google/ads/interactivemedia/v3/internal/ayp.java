package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class ayp extends AtomicReference implements Runnable {
    private static final Runnable a = new ayo(null, 0);

    /* renamed from: b  reason: collision with root package name */
    private static final Runnable f768b = new ayo(null, 0);

    private final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        ayn aynVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof ayn)) {
                if (runnable != f768b) {
                    break;
                }
            } else {
                aynVar = (ayn) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = f768b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(aynVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    abstract Object a() throws Exception;

    abstract String b();

    abstract void d(Throwable th);

    abstract void e(Object obj);

    abstract boolean g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            ayn aynVar = new ayn(this);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, aynVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(a)) == f768b) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(a)) == f768b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean z = !g();
            if (z) {
                try {
                    obj = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, a)) {
                            c(currentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, a)) {
                            c(currentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, a)) {
                c(currentThread);
            }
            if (z) {
                e(obj);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof ayn) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
