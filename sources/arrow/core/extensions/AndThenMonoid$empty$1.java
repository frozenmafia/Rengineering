package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.MediaBrowserCompat;
import o.Styleable;
/* loaded from: classes6.dex */
public final class AndThenMonoid$empty$1 extends Lambda implements Styleable.ChangeBounds<A, B> {
    final /* synthetic */ MediaBrowserCompat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndThenMonoid$empty$1(MediaBrowserCompat mediaBrowserCompat) {
        super(1);
        this.this$0 = mediaBrowserCompat;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [B, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final B invoke(A a) {
        return this.this$0.ah$a().values();
    }
}
