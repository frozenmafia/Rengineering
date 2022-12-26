package o;

import o.ExtensionWindowLayoutInfoBackend;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ExtensionWindowLayoutInfoBackend$MulticastConsumer$ag$a {
    static final byte[] toString = new byte[122784];

    static {
        String[] strArr = {ExtensionWindowLayoutInfoBackend.MulticastConsumer.valueOf.ah$a(), ExtensionWindowLayoutInfoBackend$MulticastConsumer$ah$a.valueOf(), ExtensionWindowLayoutInfoBackend.MulticastConsumer.toString.ah$a()};
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            i += strArr[i2].length();
        }
        if (i != toString.length) {
            throw new RuntimeException("Corrupted brotli dictionary");
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            String str = strArr[i4];
            int i5 = 0;
            while (i5 < str.length()) {
                toString[i3] = (byte) str.charAt(i5);
                i5++;
                i3++;
            }
        }
    }
}
