package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeFloatArray$ah$a;
/* loaded from: classes7.dex */
public final class FlowKt__CollectKt$collect$3$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ writeFloatArray$ah$a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__CollectKt$collect$3$emit$1(writeFloatArray$ah$a writefloatarray_ah_a, setPatternPath<? super FlowKt__CollectKt$collect$3$emit$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = writefloatarray_ah_a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
