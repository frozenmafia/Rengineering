package arrow.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setDefaultImpl;
import o.setPatternPath;
/* loaded from: classes6.dex */
public final class Either$Companion$catch$3 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ setDefaultImpl.valueOf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Either$Companion$catch$3(setDefaultImpl.valueOf valueof, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = valueof;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.toString(null, null, this);
    }
}
