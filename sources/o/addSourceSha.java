package o;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
/* loaded from: classes7.dex */
public final class addSourceSha<T> implements IdlingResource<T>, dataStart {
    dataStart HaptikSDK$a;
    volatile boolean ag$a;
    codepoints<Object> ah$a;
    final boolean toString;
    boolean valueOf;
    final IdlingResource<? super T> values;

    public addSourceSha(IdlingResource<? super T> idlingResource) {
        this(idlingResource, false);
    }

    public addSourceSha(IdlingResource<? super T> idlingResource, boolean z) {
        this.values = idlingResource;
        this.toString = z;
    }

    @Override // o.IdlingResource
    public void onSubscribe(dataStart datastart) {
        if (DisposableHelper.validate(this.HaptikSDK$a, datastart)) {
            this.HaptikSDK$a = datastart;
            this.values.onSubscribe(this);
        }
    }

    @Override // o.dataStart
    public void dispose() {
        this.ag$a = true;
        this.HaptikSDK$a.dispose();
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return this.HaptikSDK$a.isDisposed();
    }

    @Override // o.IdlingResource
    public void onNext(T t) {
        if (this.ag$a) {
            return;
        }
        if (t == null) {
            this.HaptikSDK$a.dispose();
            onError(ExceptionHelper.toString("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            if (this.ag$a) {
                return;
            }
            if (this.valueOf) {
                codepoints<Object> codepointsVar = this.ah$a;
                if (codepointsVar == null) {
                    codepointsVar = new codepoints<>(4);
                    this.ah$a = codepointsVar;
                }
                codepointsVar.ag$a(NotificationLite.next(t));
                return;
            }
            this.valueOf = true;
            this.values.onNext(t);
            values();
        }
    }

    @Override // o.IdlingResource
    public void onError(Throwable th) {
        if (this.ag$a) {
            endMetadataList.valueOf(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.ag$a) {
                if (this.valueOf) {
                    this.ag$a = true;
                    codepoints<Object> codepointsVar = this.ah$a;
                    if (codepointsVar == null) {
                        codepointsVar = new codepoints<>(4);
                        this.ah$a = codepointsVar;
                    }
                    Object error = NotificationLite.error(th);
                    if (this.toString) {
                        codepointsVar.ag$a(error);
                    } else {
                        codepointsVar.values((codepoints<Object>) error);
                    }
                    return;
                }
                this.ag$a = true;
                this.valueOf = true;
                z = false;
            }
            if (z) {
                endMetadataList.valueOf(th);
            } else {
                this.values.onError(th);
            }
        }
    }

    @Override // o.IdlingResource
    public void onComplete() {
        if (this.ag$a) {
            return;
        }
        synchronized (this) {
            if (this.ag$a) {
                return;
            }
            if (this.valueOf) {
                codepoints<Object> codepointsVar = this.ah$a;
                if (codepointsVar == null) {
                    codepointsVar = new codepoints<>(4);
                    this.ah$a = codepointsVar;
                }
                codepointsVar.ag$a(NotificationLite.complete());
                return;
            }
            this.ag$a = true;
            this.valueOf = true;
            this.values.onComplete();
        }
    }

    void values() {
        codepoints<Object> codepointsVar;
        do {
            synchronized (this) {
                codepointsVar = this.ah$a;
                if (codepointsVar == null) {
                    this.valueOf = false;
                    return;
                }
                this.ah$a = null;
            }
        } while (!codepointsVar.values((IdlingResource<? super T>) this.values));
    }
}
