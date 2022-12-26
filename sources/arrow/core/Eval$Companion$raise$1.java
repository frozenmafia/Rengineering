package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Eval$Companion$raise$1 extends Lambda implements Styleable.ArcMotion {
    final /* synthetic */ Throwable $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Eval$Companion$raise$1(Throwable th) {
        super(0);
        this.$t = th;
    }

    @Override // o.Styleable.ArcMotion
    public final Void invoke() {
        throw this.$t;
    }
}
