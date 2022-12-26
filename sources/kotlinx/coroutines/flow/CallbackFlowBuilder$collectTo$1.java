package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeBooleanArray;
/* loaded from: classes7.dex */
public final class CallbackFlowBuilder$collectTo$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ writeBooleanArray<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackFlowBuilder$collectTo$1(writeBooleanArray<T> writebooleanarray, setPatternPath<? super CallbackFlowBuilder$collectTo$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = writebooleanarray;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.ag$a(null, this);
    }
}
