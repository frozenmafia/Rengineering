package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.readLongArray;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public TickerChannelsKt$fixedDelayTicker$1(setPatternPath<? super TickerChannelsKt$fixedDelayTicker$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object values;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        values = readLongArray.values(0L, 0L, null, this);
        return values;
    }
}
