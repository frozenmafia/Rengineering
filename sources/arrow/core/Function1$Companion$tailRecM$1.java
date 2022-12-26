package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.extraCommand;
/* loaded from: classes6.dex */
public final class Function1$Companion$tailRecM$1 extends Lambda implements Styleable.ChangeBounds<I, B> {
    final /* synthetic */ Object $a;
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Function1$Companion$tailRecM$1(Object obj, Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$a = obj;
        this.$f = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [B, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final B invoke(I i) {
        ?? ag$a;
        ag$a = extraCommand.ah$a.ag$a(this.$a, i, this.$f);
        return ag$a;
    }
}
