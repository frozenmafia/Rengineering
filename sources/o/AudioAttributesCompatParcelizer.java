package o;

import o.ICustomTabsCallback;
/* loaded from: classes6.dex */
public final class AudioAttributesCompatParcelizer<A, B, C, D, E, F, G> implements ICustomTabsCallback.Default<ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends Object, ? extends A>, ? extends B>, ? extends C>, ? extends D>, ? extends E>, ? extends F>, G> {
    public static final values values = new values(null);
    private final F HaptikSDK$a;
    private final E HaptikSDK$b;
    private final G HaptikSDK$c;
    private final B ag$a;
    private final D ah$a;
    private final C toString;
    private final A valueOf;

    public final F HaptikSDK$c() {
        return this.HaptikSDK$a;
    }

    public final C ag$a() {
        return this.toString;
    }

    public final A ah$a() {
        return this.valueOf;
    }

    public final E ah$b() {
        return this.HaptikSDK$b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioAttributesCompatParcelizer) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
                return runAnimators.values(this.valueOf, audioAttributesCompatParcelizer.valueOf) && runAnimators.values(this.ag$a, audioAttributesCompatParcelizer.ag$a) && runAnimators.values(this.toString, audioAttributesCompatParcelizer.toString) && runAnimators.values(this.ah$a, audioAttributesCompatParcelizer.ah$a) && runAnimators.values(this.HaptikSDK$b, audioAttributesCompatParcelizer.HaptikSDK$b) && runAnimators.values(this.HaptikSDK$a, audioAttributesCompatParcelizer.HaptikSDK$a) && runAnimators.values(this.HaptikSDK$c, audioAttributesCompatParcelizer.HaptikSDK$c);
            }
            return false;
        }
        return true;
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
        E e = this.HaptikSDK$b;
        int hashCode5 = e != null ? e.hashCode() : 0;
        F f = this.HaptikSDK$a;
        int hashCode6 = f != null ? f.hashCode() : 0;
        G g = this.HaptikSDK$c;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (g != null ? g.hashCode() : 0);
    }

    public final G invoke() {
        return this.HaptikSDK$c;
    }

    public final B valueOf() {
        return this.ag$a;
    }

    public final D values() {
        return this.ah$a;
    }

    public AudioAttributesCompatParcelizer(A a, B b2, C c, D d, E e, F f, G g) {
        this.valueOf = a;
        this.ag$a = b2;
        this.toString = c;
        this.ah$a = d;
        this.HaptikSDK$b = e;
        this.HaptikSDK$a = f;
        this.HaptikSDK$c = g;
    }

    public final A HaptikSDK$a() {
        return this.valueOf;
    }

    public final B HaptikSDK$b() {
        return this.ag$a;
    }

    public final E HaptikSDK$d() {
        return this.HaptikSDK$b;
    }

    public final F HaptikSDK$e() {
        return this.HaptikSDK$a;
    }

    public final D HaptikWebView() {
        return this.ah$a;
    }

    public final G getInitSettings() {
        return this.HaptikSDK$c;
    }

    public final C getSignupData() {
        return this.toString;
    }

    public final String toString(pause<? super A> pauseVar, pause<? super B> pauseVar2, pause<? super C> pauseVar3, pause<? super D> pauseVar4, pause<? super E> pauseVar5, pause<? super F> pauseVar6, pause<? super G> pauseVar7) {
        runAnimators.valueOf(pauseVar, "SA");
        runAnimators.valueOf(pauseVar2, "SB");
        runAnimators.valueOf(pauseVar3, "SC");
        runAnimators.valueOf(pauseVar4, "SD");
        runAnimators.valueOf(pauseVar5, "SE");
        runAnimators.valueOf(pauseVar6, "SF");
        runAnimators.valueOf(pauseVar7, "SG");
        return "(" + reserveEndViewTransition.valueOf(reserveEndViewTransition.valueOf(pauseVar.toString((A) this.valueOf), pauseVar2.toString((B) this.ag$a), pauseVar3.toString((C) this.toString), pauseVar4.toString((D) this.ah$a), pauseVar5.toString((E) this.HaptikSDK$b), pauseVar6.toString((F) this.HaptikSDK$a), pauseVar7.toString((G) this.HaptikSDK$c)), ", ", null, null, 0, null, null, 62, null) + ")";
    }

    public String toString() {
        return toString(pause.toString.valueOf(), pause.toString.valueOf(), pause.toString.valueOf(), pause.toString.valueOf(), pause.toString.valueOf(), pause.toString.valueOf(), pause.toString.valueOf());
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
