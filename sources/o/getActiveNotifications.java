package o;

import o.ICustomTabsCallback;
/* loaded from: classes6.dex */
public final class getActiveNotifications<A, B, C, D, E, F, G, H, I, J, K, L> implements ICustomTabsCallback.Default<ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends Object, ? extends A>, ? extends B>, ? extends C>, ? extends D>, ? extends E>, ? extends F>, ? extends G>, ? extends H>, ? extends I>, ? extends J>, ? extends K>, L> {
    public static final valueOf toString = new valueOf(null);
    private final E HaptikSDK$a;
    private final H HaptikSDK$b;
    private final G HaptikSDK$c;
    private final K HaptikSDK$d;
    private final L HaptikSDK$e;
    private final J HaptikWebView;
    private final B ag$a;
    private final C ah$a;
    private final F ah$b;
    private final I invoke;
    private final A valueOf;
    private final D values;

    public final D HaptikSDK$a() {
        return this.values;
    }

    public final E HaptikSDK$b() {
        return this.HaptikSDK$a;
    }

    public final C HaptikSDK$c() {
        return this.ah$a;
    }

    public final I HaptikSDK$d() {
        return this.invoke;
    }

    public final A ag$a() {
        return this.valueOf;
    }

    public final K ah$a() {
        return this.HaptikSDK$d;
    }

    public final F ah$b() {
        return this.ah$b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof getActiveNotifications) {
                getActiveNotifications getactivenotifications = (getActiveNotifications) obj;
                return runAnimators.values(this.valueOf, getactivenotifications.valueOf) && runAnimators.values(this.ag$a, getactivenotifications.ag$a) && runAnimators.values(this.ah$a, getactivenotifications.ah$a) && runAnimators.values(this.values, getactivenotifications.values) && runAnimators.values(this.HaptikSDK$a, getactivenotifications.HaptikSDK$a) && runAnimators.values(this.ah$b, getactivenotifications.ah$b) && runAnimators.values(this.HaptikSDK$c, getactivenotifications.HaptikSDK$c) && runAnimators.values(this.HaptikSDK$b, getactivenotifications.HaptikSDK$b) && runAnimators.values(this.invoke, getactivenotifications.invoke) && runAnimators.values(this.HaptikWebView, getactivenotifications.HaptikWebView) && runAnimators.values(this.HaptikSDK$d, getactivenotifications.HaptikSDK$d) && runAnimators.values(this.HaptikSDK$e, getactivenotifications.HaptikSDK$e);
            }
            return false;
        }
        return true;
    }

    public final H getInitSettings() {
        return this.HaptikSDK$b;
    }

    public final G getSignupData() {
        return this.HaptikSDK$c;
    }

    public int hashCode() {
        A a = this.valueOf;
        int hashCode = a != null ? a.hashCode() : 0;
        B b2 = this.ag$a;
        int hashCode2 = b2 != null ? b2.hashCode() : 0;
        C c = this.ah$a;
        int hashCode3 = c != null ? c.hashCode() : 0;
        D d = this.values;
        int hashCode4 = d != null ? d.hashCode() : 0;
        E e = this.HaptikSDK$a;
        int hashCode5 = e != null ? e.hashCode() : 0;
        F f = this.ah$b;
        int hashCode6 = f != null ? f.hashCode() : 0;
        G g = this.HaptikSDK$c;
        int hashCode7 = g != null ? g.hashCode() : 0;
        H h = this.HaptikSDK$b;
        int hashCode8 = h != null ? h.hashCode() : 0;
        I i = this.invoke;
        int hashCode9 = i != null ? i.hashCode() : 0;
        J j = this.HaptikWebView;
        int hashCode10 = j != null ? j.hashCode() : 0;
        K k = this.HaptikSDK$d;
        int hashCode11 = k != null ? k.hashCode() : 0;
        L l = this.HaptikSDK$e;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (l != null ? l.hashCode() : 0);
    }

    public final B invoke() {
        return this.ag$a;
    }

    public String toString() {
        return "Tuple12(a=" + this.valueOf + ", b=" + this.ag$a + ", c=" + this.ah$a + ", d=" + this.values + ", e=" + this.HaptikSDK$a + ", f=" + this.ah$b + ", g=" + this.HaptikSDK$c + ", h=" + this.HaptikSDK$b + ", i=" + this.invoke + ", j=" + this.HaptikWebView + ", k=" + this.HaptikSDK$d + ", l=" + this.HaptikSDK$e + ")";
    }

    public final L valueOf() {
        return this.HaptikSDK$e;
    }

    public final J values() {
        return this.HaptikWebView;
    }

    /* loaded from: classes6.dex */
    public static final class valueOf {
        private valueOf() {
        }

        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }
    }

    public getActiveNotifications(A a, B b2, C c, D d, E e, F f, G g, H h, I i, J j, K k, L l) {
        this.valueOf = a;
        this.ag$a = b2;
        this.ah$a = c;
        this.values = d;
        this.HaptikSDK$a = e;
        this.ah$b = f;
        this.HaptikSDK$c = g;
        this.HaptikSDK$b = h;
        this.invoke = i;
        this.HaptikWebView = j;
        this.HaptikSDK$d = k;
        this.HaptikSDK$e = l;
    }
}
