package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.VersionedParcel$1$HaptikSDK$b;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ VersionedParcel$1$HaptikSDK$b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1(VersionedParcel$1$HaptikSDK$b versionedParcel$1$HaptikSDK$b, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = versionedParcel$1$HaptikSDK$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
