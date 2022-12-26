package o;

import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class ScrollerCompat implements getViewHorizontalDragRange {
    private static int ah$b = 1;
    private static int invoke = 0;
    private static long values = 7713421030602626553L;
    private final ViewGroupBindingAdapter ag$a;
    private final setCurrentTabTag ah$a;
    private final setContentPaddingRight toString;
    private final notifyFirst64 valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof ScrollerCompat) {
                ScrollerCompat scrollerCompat = (ScrollerCompat) obj;
                if (runAnimators.values(this.valueOf, scrollerCompat.valueOf)) {
                    if ((!runAnimators.values(this.toString, scrollerCompat.toString) ? (char) 4 : '\'') != 4) {
                        try {
                            if (runAnimators.values(this.ah$a, scrollerCompat.ah$a)) {
                                return runAnimators.values(this.ag$a, scrollerCompat.ag$a);
                            }
                            int i = invoke + 63;
                            ah$b = i % 128;
                            int i2 = i % 2;
                            int i3 = invoke + 119;
                            ah$b = i3 % 128;
                            if ((i3 % 2 != 0 ? 'G' : (char) 2) != 'G') {
                                int i4 = 30 / 0;
                                return false;
                            }
                            return false;
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    return false;
                }
                return false;
            }
            return false;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = invoke + 57;
        ah$b = i % 128;
        int i2 = i % 2;
        int hashCode = (((((this.valueOf.hashCode() * 31) + this.toString.hashCode()) * 31) + this.ah$a.hashCode()) * 31) + this.ag$a.hashCode();
        int i3 = invoke + 95;
        ah$b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
            return hashCode;
        }
        return hashCode;
    }

    public String toString() {
        String str = "DefaultAmountBoxClicked(_amountToAdd=" + this.valueOf + ", _pillNumber=" + this.toString + ", _source=" + this.ah$a + ", _value=" + this.ag$a + ')';
        int i = invoke + 37;
        ah$b = i % 128;
        if (!(i % 2 != 0)) {
            int i2 = 91 / 0;
            return str;
        }
        return str;
    }

    public ScrollerCompat(notifyFirst64 notifyfirst64, setContentPaddingRight setcontentpaddingright, setCurrentTabTag setcurrenttabtag, ViewGroupBindingAdapter viewGroupBindingAdapter) {
        runAnimators.ag$a(notifyfirst64, "_amountToAdd");
        runAnimators.ag$a(setcontentpaddingright, "_pillNumber");
        runAnimators.ag$a(setcurrenttabtag, "_source");
        runAnimators.ag$a(viewGroupBindingAdapter, "_value");
        this.valueOf = notifyfirst64;
        this.toString = setcontentpaddingright;
        this.ah$a = setcurrenttabtag;
        this.ag$a = viewGroupBindingAdapter;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "DefaultAmountBoxClicked");
        hashMap.put("amountToAdd", Double.valueOf(this.valueOf.valueOf()));
        hashMap.put("pillNumber", Integer.valueOf(this.toString.ag$a()));
        hashMap.put(toString(new char[]{54666, 54781, 54618, 54474, 54326, 55179}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 106).intern(), this.ah$a.ah$a());
        hashMap.put("value", Integer.valueOf(this.ag$a.valueOf()));
        int i = ah$b + 41;
        invoke = i % 128;
        int i2 = i % 2;
        return hashMap;
    }

    private static String toString(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ values);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
