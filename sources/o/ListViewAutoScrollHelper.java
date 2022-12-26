package o;

import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
import o.AdapterViewBindingAdapter;
import o.SeekBarBindingAdapter;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public final class ListViewAutoScrollHelper implements getViewHorizontalDragRange {
    private static char HaptikSDK$a = 65183;
    private static int HaptikSDK$b = 1;
    private static int HaptikSDK$c = 0;
    private static char ag$a = 18817;
    private static char ah$b = 29715;
    private static char toString = 8054;
    private final AdapterViewBindingAdapter.OnItemSelectedComponentListener ah$a;
    private final SeekBarBindingAdapter.OnProgressChanged valueOf;
    private final setCurrentTabTag values;

    public boolean equals(Object obj) {
        try {
            int i = HaptikSDK$c + 19;
            HaptikSDK$b = i % 128;
            int i2 = i % 2;
            if (this != obj) {
                if ((!(obj instanceof ListViewAutoScrollHelper) ? TokenParser.ESCAPE : '0') == '\\') {
                    int i3 = HaptikSDK$c + 65;
                    HaptikSDK$b = i3 % 128;
                    if (i3 % 2 == 0) {
                    }
                    return false;
                }
                ListViewAutoScrollHelper listViewAutoScrollHelper = (ListViewAutoScrollHelper) obj;
                if (runAnimators.values(this.ah$a, listViewAutoScrollHelper.ah$a)) {
                    if (runAnimators.values(this.valueOf, listViewAutoScrollHelper.valueOf)) {
                        try {
                            if (runAnimators.values(this.values, listViewAutoScrollHelper.values)) {
                                return true;
                            }
                            int i4 = HaptikSDK$b + 39;
                            HaptikSDK$c = i4 % 128;
                            return i4 % 2 != 0;
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    int i5 = HaptikSDK$b + 9;
                    HaptikSDK$c = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = HaptikSDK$c + 77;
                    HaptikSDK$b = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                return false;
            }
            return true;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = HaptikSDK$c + 1;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        int hashCode = (((this.ah$a.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.values.hashCode();
        int i3 = HaptikSDK$c + 107;
        HaptikSDK$b = i3 % 128;
        int i4 = i3 % 2;
        return hashCode;
    }

    public String toString() {
        String str = "BlockProfileSelected(_other_user_id=" + this.ah$a + ", _selection=" + this.valueOf + ", _source=" + this.values + ')';
        int i = HaptikSDK$c + 1;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        return str;
    }

    public ListViewAutoScrollHelper(AdapterViewBindingAdapter.OnItemSelectedComponentListener onItemSelectedComponentListener, SeekBarBindingAdapter.OnProgressChanged onProgressChanged, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(onItemSelectedComponentListener, "_other_user_id");
        runAnimators.ag$a(onProgressChanged, "_selection");
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.ah$a = onItemSelectedComponentListener;
        this.valueOf = onProgressChanged;
        this.values = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "BlockProfileSelected");
        hashMap.put("other_user_id", this.ah$a.ah$a());
        hashMap.put("selection", this.valueOf.ag$a());
        hashMap.put(toString(new char[]{41394, 15386, 55896, 20689, 1427, 37478}, 6 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), this.values.ah$a());
        int i = HaptikSDK$c + 25;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        return hashMap;
    }

    private static String toString(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ah$b)) ^ ((cArr3[0] >>> 5) + HaptikSDK$a)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + toString)) ^ ((cArr3[1] >>> 5) + ag$a)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
