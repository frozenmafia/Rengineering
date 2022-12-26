package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeSet;
/* loaded from: classes7.dex */
public final class FlowKt__ErrorsKt$catchImpl$2$emit$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ writeSet.toString<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ErrorsKt$catchImpl$2$emit$1(writeSet.toString<? super T> tostring, setPatternPath<? super FlowKt__ErrorsKt$catchImpl$2$emit$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = tostring;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
