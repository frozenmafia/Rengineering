package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.getOptionsList;
/* loaded from: classes6.dex */
public final class SequenceKHash$hash$1 extends Lambda implements Transition<Integer, A, Integer> {
    final /* synthetic */ getOptionsList this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SequenceKHash$hash$1(getOptionsList getoptionslist) {
        super(2);
        this.this$0 = getoptionslist;
    }

    @Override // o.Transition
    public /* synthetic */ Integer invoke(Integer num, Object obj) {
        return Integer.valueOf(invoke(num.intValue(), (int) obj));
    }

    public final int invoke(int i, A a) {
        return (i * 31) + this.this$0.values().values(a);
    }
}
