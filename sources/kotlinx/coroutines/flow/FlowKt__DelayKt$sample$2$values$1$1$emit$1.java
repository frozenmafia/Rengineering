package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1;
import o.setPatternPath;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FlowKt__DelayKt$sample$2$values$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__DelayKt$sample$2$values$1.AnonymousClass5<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$sample$2$values$1$1$emit$1(FlowKt__DelayKt$sample$2$values$1.AnonymousClass5<? super T> anonymousClass5, setPatternPath<? super FlowKt__DelayKt$sample$2$values$1$1$emit$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = anonymousClass5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
