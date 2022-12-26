package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.excludeObject;
/* loaded from: classes6.dex */
public final class CurryingKt$curried$2 extends Lambda implements Styleable.ChangeBounds<P1, Styleable.ChangeBounds<? super P2, ? extends Styleable.ChangeBounds<? super P3, ? extends R>>> {
    final /* synthetic */ excludeObject $this_curried;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurryingKt$curried$2(excludeObject excludeobject) {
        super(1);
        this.$this_curried = excludeobject;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((CurryingKt$curried$2) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.syntax.function.CurryingKt$curried$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<P2, Styleable.ChangeBounds<? super P3, ? extends R>> {
        final /* synthetic */ Object $p1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$p1 = obj;
        }

        @Override // o.Styleable.ChangeBounds
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((AnonymousClass1) obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: arrow.syntax.function.CurryingKt$curried$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01491 extends Lambda implements Styleable.ChangeBounds<P3, R> {
            final /* synthetic */ Object $p2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01491(Object obj) {
                super(1);
                this.$p2 = obj;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [R, java.lang.Object] */
            @Override // o.Styleable.ChangeBounds
            public final R invoke(P3 p3) {
                return CurryingKt$curried$2.this.$this_curried.invoke(AnonymousClass1.this.$p1, this.$p2, p3);
            }
        }

        @Override // o.Styleable.ChangeBounds
        public final Styleable.ChangeBounds<P3, R> invoke(P2 p2) {
            return new C01491(p2);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final Styleable.ChangeBounds<P2, Styleable.ChangeBounds<P3, R>> invoke(P1 p1) {
        return new AnonymousClass1(p1);
    }
}
