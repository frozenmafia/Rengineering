package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeParcelable;
/* loaded from: classes7.dex */
public final class FlowKt__ReduceKt$fold$1<T, R> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ReduceKt$fold$1(setPatternPath<? super FlowKt__ReduceKt$fold$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return writeParcelable.toString(null, null, null, this);
    }
}
