package o;

import kotlin.NoWhenBranchMatchedException;
import o.ICustomTabsService;
import o.IPostMessageService;
/* loaded from: classes6.dex */
public final class isCaptioningEnabled$ah$a {
    public static <A> A ah$a(isCaptioningEnabled<A> iscaptioningenabled, A a, A a2) {
        return iscaptioningenabled.ah$a(a, a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <A> A valueOf(isCaptioningEnabled<A> iscaptioningenabled, A a, A a2) {
        ICustomTabsService.Stub.Proxy<A> valueOf = ICustomTabsService.Stub.Proxy.toString.valueOf(a2);
        if (valueOf instanceof IPostMessageService.Default) {
            return a;
        }
        if (valueOf instanceof ITrustedWebActivityCallback) {
            return (A) iscaptioningenabled.ah$a(a, ((ITrustedWebActivityCallback) valueOf).ag$a());
        }
        throw new NoWhenBranchMatchedException();
    }
}
