package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeSet;
/* loaded from: classes7.dex */
public final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ErrorsKt$catchImpl$1(setPatternPath<? super FlowKt__ErrorsKt$catchImpl$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object ag$a;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ag$a = writeSet.ag$a(null, null, this);
        return ag$a;
    }
}
