package o;

import o.ICustomTabsCallback;
/* loaded from: classes6.dex */
public final class notifyNotificationWithChannel<A, B, C, D, E, F, G, H, I, J, K, L, M, N> implements ICustomTabsCallback.Default<ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends Object, ? extends A>, ? extends B>, ? extends C>, ? extends D>, ? extends E>, ? extends F>, ? extends G>, ? extends H>, ? extends I>, ? extends J>, ? extends K>, ? extends L>, ? extends M>, N> {
    public static final values ah$a = new values(null);
    private final I HaptikSDK$a;
    private final G HaptikSDK$b;
    private final H HaptikSDK$c;
    private final M HaptikSDK$d;
    private final J HaptikSDK$e;
    private final L HaptikWebView;
    private final B ag$a;
    private final F ah$b;
    private final N getInitSettings;
    private final K getSignupData;
    private final E invoke;
    private final C toString;
    private final D valueOf;
    private final A values;

    public final M HaptikSDK$a() {
        return this.HaptikSDK$d;
    }

    public final N HaptikSDK$b() {
        return this.getInitSettings;
    }

    public final C HaptikSDK$c() {
        return this.toString;
    }

    public final I HaptikSDK$d() {
        return this.HaptikSDK$a;
    }

    public final F HaptikSDK$e() {
        return this.ah$b;
    }

    public final H HaptikWebView() {
        return this.HaptikSDK$c;
    }

    public final A ag$a() {
        return this.values;
    }

    public final L ah$a() {
        return this.HaptikWebView;
    }

    public final D ah$b() {
        return this.valueOf;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof notifyNotificationWithChannel) {
                notifyNotificationWithChannel notifynotificationwithchannel = (notifyNotificationWithChannel) obj;
                return runAnimators.values(this.values, notifynotificationwithchannel.values) && runAnimators.values(this.ag$a, notifynotificationwithchannel.ag$a) && runAnimators.values(this.toString, notifynotificationwithchannel.toString) && runAnimators.values(this.valueOf, notifynotificationwithchannel.valueOf) && runAnimators.values(this.invoke, notifynotificationwithchannel.invoke) && runAnimators.values(this.ah$b, notifynotificationwithchannel.ah$b) && runAnimators.values(this.HaptikSDK$b, notifynotificationwithchannel.HaptikSDK$b) && runAnimators.values(this.HaptikSDK$c, notifynotificationwithchannel.HaptikSDK$c) && runAnimators.values(this.HaptikSDK$a, notifynotificationwithchannel.HaptikSDK$a) && runAnimators.values(this.HaptikSDK$e, notifynotificationwithchannel.HaptikSDK$e) && runAnimators.values(this.getSignupData, notifynotificationwithchannel.getSignupData) && runAnimators.values(this.HaptikWebView, notifynotificationwithchannel.HaptikWebView) && runAnimators.values(this.HaptikSDK$d, notifynotificationwithchannel.HaptikSDK$d) && runAnimators.values(this.getInitSettings, notifynotificationwithchannel.getInitSettings);
            }
            return false;
        }
        return true;
    }

    public final E getInitSettings() {
        return this.invoke;
    }

    public final G getSignupData() {
        return this.HaptikSDK$b;
    }

    public int hashCode() {
        A a = this.values;
        int hashCode = a != null ? a.hashCode() : 0;
        B b2 = this.ag$a;
        int hashCode2 = b2 != null ? b2.hashCode() : 0;
        C c = this.toString;
        int hashCode3 = c != null ? c.hashCode() : 0;
        D d = this.valueOf;
        int hashCode4 = d != null ? d.hashCode() : 0;
        E e = this.invoke;
        int hashCode5 = e != null ? e.hashCode() : 0;
        F f = this.ah$b;
        int hashCode6 = f != null ? f.hashCode() : 0;
        G g = this.HaptikSDK$b;
        int hashCode7 = g != null ? g.hashCode() : 0;
        H h = this.HaptikSDK$c;
        int hashCode8 = h != null ? h.hashCode() : 0;
        I i = this.HaptikSDK$a;
        int hashCode9 = i != null ? i.hashCode() : 0;
        J j = this.HaptikSDK$e;
        int hashCode10 = j != null ? j.hashCode() : 0;
        K k = this.getSignupData;
        int hashCode11 = k != null ? k.hashCode() : 0;
        L l = this.HaptikWebView;
        int hashCode12 = l != null ? l.hashCode() : 0;
        M m = this.HaptikSDK$d;
        int hashCode13 = m != null ? m.hashCode() : 0;
        N n = this.getInitSettings;
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (n != null ? n.hashCode() : 0);
    }

    public final B invoke() {
        return this.ag$a;
    }

    public String toString() {
        return "Tuple14(a=" + this.values + ", b=" + this.ag$a + ", c=" + this.toString + ", d=" + this.valueOf + ", e=" + this.invoke + ", f=" + this.ah$b + ", g=" + this.HaptikSDK$b + ", h=" + this.HaptikSDK$c + ", i=" + this.HaptikSDK$a + ", j=" + this.HaptikSDK$e + ", k=" + this.getSignupData + ", l=" + this.HaptikWebView + ", m=" + this.HaptikSDK$d + ", n=" + this.getInitSettings + ")";
    }

    public final J valueOf() {
        return this.HaptikSDK$e;
    }

    public final K values() {
        return this.getSignupData;
    }

    /* loaded from: classes6.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }
    }

    public notifyNotificationWithChannel(A a, B b2, C c, D d, E e, F f, G g, H h, I i, J j, K k, L l, M m, N n) {
        this.values = a;
        this.ag$a = b2;
        this.toString = c;
        this.valueOf = d;
        this.invoke = e;
        this.ah$b = f;
        this.HaptikSDK$b = g;
        this.HaptikSDK$c = h;
        this.HaptikSDK$a = i;
        this.HaptikSDK$e = j;
        this.getSignupData = k;
        this.HaptikWebView = l;
        this.HaptikSDK$d = m;
        this.getInitSettings = n;
    }
}
