package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.excludeView;
/* loaded from: classes6.dex */
public final class ComplementKt$complement$22 extends Lambda implements excludeView<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, Boolean> {
    final /* synthetic */ excludeView $this_complement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComplementKt$complement$22(excludeView excludeview) {
        super(21);
        this.$this_complement = excludeview;
    }

    @Override // o.excludeView
    public /* synthetic */ Boolean invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        return Boolean.valueOf(invoke2((ComplementKt$complement$22) obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean] */
    @Override // o.excludeView
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13, P14 p14, P15 p15, P16 p16, P17 p17, P18 p18, P19 p19, P20 p20, P21 p21) {
        return !((Boolean) this.$this_complement.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21)).booleanValue();
    }
}
