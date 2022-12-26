package o;

import io.reactivex.internal.util.NotificationLite;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.startProgressAlphaMaxAnimation;
/* loaded from: classes.dex */
final class __has_identifier<T> extends __offset<T> implements startProgressAlphaMaxAnimation.valueOf<Object> {
    startProgressAlphaMaxAnimation<Object> ag$a;
    final __offset<T> ah$a;
    boolean toString;
    volatile boolean valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public __has_identifier(__offset<T> __offsetVar) {
        this.ah$a = __offsetVar;
    }

    @Override // o.SupportSQLiteQuery
    protected void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.ah$a.subscribe(factory);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        boolean z = true;
        if (!this.valueOf) {
            synchronized (this) {
                if (!this.valueOf) {
                    if (this.toString) {
                        startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation = this.ag$a;
                        if (startprogressalphamaxanimation == null) {
                            startprogressalphamaxanimation = new startProgressAlphaMaxAnimation<>(4);
                            this.ag$a = startprogressalphamaxanimation;
                        }
                        startprogressalphamaxanimation.ag$a(NotificationLite.disposable(anonymousClass2));
                        return;
                    }
                    this.toString = true;
                    z = false;
                }
            }
        }
        if (z) {
            anonymousClass2.dispose();
            return;
        }
        this.ah$a.onSubscribe(anonymousClass2);
        HaptikSDK$c();
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        if (this.valueOf) {
            return;
        }
        synchronized (this) {
            if (this.valueOf) {
                return;
            }
            if (this.toString) {
                startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation = this.ag$a;
                if (startprogressalphamaxanimation == null) {
                    startprogressalphamaxanimation = new startProgressAlphaMaxAnimation<>(4);
                    this.ag$a = startprogressalphamaxanimation;
                }
                startprogressalphamaxanimation.ag$a(NotificationLite.next(t));
                return;
            }
            this.toString = true;
            this.ah$a.onNext(t);
            HaptikSDK$c();
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
                this.valueOf = true;
                if (this.toString) {
                    startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation = this.ag$a;
                    if (startprogressalphamaxanimation == null) {
                        startprogressalphamaxanimation = new startProgressAlphaMaxAnimation<>(4);
                        this.ag$a = startprogressalphamaxanimation;
                    }
                    startprogressalphamaxanimation.ah$a((startProgressAlphaMaxAnimation<Object>) NotificationLite.error(th));
                    return;
                }
                this.toString = true;
                z = false;
            }
            if (z) {
                setProgressBackgroundColor.values(th);
            } else {
                this.ah$a.onError(th);
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
            this.valueOf = true;
            if (this.toString) {
                startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation = this.ag$a;
                if (startprogressalphamaxanimation == null) {
                    startprogressalphamaxanimation = new startProgressAlphaMaxAnimation<>(4);
                    this.ag$a = startprogressalphamaxanimation;
                }
                startprogressalphamaxanimation.ag$a(NotificationLite.complete());
                return;
            }
            this.toString = true;
            this.ah$a.onComplete();
        }
    }

    void HaptikSDK$c() {
        startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation;
        while (true) {
            synchronized (this) {
                startprogressalphamaxanimation = this.ag$a;
                if (startprogressalphamaxanimation == null) {
                    this.toString = false;
                    return;
                }
                this.ag$a = null;
            }
            startprogressalphamaxanimation.valueOf(this);
        }
    }

    @Override // o.startProgressAlphaMaxAnimation.valueOf, o.initializeComponent
    public boolean test(Object obj) {
        return NotificationLite.acceptFull(obj, this.ah$a);
    }
}
