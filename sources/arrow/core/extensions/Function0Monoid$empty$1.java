package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onConnectionFailed;
/* loaded from: classes6.dex */
public final class Function0Monoid$empty$1 extends Lambda implements Styleable.ArcMotion<A> {
    final /* synthetic */ onConnectionFailed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Function0Monoid$empty$1(onConnectionFailed onconnectionfailed) {
        super(0);
        this.this$0 = onconnectionfailed;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [A, java.lang.Object] */
    @Override // o.Styleable.ArcMotion
    public final A invoke() {
        return this.this$0.ag$a().values();
    }
}
