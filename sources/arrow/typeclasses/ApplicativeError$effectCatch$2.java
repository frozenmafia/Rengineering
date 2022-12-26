package arrow.typeclasses;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.Styleable;
import o.newUnratedRating;
import o.newUnratedRating$ah$a;
import o.setPatternPath;
/* loaded from: classes6.dex */
public final class ApplicativeError$effectCatch$2 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ newUnratedRating this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicativeError$effectCatch$2(newUnratedRating newunratedrating, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = newunratedrating;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return newUnratedRating$ah$a.values((newUnratedRating) null, (newUnratedRating) null, (Styleable.ChangeBounds) null, this);
    }
}
