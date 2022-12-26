package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.applyOptions;
/* loaded from: classes6.dex */
public final class SortedMapKHash$hash$2 extends Lambda implements Transition<Integer, A, Integer> {
    final /* synthetic */ applyOptions this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SortedMapKHash$hash$2(applyOptions applyoptions) {
        super(2);
        this.this$0 = applyoptions;
    }

    @Override // o.Transition
    public /* synthetic */ Integer invoke(Integer num, Object obj) {
        return Integer.valueOf(invoke(num.intValue(), (int) obj));
    }

    public final int invoke(int i, A a) {
        return (i * 31) + this.this$0.ah$a().values(a);
    }
}
