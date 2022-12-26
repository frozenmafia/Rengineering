package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.VersionedParcel$1$ah$b;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VersionedParcel$1$ah$b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$1(VersionedParcel$1$ah$b versionedParcel$1$ah$b, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = versionedParcel$1$ah$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
