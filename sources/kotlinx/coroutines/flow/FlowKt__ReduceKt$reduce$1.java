package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.excludeObject;
import o.setPatternPath;
import o.writeByteArray;
import o.writeIntArray;
/* loaded from: classes7.dex */
public final class FlowKt__ReduceKt$reduce$1<S, T extends S> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ReduceKt$reduce$1(setPatternPath<? super FlowKt__ReduceKt$reduce$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return writeIntArray.values((writeByteArray) null, (excludeObject) null, this);
    }
}
