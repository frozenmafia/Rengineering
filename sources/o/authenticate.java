package o;

import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class authenticate {
    private static final byte[] ag$a = {0, 0, 0, 1};
    private static final String[] values = {"", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};

    public static android.util.Pair<Integer, Integer> ah$a(byte[] bArr) {
        C$default$setContentDescription c$default$setContentDescription = new C$default$setContentDescription(bArr);
        c$default$setContentDescription.HaptikSDK$b(9);
        int extraCallbackWithResult = c$default$setContentDescription.extraCallbackWithResult();
        c$default$setContentDescription.HaptikSDK$b(20);
        return android.util.Pair.create(Integer.valueOf(c$default$setContentDescription.onNavigationEvent()), Integer.valueOf(extraCallbackWithResult));
    }

    public static List<byte[]> valueOf(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static boolean valueOf(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static String valueOf(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String toString(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = new Object[5];
        objArr[0] = values[i];
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = Character.valueOf(z ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i4);
        StringBuilder sb = new StringBuilder(getElevationDegrees.values("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static byte[] values(byte[] bArr, int i, int i2) {
        byte[] bArr2 = ag$a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }
}
