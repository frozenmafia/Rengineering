package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.closeField;
import o.readIntArray;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ChannelsKt__DeprecatedKt$elementAt$1<E> extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$elementAt$1(setPatternPath<? super ChannelsKt__DeprecatedKt$elementAt$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object values;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        values = closeField.values((readIntArray) null, 0, this);
        return values;
    }
}
