package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class FlowKt__EmittersKt$transform$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__EmittersKt$transform$1.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$transform$1$1$emit$1(FlowKt__EmittersKt$transform$1.AnonymousClass2<? super T> anonymousClass2, setPatternPath<? super FlowKt__EmittersKt$transform$1$1$emit$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
