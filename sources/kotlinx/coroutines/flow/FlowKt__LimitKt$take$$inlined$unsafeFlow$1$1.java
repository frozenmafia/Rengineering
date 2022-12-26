package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeSize;
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ writeSize.valueOf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1(writeSize.valueOf valueof, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = valueof;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
