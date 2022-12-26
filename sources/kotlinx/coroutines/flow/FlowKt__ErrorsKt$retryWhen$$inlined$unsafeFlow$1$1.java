package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeSet$ag$a;
/* loaded from: classes7.dex */
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    public int I$0;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ writeSet$ag$a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1(writeSet$ag$a writeset_ag_a, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = writeset_ag_a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
