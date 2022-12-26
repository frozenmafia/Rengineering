package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeLongArray;
/* loaded from: classes7.dex */
public final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__EmittersKt$invokeSafely$1(setPatternPath<? super FlowKt__EmittersKt$invokeSafely$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object writelongarray;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        writelongarray = writeLongArray.toString(null, null, null, this);
        return writelongarray;
    }
}
