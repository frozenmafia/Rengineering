package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.getRatingStyle;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class Foldable$traverse_$2$1$1 extends Lambda implements Styleable.ChangeBounds<ICustomTabsCallback.Default<? extends G, ? extends setAnimationMatrix>, ICustomTabsCallback.Default<? extends G, ? extends Styleable.ChangeBounds<? super B, ? extends setAnimationMatrix>>> {
    final /* synthetic */ getRatingStyle $this_run;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Foldable$traverse_$2$1$1(getRatingStyle getratingstyle) {
        super(1);
        this.$this_run = getratingstyle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.typeclasses.Foldable$traverse_$2$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<setAnimationMatrix, Styleable.ChangeBounds<? super B, ? extends setAnimationMatrix>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: arrow.typeclasses.Foldable$traverse_$2$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C02291 extends Lambda implements Styleable.ChangeBounds<B, setAnimationMatrix> {
            public static final C02291 INSTANCE = new C02291();

            C02291() {
                super(1);
            }

            @Override // o.Styleable.ChangeBounds
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(B b2) {
            }

            @Override // o.Styleable.ChangeBounds
            public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Object obj) {
                invoke2((C02291) obj);
                return setAnimationMatrix.ag$a;
            }
        }

        @Override // o.Styleable.ChangeBounds
        public final Styleable.ChangeBounds<B, setAnimationMatrix> invoke(setAnimationMatrix setanimationmatrix) {
            runAnimators.valueOf(setanimationmatrix, "it");
            return C02291.INSTANCE;
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<G, Styleable.ChangeBounds<B, setAnimationMatrix>> invoke(ICustomTabsCallback.Default<? extends G, setAnimationMatrix> r3) {
        runAnimators.valueOf(r3, "it");
        return this.$this_run.map(r3, AnonymousClass1.INSTANCE);
    }
}
