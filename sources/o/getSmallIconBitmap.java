package o;

import o.ICustomTabsCallback;
/* loaded from: classes6.dex */
public final class getSmallIconBitmap<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> implements ICustomTabsCallback.Default<ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends Object, ? extends A>, ? extends B>, ? extends C>, ? extends D>, ? extends E>, ? extends F>, ? extends G>, ? extends H>, ? extends I>, ? extends J>, ? extends K>, ? extends L>, ? extends M>, ? extends N>, ? extends O>, P> {
    public static final getSmallIconBitmap$ah$a toString = new getSmallIconBitmap$ah$a(null);
    private final G HaptikSDK$a;
    private final H HaptikSDK$b;
    private final I HaptikSDK$c;
    private final N HaptikSDK$d;
    private final L HaptikSDK$e;
    private final K HaptikWebView;
    private final D ag$a;
    private final A ah$a;
    private final F ah$b;
    private final O ak;
    private final M getInitSettings;
    private final J getSignupData;
    private final E invoke;
    private final P isLogoutPending;
    private final B valueOf;
    private final C values;

    public final P HaptikSDK$a() {
        return this.isLogoutPending;
    }

    public final O HaptikSDK$b() {
        return this.ak;
    }

    public final N HaptikSDK$c() {
        return this.HaptikSDK$d;
    }

    public final D HaptikSDK$d() {
        return this.ag$a;
    }

    public final E HaptikSDK$e() {
        return this.invoke;
    }

    public final F HaptikWebView() {
        return this.ah$b;
    }

    public final H a() {
        return this.HaptikSDK$b;
    }

    public final K ag$a() {
        return this.HaptikWebView;
    }

    public final A ah$a() {
        return this.ah$a;
    }

    public final B ah$b() {
        return this.valueOf;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof getSmallIconBitmap) {
                getSmallIconBitmap getsmalliconbitmap = (getSmallIconBitmap) obj;
                return runAnimators.values(this.ah$a, getsmalliconbitmap.ah$a) && runAnimators.values(this.valueOf, getsmalliconbitmap.valueOf) && runAnimators.values(this.values, getsmalliconbitmap.values) && runAnimators.values(this.ag$a, getsmalliconbitmap.ag$a) && runAnimators.values(this.invoke, getsmalliconbitmap.invoke) && runAnimators.values(this.ah$b, getsmalliconbitmap.ah$b) && runAnimators.values(this.HaptikSDK$a, getsmalliconbitmap.HaptikSDK$a) && runAnimators.values(this.HaptikSDK$b, getsmalliconbitmap.HaptikSDK$b) && runAnimators.values(this.HaptikSDK$c, getsmalliconbitmap.HaptikSDK$c) && runAnimators.values(this.getSignupData, getsmalliconbitmap.getSignupData) && runAnimators.values(this.HaptikWebView, getsmalliconbitmap.HaptikWebView) && runAnimators.values(this.HaptikSDK$e, getsmalliconbitmap.HaptikSDK$e) && runAnimators.values(this.getInitSettings, getsmalliconbitmap.getInitSettings) && runAnimators.values(this.HaptikSDK$d, getsmalliconbitmap.HaptikSDK$d) && runAnimators.values(this.ak, getsmalliconbitmap.ak) && runAnimators.values(this.isLogoutPending, getsmalliconbitmap.isLogoutPending);
            }
            return false;
        }
        return true;
    }

    public final G getInitSettings() {
        return this.HaptikSDK$a;
    }

    public final C getSignupData() {
        return this.values;
    }

    public int hashCode() {
        A a = this.ah$a;
        int hashCode = a != null ? a.hashCode() : 0;
        B b2 = this.valueOf;
        int hashCode2 = b2 != null ? b2.hashCode() : 0;
        C c = this.values;
        int hashCode3 = c != null ? c.hashCode() : 0;
        D d = this.ag$a;
        int hashCode4 = d != null ? d.hashCode() : 0;
        E e = this.invoke;
        int hashCode5 = e != null ? e.hashCode() : 0;
        F f = this.ah$b;
        int hashCode6 = f != null ? f.hashCode() : 0;
        G g = this.HaptikSDK$a;
        int hashCode7 = g != null ? g.hashCode() : 0;
        H h = this.HaptikSDK$b;
        int hashCode8 = h != null ? h.hashCode() : 0;
        I i = this.HaptikSDK$c;
        int hashCode9 = i != null ? i.hashCode() : 0;
        J j = this.getSignupData;
        int hashCode10 = j != null ? j.hashCode() : 0;
        K k = this.HaptikWebView;
        int hashCode11 = k != null ? k.hashCode() : 0;
        L l = this.HaptikSDK$e;
        int hashCode12 = l != null ? l.hashCode() : 0;
        M m = this.getInitSettings;
        int hashCode13 = m != null ? m.hashCode() : 0;
        N n = this.HaptikSDK$d;
        int hashCode14 = n != null ? n.hashCode() : 0;
        O o2 = this.ak;
        int hashCode15 = o2 != null ? o2.hashCode() : 0;
        P p = this.isLogoutPending;
        return (((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + (p != null ? p.hashCode() : 0);
    }

    public final M invoke() {
        return this.getInitSettings;
    }

    public final I isLogoutPending() {
        return this.HaptikSDK$c;
    }

    public String toString() {
        return "Tuple16(a=" + this.ah$a + ", b=" + this.valueOf + ", c=" + this.values + ", d=" + this.ag$a + ", e=" + this.invoke + ", f=" + this.ah$b + ", g=" + this.HaptikSDK$a + ", h=" + this.HaptikSDK$b + ", i=" + this.HaptikSDK$c + ", j=" + this.getSignupData + ", k=" + this.HaptikWebView + ", l=" + this.HaptikSDK$e + ", m=" + this.getInitSettings + ", n=" + this.HaptikSDK$d + ", o=" + this.ak + ", p=" + this.isLogoutPending + ")";
    }

    public final L valueOf() {
        return this.HaptikSDK$e;
    }

    public final J values() {
        return this.getSignupData;
    }

    public getSmallIconBitmap(A a, B b2, C c, D d, E e, F f, G g, H h, I i, J j, K k, L l, M m, N n, O o2, P p) {
        this.ah$a = a;
        this.valueOf = b2;
        this.values = c;
        this.ag$a = d;
        this.invoke = e;
        this.ah$b = f;
        this.HaptikSDK$a = g;
        this.HaptikSDK$b = h;
        this.HaptikSDK$c = i;
        this.getSignupData = j;
        this.HaptikWebView = k;
        this.HaptikSDK$e = l;
        this.getInitSettings = m;
        this.HaptikSDK$d = n;
        this.ak = o2;
        this.isLogoutPending = p;
    }
}
