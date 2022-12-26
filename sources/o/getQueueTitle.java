package o;

import o.ICustomTabsCallback;
import o.IMediaControllerCallback;
/* loaded from: classes6.dex */
public interface getQueueTitle<F> extends IMediaControllerCallback.Stub.Proxy<F>, getPercentRating<F> {
    <A> ICustomTabsCallback.Default<F, A> valueOf();

    <A> ICustomTabsCallback.Default<F, A> valueOf(ICustomTabsCallback.Default<? extends F, ? extends A> r1, ICustomTabsCallback.Default<? extends F, ? extends A> r2);
}
