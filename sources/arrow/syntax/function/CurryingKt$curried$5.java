package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isValidMatch;
/* loaded from: classes6.dex */
public final class CurryingKt$curried$5 extends Lambda implements Styleable.ChangeBounds<P1, Styleable.ChangeBounds<? super P2, ? extends Styleable.ChangeBounds<? super P3, ? extends Styleable.ChangeBounds<? super P4, ? extends Styleable.ChangeBounds<? super P5, ? extends Styleable.ChangeBounds<? super P6, ? extends R>>>>>> {
    final /* synthetic */ isValidMatch $this_curried;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurryingKt$curried$5(isValidMatch isvalidmatch) {
        super(1);
        this.$this_curried = isvalidmatch;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((CurryingKt$curried$5) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.syntax.function.CurryingKt$curried$5$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<P2, Styleable.ChangeBounds<? super P3, ? extends Styleable.ChangeBounds<? super P4, ? extends Styleable.ChangeBounds<? super P5, ? extends Styleable.ChangeBounds<? super P6, ? extends R>>>>> {
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
        /* renamed from: arrow.syntax.function.CurryingKt$curried$5$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01941 extends Lambda implements Styleable.ChangeBounds<P3, Styleable.ChangeBounds<? super P4, ? extends Styleable.ChangeBounds<? super P5, ? extends Styleable.ChangeBounds<? super P6, ? extends R>>>> {
            final /* synthetic */ Object $p2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01941(Object obj) {
                super(1);
                this.$p2 = obj;
            }

            @Override // o.Styleable.ChangeBounds
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((C01941) obj);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: arrow.syntax.function.CurryingKt$curried$5$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01951 extends Lambda implements Styleable.ChangeBounds<P4, Styleable.ChangeBounds<? super P5, ? extends Styleable.ChangeBounds<? super P6, ? extends R>>> {
                final /* synthetic */ Object $p3;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01951(Object obj) {
                    super(1);
                    this.$p3 = obj;
                }

                @Override // o.Styleable.ChangeBounds
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((C01951) obj);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: arrow.syntax.function.CurryingKt$curried$5$1$1$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C01961 extends Lambda implements Styleable.ChangeBounds<P5, Styleable.ChangeBounds<? super P6, ? extends R>> {
                    final /* synthetic */ Object $p4;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C01961(Object obj) {
                        super(1);
                        this.$p4 = obj;
                    }

                    @Override // o.Styleable.ChangeBounds
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((C01961) obj);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: arrow.syntax.function.CurryingKt$curried$5$1$1$1$1$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes6.dex */
                    public static final class C01971 extends Lambda implements Styleable.ChangeBounds<P6, R> {
                        final /* synthetic */ Object $p5;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C01971(Object obj) {
                            super(1);
                            this.$p5 = obj;
                        }

                        /* JADX WARN: Type inference failed for: r9v1, types: [R, java.lang.Object] */
                        @Override // o.Styleable.ChangeBounds
                        public final R invoke(P6 p6) {
                            return CurryingKt$curried$5.this.$this_curried.invoke(AnonymousClass1.this.$p1, C01941.this.$p2, C01951.this.$p3, C01961.this.$p4, this.$p5, p6);
                        }
                    }

                    @Override // o.Styleable.ChangeBounds
                    public final Styleable.ChangeBounds<P6, R> invoke(P5 p5) {
                        return new C01971(p5);
                    }
                }

                @Override // o.Styleable.ChangeBounds
                public final Styleable.ChangeBounds<P5, Styleable.ChangeBounds<P6, R>> invoke(P4 p4) {
                    return new C01961(p4);
                }
            }

            @Override // o.Styleable.ChangeBounds
            public final Styleable.ChangeBounds<P4, Styleable.ChangeBounds<P5, Styleable.ChangeBounds<P6, R>>> invoke(P3 p3) {
                return new C01951(p3);
            }
        }

        @Override // o.Styleable.ChangeBounds
        public final Styleable.ChangeBounds<P3, Styleable.ChangeBounds<P4, Styleable.ChangeBounds<P5, Styleable.ChangeBounds<P6, R>>>> invoke(P2 p2) {
            return new C01941(p2);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final Styleable.ChangeBounds<P2, Styleable.ChangeBounds<P3, Styleable.ChangeBounds<P4, Styleable.ChangeBounds<P5, Styleable.ChangeBounds<P6, R>>>>> invoke(P1 p1) {
        return new AnonymousClass1(p1);
    }
}
