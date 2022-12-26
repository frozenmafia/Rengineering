package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.matchIds;
/* loaded from: classes6.dex */
public final class CurryingKt$curried$6 extends Lambda implements Styleable.ChangeBounds<P1, Styleable.ChangeBounds<? super P2, ? extends Styleable.ChangeBounds<? super P3, ? extends Styleable.ChangeBounds<? super P4, ? extends Styleable.ChangeBounds<? super P5, ? extends Styleable.ChangeBounds<? super P6, ? extends Styleable.ChangeBounds<? super P7, ? extends R>>>>>>> {
    final /* synthetic */ matchIds $this_curried;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurryingKt$curried$6(matchIds matchids) {
        super(1);
        this.$this_curried = matchids;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((CurryingKt$curried$6) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.syntax.function.CurryingKt$curried$6$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<P2, Styleable.ChangeBounds<? super P3, ? extends Styleable.ChangeBounds<? super P4, ? extends Styleable.ChangeBounds<? super P5, ? extends Styleable.ChangeBounds<? super P6, ? extends Styleable.ChangeBounds<? super P7, ? extends R>>>>>> {
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
        /* renamed from: arrow.syntax.function.CurryingKt$curried$6$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01981 extends Lambda implements Styleable.ChangeBounds<P3, Styleable.ChangeBounds<? super P4, ? extends Styleable.ChangeBounds<? super P5, ? extends Styleable.ChangeBounds<? super P6, ? extends Styleable.ChangeBounds<? super P7, ? extends R>>>>> {
            final /* synthetic */ Object $p2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01981(Object obj) {
                super(1);
                this.$p2 = obj;
            }

            @Override // o.Styleable.ChangeBounds
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((C01981) obj);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: arrow.syntax.function.CurryingKt$curried$6$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01991 extends Lambda implements Styleable.ChangeBounds<P4, Styleable.ChangeBounds<? super P5, ? extends Styleable.ChangeBounds<? super P6, ? extends Styleable.ChangeBounds<? super P7, ? extends R>>>> {
                final /* synthetic */ Object $p3;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01991(Object obj) {
                    super(1);
                    this.$p3 = obj;
                }

                @Override // o.Styleable.ChangeBounds
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((C01991) obj);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: arrow.syntax.function.CurryingKt$curried$6$1$1$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C02001 extends Lambda implements Styleable.ChangeBounds<P5, Styleable.ChangeBounds<? super P6, ? extends Styleable.ChangeBounds<? super P7, ? extends R>>> {
                    final /* synthetic */ Object $p4;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02001(Object obj) {
                        super(1);
                        this.$p4 = obj;
                    }

                    @Override // o.Styleable.ChangeBounds
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((C02001) obj);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: arrow.syntax.function.CurryingKt$curried$6$1$1$1$1$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes6.dex */
                    public static final class C02011 extends Lambda implements Styleable.ChangeBounds<P6, Styleable.ChangeBounds<? super P7, ? extends R>> {
                        final /* synthetic */ Object $p5;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C02011(Object obj) {
                            super(1);
                            this.$p5 = obj;
                        }

                        @Override // o.Styleable.ChangeBounds
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke((C02011) obj);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* renamed from: arrow.syntax.function.CurryingKt$curried$6$1$1$1$1$1$1  reason: invalid class name and collision with other inner class name */
                        /* loaded from: classes6.dex */
                        public static final class C02021 extends Lambda implements Styleable.ChangeBounds<P7, R> {
                            final /* synthetic */ Object $p6;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C02021(Object obj) {
                                super(1);
                                this.$p6 = obj;
                            }

                            /* JADX WARN: Type inference failed for: r10v1, types: [R, java.lang.Object] */
                            @Override // o.Styleable.ChangeBounds
                            public final R invoke(P7 p7) {
                                return CurryingKt$curried$6.this.$this_curried.invoke(AnonymousClass1.this.$p1, C01981.this.$p2, C01991.this.$p3, C02001.this.$p4, C02011.this.$p5, this.$p6, p7);
                            }
                        }

                        @Override // o.Styleable.ChangeBounds
                        public final Styleable.ChangeBounds<P7, R> invoke(P6 p6) {
                            return new C02021(p6);
                        }
                    }

                    @Override // o.Styleable.ChangeBounds
                    public final Styleable.ChangeBounds<P6, Styleable.ChangeBounds<P7, R>> invoke(P5 p5) {
                        return new C02011(p5);
                    }
                }

                @Override // o.Styleable.ChangeBounds
                public final Styleable.ChangeBounds<P5, Styleable.ChangeBounds<P6, Styleable.ChangeBounds<P7, R>>> invoke(P4 p4) {
                    return new C02001(p4);
                }
            }

            @Override // o.Styleable.ChangeBounds
            public final Styleable.ChangeBounds<P4, Styleable.ChangeBounds<P5, Styleable.ChangeBounds<P6, Styleable.ChangeBounds<P7, R>>>> invoke(P3 p3) {
                return new C01991(p3);
            }
        }

        @Override // o.Styleable.ChangeBounds
        public final Styleable.ChangeBounds<P3, Styleable.ChangeBounds<P4, Styleable.ChangeBounds<P5, Styleable.ChangeBounds<P6, Styleable.ChangeBounds<P7, R>>>>> invoke(P2 p2) {
            return new C01981(p2);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final Styleable.ChangeBounds<P2, Styleable.ChangeBounds<P3, Styleable.ChangeBounds<P4, Styleable.ChangeBounds<P5, Styleable.ChangeBounds<P6, Styleable.ChangeBounds<P7, R>>>>>> invoke(P1 p1) {
        return new AnonymousClass1(p1);
    }
}
