package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.isStream;
import o.readIntArray;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ChannelsKt__Channels_commonKt$toList$1<E> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__Channels_commonKt$toList$1(setPatternPath<? super ChannelsKt__Channels_commonKt$toList$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object isstream;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        isstream = isStream.toString((readIntArray) null, this);
        return isstream;
    }
}
