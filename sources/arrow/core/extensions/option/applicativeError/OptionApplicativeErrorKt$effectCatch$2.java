package arrow.core.extensions.option.applicativeError;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getString;
import o.setPatternPath;
/* loaded from: classes6.dex */
public final class OptionApplicativeErrorKt$effectCatch$2 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public OptionApplicativeErrorKt$effectCatch$2(setPatternPath setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return getString.toString(null, null, this);
    }
}
