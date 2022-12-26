package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Function0$coflatMap$1 extends Lambda implements Styleable.ArcMotion<B> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ ICustomTabsCallback.Stub.Proxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Function0$coflatMap$1(ICustomTabsCallback.Stub.Proxy proxy, Styleable.ChangeBounds changeBounds) {
        super(0);
        this.this$0 = proxy;
        this.$f = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [B, java.lang.Object] */
    @Override // o.Styleable.ArcMotion
    public final B invoke() {
        return this.$f.invoke(this.this$0);
    }
}
