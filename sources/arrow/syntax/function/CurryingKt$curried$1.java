package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
/* loaded from: classes6.dex */
public final class CurryingKt$curried$1 extends Lambda implements Styleable.ChangeBounds<P1, Styleable.ChangeBounds<? super P2, ? extends R>> {
    final /* synthetic */ Transition $this_curried;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurryingKt$curried$1(Transition transition) {
        super(1);
        this.$this_curried = transition;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((CurryingKt$curried$1) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.syntax.function.CurryingKt$curried$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<P2, R> {
        final /* synthetic */ Object $p1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$p1 = obj;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
        @Override // o.Styleable.ChangeBounds
        public final R invoke(P2 p2) {
            return CurryingKt$curried$1.this.$this_curried.invoke(this.$p1, p2);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final Styleable.ChangeBounds<P2, R> invoke(P1 p1) {
        return new AnonymousClass1(p1);
    }
}
