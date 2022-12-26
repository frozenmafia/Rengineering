package kotlinx.coroutines.sync;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ensureFragment;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class MutexKt$withLock$1<T> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public MutexKt$withLock$1(setPatternPath<? super MutexKt$withLock$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ensureFragment.ag$a(null, null, null, this);
    }
}
