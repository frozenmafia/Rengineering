package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.VersionedParcel$1$ag$a;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ VersionedParcel$1$ag$a.AnonymousClass2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1(VersionedParcel$1$ag$a.AnonymousClass2 anonymousClass2, setPatternPath setpatternpath) {
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
