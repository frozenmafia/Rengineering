package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Transition;
/* loaded from: classes6.dex */
public final class ComplementKt$complement$3 extends Lambda implements Transition<P1, P2, Boolean> {
    final /* synthetic */ Transition $this_complement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComplementKt$complement$3(Transition transition) {
        super(2);
        this.$this_complement = transition;
    }

    @Override // o.Transition
    public /* synthetic */ Boolean invoke(Object obj, Object obj2) {
        return Boolean.valueOf(invoke2((ComplementKt$complement$3) obj, obj2));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean] */
    @Override // o.Transition
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(P1 p1, P2 p2) {
        return !((Boolean) this.$this_complement.invoke(p1, p2)).booleanValue();
    }
}
