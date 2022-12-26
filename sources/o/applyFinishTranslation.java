package o;

import io.reactivex.internal.observers.InnerQueuedObserver;
/* loaded from: classes7.dex */
public interface applyFinishTranslation<T> {
    void drain();

    void innerComplete(InnerQueuedObserver<T> innerQueuedObserver);

    void innerError(InnerQueuedObserver<T> innerQueuedObserver, Throwable th);

    void innerNext(InnerQueuedObserver<T> innerQueuedObserver, T t);
}
