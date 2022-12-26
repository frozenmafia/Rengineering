package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeSparseBooleanArray;
/* loaded from: classes7.dex */
public final class FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ writeSparseBooleanArray.valueOf.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1(writeSparseBooleanArray.valueOf.AnonymousClass1 anonymousClass1, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
