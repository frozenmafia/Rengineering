package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeLongArray;
/* loaded from: classes7.dex */
public final class FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ writeLongArray.invoke<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(writeLongArray.invoke<? super T> invokeVar, setPatternPath<? super FlowKt__EmittersKt$unsafeTransform$1$1$emit$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = invokeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
