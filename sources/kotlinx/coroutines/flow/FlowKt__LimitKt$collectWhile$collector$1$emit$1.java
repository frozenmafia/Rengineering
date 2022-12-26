package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeSize;
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1$emit$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ writeSize.values this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$collectWhile$collector$1$emit$1(writeSize.values valuesVar, setPatternPath<? super FlowKt__LimitKt$collectWhile$collector$1$emit$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = valuesVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
