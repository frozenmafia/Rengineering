package o;

import android.graphics.Color;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.HashMap;
import java.util.Map;
import o.SeekBarBindingAdapter;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public final class getCurrY implements getViewHorizontalDragRange {
    private static int HaptikSDK$b = 1;
    private static int invoke = 0;
    private static char[] toString = {'s', 31235, 62637, 28470, 59859, 25721};
    private static long valueOf = 5272376167135410796L;
    private final ObservableBoolean ag$a;
    private final setCurrentTabTag ah$a;
    private final SeekBarBindingAdapter.OnProgressChanged values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((!(obj instanceof getCurrY) ? '\b' : (char) 17) != 17) {
            return false;
        }
        getCurrY getcurry = (getCurrY) obj;
        if (!runAnimators.values(this.ag$a, getcurry.ag$a)) {
            int i = HaptikSDK$b + 47;
            invoke = i % 128;
            return !(i % 2 == 0);
        }
        if ((!runAnimators.values(this.values, getcurry.values) ? '>' : TokenParser.CR) == '\r') {
            return !(!runAnimators.values(this.ah$a, getcurry.ah$a));
        }
        try {
            int i2 = HaptikSDK$b + 29;
            invoke = i2 % 128;
            int i3 = i2 % 2;
            return false;
        } catch (Exception e) {
            throw e;
        }
    }

    public int hashCode() {
        int i = HaptikSDK$b + 67;
        invoke = i % 128;
        int i2 = i % 2;
        int hashCode = (((this.ag$a.hashCode() * 31) + this.values.hashCode()) * 31) + this.ah$a.hashCode();
        int i3 = invoke + 121;
        HaptikSDK$b = i3 % 128;
        if ((i3 % 2 == 0 ? 'B' : (char) 17) != 17) {
            Object obj = null;
            super.hashCode();
            return hashCode;
        }
        return hashCode;
    }

    public String toString() {
        String str = "EditTeamNamePageInteracted(_currentTeamName=" + this.ag$a + ", _selection=" + this.values + ", _source=" + this.ah$a + ')';
        try {
            int i = invoke + 17;
            HaptikSDK$b = i % 128;
            int i2 = i % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public getCurrY(ObservableBoolean observableBoolean, SeekBarBindingAdapter.OnProgressChanged onProgressChanged, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(observableBoolean, "_currentTeamName");
        runAnimators.ag$a(onProgressChanged, "_selection");
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.ag$a = observableBoolean;
        this.values = onProgressChanged;
        this.ah$a = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "EditTeamNamePageInteracted");
        hashMap.put("currentTeamName", this.ag$a.ah$a());
        hashMap.put("selection", this.values.ag$a());
        hashMap.put(values(6 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), this.ah$a.ah$a());
        int i = invoke + 11;
        HaptikSDK$b = i % 128;
        if (!(i % 2 == 0)) {
            return hashMap;
        }
        int i2 = 92 / 0;
        return hashMap;
    }

    private static String values(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((toString[move.values + i2] ^ (move.values * valueOf)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
