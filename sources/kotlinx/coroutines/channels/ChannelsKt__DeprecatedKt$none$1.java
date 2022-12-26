package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.closeField;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ChannelsKt__DeprecatedKt$none$1<E> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$none$1(setPatternPath<? super ChannelsKt__DeprecatedKt$none$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object ah$b;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ah$b = closeField.ah$b(null, this);
        return ah$b;
    }
}
