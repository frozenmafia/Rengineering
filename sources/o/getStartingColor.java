package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.Objects;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes.dex */
public final class getStartingColor<T> extends SupportSQLiteQuery<T> {
    final Iterable<? extends T> toString;

    public getStartingColor(Iterable<? extends T> iterable) {
        this.toString = iterable;
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        try {
            Iterator<? extends T> it = this.toString.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(factory);
                    return;
                }
                valueOf valueof = new valueOf(factory, it);
                factory.onSubscribe(valueof);
                if (valueof.toString) {
                    return;
                }
                valueof.ah$a();
            } catch (Throwable th) {
                FrameworkSQLiteDatabase.values(th);
                EmptyDisposable.error(th, factory);
            }
        } catch (Throwable th2) {
            FrameworkSQLiteDatabase.values(th2);
            EmptyDisposable.error(th2, factory);
        }
    }

    /* loaded from: classes5.dex */
    static final class valueOf<T> extends setAnimationListener<T> {
        final Iterator<? extends T> HaptikSDK$a;
        boolean ag$a;
        boolean ah$a;
        boolean toString;
        final SupportSQLiteOpenHelper.Factory<? super T> valueOf;
        volatile boolean values;

        valueOf(SupportSQLiteOpenHelper.Factory<? super T> factory, Iterator<? extends T> it) {
            this.valueOf = factory;
            this.HaptikSDK$a = it;
        }

        void ah$a() {
            while (!isDisposed()) {
                try {
                    this.valueOf.onNext(Objects.requireNonNull(this.HaptikSDK$a.next(), "The iterator returned a null value"));
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.HaptikSDK$a.hasNext()) {
                            if (isDisposed()) {
                                return;
                            }
                            this.valueOf.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        FrameworkSQLiteDatabase.values(th);
                        this.valueOf.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    FrameworkSQLiteDatabase.values(th2);
                    this.valueOf.onError(th2);
                    return;
                }
            }
        }

        @Override // o.e
        public int requestFusion(int i) {
            if ((i & 1) != 0) {
                this.toString = true;
                return 1;
            }
            return 0;
        }

        @Override // o.elevationSupported
        public T poll() {
            if (this.ag$a) {
                return null;
            }
            if (this.ah$a) {
                if (!this.HaptikSDK$a.hasNext()) {
                    this.ag$a = true;
                    return null;
                }
            } else {
                this.ah$a = true;
            }
            return (T) Objects.requireNonNull(this.HaptikSDK$a.next(), "The iterator returned a null value");
        }

        @Override // o.elevationSupported
        public boolean isEmpty() {
            return this.ag$a;
        }

        @Override // o.elevationSupported
        public void clear() {
            this.ag$a = true;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            this.values = true;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.values;
        }
    }
}
