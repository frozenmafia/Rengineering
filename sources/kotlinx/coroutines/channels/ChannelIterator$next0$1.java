package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.readExceptionCode$ah$a;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ChannelIterator$next0$1<E> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public ChannelIterator$next0$1(setPatternPath<? super ChannelIterator$next0$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return readExceptionCode$ah$a.ah$a(null, this);
    }
}
