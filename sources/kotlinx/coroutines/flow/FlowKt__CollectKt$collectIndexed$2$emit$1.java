package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeFloatArray;
/* loaded from: classes7.dex */
public final class FlowKt__CollectKt$collectIndexed$2$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ writeFloatArray.values this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__CollectKt$collectIndexed$2$emit$1(writeFloatArray.values valuesVar, setPatternPath<? super FlowKt__CollectKt$collectIndexed$2$emit$1> setpatternpath) {
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
