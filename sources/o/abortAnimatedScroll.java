package o;

import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class abortAnimatedScroll implements getViewHorizontalDragRange {
    private static int HaptikSDK$b = 1;
    private static char HaptikSDK$c = 5754;
    private static char ag$a = 19307;
    private static char ah$b = 12990;
    private static int invoke = 0;
    private static char values = 53884;
    private final notifyFirst64 ah$a;
    private final setCurrentTabTag toString;
    private final AbsSeekBarBindingAdapter valueOf;

    public boolean equals(Object obj) {
        int i = HaptikSDK$b + 53;
        invoke = i % 128;
        int i2 = i % 2;
        if (this == obj) {
            return true;
        }
        if ((!(obj instanceof abortAnimatedScroll) ? '9' : 'V') == '9') {
            int i3 = invoke + 23;
            HaptikSDK$b = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        abortAnimatedScroll abortanimatedscroll = (abortAnimatedScroll) obj;
        if (!runAnimators.values(this.ah$a, abortanimatedscroll.ah$a)) {
            try {
                int i5 = HaptikSDK$b + 113;
                invoke = i5 % 128;
                int i6 = i5 % 2;
                return false;
            } catch (Exception e) {
                throw e;
            }
        } else if (!runAnimators.values(this.valueOf, abortanimatedscroll.valueOf)) {
            int i7 = HaptikSDK$b + 107;
            invoke = i7 % 128;
            int i8 = i7 % 2;
            return false;
        } else if (!runAnimators.values(this.toString, abortanimatedscroll.toString)) {
            int i9 = invoke + 47;
            HaptikSDK$b = i9 % 128;
            int i10 = i9 % 2;
            return false;
        } else {
            int i11 = invoke + 19;
            HaptikSDK$b = i11 % 128;
            if (i11 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            super.hashCode();
            return true;
        }
    }

    public int hashCode() {
        try {
            int i = HaptikSDK$b + 81;
            invoke = i % 128;
            int hashCode = (i % 2 != 0 ? '[' : (char) 24) != '[' ? (((this.ah$a.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.toString.hashCode() : (((this.ah$a.hashCode() / 6) >> this.valueOf.hashCode()) * 9) / this.toString.hashCode();
            int i2 = invoke + 85;
            HaptikSDK$b = i2 % 128;
            int i3 = i2 % 2;
            return hashCode;
        } catch (Exception e) {
            throw e;
        }
    }

    public String toString() {
        String str = "CashAddPageLoaded(_amountToAdd=" + this.ah$a + ", _oldAmount=" + this.valueOf + ", _source=" + this.toString + ')';
        int i = invoke + 61;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        return str;
    }

    public abortAnimatedScroll(notifyFirst64 notifyfirst64, AbsSeekBarBindingAdapter absSeekBarBindingAdapter, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(notifyfirst64, "_amountToAdd");
        runAnimators.ag$a(absSeekBarBindingAdapter, "_oldAmount");
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.ah$a = notifyfirst64;
        this.valueOf = absSeekBarBindingAdapter;
        this.toString = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "CashAddPageLoaded");
        hashMap.put("amountToAdd", Double.valueOf(this.ah$a.valueOf()));
        hashMap.put("oldAmount", Double.valueOf(this.valueOf.ag$a()));
        hashMap.put(ag$a(new char[]{23824, 16167, 25217, 64638, 58825, 55967}, 6 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), this.toString.ah$a());
        int i = HaptikSDK$b + 93;
        invoke = i % 128;
        if ((i % 2 != 0 ? 'D' : (char) 0) != 'D') {
            return hashMap;
        }
        int i2 = 52 / 0;
        return hashMap;
    }

    private static String ag$a(char[] cArr, int i) {
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
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ah$b)) ^ ((cArr3[0] >>> 5) + HaptikSDK$c)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + values)) ^ ((cArr3[1] >>> 5) + ag$a)));
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
