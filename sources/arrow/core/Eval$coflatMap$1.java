package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.asBinder;
/* loaded from: classes6.dex */
public final class Eval$coflatMap$1 extends Lambda implements Styleable.ArcMotion<B> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ asBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Eval$coflatMap$1(asBinder asbinder, Styleable.ChangeBounds changeBounds) {
        super(0);
        this.this$0 = asbinder;
        this.$f = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [B, java.lang.Object] */
    @Override // o.Styleable.ArcMotion
    public final B invoke() {
        return this.$f.invoke(this.this$0);
    }
}
