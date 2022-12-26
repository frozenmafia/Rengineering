package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.VersionedParcel$1$ah$a;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ VersionedParcel$1$ah$a.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1(VersionedParcel$1$ah$a.AnonymousClass1 anonymousClass1, setPatternPath setpatternpath) {
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
