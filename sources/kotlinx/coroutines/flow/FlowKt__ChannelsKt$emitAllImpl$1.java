package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeDoubleArray;
/* loaded from: classes7.dex */
public final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ChannelsKt$emitAllImpl$1(setPatternPath<? super FlowKt__ChannelsKt$emitAllImpl$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object writedoublearray;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        writedoublearray = writeDoubleArray.toString(null, null, false, this);
        return writedoublearray;
    }
}
