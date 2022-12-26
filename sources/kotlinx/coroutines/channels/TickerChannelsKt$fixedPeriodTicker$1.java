package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.readLongArray;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class TickerChannelsKt$fixedPeriodTicker$1 extends ContinuationImpl {
    public long J$0;
    public long J$1;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public TickerChannelsKt$fixedPeriodTicker$1(setPatternPath<? super TickerChannelsKt$fixedPeriodTicker$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object ag$a;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ag$a = readLongArray.ag$a(0L, 0L, null, this);
        return ag$a;
    }
}
