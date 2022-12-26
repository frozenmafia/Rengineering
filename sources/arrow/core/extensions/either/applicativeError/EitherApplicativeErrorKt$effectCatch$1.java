package arrow.core.extensions.either.applicativeError;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.fromMediaMetadata;
import o.setPatternPath;
/* loaded from: classes6.dex */
public final class EitherApplicativeErrorKt$effectCatch$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public EitherApplicativeErrorKt$effectCatch$1(setPatternPath setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return fromMediaMetadata.ah$a(null, null, this);
    }
}
