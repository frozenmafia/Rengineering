package o;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
/* loaded from: classes7.dex */
public final class __vector_as_bytebuffer<T> implements SupportSQLiteOpenHelper<T>, getSidecarVersion {
    startProgressAlphaMaxAnimation<Object> ag$a;
    boolean ah$a;
    getSidecarVersion ah$b;
    final boolean toString;
    final registerConfigurationChangeListener<? super T> valueOf;
    volatile boolean values;

    public __vector_as_bytebuffer(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this(registerconfigurationchangelistener, false);
    }

    public __vector_as_bytebuffer(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, boolean z) {
        this.valueOf = registerconfigurationchangelistener;
        this.toString = z;
    }

    @Override // o.SupportSQLiteOpenHelper, o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        if (SubscriptionHelper.validate(this.ah$b, getsidecarversion)) {
            this.ah$b = getsidecarversion;
            this.valueOf.onSubscribe(this);
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(T t) {
        if (this.values) {
            return;
        }
        if (t == null) {
            this.ah$b.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.values) {
                return;
            }
            if (this.ah$a) {
                startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation = this.ag$a;
                if (startprogressalphamaxanimation == null) {
                    startprogressalphamaxanimation = new startProgressAlphaMaxAnimation<>(4);
                    this.ag$a = startprogressalphamaxanimation;
                }
                startprogressalphamaxanimation.ag$a(NotificationLite.next(t));
                return;
            }
            this.ah$a = true;
            this.valueOf.onNext(t);
            ah$a();
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        if (this.values) {
            setProgressBackgroundColor.values(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.values) {
                if (this.ah$a) {
                    this.values = true;
                    startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation = this.ag$a;
                    if (startprogressalphamaxanimation == null) {
                        startprogressalphamaxanimation = new startProgressAlphaMaxAnimation<>(4);
                        this.ag$a = startprogressalphamaxanimation;
                    }
                    Object error = NotificationLite.error(th);
                    if (this.toString) {
                        startprogressalphamaxanimation.ag$a(error);
                    } else {
                        startprogressalphamaxanimation.ah$a((startProgressAlphaMaxAnimation<Object>) error);
                    }
                    return;
                }
                this.values = true;
                this.ah$a = true;
                z = false;
            }
            if (z) {
                setProgressBackgroundColor.values(th);
            } else {
                this.valueOf.onError(th);
            }
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        if (this.values) {
            return;
        }
        synchronized (this) {
            if (this.values) {
                return;
            }
            if (this.ah$a) {
                startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation = this.ag$a;
                if (startprogressalphamaxanimation == null) {
                    startprogressalphamaxanimation = new startProgressAlphaMaxAnimation<>(4);
                    this.ag$a = startprogressalphamaxanimation;
                }
                startprogressalphamaxanimation.ag$a(NotificationLite.complete());
                return;
            }
            this.values = true;
            this.ah$a = true;
            this.valueOf.onComplete();
        }
    }

    void ah$a() {
        startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation;
        do {
            synchronized (this) {
                startprogressalphamaxanimation = this.ag$a;
                if (startprogressalphamaxanimation == null) {
                    this.ah$a = false;
                    return;
                }
                this.ag$a = null;
            }
        } while (!startprogressalphamaxanimation.ah$a((registerConfigurationChangeListener<? super T>) this.valueOf));
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
        this.ah$b.request(j);
    }

    @Override // o.getSidecarVersion
    public void cancel() {
        this.ah$b.cancel();
    }
}
