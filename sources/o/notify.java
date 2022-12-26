package o;

import o.ICustomTabsCallback;
/* loaded from: classes6.dex */
public final class notify<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> implements ICustomTabsCallback.Default<ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends Object, ? extends A>, ? extends B>, ? extends C>, ? extends D>, ? extends E>, ? extends F>, ? extends G>, ? extends H>, ? extends I>, ? extends J>, ? extends K>, ? extends L>, ? extends M>, ? extends N>, ? extends O>, ? extends P>, ? extends Q>, ? extends R>, ? extends S>, ? extends T>, ? extends U>, V> {
    public static final notify$ag$a values = new notify$ag$a(null);
    private final I HaptikSDK$a;
    private final G HaptikSDK$b;
    private final E HaptikSDK$c;
    private final L HaptikSDK$d;
    private final K HaptikSDK$e;
    private final J HaptikWebView;
    private final T ICustomTabsCallback;
    private final Q a;
    private final B ag$a;
    private final D ah$a;
    private final H ah$b;
    private final S aj$a;
    private final P ak;
    private final U ak$a;
    private final V ak$b;
    private final M getInitSettings;
    private final N getSignupData;
    private final F invoke;
    private final O isLogoutPending;
    private final R onXdkEvent;
    private final C toString;
    private final A valueOf;

    public final O HaptikSDK$a() {
        return this.isLogoutPending;
    }

    public final N HaptikSDK$b() {
        return this.getSignupData;
    }

    public final P HaptikSDK$c() {
        return this.ak;
    }

    public final S HaptikSDK$d() {
        return this.aj$a;
    }

    public final R HaptikSDK$e() {
        return this.onXdkEvent;
    }

    public final T HaptikWebView() {
        return this.ICustomTabsCallback;
    }

    public final F a() {
        return this.invoke;
    }

    public final L ag$a() {
        return this.HaptikSDK$d;
    }

    public final K ah$a() {
        return this.HaptikSDK$e;
    }

    public final Q ah$b() {
        return this.a;
    }

    public final D aj$a() {
        return this.ah$a;
    }

    public final V ak() {
        return this.ak$b;
    }

