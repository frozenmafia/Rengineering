package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ParcelField;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public TimeoutKt$withTimeoutOrNull$1(setPatternPath<? super TimeoutKt$withTimeoutOrNull$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ParcelField.ag$a(0L, null, this);
    }
}
