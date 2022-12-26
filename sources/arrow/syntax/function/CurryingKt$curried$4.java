package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.excludeId;
/* loaded from: classes6.dex */
public final class CurryingKt$curried$4 extends Lambda implements Styleable.ChangeBounds<P1, Styleable.ChangeBounds<? super P2, ? extends Styleable.ChangeBounds<? super P3, ? extends Styleable.ChangeBounds<? super P4, ? extends Styleable.ChangeBounds<? super P5, ? extends R>>>>> {
    final /* synthetic */ excludeId $this_curried;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurryingKt$curried$4(excludeId excludeid) {
        super(1);
        this.$this_curried = excludeid;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((CurryingKt$curried$4) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.syntax.function.CurryingKt$curried$4$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<P2, Styleable.ChangeBounds<? super P3, ? extends Styleable.ChangeBounds<? super P4, ? extends Styleable.ChangeBounds<? super P5, ? extends R>>>> {
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
        /* renamed from: arrow.syntax.function.CurryingKt$curried$4$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01911 extends Lambda implements Styleable.ChangeBounds<P3, Styleable.ChangeBounds<? super P4, ? extends Styleable.ChangeBounds<? super P5, ? extends R>>> {
            final /* synthetic */ Object $p2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01911(Object obj) {
                super(1);
                this.$p2 = obj;
            }

            @Override // o.Styleable.ChangeBounds
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((C01911) obj);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: arrow.syntax.function.CurryingKt$curried$4$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01921 extends Lambda implements Styleable.ChangeBounds<P4, Styleable.ChangeBounds<? super P5, ? extends R>> {
                final /* synthetic */ Object $p3;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01921(Object obj) {
                    super(1);
                    this.$p3 = obj;
                }

                @Override // o.Styleable.ChangeBounds
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((C01921) obj);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: arrow.syntax.function.CurryingKt$curried$4$1$1$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C01931 extends Lambda implements Styleable.ChangeBounds<P5, R> {
                    final /* synthetic */ Object $p4;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C01931(Object obj) {
                        super(1);
                        this.$p4 = obj;
                    }

                    /* JADX WARN: Type inference failed for: r8v1, types: [R, java.lang.Object] */
                    @Override // o.Styleable.ChangeBounds
                    public final R invoke(P5 p5) {
                        return CurryingKt$curried$4.this.$this_curried.invoke(AnonymousClass1.this.$p1, C01911.this.$p2, C01921.this.$p3, this.$p4, p5);
                    }
                }

                @Override // o.Styleable.ChangeBounds
                public final Styleable.ChangeBounds<P5, R> invoke(P4 p4) {
                    return new C01931(p4);
                }
            }

            @Override // o.Styleable.ChangeBounds
            public final Styleable.ChangeBounds<P4, Styleable.ChangeBounds<P5, R>> invoke(P3 p3) {
                return new C01921(p3);
            }
        }

        @Override // o.Styleable.ChangeBounds
        public final Styleable.ChangeBounds<P3, Styleable.ChangeBounds<P4, Styleable.ChangeBounds<P5, R>>> invoke(P2 p2) {
            return new C01911(p2);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final Styleable.ChangeBounds<P2, Styleable.ChangeBounds<P3, Styleable.ChangeBounds<P4, Styleable.ChangeBounds<P5, R>>>> invoke(P1 p1) {
        return new AnonymousClass1(p1);
    }
}
