package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.unscheduleSelf;
/* loaded from: classes7.dex */
public final class DelayKt$awaitCancellation$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    public DelayKt$awaitCancellation$1(setPatternPath<? super DelayKt$awaitCancellation$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return unscheduleSelf.valueOf(this);
    }
}
