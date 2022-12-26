package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.emojiStyle;
import o.forceDefaults;
import o.offset;
import o.putByte;
/* loaded from: classes7.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<dataStart> implements IdlingResource<T>, dataStart {
    private static final long serialVersionUID = -5417183359794346637L;
    volatile boolean done;
    int fusionMode;
    final offset<T> parent;
    final int prefetch;
    putByte<T> queue;

    public InnerQueuedObserver(offset<T> offsetVar, int i) {
        this.parent = offsetVar;
        this.prefetch = i;
    }

    @Override // o.IdlingResource
    public void onSubscribe(dataStart datastart) {
        if (DisposableHelper.setOnce(this, datastart)) {
            if (datastart instanceof forceDefaults) {
                forceDefaults forcedefaults = (forceDefaults) datastart;
                int requestFusion = forcedefaults.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = forcedefaults;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = forcedefaults;
                    return;
                }
            }
            this.queue = emojiStyle.valueOf(-this.prefetch);
        }
    }

    @Override // o.IdlingResource
    public void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t);
        } else {
            this.parent.drain();
        }
    }

    @Override // o.IdlingResource
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // o.IdlingResource
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // o.dataStart
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public boolean isDone() {
        return this.done;
    }

    public void setDone() {
        this.done = true;
    }

    public putByte<T> queue() {
        return this.queue;
    }
}
