package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class ComplementKt$complement$11 extends Lambda implements Styleable.PatternPathMotion<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, Boolean> {
    final /* synthetic */ Styleable.PatternPathMotion $this_complement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComplementKt$complement$11(Styleable.PatternPathMotion patternPathMotion) {
        super(10);
        this.$this_complement = patternPathMotion;
    }

    @Override // o.Styleable.PatternPathMotion
    public /* synthetic */ Boolean invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return Boolean.valueOf(invoke2((ComplementKt$complement$11) obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean] */
    @Override // o.Styleable.PatternPathMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10) {
        return !((Boolean) this.$this_complement.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)).booleanValue();
    }
}
