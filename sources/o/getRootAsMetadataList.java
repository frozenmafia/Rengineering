package o;

import io.reactivex.rxjava3.internal.util.NotificationLite;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class getRootAsMetadataList<T> extends startMetadataList<T> {
    volatile boolean ag$a;
    boolean ah$a;
    codepoints<Object> toString;
    final startMetadataList<T> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getRootAsMetadataList(startMetadataList<T> startmetadatalist) {
        this.values = startmetadatalist;
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    protected void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.values.subscribe(registerconfigurationchangelistener);
    }

    @Override // o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        boolean z = true;
        if (!this.ag$a) {
            synchronized (this) {
                if (!this.ag$a) {
                    if (this.ah$a) {
                        codepoints<Object> codepointsVar = this.toString;
                        if (codepointsVar == null) {
                            codepointsVar = new codepoints<>(4);
                            this.toString = codepointsVar;
                        }
                        codepointsVar.ag$a(NotificationLite.subscription(getsidecarversion));
                        return;
                    }
                    this.ah$a = true;
                    z = false;
                }
            }
        }
        if (z) {
            getsidecarversion.cancel();
            return;
        }
        this.values.onSubscribe(getsidecarversion);
        valueOf();
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(T t) {
        if (this.ag$a) {
            return;
        }
        synchronized (this) {
            if (this.ag$a) {
                return;
            }
            if (this.ah$a) {
                codepoints<Object> codepointsVar = this.toString;
                if (codepointsVar == null) {
                    codepointsVar = new codepoints<>(4);
                    this.toString = codepointsVar;
                }
                codepointsVar.ag$a(NotificationLite.next(t));
                return;
            }
            this.ah$a = true;
            this.values.onNext(t);
            valueOf();
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        if (this.ag$a) {
            endMetadataList.valueOf(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.ag$a) {
                this.ag$a = true;
                if (this.ah$a) {
                    codepoints<Object> codepointsVar = this.toString;
                    if (codepointsVar == null) {
                        codepointsVar = new codepoints<>(4);
                        this.toString = codepointsVar;
                    }
                    codepointsVar.values((codepoints<Object>) NotificationLite.error(th));
                    return;
                }
                this.ah$a = true;
                z = false;
            }
            if (z) {
                endMetadataList.valueOf(th);
            } else {
                this.values.onError(th);
            }
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        if (this.ag$a) {
            return;
        }
        synchronized (this) {
            if (this.ag$a) {
                return;
            }
            this.ag$a = true;
            if (this.ah$a) {
                codepoints<Object> codepointsVar = this.toString;
                if (codepointsVar == null) {
                    codepointsVar = new codepoints<>(4);
                    this.toString = codepointsVar;
                }
                codepointsVar.ag$a(NotificationLite.complete());
                return;
            }
            this.ah$a = true;
            this.values.onComplete();
        }
    }

    void valueOf() {
        codepoints<Object> codepointsVar;
        while (true) {
            synchronized (this) {
                codepointsVar = this.toString;
                if (codepointsVar == null) {
                    this.ah$a = false;
                    return;
                }
                this.toString = null;
            }
            codepointsVar.ah$a(this.values);
        }
    }
}
