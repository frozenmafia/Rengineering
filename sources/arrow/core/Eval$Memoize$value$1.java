package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.asBinder;
import o.asBinder$ah$a;
/* loaded from: classes.dex */
public final class Eval$Memoize$value$1 extends Lambda implements Styleable.ArcMotion<A> {
    final /* synthetic */ asBinder$ah$a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eval$Memoize$value$1(asBinder$ah$a asbinder_ah_a) {
        super(0);
        this.this$0 = asbinder_ah_a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [A, java.lang.Object] */
    @Override // o.Styleable.ArcMotion
    public final A invoke() {
        ?? values;
        values = asBinder.ah$a.values(this.this$0.ag$a());
        this.this$0.ag$a(new ITrustedWebActivityCallback(values));
        return values;
    }
}
