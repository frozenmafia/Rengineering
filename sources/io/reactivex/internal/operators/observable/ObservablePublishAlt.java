package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.FrameworkSQLiteStatement;
import o.SupportSQLiteOpenHelper;
import o.doInitialize;
import o.noBackupDirectory;
import o.setColorSchemeResources;
/* loaded from: classes7.dex */
public final class ObservablePublishAlt<T> extends setColorSchemeResources<T> implements doInitialize {
    final AtomicReference<PublishConnection<T>> ag$a;
    final noBackupDirectory<T> valueOf;

    @Override // o.setColorSchemeResources
    public void HaptikSDK$b(FrameworkSQLiteStatement<? super FrameworkSQLiteDatabase.AnonymousClass2> frameworkSQLiteStatement) {
        PublishConnection<T> publishConnection;
        while (true) {
            publishConnection = this.ag$a.get();
            if (publishConnection != null && !publishConnection.isDisposed()) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.ag$a);
            if (this.ag$a.compareAndSet(publishConnection, publishConnection2)) {
                publishConnection = publishConnection2;
                break;
            }
        }
        boolean z = false;
        if (!publishConnection.connect.get() && publishConnection.connect.compareAndSet(false, true)) {
            z = true;
        }
        try {
            frameworkSQLiteStatement.accept(publishConnection);
            if (z) {
                this.valueOf.subscribe(publishConnection);
            }
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            throw ExceptionHelper.valueOf(th);
        }
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        PublishConnection<T> publishConnection;
        while (true) {
            publishConnection = this.ag$a.get();
            if (publishConnection != null) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.ag$a);
            if (this.ag$a.compareAndSet(publishConnection, publishConnection2)) {
                publishConnection = publishConnection2;
                break;
            }
        }
        InnerDisposable<T> innerDisposable = new InnerDisposable<>(factory, publishConnection);
        factory.onSubscribe(innerDisposable);
        if (publishConnection.add(innerDisposable)) {
            if (innerDisposable.isDisposed()) {
                publishConnection.remove(innerDisposable);
                return;
            }
            return;
        }
        Throwable th = publishConnection.error;
        if (th != null) {
            factory.onError(th);
        } else {
            factory.onComplete();
        }
    }

    @Override // o.doInitialize
    public void values(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        this.ag$a.compareAndSet((PublishConnection) anonymousClass2, null);
    }

    /* loaded from: classes7.dex */
    static final class PublishConnection<T> extends AtomicReference<InnerDisposable<T>[]> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        static final InnerDisposable[] EMPTY = new InnerDisposable[0];
        static final InnerDisposable[] TERMINATED = new InnerDisposable[0];
        private static final long serialVersionUID = -3251430252873581268L;
        final AtomicReference<PublishConnection<T>> current;
        Throwable error;
        final AtomicBoolean connect = new AtomicBoolean();
        final AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> upstream = new AtomicReference<>();

        PublishConnection(AtomicReference<PublishConnection<T>> atomicReference) {
            this.current = atomicReference;
            lazySet(EMPTY);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            getAndSet(TERMINATED);
            this.current.compareAndSet(this, null);
            DisposableHelper.dispose(this.upstream);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return get() == TERMINATED;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this.upstream, anonymousClass2);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            for (InnerDisposable<T> innerDisposable : get()) {
                innerDisposable.downstream.onNext(t);
            }
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            this.error = th;
            this.upstream.lazySet(DisposableHelper.DISPOSED);
            for (InnerDisposable<T> innerDisposable : getAndSet(TERMINATED)) {
                innerDisposable.downstream.onError(th);
            }
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            this.upstream.lazySet(DisposableHelper.DISPOSED);
            for (InnerDisposable<T> innerDisposable : getAndSet(TERMINATED)) {
                innerDisposable.downstream.onComplete();
            }
        }

        public boolean add(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = get();
                if (innerDisposableArr == TERMINATED) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!compareAndSet(innerDisposableArr, innerDisposableArr2));
            return true;
        }

        public void remove(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (innerDisposableArr[i2] == innerDisposable) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i < 0) {
                    return;
                }
                innerDisposableArr2 = EMPTY;
                if (length != 1) {
                    innerDisposableArr2 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, i);
                    System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr2, i, (length - i) - 1);
                }
            } while (!compareAndSet(innerDisposableArr, innerDisposableArr2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class InnerDisposable<T> extends AtomicReference<PublishConnection<T>> implements FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 7463222674719692880L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;

        InnerDisposable(SupportSQLiteOpenHelper.Factory<? super T> factory, PublishConnection<T> publishConnection) {
            this.downstream = factory;
            lazySet(publishConnection);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            PublishConnection<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.remove(this);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return get() == null;
        }
    }
}
