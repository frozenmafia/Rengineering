package retrofit2;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getWindowLayoutChangeCallbacks;
import o.setPatternPath;
/* loaded from: classes5.dex */
public final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public KotlinExtensions$suspendAndThrow$1(setPatternPath setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return getWindowLayoutChangeCallbacks.values((Exception) null, this);
    }
}
