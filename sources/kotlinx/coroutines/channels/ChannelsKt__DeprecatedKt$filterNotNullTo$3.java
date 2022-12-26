package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.closeField;
import o.readDoubleArray;
import o.readIntArray;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends readDoubleArray<? super E>> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$filterNotNullTo$3(setPatternPath<? super ChannelsKt__DeprecatedKt$filterNotNullTo$3> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object ag$a;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ag$a = closeField.ag$a((readIntArray) null, (readDoubleArray) null, this);
        return ag$a;
    }
}
