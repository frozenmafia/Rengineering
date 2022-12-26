package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.matchIds;
/* loaded from: classes6.dex */
public final class ComplementKt$complement$8 extends Lambda implements matchIds<P1, P2, P3, P4, P5, P6, P7, Boolean> {
    final /* synthetic */ matchIds $this_complement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComplementKt$complement$8(matchIds matchids) {
        super(7);
        this.$this_complement = matchids;
    }

    @Override // o.matchIds
    public /* synthetic */ Boolean invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return Boolean.valueOf(invoke2((ComplementKt$complement$8) obj, obj2, obj3, obj4, obj5, obj6, obj7));
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Boolean] */
    @Override // o.matchIds
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7) {
        return !((Boolean) this.$this_complement.invoke(p1, p2, p3, p4, p5, p6, p7)).booleanValue();
    }
}
