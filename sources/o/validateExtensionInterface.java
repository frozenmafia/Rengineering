package o;

import okio.SegmentedByteString;
/* loaded from: classes5.dex */
public final class validateExtensionInterface {
    public static final int values(int[] iArr, int i, int i2, int i3) {
        runAnimators.ag$a(iArr, "$this$binarySearch");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final int ah$a(SegmentedByteString segmentedByteString, int i) {
        runAnimators.ag$a(segmentedByteString, "$this$segment");
        int values = values(segmentedByteString.getDirectory$okio(), i + 1, 0, segmentedByteString.getSegments$okio().length);
        return values >= 0 ? values : ~values;
    }
}
