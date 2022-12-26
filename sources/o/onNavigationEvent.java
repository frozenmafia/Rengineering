package o;

import o.ICustomTabsCallback;
/* loaded from: classes6.dex */
public final class onNavigationEvent {
    public static final <A, B> B ah$a(ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<Object, ? extends A>, ? extends B> r1, A a) {
        runAnimators.valueOf(r1, "$this$invoke");
        return (B) ((onPostMessage) r1).invoke(a);
    }
}
