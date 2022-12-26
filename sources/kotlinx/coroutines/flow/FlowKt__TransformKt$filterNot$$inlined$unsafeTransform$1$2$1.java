package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.VersionedParcel;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ VersionedParcel.AnonymousClass1.values.C03371 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1(VersionedParcel.AnonymousClass1.values.C03371 c03371, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = c03371;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
