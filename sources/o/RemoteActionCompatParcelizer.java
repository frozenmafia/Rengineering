package o;

import o.ICustomTabsCallback;
/* loaded from: classes6.dex */
public final class RemoteActionCompatParcelizer<A, B, C, D, E> implements ICustomTabsCallback.Default<ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<? extends Object, ? extends A>, ? extends B>, ? extends C>, ? extends D>, E> {
    public static final values toString = new values(null);
    private final E HaptikSDK$c;
    private final C ag$a;
    private final B ah$a;
    private final A valueOf;
    private final D values;

    public final A ag$a() {
        return this.valueOf;
    }

    public final B ah$a() {
        return this.ah$a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RemoteActionCompatParcelizer) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
                return runAnimators.values(this.valueOf, remoteActionCompatParcelizer.valueOf) && runAnimators.values(this.ah$a, remoteActionCompatParcelizer.ah$a) && runAnimators.values(this.ag$a, remoteActionCompatParcelizer.ag$a) && runAnimators.values(this.values, remoteActionCompatParcelizer.values) && runAnimators.values(this.HaptikSDK$c, remoteActionCompatParcelizer.HaptikSDK$c);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a = this.valueOf;
        int hashCode = a != null ? a.hashCode() : 0;
        B b2 = this.ah$a;
        int hashCode2 = b2 != null ? b2.hashCode() : 0;
        C c = this.ag$a;
        int hashCode3 = c != null ? c.hashCode() : 0;
        D d = this.values;
        int hashCode4 = d != null ? d.hashCode() : 0;
        E e = this.HaptikSDK$c;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (e != null ? e.hashCode() : 0);
    }

    public final E invoke() {
        return this.HaptikSDK$c;
    }

    public final D valueOf() {
        return this.values;
    }

    public final C values() {
        return this.ag$a;
    }

    public RemoteActionCompatParcelizer(A a, B b2, C c, D d, E e) {
        this.valueOf = a;
        this.ah$a = b2;
        this.ag$a = c;
        this.values = d;
        this.HaptikSDK$c = e;
    }

    public final B HaptikSDK$a() {
        return this.ah$a;
    }

    public final C HaptikSDK$b() {
        return this.ag$a;
    }

    public final D HaptikSDK$c() {
        return this.values;
    }

    public final E HaptikSDK$d() {
        return this.HaptikSDK$c;
    }

    public final A ah$b() {
        return this.valueOf;
    }

    public final String valueOf(pause<? super A> pauseVar, pause<? super B> pauseVar2, pause<? super C> pauseVar3, pause<? super D> pauseVar4, pause<? super E> pauseVar5) {
        runAnimators.valueOf(pauseVar, "SA");
        runAnimators.valueOf(pauseVar2, "SB");
        runAnimators.valueOf(pauseVar3, "SC");
        runAnimators.valueOf(pauseVar4, "SD");
        runAnimators.valueOf(pauseVar5, "SE");
        return "(" + reserveEndViewTransition.valueOf(reserveEndViewTransition.valueOf(pauseVar.toString((A) this.valueOf), pauseVar2.toString((B) this.ah$a), pauseVar3.toString((C) this.ag$a), pauseVar4.toString((D) this.values), pauseVar5.toString((E) this.HaptikSDK$c)), ", ", null, null, 0, null, null, 62, null) + ")";
    }

    public String toString() {
        return valueOf(pause.toString.valueOf(), pause.toString.valueOf(), pause.toString.valueOf(), pause.toString.valueOf(), pause.toString.valueOf());
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
