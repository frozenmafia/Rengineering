package o;

import okio.ByteString;
import okio.SegmentedByteString;
/* loaded from: classes5.dex */
public final class setExtensionCallback {
    private static final char[] toString = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final /* synthetic */ int valueOf(char c) {
        return ah$a(c);
    }

    public static final /* synthetic */ int values(byte[] bArr, int i) {
        return ag$a(bArr, i);
    }

    public static final char[] values() {
        return toString;
    }

    public static final ByteString ag$a(ByteString byteString, String str) {
        runAnimators.ag$a(byteString, "$this$commonDigest");
        runAnimators.ag$a(str, "algorithm");
        onWindowLayoutChangeListenerRemoved values = onWindowLayoutChangeListenerAdded.values(str);
        values.ah$a(byteString.getData$okio(), 0, byteString.size());
        return new ByteString(values.values());
    }

    public static final ByteString toString(SegmentedByteString segmentedByteString, String str) {
        runAnimators.ag$a(segmentedByteString, "$this$commonSegmentDigest");
        runAnimators.ag$a(str, "algorithm");
        onWindowLayoutChangeListenerRemoved values = onWindowLayoutChangeListenerAdded.values(str);
        int length = segmentedByteString.getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = segmentedByteString.getDirectory$okio()[length + i];
            int i4 = segmentedByteString.getDirectory$okio()[i];
            values.ah$a(segmentedByteString.getSegments$okio()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new ByteString(values.values());
    }

    public static final void values(ByteString byteString, getMinSmallestWidth getminsmallestwidth, int i, int i2) {
        runAnimators.ag$a(byteString, "$this$commonWrite");
        runAnimators.ag$a(getminsmallestwidth, "buffer");
        getminsmallestwidth.values(byteString.getData$okio(), i, i2);
    }

    public static final int ah$a(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'A';
        if ('a' <= c && 'f' >= c) {
            c2 = 'a';
        } else if ('A' > c || 'F' < c) {
            throw new IllegalArgumentException("Unexpected hex digit: " + c);
        }
        return (c - c2) + 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:277:0x003b, code lost:
        if (r7 < 65536) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x003d, code lost:
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x003f, code lost:
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0040, code lost:
        r5 = r5 + r6;
        r4 = r4 + 1;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0045, code lost:
        if (r4 >= r2) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0049, code lost:
        if (r19[r4] < 0) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x004b, code lost:
        r7 = r19[r4];
        r18 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x004f, code lost:
        if (r6 != r20) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0051, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0052, code lost:
        if (r7 == 10) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0054, code lost:
        if (r7 == 13) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0056, code lost:
        if (r7 < 0) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0058, code lost:
        if (31 >= r7) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x005a, code lost:
        if (Byte.MAX_VALUE <= r7) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x005d, code lost:
        if (159 < r7) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x005f, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0061, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0062, code lost:
        if (r6 != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0064, code lost:
        if (r7 != 65533) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0066, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0067, code lost:
        if (r7 >= 65536) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0008, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0008, code lost:
        continue;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:279:0x003f -> B:280:0x0040). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:299:0x0067 -> B:278:0x003d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int ag$a(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setExtensionCallback.ag$a(byte[], int):int");
    }
}
