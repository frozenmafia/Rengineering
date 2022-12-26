package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.VersionedParcel$1$HaptikSDK$a;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$runningFold$1$1$emit$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ VersionedParcel$1$HaptikSDK$a<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$runningFold$1$1$emit$1(VersionedParcel$1$HaptikSDK$a<? super T> versionedParcel$1$HaptikSDK$a, setPatternPath<? super FlowKt__TransformKt$runningFold$1$1$emit$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = versionedParcel$1$HaptikSDK$a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
