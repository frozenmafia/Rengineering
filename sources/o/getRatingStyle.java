package o;

import o.ICustomTabsCallback;
import o.RatingCompat;
import o.Styleable;
/* loaded from: classes6.dex */
public interface getRatingStyle<F> extends RatingCompat.Api19Impl<F> {
    @Override // o.onSessionReady
    <A, B> ICustomTabsCallback.Default<F, B> map(ICustomTabsCallback.Default<? extends F, ? extends A> r1, Styleable.ChangeBounds<? super A, ? extends B> changeBounds);

    <A> ICustomTabsCallback.Default<F, A> values(A a);
}
