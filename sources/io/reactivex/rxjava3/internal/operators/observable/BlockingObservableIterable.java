package io.reactivex.rxjava3.internal.operators.observable;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o.IdlingResource;
import o.__init;
import o.addCodepoints;
import o.dataStart;
import o.registerLooperAsIdlingResource;
/* loaded from: classes7.dex */
public final class BlockingObservableIterable<T> implements Iterable<T> {
    final int ag$a;
    final registerLooperAsIdlingResource<? extends T> ah$a;

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        BlockingObservableIterator blockingObservableIterator = new BlockingObservableIterator(this.ag$a);
        this.ah$a.subscribe(blockingObservableIterator);
        return blockingObservableIterator;
    }

    /* loaded from: classes7.dex */
    static final class BlockingObservableIterator<T> extends AtomicReference<dataStart> implements IdlingResource<T>, Iterator<T>, dataStart {
        private static final long serialVersionUID = 6695226475494099826L;
        final Condition condition;
        volatile boolean done;
        volatile Throwable error;
        final Lock lock;
        final addCodepoints<T> queue;

        BlockingObservableIterator(int i) {
            this.queue = new addCodepoints<>(i);
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
                    __init.ah$a();
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

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            DisposableHelper.setOnce(this, datastart);
        }

        @Override // o.IdlingResource
        public void onNext(T t) {
            this.queue.offer(t);
            signalConsumer();
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            signalConsumer();
        }

        @Override // o.IdlingResource
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

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
            signalConsumer();
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }
}
