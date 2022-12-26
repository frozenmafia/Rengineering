package o;

import java.util.HashMap;
import java.util.Map;
import o.SeekBarBindingAdapter;
/* loaded from: classes6.dex */
public final class dispatchHoverEvent implements getViewHorizontalDragRange {
    private final SeekBarBindingAdapter.OnProgressChanged toString;
    private final setContentPaddingBottom valueOf;
    private final ObservableInt values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dispatchHoverEvent) {
            dispatchHoverEvent dispatchhoverevent = (dispatchHoverEvent) obj;
            return runAnimators.values(this.values, dispatchhoverevent.values) && runAnimators.values(this.valueOf, dispatchhoverevent.valueOf) && runAnimators.values(this.toString, dispatchhoverevent.toString);
        }
        return false;
    }

    public int hashCode() {
        return (((this.values.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.toString.hashCode();
    }

    public String toString() {
        return "MyInfoAndSettingsInteracted(_discoverability_status=" + this.values + ", _phonebook_sync_status=" + this.valueOf + ", _selection=" + this.toString + ')';
    }

    public dispatchHoverEvent(ObservableInt observableInt, setContentPaddingBottom setcontentpaddingbottom, SeekBarBindingAdapter.OnProgressChanged onProgressChanged) {
        runAnimators.ag$a(observableInt, "_discoverability_status");
        runAnimators.ag$a(setcontentpaddingbottom, "_phonebook_sync_status");
        runAnimators.ag$a(onProgressChanged, "_selection");
        this.values = observableInt;
        this.valueOf = setcontentpaddingbottom;
        this.toString = onProgressChanged;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "MyInfoAndSettingsInteracted");
        hashMap.put("discoverability_status", Integer.valueOf(this.values.ag$a()));
        hashMap.put("phonebook_sync_status", Integer.valueOf(this.valueOf.values()));
        hashMap.put("selection", this.toString.ag$a());
        return hashMap;
    }
}
