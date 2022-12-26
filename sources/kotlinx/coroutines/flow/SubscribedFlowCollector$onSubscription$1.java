package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.isCustom;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class SubscribedFlowCollector$onSubscription$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ isCustom<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(isCustom<T> iscustom, setPatternPath<? super SubscribedFlowCollector$onSubscription$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = iscustom;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.valueOf(this);
    }
}
