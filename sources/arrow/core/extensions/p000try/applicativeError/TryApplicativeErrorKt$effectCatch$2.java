package arrow.core.extensions.p000try.applicativeError;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.MediaMetadataCompat;
import o.setPatternPath;
/* renamed from: arrow.core.extensions.try.applicativeError.TryApplicativeErrorKt$effectCatch$2  reason: invalid package */
/* loaded from: classes6.dex */
public final class TryApplicativeErrorKt$effectCatch$2 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public TryApplicativeErrorKt$effectCatch$2(setPatternPath setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MediaMetadataCompat.Builder.toString(null, null, this);
    }
}
