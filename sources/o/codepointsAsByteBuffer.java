package o;

import io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriber;
/* loaded from: classes7.dex */
public interface codepointsAsByteBuffer<T> {
    void drain();

    void innerComplete(InnerQueuedSubscriber<T> innerQueuedSubscriber);

    void innerError(InnerQueuedSubscriber<T> innerQueuedSubscriber, Throwable th);

    void innerNext(InnerQueuedSubscriber<T> innerQueuedSubscriber, T t);
}