    public final G ak$b() {
        return this.HaptikSDK$b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof notify) {
                notify notifyVar = (notify) obj;
                return runAnimators.values(this.valueOf, notifyVar.valueOf) && runAnimators.values(this.ag$a, notifyVar.ag$a) && runAnimators.values(this.toString, notifyVar.toString) && runAnimators.values(this.ah$a, notifyVar.ah$a) && runAnimators.values(this.HaptikSDK$c, notifyVar.HaptikSDK$c) && runAnimators.values(this.invoke, notifyVar.invoke) && runAnimators.values(this.HaptikSDK$b, notifyVar.HaptikSDK$b) && runAnimators.values(this.ah$b, notifyVar.ah$b) && runAnimators.values(this.HaptikSDK$a, notifyVar.HaptikSDK$a) && runAnimators.values(this.HaptikWebView, notifyVar.HaptikWebView) && runAnimators.values(this.HaptikSDK$e, notifyVar.HaptikSDK$e) && runAnimators.values(this.HaptikSDK$d, notifyVar.HaptikSDK$d) && runAnimators.values(this.getInitSettings, notifyVar.getInitSettings) && runAnimators.values(this.getSignupData, notifyVar.getSignupData) && runAnimators.values(this.isLogoutPending, notifyVar.isLogoutPending) && runAnimators.values(this.ak, notifyVar.ak) && runAnimators.values(this.a, notifyVar.a) && runAnimators.values(this.onXdkEvent, notifyVar.onXdkEvent) && runAnimators.values(this.aj$a, notifyVar.aj$a) && runAnimators.values(this.ICustomTabsCallback, notifyVar.ICustomTabsCallback) && runAnimators.values(this.ak$a, notifyVar.ak$a) && runAnimators.values(this.ak$b, notifyVar.ak$b);
            }
            return false;
        }
        return true;
    }

    public final H extraCallback() {
        return this.ah$b;
    }

    public final I extraCallbackWithResult() {
        return this.HaptikSDK$a;
    }

    public final U getInitSettings() {
        return this.ak$a;
    }

    public final B getSignupData() {
        return this.ag$a;
    }

    public int hashCode() {
        A a = this.valueOf;
        int hashCode = a != null ? a.hashCode() : 0;
        B b2 = this.ag$a;
        int hashCode2 = b2 != null ? b2.hashCode() : 0;
        C c = this.toString;
        int hashCode3 = c != null ? c.hashCode() : 0;
        D d = this.ah$a;
        int hashCode4 = d != null ? d.hashCode() : 0;
        E e = this.HaptikSDK$c;
        int hashCode5 = e != null ? e.hashCode() : 0;
        F f = this.invoke;
        int hashCode6 = f != null ? f.hashCode() : 0;
        G g = this.HaptikSDK$b;
        int hashCode7 = g != null ? g.hashCode() : 0;
        H h = this.ah$b;
        int hashCode8 = h != null ? h.hashCode() : 0;
        I i = this.HaptikSDK$a;
        int hashCode9 = i != null ? i.hashCode() : 0;
        J j = this.HaptikWebView;
        int hashCode10 = j != null ? j.hashCode() : 0;
        K k = this.HaptikSDK$e;
        int hashCode11 = k != null ? k.hashCode() : 0;
        L l = this.HaptikSDK$d;
        int hashCode12 = l != null ? l.hashCode() : 0;
        M m = this.getInitSettings;
        int hashCode13 = m != null ? m.hashCode() : 0;
        N n = this.getSignupData;
        int hashCode14 = n != null ? n.hashCode() : 0;
        O o2 = this.isLogoutPending;
        int hashCode15 = o2 != null ? o2.hashCode() : 0;
        P p = this.ak;
        int hashCode16 = p != null ? p.hashCode() : 0;
        Q q = this.a;
        int hashCode17 = q != null ? q.hashCode() : 0;
        R r = this.onXdkEvent;
        int hashCode18 = r != null ? r.hashCode() : 0;
        S s = this.aj$a;
        int hashCode19 = s != null ? s.hashCode() : 0;
        T t = this.ICustomTabsCallback;
        int hashCode20 = t != null ? t.hashCode() : 0;
        U u = this.ak$a;
        int hashCode21 = u != null ? u.hashCode() : 0;
        V v = this.ak$b;
        return (((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + (v != null ? v.hashCode() : 0);
    }

    public final M invoke() {
        return this.getInitSettings;
    }

    public final C isLogoutPending() {
        return this.toString;
    }

    public final E onXdkEvent() {
        return this.HaptikSDK$c;
    }

    public String toString() {
        return "Tuple22(a=" + this.valueOf + ", b=" + this.ag$a + ", c=" + this.toString + ", d=" + this.ah$a + ", e=" + this.HaptikSDK$c + ", f=" + this.invoke + ", g=" + this.HaptikSDK$b + ", h=" + this.ah$b + ", i=" + this.HaptikSDK$a + ", j=" + this.HaptikWebView + ", k=" + this.HaptikSDK$e + ", l=" + this.HaptikSDK$d + ", m=" + this.getInitSettings + ", n=" + this.getSignupData + ", o=" + this.isLogoutPending + ", p=" + this.ak + ", q=" + this.a + ", r=" + this.onXdkEvent + ", s=" + this.aj$a + ", t=" + this.ICustomTabsCallback + ", u=" + this.ak$a + ", v=" + this.ak$b + ")";
    }

    public final A valueOf() {
        return this.valueOf;
    }

    public final J values() {
        return this.HaptikWebView;
    }

    public notify(A a, B b2, C c, D d, E e, F f, G g, H h, I i, J j, K k, L l, M m, N n, O o2, P p, Q q, R r, S s, T t, U u, V v) {
        this.valueOf = a;
        this.ag$a = b2;
        this.toString = c;
        this.ah$a = d;
        this.HaptikSDK$c = e;
        this.invoke = f;
        this.HaptikSDK$b = g;
        this.ah$b = h;
        this.HaptikSDK$a = i;
        this.HaptikWebView = j;
        this.HaptikSDK$e = k;
        this.HaptikSDK$d = l;
        this.getInitSettings = m;
        this.getSignupData = n;
        this.isLogoutPending = o2;
        this.ak = p;
        this.a = q;
        this.onXdkEvent = r;
        this.aj$a = s;
        this.ICustomTabsCallback = t;
        this.ak$a = u;
        this.ak$b = v;
    }
}
