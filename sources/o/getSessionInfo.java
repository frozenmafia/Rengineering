package o;

import o.ICustomTabsCallback;
/* loaded from: classes6.dex */
public interface getSessionInfo<F, G> extends getVolumeAttributes<F> {
    <A> cancel<A, ICustomTabsCallback.Default<G, A>> valueOf(ICustomTabsCallback.Default<? extends F, ? extends A> r1);

    onSessionDestroyed<G> valueOf();
}
