package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.VersionedParcel;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ VersionedParcel.AnonymousClass1.invoke.AnonymousClass5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1(VersionedParcel.AnonymousClass1.invoke.AnonymousClass5 anonymousClass5, setPatternPath setpatternpath) {
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
