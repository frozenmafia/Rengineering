package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Function0$Companion$tailRecM$1 extends Lambda implements Styleable.ArcMotion<B> {
    final /* synthetic */ Object $a;
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Function0$Companion$tailRecM$1(Object obj, Styleable.ChangeBounds changeBounds) {
        super(0);
        this.$a = obj;
        this.$f = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [B, java.lang.Object] */
    @Override // o.Styleable.ArcMotion
    public final B invoke() {
        return ICustomTabsCallback.Stub.Proxy.ag$a.values(this.$a, this.$f);
    }
}
