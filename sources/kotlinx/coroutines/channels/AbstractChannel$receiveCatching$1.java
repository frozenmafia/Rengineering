package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.PatternPathMotion;
import o.putVersionedParcelableList;
import o.setPatternPath;
import o.writeSerializable;
/* loaded from: classes7.dex */
public final class AbstractChannel$receiveCatching$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ putVersionedParcelableList<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractChannel$receiveCatching$1(putVersionedParcelableList<E> putversionedparcelablelist, setPatternPath<? super AbstractChannel$receiveCatching$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = putversionedparcelablelist;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object valueOf = this.this$0.valueOf(this);
        return valueOf == PatternPathMotion.values() ? valueOf : writeSerializable.valueOf(valueOf);
    }
}
