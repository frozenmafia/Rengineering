package o;

import io.reactivex.internal.util.NotificationLite;
/* loaded from: classes7.dex */
final class setOnChildScrollUpCallback<T> extends setOnRefreshListener<T> {
    startProgressAlphaMaxAnimation<Object> ah$a;
    volatile boolean toString;
    final setOnRefreshListener<T> valueOf;
    boolean values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOnChildScrollUpCallback(setOnRefreshListener<T> setonrefreshlistener) {
        this.valueOf = setonrefreshlistener;
    }

    @Override // o.SimpleSQLiteQuery
    protected void values(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.valueOf.subscribe(registerconfigurationchangelistener);
    }

    @Override // o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        boolean z = true;
        if (!this.toString) {
            synchronized (this) {
                if (!this.toString) {
                    if (this.values) {
                        startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation = this.ah$a;
                        if (startprogressalphamaxanimation == null) {
                            startprogressalphamaxanimation = new startProgressAlphaMaxAnimation<>(4);
                            this.ah$a = startprogressalphamaxanimation;
                        }
                        startprogressalphamaxanimation.ag$a(NotificationLite.subscription(getsidecarversion));
                        return;
                    }
                    this.values = true;
                    z = false;
                }
            }
        }
        if (z) {
            getsidecarversion.cancel();
            return;
        }
        this.valueOf.onSubscribe(getsidecarversion);
        HaptikSDK$a();
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(T t) {
        if (this.toString) {
            return;
        }
        synchronized (this) {
            if (this.toString) {
                return;
            }
            if (this.values) {
                startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation = this.ah$a;
                if (startprogressalphamaxanimation == null) {
                    startprogressalphamaxanimation = new startProgressAlphaMaxAnimation<>(4);
                    this.ah$a = startprogressalphamaxanimation;
                }
                startprogressalphamaxanimation.ag$a(NotificationLite.next(t));
                return;
            }
            this.values = true;
            this.valueOf.onNext(t);
            HaptikSDK$a();
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        if (this.toString) {
            setProgressBackgroundColor.values(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.toString) {
                this.toString = true;
                if (this.values) {
                    startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation = this.ah$a;
                    if (startprogressalphamaxanimation == null) {
                        startprogressalphamaxanimation = new startProgressAlphaMaxAnimation<>(4);
                        this.ah$a = startprogressalphamaxanimation;
                    }
                    startprogressalphamaxanimation.ah$a((startProgressAlphaMaxAnimation<Object>) NotificationLite.error(th));
                    return;
                }
                this.values = true;
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
        if (this.toString) {
            return;
        }
        synchronized (this) {
            if (this.toString) {
                return;
            }
            this.toString = true;
            if (this.values) {
                startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation = this.ah$a;
                if (startprogressalphamaxanimation == null) {
                    startprogressalphamaxanimation = new startProgressAlphaMaxAnimation<>(4);
                    this.ah$a = startprogressalphamaxanimation;
                }
                startprogressalphamaxanimation.ag$a(NotificationLite.complete());
                return;
            }
            this.values = true;
            this.valueOf.onComplete();
        }
    }

    void HaptikSDK$a() {
        startProgressAlphaMaxAnimation<Object> startprogressalphamaxanimation;
        while (true) {
            synchronized (this) {
                startprogressalphamaxanimation = this.ah$a;
                if (startprogressalphamaxanimation == null) {
                    this.values = false;
                    return;
                }
                this.ah$a = null;
            }
            startprogressalphamaxanimation.ah$a((registerConfigurationChangeListener) this.valueOf);
        }
    }
}
