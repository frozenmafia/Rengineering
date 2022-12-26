package o;

import o.ICustomTabsCallback;
/* loaded from: classes6.dex */
public final class getSmallIconId<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> implements ICustomTabsCallback.Default<ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends Object, ? extends A>, ? extends B>, ? extends C>, ? extends D>, ? extends E>, ? extends F>, ? extends G>, ? extends H>, ? extends I>, ? extends J>, ? extends K>, ? extends L>, ? extends M>, ? extends N>, O> {
    public static final values ag$a = new values(null);
    private final G HaptikSDK$a;
    private final H HaptikSDK$b;
    private final E HaptikSDK$c;
    private final J HaptikSDK$d;
    private final N HaptikSDK$e;
    private final M HaptikWebView;
    private final C ah$a;
    private final F ah$b;
    private final K getInitSettings;
    private final L getSignupData;
    private final I invoke;
    private final O onXdkEvent;
    private final B toString;
    private final A valueOf;
    private final D values;

    public final N HaptikSDK$a() {
        return this.HaptikSDK$e;
    }

    public final B HaptikSDK$b() {
        return this.toString;
    }

    public final O HaptikSDK$c() {
        return this.onXdkEvent;
    }

    public final D HaptikSDK$d() {
        return this.values;
    }

    public final H HaptikSDK$e() {
        return this.HaptikSDK$b;
    }

    public final E HaptikWebView() {
        return this.HaptikSDK$c;
    }

    public final I a() {
        return this.invoke;
    }

    public final J ag$a() {
        return this.HaptikSDK$d;
    }

    public final L ah$a() {
        return this.getSignupData;
    }

    public final C ah$b() {
        return this.ah$a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof getSmallIconId) {
                getSmallIconId getsmalliconid = (getSmallIconId) obj;
                return runAnimators.values(this.valueOf, getsmalliconid.valueOf) && runAnimators.values(this.toString, getsmalliconid.toString) && runAnimators.values(this.ah$a, getsmalliconid.ah$a) && runAnimators.values(this.values, getsmalliconid.values) && runAnimators.values(this.HaptikSDK$c, getsmalliconid.HaptikSDK$c) && runAnimators.values(this.ah$b, getsmalliconid.ah$b) && runAnimators.values(this.HaptikSDK$a, getsmalliconid.HaptikSDK$a) && runAnimators.values(this.HaptikSDK$b, getsmalliconid.HaptikSDK$b) && runAnimators.values(this.invoke, getsmalliconid.invoke) && runAnimators.values(this.HaptikSDK$d, getsmalliconid.HaptikSDK$d) && runAnimators.values(this.getInitSettings, getsmalliconid.getInitSettings) && runAnimators.values(this.getSignupData, getsmalliconid.getSignupData) && runAnimators.values(this.HaptikWebView, getsmalliconid.HaptikWebView) && runAnimators.values(this.HaptikSDK$e, getsmalliconid.HaptikSDK$e) && runAnimators.values(this.onXdkEvent, getsmalliconid.onXdkEvent);
            }
            return false;
        }
        return true;
    }

    public final G getInitSettings() {
        return this.HaptikSDK$a;
    }

    public final F getSignupData() {
        return this.ah$b;
    }

    public int hashCode() {
        A a = this.valueOf;
        int hashCode = a != null ? a.hashCode() : 0;
        B b2 = this.toString;
        int hashCode2 = b2 != null ? b2.hashCode() : 0;
        C c = this.ah$a;
        int hashCode3 = c != null ? c.hashCode() : 0;
        D d = this.values;
        int hashCode4 = d != null ? d.hashCode() : 0;
        E e = this.HaptikSDK$c;
        int hashCode5 = e != null ? e.hashCode() : 0;
        F f = this.ah$b;
        int hashCode6 = f != null ? f.hashCode() : 0;
        G g = this.HaptikSDK$a;
        int hashCode7 = g != null ? g.hashCode() : 0;
        H h = this.HaptikSDK$b;
        int hashCode8 = h != null ? h.hashCode() : 0;
        I i = this.invoke;
        int hashCode9 = i != null ? i.hashCode() : 0;
        J j = this.HaptikSDK$d;
        int hashCode10 = j != null ? j.hashCode() : 0;
        K k = this.getInitSettings;
        int hashCode11 = k != null ? k.hashCode() : 0;
        L l = this.getSignupData;
        int hashCode12 = l != null ? l.hashCode() : 0;
        M m = this.HaptikWebView;
        int hashCode13 = m != null ? m.hashCode() : 0;
        N n = this.HaptikSDK$e;
        int hashCode14 = n != null ? n.hashCode() : 0;
        O o2 = this.onXdkEvent;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (o2 != null ? o2.hashCode() : 0);
    }

    public final M invoke() {
        return this.HaptikWebView;
    }

    public String toString() {
        return "Tuple15(a=" + this.valueOf + ", b=" + this.toString + ", c=" + this.ah$a + ", d=" + this.values + ", e=" + this.HaptikSDK$c + ", f=" + this.ah$b + ", g=" + this.HaptikSDK$a + ", h=" + this.HaptikSDK$b + ", i=" + this.invoke + ", j=" + this.HaptikSDK$d + ", k=" + this.getInitSettings + ", l=" + this.getSignupData + ", m=" + this.HaptikWebView + ", n=" + this.HaptikSDK$e + ", o=" + this.onXdkEvent + ")";
    }

    public final K valueOf() {
        return this.getInitSettings;
    }

    public final A values() {
        return this.valueOf;
    }

    /* loaded from: classes6.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }
    }

    public getSmallIconId(A a, B b2, C c, D d, E e, F f, G g, H h, I i, J j, K k, L l, M m, N n, O o2) {
        this.valueOf = a;
        this.toString = b2;
        this.ah$a = c;
        this.values = d;
        this.HaptikSDK$c = e;
        this.ah$b = f;
        this.HaptikSDK$a = g;
        this.HaptikSDK$b = h;
        this.invoke = i;
        this.HaptikSDK$d = j;
        this.getInitSettings = k;
        this.getSignupData = l;
        this.HaptikWebView = m;
        this.HaptikSDK$e = n;
        this.onXdkEvent = o2;
    }
}
