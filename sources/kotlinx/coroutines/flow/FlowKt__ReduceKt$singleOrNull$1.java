package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeParcelable;
/* loaded from: classes7.dex */
public final class FlowKt__ReduceKt$singleOrNull$1<T> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ReduceKt$singleOrNull$1(setPatternPath<? super FlowKt__ReduceKt$singleOrNull$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object HaptikSDK$b;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        HaptikSDK$b = writeParcelable.HaptikSDK$b(null, this);
        return HaptikSDK$b;
    }
}
