package arrow.core;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.asBinder;
/* loaded from: classes6.dex */
public final class EvalKt$iterateRight$1 extends Lambda implements Styleable.ArcMotion<asBinder<? extends B>> {
    final /* synthetic */ Transition $f;
    final /* synthetic */ asBinder $lb;
    final /* synthetic */ Iterator $this_iterateRight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EvalKt$iterateRight$1(Iterator it, Transition transition, asBinder asbinder) {
        super(0);
        this.$this_iterateRight = it;
        this.$f = transition;
        this.$lb = asbinder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.EvalKt$iterateRight$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ArcMotion<asBinder<? extends B>> {
        AnonymousClass1() {
            super(0);
        }

        @Override // o.Styleable.ArcMotion
        public final asBinder<B> invoke() {
            return EvalKt$iterateRight$1.this.$this_iterateRight.hasNext() ? (asBinder) EvalKt$iterateRight$1.this.$f.invoke(EvalKt$iterateRight$1.this.$this_iterateRight.next(), EvalKt$iterateRight$1.this.invoke()) : EvalKt$iterateRight$1.this.$lb;
        }
    }

    @Override // o.Styleable.ArcMotion
    public final asBinder<B> invoke() {
        return asBinder.ah$a.valueOf(new AnonymousClass1());
    }
}
