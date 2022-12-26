package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.excludeObject;
/* loaded from: classes6.dex */
public final class ComplementKt$complement$4 extends Lambda implements excludeObject<P1, P2, P3, Boolean> {
    final /* synthetic */ excludeObject $this_complement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComplementKt$complement$4(excludeObject excludeobject) {
        super(3);
        this.$this_complement = excludeobject;
    }

    @Override // o.excludeObject
    public /* synthetic */ Boolean invoke(Object obj, Object obj2, Object obj3) {
        return Boolean.valueOf(invoke2((ComplementKt$complement$4) obj, obj2, obj3));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean] */
    @Override // o.excludeObject
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(P1 p1, P2 p2, P3 p3) {
        return !((Boolean) this.$this_complement.invoke(p1, p2, p3)).booleanValue();
    }
}
