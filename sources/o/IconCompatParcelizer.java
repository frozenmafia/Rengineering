package o;

import o.ICustomTabsCallback;
/* loaded from: classes6.dex */
public final class IconCompatParcelizer<A, B, C, D, E, F, G, H> implements ICustomTabsCallback.Default<ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends Object, ? extends A>, ? extends B>, ? extends C>, ? extends D>, ? extends E>, ? extends F>, ? extends G>, H> {
    public static final values valueOf = new values(null);
    private final G HaptikSDK$a;
    private final E HaptikSDK$b;
    private final C ag$a;
    private final B ah$a;
    private final H ah$b;
    private final F invoke;
    private final D toString;
    private final A values;

    public final G HaptikSDK$b() {
        return this.HaptikSDK$a;
    }

    public final H HaptikSDK$c() {
        return this.ah$b;
    }

    public final B ag$a() {
        return this.ah$a;
    }

    public final A ah$a() {
        return this.values;
    }

    public final F ah$b() {
        return this.invoke;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IconCompatParcelizer) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                return runAnimators.values(this.values, iconCompatParcelizer.values) && runAnimators.values(this.ah$a, iconCompatParcelizer.ah$a) && runAnimators.values(this.ag$a, iconCompatParcelizer.ag$a) && runAnimators.values(this.toString, iconCompatParcelizer.toString) && runAnimators.values(this.HaptikSDK$b, iconCompatParcelizer.HaptikSDK$b) && runAnimators.values(this.invoke, iconCompatParcelizer.invoke) && runAnimators.values(this.HaptikSDK$a, iconCompatParcelizer.HaptikSDK$a) && runAnimators.values(this.ah$b, iconCompatParcelizer.ah$b);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a = this.values;
        int hashCode = a != null ? a.hashCode() : 0;
        B b2 = this.ah$a;
        int hashCode2 = b2 != null ? b2.hashCode() : 0;
        C c = this.ag$a;
        int hashCode3 = c != null ? c.hashCode() : 0;
        D d = this.toString;
        int hashCode4 = d != null ? d.hashCode() : 0;
        E e = this.HaptikSDK$b;
        int hashCode5 = e != null ? e.hashCode() : 0;
        F f = this.invoke;
        int hashCode6 = f != null ? f.hashCode() : 0;
        G g = this.HaptikSDK$a;
        int hashCode7 = g != null ? g.hashCode() : 0;
        H h = this.ah$b;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (h != null ? h.hashCode() : 0);
    }

    public final E invoke() {
        return this.HaptikSDK$b;
    }

    public final D valueOf() {
        return this.toString;
    }

    public final C values() {
        return this.ag$a;
    }

    public IconCompatParcelizer(A a, B b2, C c, D d, E e, F f, G g, H h) {
        this.values = a;
        this.ah$a = b2;
        this.ag$a = c;
        this.toString = d;
        this.HaptikSDK$b = e;
        this.invoke = f;
        this.HaptikSDK$a = g;
        this.ah$b = h;
    }

    public final A HaptikSDK$a() {
        return this.values;
    }

    public final F HaptikSDK$d() {
        return this.invoke;
    }

    public final B HaptikSDK$e() {
        return this.ah$a;
    }

    public final C HaptikWebView() {
        return this.ag$a;
    }

    public final H ak() {
        return this.ah$b;
    }

    public final E getInitSettings() {
        return this.HaptikSDK$b;
    }

    public final D getSignupData() {
        return this.toString;
    }

    public final G isLogoutPending() {
        return this.HaptikSDK$a;
    }

    public final String toString(pause<? super A> pauseVar, pause<? super B> pauseVar2, pause<? super C> pauseVar3, pause<? super D> pauseVar4, pause<? super E> pauseVar5, pause<? super F> pauseVar6, pause<? super G> pauseVar7, pause<? super H> pauseVar8) {
        runAnimators.valueOf(pauseVar, "SA");
        runAnimators.valueOf(pauseVar2, "SB");
        runAnimators.valueOf(pauseVar3, "SC");
        runAnimators.valueOf(pauseVar4, "SD");
        runAnimators.valueOf(pauseVar5, "SE");
        runAnimators.valueOf(pauseVar6, "SF");
        runAnimators.valueOf(pauseVar7, "SG");
        runAnimators.valueOf(pauseVar8, "SH");
        return "(" + reserveEndViewTransition.valueOf(reserveEndViewTransition.valueOf(pauseVar.toString((A) this.values), pauseVar2.toString((B) this.ah$a), pauseVar3.toString((C) this.ag$a), pauseVar4.toString((D) this.toString), pauseVar5.toString((E) this.HaptikSDK$b), pauseVar6.toString((F) this.invoke), pauseVar7.toString((G) this.HaptikSDK$a), pauseVar8.toString((H) this.ah$b)), ", ", null, null, 0, null, null, 62, null) + ")";
    }

    public String toString() {
        return toString(pause.toString.valueOf(), pause.toString.valueOf(), pause.toString.valueOf(), pause.toString.valueOf(), pause.toString.valueOf(), pause.toString.valueOf(), pause.toString.valueOf(), pause.toString.valueOf());
    }

    /* loaded from: classes6.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }
    }
}
