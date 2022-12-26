package io.reactivex.internal.observers;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes5.dex */
public final class BlockingObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public BlockingObserver(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        DisposableHelper.setOnce(this, anonymousClass2);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }
}
