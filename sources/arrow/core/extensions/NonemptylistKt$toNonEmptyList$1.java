package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.validateRelationship;
/* loaded from: classes6.dex */
public final class NonemptylistKt$toNonEmptyList$1 extends Lambda implements Styleable.ChangeBounds<A, validateRelationship<? extends A>> {
    public static final NonemptylistKt$toNonEmptyList$1 INSTANCE = new NonemptylistKt$toNonEmptyList$1();

    NonemptylistKt$toNonEmptyList$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((NonemptylistKt$toNonEmptyList$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final validateRelationship<A> invoke(A a) {
        return validateRelationship.valueOf.ah$a(a, new Object[0]);
    }
}
