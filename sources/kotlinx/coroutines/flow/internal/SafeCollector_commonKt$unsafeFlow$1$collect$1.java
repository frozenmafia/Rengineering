package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setNonPrimaryAlpha$ag$a;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class SafeCollector_commonKt$unsafeFlow$1$collect$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ setNonPrimaryAlpha$ag$a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeCollector_commonKt$unsafeFlow$1$collect$1(setNonPrimaryAlpha$ag$a setnonprimaryalpha_ag_a, setPatternPath<? super SafeCollector_commonKt$unsafeFlow$1$collect$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = setnonprimaryalpha_ag_a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
