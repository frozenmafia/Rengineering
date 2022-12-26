package o;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class getCurrX implements getViewHorizontalDragRange {
    private static byte[] HaptikSDK$a = {-117, 116, -117, -113, -127, 0};
    private static short[] HaptikSDK$b = null;
    private static int HaptikSDK$c = 0;
    private static int ag$a = 21;
    private static int invoke = 1;
    private static int valueOf = -187344563;
    private static int values = -477499011;
    private final CardViewBindingAdapter ah$a;
    private final method toString;

    public boolean equals(Object obj) {
        int i = HaptikSDK$c + 71;
        invoke = i % 128;
        int i2 = i % 2;
        if (!(this != obj)) {
            int i3 = HaptikSDK$c + 45;
            invoke = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if ((!(obj instanceof getCurrX) ? 'K' : '?') != '?') {
            return false;
        }
        getCurrX getcurrx = (getCurrX) obj;
        if (runAnimators.values(this.toString, getcurrx.toString)) {
            try {
                try {
                    if (runAnimators.values(this.ah$a, getcurrx.ah$a)) {
                        return true;
                    }
                    int i5 = invoke + 77;
                    HaptikSDK$c = i5 % 128;
                    boolean z = i5 % 2 != 0;
                    int i6 = HaptikSDK$c + 89;
                    invoke = i6 % 128;
                    int i7 = i6 % 2;
                    return z;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = invoke + 17;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        int hashCode = (this.toString.hashCode() * 31) + this.ah$a.hashCode();
        int i3 = HaptikSDK$c + 55;
        invoke = i3 % 128;
        int i4 = i3 % 2;
        return hashCode;
    }

    public String toString() {
        String str = "DepositSuccessClient(_amount=" + this.toString + ", _paymentType=" + this.ah$a + ')';
        try {
            int i = invoke + 101;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public getCurrX(method methodVar, CardViewBindingAdapter cardViewBindingAdapter) {
        try {
            runAnimators.ag$a(methodVar, "_amount");
            runAnimators.ag$a(cardViewBindingAdapter, "_paymentType");
            this.toString = methodVar;
            this.ah$a = cardViewBindingAdapter;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "DepositSuccessClient");
        hashMap.put(valueOf((byte) (ExpandableListView.getPackedPositionChild(0L) - 114), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 15, 477499108 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 187344563 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), Double.valueOf(this.toString.ah$a()));
        hashMap.put("paymentType", this.ah$a.valueOf());
        int i = invoke + 85;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        return hashMap;
    }

    private static String valueOf(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + ag$a;
            boolean z = i4 == -1;
            if (z) {
                if (HaptikSDK$a != null) {
                    i4 = (byte) (HaptikSDK$a[valueOf + i3] + ag$a);
                } else {
                    i4 = (short) (HaptikSDK$b[valueOf + i3] + ag$a);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + valueOf + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + values);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (HaptikSDK$a != null) {
                        byte[] bArr = HaptikSDK$a;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = HaptikSDK$b;
                        int i6 = moveToLast.values;
                        moveToLast.values = i6 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                    }
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
