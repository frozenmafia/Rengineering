package o;

import java.util.HashMap;
import java.util.Map;
import o.ViewDataBinding;
/* loaded from: classes4.dex */
public final class getFocusedVirtualView implements getViewHorizontalDragRange {
    private final SingleDocumentFile ag$a;
    private final ViewDataBinding.AnonymousClass8 values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getFocusedVirtualView) {
            getFocusedVirtualView getfocusedvirtualview = (getFocusedVirtualView) obj;
            return runAnimators.values(this.ag$a, getfocusedvirtualview.ag$a) && runAnimators.values(this.values, getfocusedvirtualview.values);
        }
        return false;
    }

    public int hashCode() {
        return (this.ag$a.hashCode() * 31) + this.values.hashCode();
    }

    public String toString() {
        return "MyMatchesTabClicked(_tabSelected=" + this.ag$a + ", _matchesCount=" + this.values + ')';
    }

    public getFocusedVirtualView(SingleDocumentFile singleDocumentFile, ViewDataBinding.AnonymousClass8 anonymousClass8) {
        runAnimators.ag$a(singleDocumentFile, "_tabSelected");
        runAnimators.ag$a(anonymousClass8, "_matchesCount");
        this.ag$a = singleDocumentFile;
        this.values = anonymousClass8;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "MyMatchesTabClicked");
        hashMap.put("TabSelected", this.ag$a.valueOf());
        hashMap.put("matchesCount", Integer.valueOf(this.values.valueOf()));
        return hashMap;
    }
}
