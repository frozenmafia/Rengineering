package kotlinx.coroutines.channels;

import java.util.Collection;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.closeField;
import o.readIntArray;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ChannelsKt__DeprecatedKt$filterNotNullTo$1<E, C extends Collection<? super E>> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$filterNotNullTo$1(setPatternPath<? super ChannelsKt__DeprecatedKt$filterNotNullTo$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object values;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        values = closeField.values((readIntArray) null, (Collection) null, this);
        return values;
    }
}
