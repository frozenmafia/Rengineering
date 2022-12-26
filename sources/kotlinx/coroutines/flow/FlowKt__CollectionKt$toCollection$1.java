package kotlinx.coroutines.flow;

import java.util.Collection;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeException;
/* loaded from: classes7.dex */
public final class FlowKt__CollectionKt$toCollection$1<T, C extends Collection<? super T>> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__CollectionKt$toCollection$1(setPatternPath<? super FlowKt__CollectionKt$toCollection$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object writeexception;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        writeexception = writeException.toString(null, null, this);
        return writeexception;
    }
}
