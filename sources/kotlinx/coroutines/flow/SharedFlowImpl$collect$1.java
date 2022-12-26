package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.resolveClass;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class SharedFlowImpl$collect$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ resolveClass<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedFlowImpl$collect$1(resolveClass<T> resolveclass, setPatternPath<? super SharedFlowImpl$collect$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = resolveclass;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return resolveClass.values(this.this$0, null, this);
    }
}
