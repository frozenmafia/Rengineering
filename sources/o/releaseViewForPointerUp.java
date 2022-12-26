package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class releaseViewForPointerUp implements getViewHorizontalDragRange {
    private final setValidator ag$a;
    private final AutoCompleteTextViewBindingAdapter ah$a;
    private final DocumentsContractApi19 toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof releaseViewForPointerUp) {
            releaseViewForPointerUp releaseviewforpointerup = (releaseViewForPointerUp) obj;
            return runAnimators.values(this.toString, releaseviewforpointerup.toString) && runAnimators.values(this.ag$a, releaseviewforpointerup.ag$a) && runAnimators.values(this.ah$a, releaseviewforpointerup.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.toString.hashCode() * 31) + this.ag$a.hashCode()) * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        return "ReportProfileReasonClicked(_reason=" + this.toString + ", _other_user_id=" + this.ag$a + ", _other_user_type=" + this.ah$a + ')';
    }

    public releaseViewForPointerUp(DocumentsContractApi19 documentsContractApi19, setValidator setvalidator, AutoCompleteTextViewBindingAdapter autoCompleteTextViewBindingAdapter) {
        runAnimators.ag$a(documentsContractApi19, "_reason");
        runAnimators.ag$a(setvalidator, "_other_user_id");
        runAnimators.ag$a(autoCompleteTextViewBindingAdapter, "_other_user_type");
        this.toString = documentsContractApi19;
        this.ag$a = setvalidator;
        this.ah$a = autoCompleteTextViewBindingAdapter;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ReportProfileReasonClicked");
        hashMap.put("Reason", this.toString.values());
        hashMap.put("other_user_id", Long.valueOf(this.ag$a.valueOf()));
        hashMap.put("other_user_type", this.ah$a.values());
        return hashMap;
    }
}
