package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onTransact;
/* loaded from: classes6.dex */
public final class Id$coflatMap$1 extends Lambda implements Styleable.ChangeBounds<A, B> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ onTransact this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Id$coflatMap$1(onTransact ontransact, Styleable.ChangeBounds changeBounds) {
        super(1);
        this.this$0 = ontransact;
        this.$f = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [B, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final B invoke(A a) {
        return this.$f.invoke(this.this$0);
    }
}
