package o;

import io.reactivex.rxjava3.internal.util.NotificationLite;
import o.codepoints;
/* loaded from: classes7.dex */
final class Struct<T> extends list<T> implements codepoints.values<Object> {
    final list<T> ag$a;
    boolean toString;
    codepoints<Object> valueOf;
    volatile boolean values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Struct(list<T> listVar) {
        this.ag$a = listVar;
    }

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    protected void valueOf(IdlingResource<? super T> idlingResource) {
        this.ag$a.subscribe(idlingResource);
    }

    @Override // o.IdlingResource
    public void onSubscribe(dataStart datastart) {
        boolean z = true;
        if (!this.values) {
            synchronized (this) {
                if (!this.values) {
                    if (this.toString) {
                        codepoints<Object> codepointsVar = this.valueOf;
                        if (codepointsVar == null) {
                            codepointsVar = new codepoints<>(4);
                            this.valueOf = codepointsVar;
                        }
                        codepointsVar.ag$a(NotificationLite.disposable(datastart));
                        return;
                    }
                    this.toString = true;
                    z = false;
                }
            }
        }
        if (z) {
            datastart.dispose();
            return;
        }
        this.ag$a.onSubscribe(datastart);
        values();
    }

    @Override // o.IdlingResource
    public void onNext(T t) {
        if (this.values) {
            return;
        }
        synchronized (this) {
            if (this.values) {
                return;
            }
            if (this.toString) {
                codepoints<Object> codepointsVar = this.valueOf;
                if (codepointsVar == null) {
                    codepointsVar = new codepoints<>(4);
                    this.valueOf = codepointsVar;
                }
                codepointsVar.ag$a(NotificationLite.next(t));
                return;
            }
            this.toString = true;
            this.ag$a.onNext(t);
            values();
        }
    }

    @Override // o.IdlingResource
    public void onError(Throwable th) {
        if (this.values) {
            endMetadataList.valueOf(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.values) {
                this.values = true;
                if (this.toString) {
                    codepoints<Object> codepointsVar = this.valueOf;
                    if (codepointsVar == null) {
                        codepointsVar = new codepoints<>(4);
                        this.valueOf = codepointsVar;
                    }
                    codepointsVar.values((codepoints<Object>) NotificationLite.error(th));
                    return;
                }
                this.toString = true;
                z = false;
            }
            if (z) {
                endMetadataList.valueOf(th);
            } else {
                this.ag$a.onError(th);
            }
        }
    }

    @Override // o.IdlingResource
    public void onComplete() {
        if (this.values) {
            return;
        }
        synchronized (this) {
            if (this.values) {
                return;
            }
            this.values = true;
            if (this.toString) {
                codepoints<Object> codepointsVar = this.valueOf;
                if (codepointsVar == null) {
                    codepointsVar = new codepoints<>(4);
                    this.valueOf = codepointsVar;
                }
                codepointsVar.ag$a(NotificationLite.complete());
                return;
            }
            this.toString = true;
            this.ag$a.onComplete();
        }
    }

    void values() {
        codepoints<Object> codepointsVar;
        while (true) {
            synchronized (this) {
                codepointsVar = this.valueOf;
                if (codepointsVar == null) {
                    this.toString = false;
                    return;
                }
                this.valueOf = null;
            }
            codepointsVar.values((codepoints.values<? super Object>) this);
        }
    }

    @Override // o.codepoints.values, o.dataBuffer
    public boolean test(Object obj) {
        return NotificationLite.acceptFull(obj, this.ag$a);
    }
}
