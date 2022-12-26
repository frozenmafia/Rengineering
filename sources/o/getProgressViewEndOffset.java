package o;

import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes5.dex */
public final class getProgressViewEndOffset {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void ah$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            registerconfigurationchangelistener.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable terminate = atomicThrowable.terminate();
                if (terminate != null) {
                    registerconfigurationchangelistener.onError(terminate);
                } else {
                    registerconfigurationchangelistener.onComplete();
                }
            }
        }
    }

    public static void valueOf(registerConfigurationChangeListener<?> registerconfigurationchangelistener, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.addThrowable(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                registerconfigurationchangelistener.onError(atomicThrowable.terminate());
                return;
            }
            return;
        }
        setProgressBackgroundColor.values(th);
    }

    public static void valueOf(registerConfigurationChangeListener<?> registerconfigurationchangelistener, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable terminate = atomicThrowable.terminate();
            if (terminate != null) {
                registerconfigurationchangelistener.onError(terminate);
            } else {
                registerconfigurationchangelistener.onComplete();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void valueOf(SupportSQLiteOpenHelper.Factory<? super T> factory, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            factory.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable terminate = atomicThrowable.terminate();
                if (terminate != null) {
                    factory.onError(terminate);
                } else {
                    factory.onComplete();
                }
            }
        }
    }

    public static void ag$a(SupportSQLiteOpenHelper.Factory<?> factory, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.addThrowable(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                factory.onError(atomicThrowable.terminate());
                return;
            }
            return;
        }
        setProgressBackgroundColor.values(th);
    }

    public static void ah$a(SupportSQLiteOpenHelper.Factory<?> factory, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable terminate = atomicThrowable.terminate();
            if (terminate != null) {
                factory.onError(terminate);
            } else {
                factory.onComplete();
            }
        }
    }
}
