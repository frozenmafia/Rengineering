package o;

import com.sendbird.android.constant.StringSet;
import o.getMinSmallestWidth;
/* loaded from: classes5.dex */
public final class getFinishPrimaryWithSecondary {
    public static final getFinishPrimaryWithSecondary ag$a = new getFinishPrimaryWithSecondary();

    private getFinishPrimaryWithSecondary() {
    }

    public final void values(getMinSmallestWidth.toString tostring, byte[] bArr) {
        runAnimators.ag$a(tostring, "cursor");
        runAnimators.ag$a(bArr, StringSet.key);
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = tostring.valueOf;
            int i2 = tostring.ah$b;
            int i3 = tostring.ah$a;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (tostring.values() != -1);
    }

    public final String values(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): " + i;
        } else if ((1004 > i || 1006 < i) && (1015 > i || 2999 < i)) {
            return null;
        } else {
            return "Code " + i + " is reserved and may not be used.";
        }
    }

    public final void valueOf(int i) {
        String values = values(i);
        if (values == null) {
            return;
        }
        runAnimators.toString((Object) values);
        throw new IllegalArgumentException(values.toString());
    }
}
