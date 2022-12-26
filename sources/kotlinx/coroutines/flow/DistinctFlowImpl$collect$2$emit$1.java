package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeCharSequence$ah$a;
/* loaded from: classes7.dex */
public final class DistinctFlowImpl$collect$2$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ writeCharSequence$ah$a<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl$collect$2$emit$1(writeCharSequence$ah$a<? super T> writecharsequence_ah_a, setPatternPath<? super DistinctFlowImpl$collect$2$emit$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = writecharsequence_ah_a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
