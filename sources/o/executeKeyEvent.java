package o;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class executeKeyEvent implements getViewHorizontalDragRange {
    private static short[] HaptikSDK$b = null;
    private static int ag$a = 55;
    private static int ah$a = 1185730696;
    private static int ah$b = 1;
    private static int invoke = 0;
    private static int valueOf = -539401712;
    private static byte[] values = {-49, -72, -89, -77, -68, -78};
    private final setCurrentTabTag toString;

    public boolean equals(Object obj) {
        if (!(this != obj)) {
            int i = invoke + 123;
            ah$b = i % 128;
            int i2 = i % 2;
            return true;
        }
        try {
            if (obj instanceof executeKeyEvent) {
                if ((!runAnimators.values(this.toString, ((executeKeyEvent) obj).toString) ? '0' : 'O') != 'O') {
                    int i3 = ah$b + 121;
                    invoke = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                return true;
            }
            int i5 = invoke + 115;
            try {
                ah$b = i5 % 128;
                int i6 = i5 % 2;
                return false;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int hashCode;
        int i = invoke + 45;
        ah$b = i % 128;
        if (i % 2 == 0) {
            hashCode = this.toString.hashCode();
            Object obj = null;
            super.hashCode();
        } else {
            hashCode = this.toString.hashCode();
        }
        try {
            int i2 = invoke + 109;
            ah$b = i2 % 128;
            if ((i2 % 2 == 0 ? '$' : '+') != '$') {
                return hashCode;
            }
            int i3 = 47 / 0;
            return hashCode;
        } catch (Exception e) {
            throw e;
        }
    }

    public String toString() {
        String str = "ContactsInvitedClicked(_source=" + this.toString + ')';
        int i = invoke + 43;
        ah$b = i % 128;
        int i2 = i % 2;
        return str;
    }

    public executeKeyEvent(setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.toString = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ContactsInvitedClicked");
        hashMap.put(values((byte) View.resolveSizeAndState(0, 0, 0), (-56) - View.resolveSizeAndState(0, 0, 0), Color.rgb(0, 0, 0) - 1168953365, (short) (74 - TextUtils.indexOf("", "")), (ViewConfiguration.getJumpTapTimeout() >> 16) + 539401712).intern(), this.toString.ah$a());
        int i = ah$b + 13;
        invoke = i % 128;
        if ((i % 2 != 0 ? 'U' : '`') != 'U') {
            return hashMap;
        }
        Object obj = null;
        super.hashCode();
        return hashMap;
    }

    private static String values(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + ag$a;
            boolean z = i4 == -1;
            if (z) {
                if (values != null) {
                    i4 = (byte) (values[valueOf + i3] + ag$a);
                } else {
                    i4 = (short) (HaptikSDK$b[valueOf + i3] + ag$a);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + valueOf + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + ah$a);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (values != null) {
                        byte[] bArr = values;
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
