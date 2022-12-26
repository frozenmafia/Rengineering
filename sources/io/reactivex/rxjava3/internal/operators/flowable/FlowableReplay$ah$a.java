package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public interface FlowableReplay$ah$a<T> {
    void complete();

    void error(Throwable th);

    void next(T t);

    void replay(FlowableReplay.InnerSubscription<T> innerSubscription);
}
