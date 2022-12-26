package o;

import java.util.HashMap;
import java.util.Map;
import o.ViewGroupBindingAdapter;
/* loaded from: classes4.dex */
public final class onPopulateEventForHost implements getViewHorizontalDragRange {
    private final setRequiresFadingEdge ag$a;
    private final getLifecycleOwner ah$a;
    private final ViewGroupBindingAdapter.AnonymousClass2 toString;

    public onPopulateEventForHost() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof onPopulateEventForHost) {
            onPopulateEventForHost onpopulateeventforhost = (onPopulateEventForHost) obj;
            return runAnimators.values(this.ah$a, onpopulateeventforhost.ah$a) && runAnimators.values(this.ag$a, onpopulateeventforhost.ag$a) && runAnimators.values(this.toString, onpopulateeventforhost.toString);
        }
        return false;
    }

    public int hashCode() {
        getLifecycleOwner getlifecycleowner = this.ah$a;
        int hashCode = getlifecycleowner == null ? 0 : getlifecycleowner.hashCode();
        setRequiresFadingEdge setrequiresfadingedge = this.ag$a;
        int hashCode2 = setrequiresfadingedge == null ? 0 : setrequiresfadingedge.hashCode();
        ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2 = this.toString;
        return (((hashCode * 31) + hashCode2) * 31) + (anonymousClass2 != null ? anonymousClass2.hashCode() : 0);
    }

    public String toString() {
        return "OTPScreenLoaded(_isSourceFcCTA=" + this.ah$a + ", _utm_redirection=" + this.ag$a + ", _variant=" + this.toString + ')';
    }

    public onPopulateEventForHost(getLifecycleOwner getlifecycleowner, setRequiresFadingEdge setrequiresfadingedge, ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2) {
        this.ah$a = getlifecycleowner;
        this.ag$a = setrequiresfadingedge;
        this.toString = anonymousClass2;
    }

    public /* synthetic */ onPopulateEventForHost(getLifecycleOwner getlifecycleowner, setRequiresFadingEdge setrequiresfadingedge, ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : getlifecycleowner, (i & 2) != 0 ? null : setrequiresfadingedge, (i & 4) != 0 ? null : anonymousClass2);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "OTPScreenLoaded");
        getLifecycleOwner getlifecycleowner = this.ah$a;
        if (getlifecycleowner != null) {
            hashMap.put("isSourceFcCTA", Integer.valueOf(getlifecycleowner.ah$a()));
        }
        setRequiresFadingEdge setrequiresfadingedge = this.ag$a;
        if (setrequiresfadingedge != null) {
            hashMap.put("utm_redirection", setrequiresfadingedge.ah$a());
        }
        ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2 = this.toString;
        if (anonymousClass2 != null) {
            hashMap.put(com.facebook.hermes.intl.Constants.SENSITIVITY_VARIANT, anonymousClass2.ah$a());
        }
        return hashMap;
    }
}
