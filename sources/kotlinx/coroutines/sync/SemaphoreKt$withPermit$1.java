package kotlinx.coroutines.sync;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createKey;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class SemaphoreKt$withPermit$1<T> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public SemaphoreKt$withPermit$1(setPatternPath<? super SemaphoreKt$withPermit$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return createKey.ah$a(null, null, this);
    }
}
