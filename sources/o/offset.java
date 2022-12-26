package o;

import io.reactivex.rxjava3.internal.observers.InnerQueuedObserver;
/* loaded from: classes7.dex */
public interface offset<T> {
    void drain();

    void innerComplete(InnerQueuedObserver<T> innerQueuedObserver);

    void innerError(InnerQueuedObserver<T> innerQueuedObserver, Throwable th);

    void innerNext(InnerQueuedObserver<T> innerQueuedObserver, T t);
}
