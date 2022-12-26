package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes5.dex */
public final class isRefreshing<T> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    FrameworkSQLiteDatabase.AnonymousClass2 HaptikSDK$a;
    boolean ag$a;
    final boolean ah$a;
    final SupportSQLiteOpenHelper.Factory<? super T> toString;
    volatile boolean valueOf;
    startProgressAlphaMaxAnimation<Object> values;

    public isRefreshing(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this(factory, false);
    }

    public isRefreshing(SupportSQLiteOpenHelper.Factory<? super T> factory, boolean z) {
        this.toString = factory;
        this.ah$a = z;
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (DisposableHelper.validate(this.HaptikSDK$a, anonymousClass2)) {
            this.HaptikSDK$a = anonymousClass2;
            this.toString.onSubscribe(this);
        }
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        this.HaptikSDK$a.dispose();
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.HaptikSDK$a.isDisposed();
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        if (this.valueOf) {
            return;
        }
        if (t == null) {
            this.HaptikSDK$a.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.valueOf) {
                return;
            }
            if (this.ag$a) {
                startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation = this.values;
                if (startprogressalphamaxanimation == null) {
                    startprogressalphamaxanimation = new startProgressAlphaMaxAnimation<>(4);
                    this.values = startprogressalphamaxanimation;
                }
                startprogressalphamaxanimation.ag$a(NotificationLite.next(t));
                return;
            }
            this.ag$a = true;
            this.toString.onNext(t);
            valueOf();
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        if (this.valueOf) {
            setProgressBackgroundColor.values(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.valueOf) {
                if (this.ag$a) {
                    this.valueOf = true;
                    startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation = this.values;
                    if (startprogressalphamaxanimation == null) {
                        startprogressalphamaxanimation = new startProgressAlphaMaxAnimation<>(4);
                        this.values = startprogressalphamaxanimation;
                    }
                    Object error = NotificationLite.error(th);
                    if (this.ah$a) {
                        startprogressalphamaxanimation.ag$a(error);
                    } else {
                        startprogressalphamaxanimation.ah$a((startProgressAlphaMaxAnimation<Object>) error);
                    }
                    return;
                }
                this.valueOf = true;
                this.ag$a = true;
                z = false;
            }
            if (z) {
                setProgressBackgroundColor.values(th);
            } else {
                this.toString.onError(th);
            }
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        if (this.valueOf) {
            return;
        }
        synchronized (this) {
            if (this.valueOf) {
                return;
            }
            if (this.ag$a) {
                startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation = this.values;
                if (startprogressalphamaxanimation == null) {
                    startprogressalphamaxanimation = new startProgressAlphaMaxAnimation<>(4);
                    this.values = startprogressalphamaxanimation;
                }
                startprogressalphamaxanimation.ag$a(NotificationLite.complete());
                return;
            }
            this.valueOf = true;
            this.ag$a = true;
            this.toString.onComplete();
        }
    }

    void valueOf() {
        startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation;
        do {
            synchronized (this) {
                startprogressalphamaxanimation = this.values;
                if (startprogressalphamaxanimation == null) {
                    this.ag$a = false;
                    return;
                }
                this.values = null;
            }
        } while (!startprogressalphamaxanimation.values((SupportSQLiteOpenHelper.Factory<? super T>) this.toString));
    }
}
