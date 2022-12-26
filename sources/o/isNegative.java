package o;

import com.app.dream11.myprofile.emailMobileChange.EmailMobileChangeErrorVm$onCloseClick$1;
import com.app.dream11.myprofile.emailMobileChange.EmailMobileChangeErrorVm$onContactUsClick$1;
import o.Styleable;
/* loaded from: classes3.dex */
public final class isNegative {
    private final String HaptikSDK$b;
    private final boolean HaptikSDK$c;
    private final SolverVariable ag$a;
    private final int ah$a;
    private final String invoke;
    private final String toString;
    private final Styleable.ArcMotion<setAnimationMatrix> valueOf;
    private final Styleable.ArcMotion<setAnimationMatrix> values;

    public isNegative(String str, String str2, int i, boolean z, String str3, SolverVariable solverVariable) {
        runAnimators.ag$a(str, "titleMessage");
        runAnimators.ag$a(str2, "bodyMessage");
        runAnimators.ag$a(str3, "updateContactText");
        runAnimators.ag$a(solverVariable, "handler");
        this.HaptikSDK$b = str;
        this.toString = str2;
        this.ah$a = i;
        this.HaptikSDK$c = z;
        this.invoke = str3;
        this.ag$a = solverVariable;
        this.values = new EmailMobileChangeErrorVm$onCloseClick$1(this);
        this.valueOf = new EmailMobileChangeErrorVm$onContactUsClick$1(this);
    }

    public final String HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public final String values() {
        return this.toString;
    }

    public final boolean ah$b() {
        return this.HaptikSDK$c;
    }

    public final int valueOf() {
        return this.ah$a;
    }

    public final SolverVariable ag$a() {
        return this.ag$a;
    }

    public final String invoke() {
        return this.invoke;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> ah$a() {
        return this.values;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> HaptikSDK$a() {
        return this.valueOf;
    }
}
