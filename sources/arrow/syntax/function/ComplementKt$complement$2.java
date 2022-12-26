package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class ComplementKt$complement$2 extends Lambda implements Styleable.ChangeBounds<P1, Boolean> {
    final /* synthetic */ Styleable.ChangeBounds $this_complement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComplementKt$complement$2(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$this_complement = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ Boolean invoke(Object obj) {
        return Boolean.valueOf(invoke2((ComplementKt$complement$2) obj));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean] */
    @Override // o.Styleable.ChangeBounds
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(P1 p1) {
        return !((Boolean) this.$this_complement.invoke(p1)).booleanValue();
    }
}
