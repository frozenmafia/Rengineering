package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.SupportSQLiteQuery;
import o.getWrappedDb;
import o.noBackupDirectory;
import o.setColors;
/* loaded from: classes7.dex */
public final class ObservableSequenceEqual<T> extends SupportSQLiteQuery<Boolean> {
    final getWrappedDb<? super T, ? super T> ah$a;
    final noBackupDirectory<? extends T> toString;
    final int valueOf;
    final noBackupDirectory<? extends T> values;

    public ObservableSequenceEqual(noBackupDirectory<? extends T> nobackupdirectory, noBackupDirectory<? extends T> nobackupdirectory2, getWrappedDb<? super T, ? super T> getwrappeddb, int i) {
        this.toString = nobackupdirectory;
        this.values = nobackupdirectory2;
        this.ah$a = getwrappeddb;
        this.valueOf = i;
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super Boolean> factory) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(factory, this.valueOf, this.toString, this.values, this.ah$a);
        factory.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe();
    }

    /* loaded from: classes7.dex */
    static final class EqualCoordinator<T> extends AtomicInteger implements FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -6178010334400373240L;
        volatile boolean cancelled;
        final getWrappedDb<? super T, ? super T> comparer;
        final SupportSQLiteOpenHelper.Factory<? super Boolean> downstream;
        final noBackupDirectory<? extends T> first;
        final valueOf<T>[] observers;
        final ArrayCompositeDisposable resources;
        final noBackupDirectory<? extends T> second;
        T v1;
        T v2;

        EqualCoordinator(SupportSQLiteOpenHelper.Factory<? super Boolean> factory, int i, noBackupDirectory<? extends T> nobackupdirectory, noBackupDirectory<? extends T> nobackupdirectory2, getWrappedDb<? super T, ? super T> getwrappeddb) {
            this.downstream = factory;
            this.first = nobackupdirectory;
            this.second = nobackupdirectory2;
            this.comparer = getwrappeddb;
            this.observers = r3;
            valueOf<T>[] valueofArr = {new valueOf<>(this, 0, i), new valueOf<>(this, 1, i)};
            this.resources = new ArrayCompositeDisposable(2);
        }

        boolean setDisposable(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2, int i) {
            return this.resources.setResource(i, anonymousClass2);
        }

        void subscribe() {
            valueOf<T>[] valueofArr = this.observers;
            this.first.subscribe(valueofArr[0]);
            this.second.subscribe(valueofArr[1]);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.resources.dispose();
            if (getAndIncrement() == 0) {
                valueOf<T>[] valueofArr = this.observers;
                valueofArr[0].ah$a.clear();
                valueofArr[1].ah$a.clear();
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.cancelled;
        }

        void cancel(setColors<T> setcolors, setColors<T> setcolors2) {
            this.cancelled = true;
            setcolors.clear();
            setcolors2.clear();
        }

        void drain() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            valueOf<T>[] valueofArr = this.observers;
            valueOf<T> valueof = valueofArr[0];
            setColors<T> setcolors = valueof.ah$a;
            valueOf<T> valueof2 = valueofArr[1];
            setColors<T> setcolors2 = valueof2.ah$a;
            int i = 1;
            while (!this.cancelled) {
                boolean z = valueof.values;
                if (z && (th2 = valueof.ag$a) != null) {
                    cancel(setcolors, setcolors2);
                    this.downstream.onError(th2);
                    return;
                }
                boolean z2 = valueof2.values;
                if (z2 && (th = valueof2.ag$a) != null) {
                    cancel(setcolors, setcolors2);
                    this.downstream.onError(th);
                    return;
                }
                if (this.v1 == null) {
                    this.v1 = setcolors.poll();
                }
                boolean z3 = this.v1 == null;
                if (this.v2 == null) {
                    this.v2 = setcolors2.poll();
                }
                T t = this.v2;
                boolean z4 = t == null;
                if (z && z2 && z3 && z4) {
                    this.downstream.onNext(true);
                    this.downstream.onComplete();
                    return;
                } else if (z && z2 && z3 != z4) {
                    cancel(setcolors, setcolors2);
                    this.downstream.onNext(false);
                    this.downstream.onComplete();
                    return;
                } else {
                    if (!z3 && !z4) {
                        try {
                            if (!this.comparer.valueOf((T) this.v1, t)) {
                                cancel(setcolors, setcolors2);
                                this.downstream.onNext(false);
                                this.downstream.onComplete();
                                return;
                            }
                            this.v1 = null;
                            this.v2 = null;
                        } catch (Throwable th3) {
                            FrameworkSQLiteDatabase.values(th3);
                            cancel(setcolors, setcolors2);
                            this.downstream.onError(th3);
                            return;
                        }
                    }
                    if (z3 || z4) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
            }
            setcolors.clear();
            setcolors2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class valueOf<T> implements SupportSQLiteOpenHelper.Factory<T> {
        Throwable ag$a;
        final setColors<T> ah$a;
        final EqualCoordinator<T> toString;
        final int valueOf;
        volatile boolean values;

        valueOf(EqualCoordinator<T> equalCoordinator, int i, int i2) {
            this.toString = equalCoordinator;
            this.valueOf = i;
            this.ah$a = new setColors<>(i2);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            this.toString.setDisposable(anonymousClass2, this.valueOf);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            this.ah$a.offer(t);
            this.toString.drain();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            this.ag$a = th;
            this.values = true;
            this.toString.drain();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            this.values = true;
            this.toString.drain();
        }
    }
}
