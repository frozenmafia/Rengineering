package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.isValidMatch;
/* loaded from: classes6.dex */
public final class ComplementKt$complement$7 extends Lambda implements isValidMatch<P1, P2, P3, P4, P5, P6, Boolean> {
    final /* synthetic */ isValidMatch $this_complement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComplementKt$complement$7(isValidMatch isvalidmatch) {
        super(6);
        this.$this_complement = isvalidmatch;
    }

    @Override // o.isValidMatch
    public /* synthetic */ Boolean invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return Boolean.valueOf(invoke2((ComplementKt$complement$7) obj, obj2, obj3, obj4, obj5, obj6));
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Boolean] */
    @Override // o.isValidMatch
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6) {
        return !((Boolean) this.$this_complement.invoke(p1, p2, p3, p4, p5, p6)).booleanValue();
    }
}
