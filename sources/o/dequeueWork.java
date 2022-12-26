package o;

import com.app.dream11.core.service.graphql.api.type.UserVerificationStatus;
/* loaded from: classes3.dex */
public final class dequeueWork {
    private final enqueueWork ah$a;
    private final Double toString;
    private final UserVerificationStatus valueOf;
    private final Double values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dequeueWork) {
            dequeueWork dequeuework = (dequeueWork) obj;
            return runAnimators.values(this.ah$a, dequeuework.ah$a) && this.valueOf == dequeuework.valueOf && runAnimators.values(this.toString, dequeuework.toString) && runAnimators.values(this.values, dequeuework.values);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.ah$a.hashCode();
        int hashCode2 = this.valueOf.hashCode();
        Double d = this.toString;
        int hashCode3 = d == null ? 0 : d.hashCode();
        Double d2 = this.values;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        enqueueWork enqueuework = this.ah$a;
        UserVerificationStatus userVerificationStatus = this.valueOf;
        Double d = this.toString;
        Double d2 = this.values;
        return "UserDepositCriticality(criticality=" + enqueuework + ", panVerificationStatus=" + userVerificationStatus + ", capedAmount=" + d + ", allowedAmount=" + d2 + ")";
    }

    public dequeueWork(enqueueWork enqueuework, UserVerificationStatus userVerificationStatus, Double d, Double d2) {
        runAnimators.ag$a(enqueuework, "criticality");
        runAnimators.ag$a(userVerificationStatus, "panVerificationStatus");
        this.ah$a = enqueuework;
        this.valueOf = userVerificationStatus;
        this.toString = d;
        this.values = d2;
    }

    public final enqueueWork values() {
        return this.ah$a;
    }

    public final UserVerificationStatus ah$a() {
        return this.valueOf;
    }

    public final Double valueOf() {
        return this.toString;
    }

    public final Double ag$a() {
        return this.values;
    }
}
