package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class getTouchSlop implements getViewHorizontalDragRange {
    private static int ag$a = 1;
    private static char[] ah$a = {'y', 240, 241, 242, 233, 227};
    private static int values;
    private final SingleDocumentFile toString;
    private final setCurrentTabTag valueOf;

    public boolean equals(Object obj) {
        int i = ag$a + 101;
        values = i % 128;
        int i2 = i % 2;
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof getTouchSlop) {
                getTouchSlop gettouchslop = (getTouchSlop) obj;
                if (!(!runAnimators.values(this.toString, gettouchslop.toString))) {
                    return runAnimators.values(this.valueOf, gettouchslop.valueOf);
                }
                int i3 = ag$a + 83;
                values = i3 % 128;
                int i4 = i3 % 2;
            }
            return false;
        } catch (Exception e) {
            throw e;
        }
    }

    public int hashCode() {
        try {
            int i = values + 53;
            ag$a = i % 128;
            int i2 = i % 2;
            try {
                int hashCode = (this.toString.hashCode() * 31) + this.valueOf.hashCode();
                int i3 = values + 49;
                ag$a = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    int i4 = 22 / 0;
                    return hashCode;
                }
                return hashCode;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String toString() {
        String str = "ShareAppPermissionPopup(_tabSelected=" + this.toString + ", _source=" + this.valueOf + ')';
        int i = ag$a + 79;
        values = i % 128;
        int i2 = i % 2;
        return str;
    }

    public getTouchSlop(SingleDocumentFile singleDocumentFile, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(singleDocumentFile, "_tabSelected");
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.toString = singleDocumentFile;
        this.valueOf = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ShareAppPermissionPopup");
        hashMap.put("TabSelected", this.toString.valueOf());
        hashMap.put(values(false, new int[]{0, 6, 127, 0}, new byte[]{0, 0, 0, 1, 1, 0}).intern(), this.valueOf.ah$a());
        int i = ag$a + 97;
        values = i % 128;
        int i2 = i % 2;
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
            System.arraycopy(ah$a, i, cArr, 0, i2);
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
