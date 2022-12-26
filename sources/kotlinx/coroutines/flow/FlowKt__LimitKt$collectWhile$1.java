package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.Transition;
import o.setPatternPath;
import o.writeByteArray;
import o.writeSize;
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$collectWhile$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__LimitKt$collectWhile$1(setPatternPath<? super FlowKt__LimitKt$collectWhile$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return writeSize.toString((writeByteArray) null, (Transition) null, this);
    }
}
