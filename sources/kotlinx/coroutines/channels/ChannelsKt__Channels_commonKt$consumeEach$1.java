package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.Styleable;
import o.isStream;
import o.readIntArray;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ChannelsKt__Channels_commonKt$consumeEach$1<E> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__Channels_commonKt$consumeEach$1(setPatternPath<? super ChannelsKt__Channels_commonKt$consumeEach$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return isStream.ag$a((readIntArray) null, (Styleable.ChangeBounds) null, this);
    }
}
