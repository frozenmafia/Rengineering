package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__LimitKt$transformWhile$1$ag$a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1(FlowKt__LimitKt$transformWhile$1$ag$a flowKt__LimitKt$transformWhile$1$ag$a, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = flowKt__LimitKt$transformWhile$1$ag$a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
