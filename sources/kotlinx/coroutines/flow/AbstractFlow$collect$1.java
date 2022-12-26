package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.readVersionedParcelable;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class AbstractFlow$collect$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ readVersionedParcelable<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractFlow$collect$1(readVersionedParcelable<T> readversionedparcelable, setPatternPath<? super AbstractFlow$collect$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = readversionedparcelable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
