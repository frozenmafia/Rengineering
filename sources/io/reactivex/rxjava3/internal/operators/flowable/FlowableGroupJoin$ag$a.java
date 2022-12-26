package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.FlowableGroupJoin;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public interface FlowableGroupJoin$ag$a {
    void innerClose(boolean z, FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber);

    void innerCloseError(Throwable th);

    void innerComplete(FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber);

    void innerError(Throwable th);

    void innerValue(boolean z, Object obj);
}
