package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class isBetterCandidate implements getViewHorizontalDragRange {
    private static int ag$a = 0;
    private static int ah$a = 1;
    private static char[] valueOf = {'1', 'd', 'l', 'q', 'r', 's'};
    private final setCurrentTabTag toString;
    private final setOnAttachStateChangeListener values;

    public boolean equals(Object obj) {
        int i = ag$a + 75;
        ah$a = i % 128;
        int i2 = i % 2;
        if ((this == obj ? '1' : 'N') != '1') {
            try {
                if (obj instanceof isBetterCandidate) {
                    isBetterCandidate isbettercandidate = (isBetterCandidate) obj;
                    if (!runAnimators.values(this.toString, isbettercandidate.toString)) {
                        return false;
                    }
                    if (!(runAnimators.values(this.values, isbettercandidate.values))) {
                        int i3 = ah$a + 11;
                        ag$a = i3 % 128;
                        int i4 = i3 % 2;
                        return false;
                    }
                    return true;
                }
                return false;
            } catch (Exception e) {
                throw e;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = ag$a + 31;
        ah$a = i % 128;
        int i2 = i % 2;
        int hashCode = (this.toString.hashCode() * 31) + this.values.hashCode();
        int i3 = ag$a + 21;
        ah$a = i3 % 128;
        if ((i3 % 2 == 0 ? 'D' : '(') != '(') {
            Object obj = null;
            super.hashCode();
            return hashCode;
        }
        return hashCode;
    }

    public String toString() {
        String str = "ProfilePictureClicked(_source=" + this.toString + ", _useridviewed=" + this.values + ')';
        int i = ag$a + 91;
        ah$a = i % 128;
        int i2 = i % 2;
        return str;
    }

    public isBetterCandidate(setCurrentTabTag setcurrenttabtag, setOnAttachStateChangeListener setonattachstatechangelistener) {
        runAnimators.ag$a(setcurrenttabtag, "_source");
        runAnimators.ag$a(setonattachstatechangelistener, "_useridviewed");
        this.toString = setcurrenttabtag;
        this.values = setonattachstatechangelistener;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ProfilePictureClicked");
        hashMap.put(values(false, new int[]{0, 6, 0, 2}, new byte[]{1, 0, 0, 0, 0, 1}).intern(), this.toString.ah$a());
        hashMap.put("useridviewed", Long.valueOf(this.values.ah$a()));
        int i = ah$a + 47;
        ag$a = i % 128;
        if ((i % 2 != 0 ? (char) 19 : '\f') != '\f') {
            int i2 = 11 / 0;
            return hashMap;
        }
        return hashMap;
    }

    private static String values(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(valueOf, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                    }
                    c = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}
