package o;

import o.ICustomTabsCallback;
import o.ICustomTabsService;
import o.IMediaControllerCallback;
import o.Styleable;
/* loaded from: classes.dex */
public interface onSessionDestroyed<F> {
    public static final values ag$a = values.toString;

    <G, A, B> ICustomTabsCallback.Default<G, B> ag$a(ICustomTabsCallback.Default<? extends F, ? extends A> r1, IMediaControllerCallback.Stub.Proxy<G> proxy, B b2, Transition<? super B, ? super A, ? extends ICustomTabsCallback.Default<? extends G, ? extends B>> transition);

    <A> ICustomTabsService.Stub.Proxy<A> ag$a(ICustomTabsCallback.Default<? extends F, ? extends A> r1, Styleable.ChangeBounds<? super A, Boolean> changeBounds);

    <A, B> asBinder<ICustomTabsService.Stub.Proxy<B>> ag$a(ICustomTabsCallback.Default<? extends F, ? extends A> r1, Styleable.ChangeBounds<? super A, ? extends B> changeBounds, Transition<? super A, ? super asBinder<? extends B>, ? extends asBinder<? extends B>> transition);

    <A, B> B ah$a(ICustomTabsCallback.Default<? extends F, ? extends A> r1, B b2, Transition<? super B, ? super A, ? extends B> transition);

    <A> ICustomTabsService.Stub.Proxy<A> ah$a(ICustomTabsCallback.Default<? extends F, ? extends A> r1);

    <A, B> asBinder<B> ah$a(ICustomTabsCallback.Default<? extends F, ? extends A> r1, asBinder<? extends B> asbinder, Transition<? super A, ? super asBinder<? extends B>, ? extends asBinder<? extends B>> transition);

    <A> boolean ah$a(ICustomTabsCallback.Default<? extends F, ? extends A> r1, Styleable.ChangeBounds<? super A, Boolean> changeBounds);

    <A> ICustomTabsService.Stub.Proxy<A> values(ICustomTabsCallback.Default<? extends F, ? extends A> r1);

    /* loaded from: classes.dex */
    public static final class values {
        static final /* synthetic */ values toString = new values();

        private values() {
        }
    }
}
