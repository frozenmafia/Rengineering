package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeParcelable;
/* loaded from: classes7.dex */
public final class FlowKt__ReduceKt$last$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ReduceKt$last$1(setPatternPath<? super FlowKt__ReduceKt$last$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object ah$a;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ah$a = writeParcelable.ah$a(null, this);
        return ah$a;
    }
}
