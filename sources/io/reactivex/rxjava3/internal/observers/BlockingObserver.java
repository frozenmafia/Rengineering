package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
/* loaded from: classes7.dex */
public final class BlockingObserver<T> extends AtomicReference<dataStart> implements IdlingResource<T>, dataStart {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public BlockingObserver(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // o.IdlingResource
    public void onSubscribe(dataStart datastart) {
        DisposableHelper.setOnce(this, datastart);
    }

    @Override // o.IdlingResource
    public void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }

    @Override // o.IdlingResource
    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    @Override // o.IdlingResource
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // o.dataStart
    public void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }
}
