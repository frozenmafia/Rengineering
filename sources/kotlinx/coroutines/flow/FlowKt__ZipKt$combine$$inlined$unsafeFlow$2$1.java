package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeStrongBinder;
/* loaded from: classes7.dex */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$2$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ writeStrongBinder.toString this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$2$1(writeStrongBinder.toString tostring, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = tostring;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
