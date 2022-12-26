package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.readCollection;
import o.readDoubleArray;
import o.readIntArray;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ChannelsKt__DeprecatedKt$toChannel$1<E, C extends readDoubleArray<? super E>> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$toChannel$1(setPatternPath<? super ChannelsKt__DeprecatedKt$toChannel$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return readCollection.toString((readIntArray) null, (readDoubleArray) null, this);
    }
}
