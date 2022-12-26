package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.VersionedParcel;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VersionedParcel.AnonymousClass1.toString this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$1(VersionedParcel.AnonymousClass1.toString tostring, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = tostring;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
