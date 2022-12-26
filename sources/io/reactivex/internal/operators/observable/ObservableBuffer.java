package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends setProgressRotation<T, U> {
    final int ag$a;
    final Callable<U> ah$a;
    final int valueOf;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super U> factory) {
        int i = this.ag$a;
        int i2 = this.valueOf;
        if (i == i2) {
            values valuesVar = new values(factory, i2, this.ah$a);
            if (valuesVar.valueOf()) {
                this.toString.subscribe(valuesVar);
                return;
            }
            return;
        }
        this.toString.subscribe(new BufferSkipObserver(factory, this.valueOf, this.ag$a, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class values<T, U extends Collection<? super T>> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        final SupportSQLiteOpenHelper.Factory<? super U> ag$a;
        int ah$a;
        FrameworkSQLiteDatabase.AnonymousClass2 invoke;
        U toString;
        final int valueOf;
        final Callable<U> values;

        values(SupportSQLiteOpenHelper.Factory<? super U> factory, int i, Callable<U> callable) {
            this.ag$a = factory;
            this.valueOf = i;
            this.values = callable;
        }

        boolean valueOf() {
            try {
                this.toString = (U) Objects.requireNonNull(this.values.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th) {
                FrameworkSQLiteDatabase.values(th);
                this.toString = null;
                FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2 = this.invoke;
                if (anonymousClass2 == null) {
                    EmptyDisposable.error(th, this.ag$a);
                    return false;
                }
                anonymousClass2.dispose();
                this.ag$a.onError(th);
                return false;
            }
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.validate(this.invoke, anonymousClass2)) {
                this.invoke = anonymousClass2;
                this.ag$a.onSubscribe(this);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            this.invoke.dispose();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.invoke.isDisposed();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            U u = this.toString;
            if (u != null) {
                u.add(t);
                int i = this.ah$a + 1;
                this.ah$a = i;
                if (i >= this.valueOf) {
                    this.ag$a.onNext(u);
                    this.ah$a = 0;
                    valueOf();
                }
            }
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            this.toString = null;
            this.ag$a.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            U u = this.toString;
            if (u != null) {
                this.toString = null;
                if (!u.isEmpty()) {
                    this.ag$a.onNext(u);
                }
                this.ag$a.onComplete();
            }
        }
    }

    /* loaded from: classes7.dex */
    static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -8223395059921494546L;
        final Callable<U> bufferSupplier;
        final ArrayDeque<U> buffers = new ArrayDeque<>();
        final int count;
        final SupportSQLiteOpenHelper.Factory<? super U> downstream;
        long index;
        final int skip;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        BufferSkipObserver(SupportSQLiteOpenHelper.Factory<? super U> factory, int i, int i2, Callable<U> callable) {
            this.downstream = factory;
            this.count = i;
            this.skip = i2;
            this.bufferSupplier = callable;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.validate(this.upstream, anonymousClass2)) {
                this.upstream = anonymousClass2;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            long j = this.index;
            this.index = 1 + j;
            if (j % this.skip == 0) {
                try {
                    this.buffers.offer((Collection) Objects.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
                } catch (Throwable th) {
                    this.buffers.clear();
                    this.upstream.dispose();
                    this.downstream.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.buffers.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t);
                if (this.count <= next.size()) {
                    it.remove();
                    this.downstream.onNext(next);
                }
            }
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            this.buffers.clear();
            this.downstream.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            while (!this.buffers.isEmpty()) {
                this.downstream.onNext(this.buffers.poll());
            }
            this.downstream.onComplete();
        }
    }
}
