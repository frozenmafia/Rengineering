package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getPageTitle$ag$a;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ChannelFlowMerge$collectTo$2$emit$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ getPageTitle$ag$a<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge$collectTo$2$emit$1(getPageTitle$ag$a<? super T> getpagetitle_ag_a, setPatternPath<? super ChannelFlowMerge$collectTo$2$emit$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = getpagetitle_ag_a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
