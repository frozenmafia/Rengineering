package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.captureHierarchy;
/* loaded from: classes6.dex */
public final class CurryingKt$curried$3 extends Lambda implements Styleable.ChangeBounds<P1, Styleable.ChangeBounds<? super P2, ? extends Styleable.ChangeBounds<? super P3, ? extends Styleable.ChangeBounds<? super P4, ? extends R>>>> {
    final /* synthetic */ captureHierarchy $this_curried;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurryingKt$curried$3(captureHierarchy capturehierarchy) {
        super(1);
        this.$this_curried = capturehierarchy;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((CurryingKt$curried$3) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.syntax.function.CurryingKt$curried$3$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<P2, Styleable.ChangeBounds<? super P3, ? extends Styleable.ChangeBounds<? super P4, ? extends R>>> {
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
        /* renamed from: arrow.syntax.function.CurryingKt$curried$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01891 extends Lambda implements Styleable.ChangeBounds<P3, Styleable.ChangeBounds<? super P4, ? extends R>> {
            final /* synthetic */ Object $p2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01891(Object obj) {
                super(1);
                this.$p2 = obj;
            }

            @Override // o.Styleable.ChangeBounds
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((C01891) obj);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: arrow.syntax.function.CurryingKt$curried$3$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01901 extends Lambda implements Styleable.ChangeBounds<P4, R> {
                final /* synthetic */ Object $p3;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01901(Object obj) {
                    super(1);
                    this.$p3 = obj;
                }

                /* JADX WARN: Type inference failed for: r5v1, types: [R, java.lang.Object] */
                @Override // o.Styleable.ChangeBounds
                public final R invoke(P4 p4) {
                    return CurryingKt$curried$3.this.$this_curried.invoke(AnonymousClass1.this.$p1, C01891.this.$p2, this.$p3, p4);
                }
            }

            @Override // o.Styleable.ChangeBounds
            public final Styleable.ChangeBounds<P4, R> invoke(P3 p3) {
                return new C01901(p3);
            }
        }

        @Override // o.Styleable.ChangeBounds
        public final Styleable.ChangeBounds<P3, Styleable.ChangeBounds<P4, R>> invoke(P2 p2) {
            return new C01891(p2);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final Styleable.ChangeBounds<P2, Styleable.ChangeBounds<P3, Styleable.ChangeBounds<P4, R>>> invoke(P1 p1) {
        return new AnonymousClass1(p1);
    }
}
