package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeSize$ah$a;
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$drop$2$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ writeSize$ah$a<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$drop$2$1$emit$1(writeSize$ah$a<? super T> writesize_ah_a, setPatternPath<? super FlowKt__LimitKt$drop$2$1$emit$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = writesize_ah_a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
