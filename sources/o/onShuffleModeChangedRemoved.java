package o;

import o.ICustomTabsCallback;
import o.ICustomTabsService;
import o.Styleable;
/* loaded from: classes.dex */
public interface onShuffleModeChangedRemoved<F> extends onSessionReady<F> {
    <A, B> ICustomTabsCallback.Default<F, B> a_(ICustomTabsCallback.Default<? extends F, ? extends A> r1, Styleable.ChangeBounds<? super A, ? extends ICustomTabsService.Stub.Proxy<? extends B>> changeBounds);

    <A> ICustomTabsCallback.Default<F, A> values(ICustomTabsCallback.Default<? extends F, ? extends A> r1, Styleable.ChangeBounds<? super A, Boolean> changeBounds);
}
