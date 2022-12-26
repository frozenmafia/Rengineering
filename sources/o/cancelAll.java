package o;

import o.ICustomTabsCallback;
/* loaded from: classes6.dex */
public final class cancelAll<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> implements ICustomTabsCallback.Default<ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends Object, ? extends A>, ? extends B>, ? extends C>, ? extends D>, ? extends E>, ? extends F>, ? extends G>, ? extends H>, ? extends I>, ? extends J>, ? extends K>, ? extends L>, ? extends M>, ? extends N>, ? extends O>, ? extends P>, Q> {
    public static final cancelAll$ah$a values = new cancelAll$ah$a(null);
    private final G HaptikSDK$a;
    private final E HaptikSDK$b;
    private final I HaptikSDK$c;
    private final K HaptikSDK$d;
    private final J HaptikSDK$e;
    private final M HaptikWebView;
    private final B ag$a;
    private final D ah$a;
    private final H ah$b;
    private final O ak;
    private final N getInitSettings;
    private final L getSignupData;
    private final F invoke;
    private final P isLogoutPending;
    private final Q onXdkEvent;
    private final A toString;
    private final C valueOf;

    public final N HaptikSDK$a() {
        return this.getInitSettings;
    }

    public final O HaptikSDK$b() {
        return this.ak;
    }

    public final M HaptikSDK$c() {
        return this.HaptikWebView;
    }

    public final C HaptikSDK$d() {
        return this.valueOf;
    }

    public final D HaptikSDK$e() {
        return this.ah$a;
    }

    public final F HaptikWebView() {
        return this.invoke;
    }

    public final G a() {
        return this.HaptikSDK$a;
    }

    public final L ag$a() {
        return this.getSignupData;
    }

    public final J ah$a() {
        return this.HaptikSDK$e;
    }

    public final P ah$b() {
        return this.isLogoutPending;
    }

    public final I aj$a() {
        return this.HaptikSDK$c;
    }

    public final H ak() {
        return this.ah$b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cancelAll) {
                cancelAll cancelall = (cancelAll) obj;
                return runAnimators.values(this.toString, cancelall.toString) && runAnimators.values(this.ag$a, cancelall.ag$a) && runAnimators.values(this.valueOf, cancelall.valueOf) && runAnimators.values(this.ah$a, cancelall.ah$a) && runAnimators.values(this.HaptikSDK$b, cancelall.HaptikSDK$b) && runAnimators.values(this.invoke, cancelall.invoke) && runAnimators.values(this.HaptikSDK$a, cancelall.HaptikSDK$a) && runAnimators.values(this.ah$b, cancelall.ah$b) && runAnimators.values(this.HaptikSDK$c, cancelall.HaptikSDK$c) && runAnimators.values(this.HaptikSDK$e, cancelall.HaptikSDK$e) && runAnimators.values(this.HaptikSDK$d, cancelall.HaptikSDK$d) && runAnimators.values(this.getSignupData, cancelall.getSignupData) && runAnimators.values(this.HaptikWebView, cancelall.HaptikWebView) && runAnimators.values(this.getInitSettings, cancelall.getInitSettings) && runAnimators.values(this.ak, cancelall.ak) && runAnimators.values(this.isLogoutPending, cancelall.isLogoutPending) && runAnimators.values(this.onXdkEvent, cancelall.onXdkEvent);
            }
            return false;
        }
        return true;
    }

    public final E getInitSettings() {
        return this.HaptikSDK$b;
    }

    public final B getSignupData() {
        return this.ag$a;
    }

    public int hashCode() {
        A a = this.toString;
        int hashCode = a != null ? a.hashCode() : 0;
        B b2 = this.ag$a;
        int hashCode2 = b2 != null ? b2.hashCode() : 0;
        C c = this.valueOf;
        int hashCode3 = c != null ? c.hashCode() : 0;
        D d = this.ah$a;
        int hashCode4 = d != null ? d.hashCode() : 0;
        E e = this.HaptikSDK$b;
        int hashCode5 = e != null ? e.hashCode() : 0;
        F f = this.invoke;
        int hashCode6 = f != null ? f.hashCode() : 0;
        G g = this.HaptikSDK$a;
        int hashCode7 = g != null ? g.hashCode() : 0;
        H h = this.ah$b;
        int hashCode8 = h != null ? h.hashCode() : 0;
        I i = this.HaptikSDK$c;
        int hashCode9 = i != null ? i.hashCode() : 0;
        J j = this.HaptikSDK$e;
        int hashCode10 = j != null ? j.hashCode() : 0;
        K k = this.HaptikSDK$d;
        int hashCode11 = k != null ? k.hashCode() : 0;
        L l = this.getSignupData;
        int hashCode12 = l != null ? l.hashCode() : 0;
        M m = this.HaptikWebView;
        int hashCode13 = m != null ? m.hashCode() : 0;
        N n = this.getInitSettings;
        int hashCode14 = n != null ? n.hashCode() : 0;
        O o2 = this.ak;
        int hashCode15 = o2 != null ? o2.hashCode() : 0;
        P p = this.isLogoutPending;
        int hashCode16 = p != null ? p.hashCode() : 0;
        Q q = this.onXdkEvent;
        return (((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + (q != null ? q.hashCode() : 0);
    }

    public final Q invoke() {
        return this.onXdkEvent;
    }

    public String toString() {
        return "Tuple17(a=" + this.toString + ", b=" + this.ag$a + ", c=" + this.valueOf + ", d=" + this.ah$a + ", e=" + this.HaptikSDK$b + ", f=" + this.invoke + ", g=" + this.HaptikSDK$a + ", h=" + this.ah$b + ", i=" + this.HaptikSDK$c + ", j=" + this.HaptikSDK$e + ", k=" + this.HaptikSDK$d + ", l=" + this.getSignupData + ", m=" + this.HaptikWebView + ", n=" + this.getInitSettings + ", o=" + this.ak + ", p=" + this.isLogoutPending + ", q=" + this.onXdkEvent + ")";
    }

    public final A valueOf() {
        return this.toString;
    }

    public final K values() {
        return this.HaptikSDK$d;
    }

    public cancelAll(A a, B b2, C c, D d, E e, F f, G g, H h, I i, J j, K k, L l, M m, N n, O o2, P p, Q q) {
        this.toString = a;
        this.ag$a = b2;
        this.valueOf = c;
        this.ah$a = d;
        this.HaptikSDK$b = e;
        this.invoke = f;
        this.HaptikSDK$a = g;
        this.ah$b = h;
        this.HaptikSDK$c = i;
        this.HaptikSDK$e = j;
        this.HaptikSDK$d = k;
        this.getSignupData = l;
        this.HaptikWebView = m;
        this.getInitSettings = n;
        this.ak = o2;
        this.isLogoutPending = p;
        this.onXdkEvent = q;
    }
}
