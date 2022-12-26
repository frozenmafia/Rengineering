package o;

import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes5.dex */
public final class sdkAdded {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean values(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            registerconfigurationchangelistener.onNext(t);
            if (atomicInteger.decrementAndGet() == 0) {
                return true;
            }
            atomicThrowable.tryTerminateConsumer(registerconfigurationchangelistener);
        }
        return false;
    }

    public static void ah$a(registerConfigurationChangeListener<?> registerconfigurationchangelistener, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.tryAddThrowableOrReport(th) && atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.tryTerminateConsumer(registerconfigurationchangelistener);
        }
    }

    public static void valueOf(registerConfigurationChangeListener<?> registerconfigurationchangelistener, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.tryTerminateConsumer(registerconfigurationchangelistener);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void ag$a(IdlingResource<? super T> idlingResource, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            idlingResource.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                atomicThrowable.tryTerminateConsumer(idlingResource);
            }
        }
    }

    public static void toString(IdlingResource<?> idlingResource, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.tryAddThrowableOrReport(th) && atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.tryTerminateConsumer(idlingResource);
        }
    }

    public static void values(IdlingResource<?> idlingResource, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.tryTerminateConsumer(idlingResource);
        }
    }
}
