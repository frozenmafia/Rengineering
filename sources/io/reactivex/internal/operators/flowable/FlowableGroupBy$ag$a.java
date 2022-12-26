package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.operators.flowable.FlowableGroupBy;
import o.newCursor;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
final class FlowableGroupBy$ag$a<K, T> extends newCursor<K, T> {
    final FlowableGroupBy.State<T, K> toString;

    public static <T, K> FlowableGroupBy$ag$a<K, T> ah$a(K k, int i, FlowableGroupBy.GroupBySubscriber<?, K, T> groupBySubscriber, boolean z) {
        return new FlowableGroupBy$ag$a<>(k, new FlowableGroupBy.State(i, groupBySubscriber, k, z));
    }

    protected FlowableGroupBy$ag$a(K k, FlowableGroupBy.State<T, K> state) {
        super(k);
        this.toString = state;
    }

    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.toString.subscribe(registerconfigurationchangelistener);
    }

    public void valueOf(T t) {
        this.toString.onNext(t);
    }

    public void ag$a(Throwable th) {
        this.toString.onError(th);
    }

    public void HaptikSDK$b() {
        this.toString.onComplete();
    }
}
