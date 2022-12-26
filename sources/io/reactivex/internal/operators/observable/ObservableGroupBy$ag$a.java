package io.reactivex.internal.operators.observable;

import io.reactivex.internal.operators.observable.ObservableGroupBy;
import o.SupportSQLiteOpenHelper;
import o.setAnimationProgress;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ObservableGroupBy$ag$a<K, T> extends setAnimationProgress<K, T> {
    final ObservableGroupBy.State<T, K> ag$a;

    public static <T, K> ObservableGroupBy$ag$a<K, T> valueOf(K k, int i, ObservableGroupBy.GroupByObserver<?, K, T> groupByObserver, boolean z) {
        return new ObservableGroupBy$ag$a<>(k, new ObservableGroupBy.State(i, groupByObserver, k, z));
    }

    protected ObservableGroupBy$ag$a(K k, ObservableGroupBy.State<T, K> state) {
        super(k);
        this.ag$a = state;
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.ag$a.subscribe(factory);
    }

    public void toString(T t) {
        this.ag$a.onNext(t);
    }

    public void ah$a(Throwable th) {
        this.ag$a.onError(th);
    }

    public void invoke() {
        this.ag$a.onComplete();
    }
}
