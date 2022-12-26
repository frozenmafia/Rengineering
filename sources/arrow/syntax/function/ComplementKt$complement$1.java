package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class ComplementKt$complement$1 extends Lambda implements Styleable.ArcMotion<Boolean> {
    final /* synthetic */ Styleable.ArcMotion $this_complement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComplementKt$complement$1(Styleable.ArcMotion arcMotion) {
        super(0);
        this.$this_complement = arcMotion;
    }

    @Override // o.Styleable.ArcMotion
    public /* synthetic */ Boolean invoke() {
        return Boolean.valueOf(invoke2());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Boolean] */
    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2() {
        return !((Boolean) this.$this_complement.invoke()).booleanValue();
    }
}
