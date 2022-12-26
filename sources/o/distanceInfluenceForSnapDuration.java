package o;

import java.util.HashMap;
import java.util.Map;
import o.AutoCompleteTextViewBindingAdapter;
/* loaded from: classes4.dex */
public final class distanceInfluenceForSnapDuration implements getViewHorizontalDragRange {
    private final updateStateFlowRegistration ag$a;
    private final ObservableList ah$a;
    private final AutoCompleteTextViewBindingAdapter.AnonymousClass1 toString;
    private final setRequiresFadingEdge valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof distanceInfluenceForSnapDuration) {
            distanceInfluenceForSnapDuration distanceinfluenceforsnapduration = (distanceInfluenceForSnapDuration) obj;
            return runAnimators.values(this.ah$a, distanceinfluenceforsnapduration.ah$a) && runAnimators.values(this.ag$a, distanceinfluenceforsnapduration.ag$a) && runAnimators.values(this.toString, distanceinfluenceforsnapduration.toString) && runAnimators.values(this.valueOf, distanceinfluenceforsnapduration.valueOf);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.ah$a.hashCode();
        int hashCode2 = this.ag$a.hashCode();
        int hashCode3 = this.toString.hashCode();
        setRequiresFadingEdge setrequiresfadingedge = this.valueOf;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (setrequiresfadingedge == null ? 0 : setrequiresfadingedge.hashCode());
    }

    public String toString() {
        return "RegistrationAbandoned(_emailEntered=" + this.ah$a + ", _mobileNumberEntered=" + this.ag$a + ", _passwordEntered=" + this.toString + ", _utm_redirection=" + this.valueOf + ')';
    }

    public distanceInfluenceForSnapDuration(ObservableList observableList, updateStateFlowRegistration updatestateflowregistration, AutoCompleteTextViewBindingAdapter.AnonymousClass1 anonymousClass1, setRequiresFadingEdge setrequiresfadingedge) {
        runAnimators.ag$a(observableList, "_emailEntered");
        runAnimators.ag$a(updatestateflowregistration, "_mobileNumberEntered");
        runAnimators.ag$a(anonymousClass1, "_passwordEntered");
        this.ah$a = observableList;
        this.ag$a = updatestateflowregistration;
        this.toString = anonymousClass1;
        this.valueOf = setrequiresfadingedge;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "RegistrationAbandoned");
        hashMap.put("emailEntered", Boolean.valueOf(this.ah$a.ah$a()));
        hashMap.put("mobileNumberEntered", Boolean.valueOf(this.ag$a.ag$a()));
        hashMap.put("passwordEntered", Boolean.valueOf(this.toString.ah$a()));
        setRequiresFadingEdge setrequiresfadingedge = this.valueOf;
        if (setrequiresfadingedge != null) {
            hashMap.put("utm_redirection", setrequiresfadingedge.ah$a());
        }
        return hashMap;
    }
}
