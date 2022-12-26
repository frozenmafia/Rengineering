package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeLongArray$ag$a;
/* loaded from: classes7.dex */
public final class FlowKt__EmittersKt$onEmpty$1$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ writeLongArray$ag$a<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$onEmpty$1$1$emit$1(writeLongArray$ag$a<? super T> writelongarray_ag_a, setPatternPath<? super FlowKt__EmittersKt$onEmpty$1$1$emit$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = writelongarray_ag_a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
