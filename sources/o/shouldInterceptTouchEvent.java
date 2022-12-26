package o;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class shouldInterceptTouchEvent implements getViewHorizontalDragRange {
    private static int HaptikSDK$b = 1;
    private static int ag$a = 0;
    private static char[] ah$a = {13823, 13826, 13807, 13825, 13824, 13800, 13813, 13817, 13801};
    private static char valueOf = 3;
    private final setCurrentTabTag toString;
    private final emit values;

    public boolean equals(Object obj) {
        if (this == obj) {
            int i = HaptikSDK$b + 55;
            ag$a = i % 128;
            int i2 = i % 2;
            return true;
        }
        if (!(obj instanceof shouldInterceptTouchEvent)) {
            return false;
        }
        shouldInterceptTouchEvent shouldintercepttouchevent = (shouldInterceptTouchEvent) obj;
        if (!runAnimators.values(this.values, shouldintercepttouchevent.values)) {
            int i3 = HaptikSDK$b + 59;
            ag$a = i3 % 128;
            return (i3 % 2 != 0 ? 'X' : '1') != '1';
        }
        if (!runAnimators.values(this.toString, shouldintercepttouchevent.toString)) {
            int i4 = HaptikSDK$b + 59;
            ag$a = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        return true;
    }

    public int hashCode() {
        try {
            emit emitVar = this.values;
            int i = 0;
            if (emitVar == null) {
                int i2 = HaptikSDK$b + 19;
                ag$a = i2 % 128;
                int i3 = i2 % 2;
                int i4 = HaptikSDK$b + 55;
                ag$a = i4 % 128;
                int i5 = i4 % 2;
            } else {
                i = emitVar.hashCode();
            }
            return (i * 31) + this.toString.hashCode();
        } catch (Exception e) {
            throw e;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("StartDMSelected(_noOfChannels=");
            sb.append(this.values);
            sb.append(", _source=");
            sb.append(this.toString);
            sb.append(')');
            String sb2 = sb.toString();
            int i = HaptikSDK$b + 79;
            ag$a = i % 128;
            int i2 = i % 2;
            return sb2;
        } catch (Exception e) {
            throw e;
        }
    }

    public shouldInterceptTouchEvent(emit emitVar, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.values = emitVar;
        this.toString = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "StartDMSelected");
        emit emitVar = this.values;
        if (emitVar != null) {
            int i = ag$a + 105;
            HaptikSDK$b = i % 128;
            if ((i % 2 == 0 ? 'Y' : (char) 24) != 'Y') {
                hashMap.put("noOfChannels", Integer.valueOf(emitVar.ag$a()));
            } else {
                hashMap.put("noOfChannels", Integer.valueOf(emitVar.ag$a()));
                Object obj = null;
                super.hashCode();
            }
        }
        hashMap.put(toString((byte) (115 - (ViewConfiguration.getScrollBarSize() >> 8)), new char[]{6, 7, 5, '\b', 6, 1}, 5 - MotionEvent.axisFromString("")).intern(), this.toString.ah$a());
        int i2 = HaptikSDK$b + 97;
        ag$a = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    private static String toString(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = ah$a;
            char c = valueOf;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                isFirst.valueOf = 0;
                while (isFirst.valueOf < i2) {
                    isFirst.toString = cArr[isFirst.valueOf];
                    isFirst.ah$a = cArr[isFirst.valueOf + 1];
                    if (isFirst.toString == isFirst.ah$a) {
                        cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                        cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                    } else {
                        isFirst.ag$a = isFirst.toString / c;
                        isFirst.invoke = isFirst.toString % c;
                        isFirst.values = isFirst.ah$a / c;
                        isFirst.ah$b = isFirst.ah$a % c;
                        if (isFirst.invoke == isFirst.ah$b) {
                            isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                            isFirst.values = ((isFirst.values + c) - 1) % c;
                            int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i4 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i3];
                            cArr3[isFirst.valueOf + 1] = cArr2[i4];
                        } else if (isFirst.ag$a == isFirst.values) {
                            isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                            isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                            int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i6 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i5];
                            cArr3[isFirst.valueOf + 1] = cArr2[i6];
                        } else {
                            int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                            int i8 = (isFirst.values * c) + isFirst.invoke;
                            cArr3[isFirst.valueOf] = cArr2[i7];
                            cArr3[isFirst.valueOf + 1] = cArr2[i8];
                        }
                    }
                    isFirst.valueOf += 2;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr3[i9] = (char) (cArr3[i9] ^ 13722);
            }
            str = new String(cArr3);
        }
        return str;
    }
}
