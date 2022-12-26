package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.getInterfaceDescriptor;
import o.onConnected;
/* loaded from: classes6.dex */
public final class Function0Semigroup$combine$1 extends Lambda implements Styleable.ArcMotion<A> {
    final /* synthetic */ ICustomTabsCallback.Stub.Proxy $b;
    final /* synthetic */ ICustomTabsCallback.Stub.Proxy $this_combine;
    final /* synthetic */ onConnected this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Function0Semigroup$combine$1(onConnected onconnected, ICustomTabsCallback.Stub.Proxy proxy, ICustomTabsCallback.Stub.Proxy proxy2) {
        super(0);
        this.this$0 = onconnected;
        this.$this_combine = proxy;
        this.$b = proxy2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [A, java.lang.Object] */
    @Override // o.Styleable.ArcMotion
    public final A invoke() {
        return this.this$0.valueOf().ah$a(getInterfaceDescriptor.toString(this.$this_combine), getInterfaceDescriptor.toString(this.$b));
    }
}
