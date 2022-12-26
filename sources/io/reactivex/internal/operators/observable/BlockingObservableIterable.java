package io.reactivex.internal.operators.observable;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.noBackupDirectory;
import o.setColors;
import o.startDragging;
/* loaded from: classes7.dex */
public final class BlockingObservableIterable<T> implements Iterable<T> {
    final int valueOf;
    final noBackupDirectory<? extends T> values;

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        BlockingObservableIterator blockingObservableIterator = new BlockingObservableIterator(this.valueOf);
        this.values.subscribe(blockingObservableIterator);
        return blockingObservableIterator;
    }

    /* loaded from: classes7.dex */
    static final class BlockingObservableIterator<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SupportSQLiteOpenHelper.Factory<T>, Iterator<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 6695226475494099826L;
        final Condition condition;
        volatile boolean done;
        volatile Throwable error;
        final Lock lock;
        final setColors<T> queue;

        BlockingObservableIterator(int i) {
            this.queue = new setColors<>(i);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.condition = reentrantLock.newCondition();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!isDisposed()) {
                boolean z = this.done;
                boolean isEmpty = this.queue.isEmpty();
                if (z) {
                    Throwable th = this.error;
                    if (th != null) {
                        throw ExceptionHelper.valueOf(th);
                    }
                    if (isEmpty) {
                        return false;
                    }
                }
                if (!isEmpty) {
                    return true;
                }
                try {
                    startDragging.values();
                    this.lock.lock();
                    while (!this.done && this.queue.isEmpty() && !isDisposed()) {
                        this.condition.await();
                    }
                    this.lock.unlock();
                } catch (InterruptedException e) {
                    DisposableHelper.dispose(this);
                    signalConsumer();
                    throw ExceptionHelper.valueOf(e);
                }
            }
            Throwable th2 = this.error;
            if (th2 == null) {
                return false;
            }
            throw ExceptionHelper.valueOf(th2);
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.queue.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this, anonymousClass2);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            this.queue.offer(t);
            signalConsumer();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            signalConsumer();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            this.done = true;
            signalConsumer();
        }

        void signalConsumer() {
            this.lock.lock();
            try {
                this.condition.signalAll();
            } finally {
                this.lock.unlock();
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProductAction.ACTION_REMOVE);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
            signalConsumer();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }
}
