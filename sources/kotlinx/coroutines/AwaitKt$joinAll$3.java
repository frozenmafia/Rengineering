package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.removeAnimatorSetListener;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class AwaitKt$joinAll$3 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public AwaitKt$joinAll$3(setPatternPath<? super AwaitKt$joinAll$3> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return removeAnimatorSetListener.valueOf(null, this);
    }
}
