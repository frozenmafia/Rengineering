package arrow.core;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.asBinder;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SequenceK$foldRight$1 extends Lambda implements Styleable.ChangeBounds<Iterator<? extends A>, asBinder<? extends B>> {
    final /* synthetic */ Transition $f;
    final /* synthetic */ asBinder $lb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequenceK$foldRight$1(Transition transition, asBinder asbinder) {
        super(1);
        this.$f = transition;
        this.$lb = asbinder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.SequenceK$foldRight$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ArcMotion<asBinder<? extends B>> {
        final /* synthetic */ Iterator $this_loop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Iterator it) {
            super(0);
            this.$this_loop = it;
        }

        @Override // o.Styleable.ArcMotion
        public final asBinder<B> invoke() {
            return SequenceK$foldRight$1.this.invoke(this.$this_loop);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final asBinder<B> invoke(Iterator<? extends A> it) {
        runAnimators.valueOf(it, "$this$loop");
        return it.hasNext() ? (asBinder) this.$f.invoke(it.next(), asBinder.ah$a.valueOf(new AnonymousClass1(it))) : this.$lb;
    }
}
