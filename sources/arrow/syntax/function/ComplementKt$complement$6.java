package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.excludeId;
/* loaded from: classes6.dex */
public final class ComplementKt$complement$6 extends Lambda implements excludeId<P1, P2, P3, P4, P5, Boolean> {
    final /* synthetic */ excludeId $this_complement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComplementKt$complement$6(excludeId excludeid) {
        super(5);
        this.$this_complement = excludeid;
    }

    @Override // o.excludeId
    public /* synthetic */ Boolean invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return Boolean.valueOf(invoke2((ComplementKt$complement$6) obj, obj2, obj3, obj4, obj5));
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    @Override // o.excludeId
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5) {
        return !((Boolean) this.$this_complement.invoke(p1, p2, p3, p4, p5)).booleanValue();
    }
}
