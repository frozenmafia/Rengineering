package o;

import o.SavedStateHandle;
/* loaded from: classes4.dex */
public final class observe extends androidx.databinding.BaseObservable {
    private boolean HaptikSDK$b;
    private boolean toString;
    public observe$ag$a values;
    private String HaptikSDK$a = "";
    private String invoke = "";
    private String HaptikSDK$c = "";
    private String ah$a = "";
    private String ag$a = "";
    private String valueOf = "";
    private String ah$b = "";

    public final observe$ag$a HaptikSDK$c() {
        observe$ag$a observe_ag_a = this.values;
        if (observe_ag_a != null) {
            return observe_ag_a;
        }
        runAnimators.valueOf("purchaseSectionHandler");
        return null;
    }

    public final void values(observe$ag$a observe_ag_a) {
        runAnimators.ag$a(observe_ag_a, "<set-?>");
        this.values = observe_ag_a;
    }

    public final String invoke() {
        return this.HaptikSDK$a;
    }

    public final String values() {
        return this.invoke;
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    public final String valueOf() {
        return this.ag$a;
    }

    public final String ag$a() {
        return this.valueOf;
    }

    public final String HaptikSDK$a() {
        return this.ah$b;
    }

    public final boolean HaptikSDK$e() {
        return this.toString;
    }

    public final boolean getSignupData() {
        return this.HaptikSDK$b;
    }

    public final void toString(boolean z) {
        this.toString = z;
        notifyChange();
    }

    public final void ag$a(String str, onActivityPreCreated onactivityprecreated, String str2) {
        runAnimators.ag$a(str, "productTitle");
        runAnimators.ag$a(onactivityprecreated, "payableAmount");
        this.HaptikSDK$a = str;
        boolean z = (str2 == null || SavedStateHandle.AnonymousClass1.toString.ag$a(str2)) ? false : true;
        String ag$a = keys.ag$a.ag$a(onactivityprecreated);
        if (z) {
            ag$a = ag$a + "/";
        }
        this.invoke = ag$a;
        this.HaptikSDK$c = (!z || str2 == null) ? "" : "";
        notifyChange();
    }

    public final void ah$b() {
        toString(!this.toString);
        notifyChange();
    }
}
