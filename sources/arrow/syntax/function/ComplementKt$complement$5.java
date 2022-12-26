package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.captureHierarchy;
/* loaded from: classes6.dex */
public final class ComplementKt$complement$5 extends Lambda implements captureHierarchy<P1, P2, P3, P4, Boolean> {
    final /* synthetic */ captureHierarchy $this_complement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComplementKt$complement$5(captureHierarchy capturehierarchy) {
        super(4);
        this.$this_complement = capturehierarchy;
    }

    @Override // o.captureHierarchy
    public /* synthetic */ Boolean invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return Boolean.valueOf(invoke2((ComplementKt$complement$5) obj, obj2, obj3, obj4));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean] */
    @Override // o.captureHierarchy
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(P1 p1, P2 p2, P3 p3, P4 p4) {
        return !((Boolean) this.$this_complement.invoke(p1, p2, p3, p4)).booleanValue();
    }
}
