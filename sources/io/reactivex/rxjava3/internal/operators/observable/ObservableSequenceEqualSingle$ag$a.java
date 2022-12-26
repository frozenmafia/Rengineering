package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.operators.observable.ObservableSequenceEqualSingle;
import o.IdlingResource;
import o.addCodepoints;
import o.dataStart;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ObservableSequenceEqualSingle$ag$a<T> implements IdlingResource<T> {
    final ObservableSequenceEqualSingle.EqualCoordinator<T> ag$a;
    volatile boolean ah$a;
    Throwable toString;
    final addCodepoints<T> valueOf;
    final int values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ObservableSequenceEqualSingle$ag$a(ObservableSequenceEqualSingle.EqualCoordinator<T> equalCoordinator, int i, int i2) {
        this.ag$a = equalCoordinator;
        this.values = i;
        this.valueOf = new addCodepoints<>(i2);
    }

    @Override // o.IdlingResource
    public void onSubscribe(dataStart datastart) {
        this.ag$a.setDisposable(datastart, this.values);
    }

    @Override // o.IdlingResource
    public void onNext(T t) {
        this.valueOf.offer(t);
        this.ag$a.drain();
    }

    @Override // o.IdlingResource
    public void onError(Throwable th) {
        this.toString = th;
        this.ah$a = true;
        this.ag$a.drain();
    }

    @Override // o.IdlingResource
    public void onComplete() {
        this.ah$a = true;
        this.ag$a.drain();
    }
}
