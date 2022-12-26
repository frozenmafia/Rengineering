package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ViewBindings;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class SubscribedSharedFlow$collect$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ ViewBindings<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedSharedFlow$collect$1(ViewBindings<T> viewBindings, setPatternPath<? super SubscribedSharedFlow$collect$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = viewBindings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
