package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeParcelable$ah$a;
/* loaded from: classes7.dex */
public final class FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ writeParcelable$ah$a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1(writeParcelable$ah$a writeparcelable_ah_a, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = writeparcelable_ah_a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
