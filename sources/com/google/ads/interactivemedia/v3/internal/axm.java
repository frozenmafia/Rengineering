package com.google.ads.interactivemedia.v3.internal;

import com.facebook.hermes.intl.Constants;
import com.sendbird.android.constant.StringSet;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes4.dex */
public abstract class axm<V> extends ayz implements ayq<V> {
    static final boolean a;
    private static final Logger aW;
    private static final a aX;
    private static final Object d;
    volatile d listeners;
    volatile Object value;
    volatile k waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public abstract class a {
        /* synthetic */ a() {
        }

        abstract d a(axm axmVar, d dVar);

        abstract k b(axm axmVar, k kVar);

        abstract void c(k kVar, k kVar2);

        abstract void d(k kVar, Thread thread);

        abstract boolean e(axm axmVar, d dVar, d dVar2);

        abstract boolean f(axm axmVar, Object obj, Object obj2);

        abstract boolean g(axm axmVar, k kVar, k kVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class b {
        static final b a;

        /* renamed from: b  reason: collision with root package name */
        static final b f751b;
        final boolean c;
        final Throwable d;

        static {
            if (axm.a) {
                f751b = null;
                a = null;
                return;
            }
            f751b = new b(false, null);
            a = new b(true, null);
        }

        b(boolean z, Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class c {
        static final c a = new c(new Throwable() { // from class: com.google.ads.interactivemedia.v3.internal.axm.c.1
            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                synchronized (this) {
                }
                return this;
            }
        });

        /* renamed from: b  reason: collision with root package name */
        final Throwable f752b;

        c(Throwable th) {
            atc.k(th);
            this.f752b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class d {
        static final d a = new d();

        /* renamed from: b  reason: collision with root package name */
        final Runnable f753b;
        final Executor c;
        d next;

        d() {
            this.f753b = null;
            this.c = null;
        }

        d(Runnable runnable, Executor executor) {
            this.f753b = runnable;
            this.c = executor;
        }
    }

    /* loaded from: classes4.dex */
    final class e extends a {
        final AtomicReferenceFieldUpdater<k, Thread> a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<k, k> f754b;
        final AtomicReferenceFieldUpdater<axm, k> c;
        final AtomicReferenceFieldUpdater<axm, d> d;
        final AtomicReferenceFieldUpdater<axm, Object> e;

        e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.f754b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final d a(axm axmVar, d dVar) {
            return this.d.getAndSet(axmVar, dVar);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final k b(axm axmVar, k kVar) {
            return this.c.getAndSet(axmVar, kVar);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final void c(k kVar, k kVar2) {
            this.f754b.lazySet(kVar, kVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final void d(k kVar, Thread thread) {
            this.a.lazySet(kVar, thread);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final boolean e(axm axmVar, d dVar, d dVar2) {
            return axn.a(this.d, axmVar, dVar, dVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final boolean f(axm axmVar, Object obj, Object obj2) {
            return axn.a(this.e, axmVar, obj, obj2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final boolean g(axm axmVar, k kVar, k kVar2) {
            return axn.a(this.c, axmVar, kVar, kVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class f<V> implements Runnable {
        final axm<V> a;

        /* renamed from: b  reason: collision with root package name */
        final ayq<? extends V> f755b;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* loaded from: classes4.dex */
    final class g extends a {
        private g() {
        }

        /* synthetic */ g(byte[] bArr) {
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final d a(axm axmVar, d dVar) {
            d dVar2;
            synchronized (axmVar) {
                dVar2 = axmVar.listeners;
                if (dVar2 != dVar) {
                    axmVar.listeners = dVar;
                }
            }
            return dVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final k b(axm axmVar, k kVar) {
            k kVar2;
            synchronized (axmVar) {
                kVar2 = axmVar.waiters;
                if (kVar2 != kVar) {
                    axmVar.waiters = kVar;
                }
            }
            return kVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final void c(k kVar, k kVar2) {
            kVar.next = kVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final void d(k kVar, Thread thread) {
            kVar.thread = thread;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final boolean e(axm axmVar, d dVar, d dVar2) {
            synchronized (axmVar) {
                if (axmVar.listeners == dVar) {
                    axmVar.listeners = dVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final boolean f(axm axmVar, Object obj, Object obj2) {
            synchronized (axmVar) {
                if (axmVar.value == obj) {
                    axmVar.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final boolean g(axm axmVar, k kVar, k kVar2) {
            synchronized (axmVar) {
                if (axmVar.waiters == kVar) {
                    axmVar.waiters = kVar2;
                    return true;
                }
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface h<V> extends ayq<V> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public abstract class i<V> extends axm<V> implements h<V> {
    }

    /* loaded from: classes4.dex */
    final class j extends a {
        static final Unsafe a;

        /* renamed from: b  reason: collision with root package name */
        static final long f756b;
        static final long c;
        static final long d;
        static final long e;
        static final long f;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.ads.interactivemedia.v3.internal.axm.j.1
                        public static final Unsafe a() throws Exception {
                            Field[] declaredFields;
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }

                        @Override // java.security.PrivilegedExceptionAction
                        public final /* synthetic */ Unsafe run() throws Exception {
                            return a();
                        }
                    });
                }
                try {
                    c = unsafe.objectFieldOffset(axm.class.getDeclaredField("waiters"));
                    f756b = unsafe.objectFieldOffset(axm.class.getDeclaredField("listeners"));
                    d = unsafe.objectFieldOffset(axm.class.getDeclaredField("value"));
                    e = unsafe.objectFieldOffset(k.class.getDeclaredField("thread"));
                    f = unsafe.objectFieldOffset(k.class.getDeclaredField(StringSet.next));
                    a = unsafe;
                } catch (NoSuchFieldException e2) {
                    throw new RuntimeException(e2);
                } catch (RuntimeException e3) {
                    throw e3;
                }
            } catch (PrivilegedActionException e4) {
                throw new RuntimeException("Could not initialize intrinsics", e4.getCause());
            }
        }

        private j() {
        }

        /* synthetic */ j(byte[] bArr) {
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final d a(axm axmVar, d dVar) {
            d dVar2;
            do {
                dVar2 = axmVar.listeners;
                if (dVar == dVar2) {
                    return dVar2;
                }
            } while (!e(axmVar, dVar2, dVar));
            return dVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final k b(axm axmVar, k kVar) {
            k kVar2;
            do {
                kVar2 = axmVar.waiters;
                if (kVar == kVar2) {
                    return kVar2;
                }
            } while (!g(axmVar, kVar2, kVar));
            return kVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final void c(k kVar, k kVar2) {
            a.putObject(kVar, f, kVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final void d(k kVar, Thread thread) {
            a.putObject(kVar, e, thread);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final boolean e(axm axmVar, d dVar, d dVar2) {
            return axo.a(a, axmVar, f756b, dVar, dVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final boolean f(axm axmVar, Object obj, Object obj2) {
            return axo.a(a, axmVar, d, obj, obj2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axm.a
        final boolean g(axm axmVar, k kVar, k kVar2) {
            return axo.a(a, axmVar, c, kVar, kVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class k {
        static final k a = new k(null);
        volatile k next;
        volatile Thread thread;

        k() {
            axm.aX.d(this, Thread.currentThread());
        }

        k(byte[] bArr) {
        }

        final void a(k kVar) {
            axm.aX.c(this, kVar);
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        a gVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", Constants.CASEFIRST_FALSE));
        } catch (SecurityException unused) {
            z = false;
        }
        a = z;
        aW = Logger.getLogger(axm.class.getName());
        try {
            gVar = new j(null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e2) {
            try {
                th2 = e2;
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, StringSet.next), AtomicReferenceFieldUpdater.newUpdater(axm.class, k.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(axm.class, d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(axm.class, Object.class, "value"));
                th = null;
            } catch (Error | RuntimeException e3) {
                th = e3;
                th2 = e2;
                gVar = new g(null);
            }
        }
        aX = gVar;
        if (th != null) {
            Logger logger = aW;
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        d = new Object();
    }

    private static Object p(ayq ayqVar) {
        Throwable f2;
        if (ayqVar instanceof h) {
            Object obj = ((axm) ayqVar).value;
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.c) {
                    Throwable th = bVar.d;
                    obj = th != null ? new b(false, th) : b.f751b;
                }
            }
            obj.getClass();
            return obj;
        } else if (!(ayqVar instanceof ayz) || (f2 = ((ayz) ayqVar).f()) == null) {
            boolean isCancelled = ayqVar.isCancelled();
            if ((!a) & isCancelled) {
                b bVar2 = b.f751b;
                bVar2.getClass();
                return bVar2;
            }
            try {
                Object q = q(ayqVar);
                if (!isCancelled) {
                    return q == null ? d : q;
                }
                return new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + ayqVar));
            } catch (Error e2) {
                e = e2;
                return new c(e);
            } catch (CancellationException e3) {
                if (!isCancelled) {
                    Objects.toString(ayqVar);
                    return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(ayqVar)), e3));
                }
                return new b(false, e3);
            } catch (RuntimeException e4) {
                e = e4;
                return new c(e);
            } catch (ExecutionException e5) {
                if (isCancelled) {
                    Objects.toString(ayqVar);
                    return new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(ayqVar)), e5));
                }
                return new c(e5.getCause());
            }
        } else {
            return new c(f2);
        }
    }

    private static Object q(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void r(StringBuilder sb) {
        try {
            Object q = q(this);
            sb.append("SUCCESS, result=[");
            if (q == null) {
                sb.append("null");
            } else if (q == this) {
                sb.append("this future");
            } else {
                sb.append(q.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(q)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private final void s(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof f) {
            sb.append(", setFuture=[");
            t(sb, ((f) obj).f755b);
            sb.append("]");
        } else {
            try {
                concat = atc.a(e());
            } catch (RuntimeException | StackOverflowError e2) {
                Class<?> cls = e2.getClass();
                Objects.toString(cls);
                concat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            r(sb);
        }
    }

    private final void t(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e2) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e2.getClass());
        }
    }

    private static void u(axm axmVar) {
        d dVar;
        axm<V> axmVar2;
        d dVar2 = null;
        while (true) {
            for (k b2 = aX.b(axmVar, k.a); b2 != null; b2 = b2.next) {
                Thread thread = b2.thread;
                if (thread != null) {
                    b2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            axmVar.h();
            d a2 = aX.a(axmVar, d.a);
            while (a2 != null) {
                d dVar3 = a2.next;
                a2.next = dVar2;
                dVar2 = a2;
                a2 = dVar3;
            }
            while (dVar2 != null) {
                dVar = dVar2.next;
                Runnable runnable = dVar2.f753b;
                runnable.getClass();
                if (runnable instanceof f) {
                    f fVar = (f) runnable;
                    axmVar2 = fVar.a;
                    if (axmVar2.value == fVar) {
                        if (aX.f(axmVar2, fVar, p(fVar.f755b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dVar2.c;
                    executor.getClass();
                    v(runnable, executor);
                }
                dVar2 = dVar;
            }
            return;
            dVar2 = dVar;
            axmVar = axmVar2;
        }
    }

    private static void v(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = aW;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    private final void w(k kVar) {
        kVar.thread = null;
        while (true) {
            k kVar2 = this.waiters;
            if (kVar2 != k.a) {
                k kVar3 = null;
                while (kVar2 != null) {
                    k kVar4 = kVar2.next;
                    if (kVar2.thread != null) {
                        kVar3 = kVar2;
                    } else if (kVar3 != null) {
                        kVar3.next = kVar4;
                        if (kVar3.thread == null) {
                            break;
                        }
                    } else if (!aX.g(this, kVar2, kVar4)) {
                        break;
                    }
                    kVar2 = kVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object x(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f752b);
        } else {
            if (obj == d) {
                return null;
            }
            return obj;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        b bVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (a) {
            bVar = new b(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                bVar = b.a;
            } else {
                bVar = b.f751b;
            }
            bVar.getClass();
        }
        boolean z2 = false;
        axm<V> axmVar = this;
        while (true) {
            if (aX.f(axmVar, obj, bVar)) {
                if (z) {
                    axmVar.i();
                }
                u(axmVar);
                if (!(obj instanceof f)) {
                    return true;
                }
                ayq<? extends V> ayqVar = ((f) obj).f755b;
                if (ayqVar instanceof h) {
                    axmVar = (axm) ayqVar;
                    obj = axmVar.value;
                    if (!(obj == null) && !(obj instanceof f)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    ayqVar.cancel(z);
                    return true;
                }
            } else {
                obj = axmVar.value;
                if (!(obj instanceof f)) {
                    return z2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String e() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.ads.interactivemedia.v3.internal.ayz
    public final Throwable f() {
        if (this instanceof h) {
            Object obj = this.value;
            if (obj instanceof c) {
                return ((c) obj).f752b;
            }
            return null;
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayq
    public final void g(Runnable runnable, Executor executor) {
        d dVar;
        atc.l(runnable, "Runnable was null.");
        atc.l(executor, "Executor was null.");
        if (isDone() || (dVar = this.listeners) == d.a) {
            v(runnable, executor);
        }
        d dVar2 = new d(runnable, executor);
        do {
            dVar2.next = dVar;
            if (aX.e(this, dVar, dVar2)) {
                return;
            }
            dVar = this.listeners;
        } while (dVar != d.a);
        v(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return x(obj2);
            }
            k kVar = this.waiters;
            if (kVar != k.a) {
                k kVar2 = new k();
                do {
                    kVar2.a(kVar);
                    if (aX.g(this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                w(kVar2);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return x(obj);
                    }
                    kVar = this.waiters;
                } while (kVar != k.a);
                Object obj3 = this.value;
                obj3.getClass();
                return x(obj3);
            }
            Object obj32 = this.value;
            obj32.getClass();
            return x(obj32);
        }
        throw new InterruptedException();
    }

    protected void h() {
    }

    protected void i() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof f)) & (obj != null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean j(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (aX.f(this, null, obj)) {
            u(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean k() {
        Object obj = this.value;
        return (obj instanceof b) && ((b) obj).c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(Throwable th) {
        atc.k(th);
        if (aX.f(this, null, new c(th))) {
            u(this);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            r(sb);
        } else {
            s(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if ((obj != null) & (!(obj instanceof f))) {
                return x(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                k kVar = this.waiters;
                if (kVar != k.a) {
                    k kVar2 = new k();
                    do {
                        kVar2.a(kVar);
                        if (aX.g(this, kVar, kVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (Thread.interrupted()) {
                                    w(kVar2);
                                    throw new InterruptedException();
                                }
                                Object obj2 = this.value;
                                if (!((obj2 != null) & (!(obj2 instanceof f)))) {
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    return x(obj2);
                                }
                            } while (nanos >= 1000);
                            w(kVar2);
                        } else {
                            kVar = this.waiters;
                        }
                    } while (kVar != k.a);
                    Object obj3 = this.value;
                    obj3.getClass();
                    return x(obj3);
                }
                Object obj32 = this.value;
                obj32.getClass();
                return x(obj32);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if (!((obj4 != null) & (!(obj4 instanceof f)))) {
                    if (!Thread.interrupted()) {
                        nanos = nanoTime - System.nanoTime();
                    } else {
                        throw new InterruptedException();
                    }
                } else {
                    return x(obj4);
                }
            }
            String axmVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + com.dreampay.commons.constants.Constants.WHITE_SPACE + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i2 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String str2 = concat + convert + com.dreampay.commons.constants.Constants.WHITE_SPACE + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = String.valueOf(str2).concat(com.dreampay.commons.constants.Constants.WHITE_SPACE);
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(str).concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + axmVar);
        }
        throw new InterruptedException();
    }
}
