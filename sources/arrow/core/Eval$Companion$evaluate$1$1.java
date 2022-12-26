package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.asBinder;
import o.asBinder$ag$a;
import o.asBinder$ah$a;
import o.runAnimators;
/* loaded from: classes.dex */
public final class Eval$Companion$evaluate$1$1 extends Lambda implements Styleable.ChangeBounds<asBinder$ah$a<Object>, Styleable.ChangeBounds<? super Object, ? extends asBinder<? extends Object>>> {
    final /* synthetic */ asBinder$ag$a $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eval$Companion$evaluate$1$1(asBinder$ag$a asbinder_ag_a) {
        super(1);
        this.$this_run = asbinder_ag_a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.Eval$Companion$evaluate$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<Object, asBinder<? extends Object>> {
        final /* synthetic */ asBinder$ah$a $m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(asBinder$ah$a asbinder_ah_a) {
            super(1);
            this.$m = asbinder_ah_a;
        }

        @Override // o.Styleable.ChangeBounds
        public final asBinder<? extends Object> invoke(Object obj) {
            this.$m.ag$a(new ITrustedWebActivityCallback(obj));
            return Eval$Companion$evaluate$1$1.this.$this_run.toString(obj);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final Styleable.ChangeBounds<Object, asBinder<Object>> invoke(asBinder$ah$a<Object> asbinder_ah_a) {
        runAnimators.valueOf(asbinder_ah_a, "m");
        return new AnonymousClass1(asbinder_ah_a);
    }
}
