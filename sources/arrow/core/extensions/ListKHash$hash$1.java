package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.MediaBrowserCompat;
import o.Transition;
/* loaded from: classes6.dex */
public final class ListKHash$hash$1 extends Lambda implements Transition<Integer, A, Integer> {
    final /* synthetic */ MediaBrowserCompat.MediaBrowserImplApi21.AnonymousClass6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListKHash$hash$1(MediaBrowserCompat.MediaBrowserImplApi21.AnonymousClass6 anonymousClass6) {
        super(2);
        this.this$0 = anonymousClass6;
    }

    @Override // o.Transition
    public /* synthetic */ Integer invoke(Integer num, Object obj) {
        return Integer.valueOf(invoke(num.intValue(), (int) obj));
    }

    public final int invoke(int i, A a) {
        return (i * 31) + this.this$0.ah$a().values(a);
    }
}
