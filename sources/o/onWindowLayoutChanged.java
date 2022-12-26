package o;

import java.io.IOException;
import java.io.InputStream;
import o.translate;
import org.brotli.dec.BrotliRuntimeException;
/* loaded from: classes5.dex */
public final class onWindowLayoutChanged {
    private int HaptikSDK$c;
    private InputStream ag$a;
    long ah$a;
    int toString;
    private boolean values;
    private final byte[] valueOf = new byte[4160];
    private final int[] HaptikSDK$b = new int[1040];
    private final translate.window_release ah$b = new translate.window_release();
    private int HaptikSDK$a = 0;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0037, code lost:
        r5.values = true;
        r5.HaptikSDK$a = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x003c, code lost:
        r2 = r2 + 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ag$a(o.onWindowLayoutChanged r5) {
        /*
            int r0 = r5.HaptikSDK$c
            r1 = 1015(0x3f7, float:1.422E-42)
            if (r0 > r1) goto L7
            return
        L7:
            boolean r1 = r5.values
            if (r1 == 0) goto L1b
            int r5 = valueOf(r5)
            r0 = -2
            if (r5 < r0) goto L13
            return
        L13:
            org.brotli.dec.BrotliRuntimeException r5 = new org.brotli.dec.BrotliRuntimeException
            java.lang.String r0 = "No more input"
            r5.<init>(r0)
            throw r5
        L1b:
            int r0 = r0 << 2
            r1 = 4096(0x1000, float:5.74E-42)
            int r2 = 4096 - r0
            byte[] r3 = r5.valueOf
            r4 = 0
            java.lang.System.arraycopy(r3, r0, r3, r4, r2)
            r5.HaptikSDK$c = r4
        L29:
            if (r2 >= r1) goto L4a
            java.io.InputStream r0 = r5.ag$a     // Catch: java.io.IOException -> L41
            byte[] r3 = r5.valueOf     // Catch: java.io.IOException -> L41
            int r4 = 4096 - r2
            int r0 = r0.read(r3, r2, r4)     // Catch: java.io.IOException -> L41
            if (r0 > 0) goto L3f
            r0 = 1
            r5.values = r0     // Catch: java.io.IOException -> L41
            r5.HaptikSDK$a = r2     // Catch: java.io.IOException -> L41
            int r2 = r2 + 3
            goto L4a
        L3f:
            int r2 = r2 + r0
            goto L29
        L41:
            r5 = move-exception
            org.brotli.dec.BrotliRuntimeException r0 = new org.brotli.dec.BrotliRuntimeException
            java.lang.String r1 = "Failed to read input"
            r0.<init>(r1, r5)
            throw r0
        L4a:
            o.translate$window_release r5 = r5.ah$b
            int r0 = r2 >> 2
            o.translate.window_release.values(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onWindowLayoutChanged.ag$a(o.onWindowLayoutChanged):void");
    }

    public static void toString(onWindowLayoutChanged onwindowlayoutchanged, boolean z) {
        if (onwindowlayoutchanged.values) {
            int i = ((onwindowlayoutchanged.HaptikSDK$c << 2) + ((onwindowlayoutchanged.toString + 7) >> 3)) - 8;
            int i2 = onwindowlayoutchanged.HaptikSDK$a;
            if (i > i2) {
                throw new BrotliRuntimeException("Read after end");
            }
            if (z && i != i2) {
                throw new BrotliRuntimeException("Unused bytes after end");
            }
        }
    }

    public static void toString(onWindowLayoutChanged onwindowlayoutchanged) {
        int i = onwindowlayoutchanged.toString;
        if (i >= 32) {
            int[] iArr = onwindowlayoutchanged.HaptikSDK$b;
            int i2 = onwindowlayoutchanged.HaptikSDK$c;
            onwindowlayoutchanged.HaptikSDK$c = i2 + 1;
            onwindowlayoutchanged.ah$a = (iArr[i2] << 32) | (onwindowlayoutchanged.ah$a >>> 32);
            onwindowlayoutchanged.toString = i - 32;
        }
    }

    public static int ah$a(onWindowLayoutChanged onwindowlayoutchanged, int i) {
        toString(onwindowlayoutchanged);
        long j = onwindowlayoutchanged.ah$a;
        int i2 = onwindowlayoutchanged.toString;
        onwindowlayoutchanged.toString = i2 + i;
        return ((int) (j >>> i2)) & ((1 << i) - 1);
    }

    public static void ah$a(onWindowLayoutChanged onwindowlayoutchanged, InputStream inputStream) {
        if (onwindowlayoutchanged.ag$a != null) {
            throw new IllegalStateException("Bit reader already has associated input stream");
        }
        translate.window_release.ah$a(onwindowlayoutchanged.ah$b, onwindowlayoutchanged.valueOf, onwindowlayoutchanged.HaptikSDK$b);
        onwindowlayoutchanged.ag$a = inputStream;
        onwindowlayoutchanged.ah$a = 0L;
        onwindowlayoutchanged.toString = 64;
        onwindowlayoutchanged.HaptikSDK$c = 1024;
        onwindowlayoutchanged.values = false;
        HaptikSDK$a(onwindowlayoutchanged);
    }

    private static void HaptikSDK$a(onWindowLayoutChanged onwindowlayoutchanged) {
        ag$a(onwindowlayoutchanged);
        toString(onwindowlayoutchanged, false);
        toString(onwindowlayoutchanged);
        toString(onwindowlayoutchanged);
    }

    public static void HaptikSDK$b(onWindowLayoutChanged onwindowlayoutchanged) {
        if (onwindowlayoutchanged.toString == 64) {
            HaptikSDK$a(onwindowlayoutchanged);
        }
    }

    public static void ah$a(onWindowLayoutChanged onwindowlayoutchanged) throws IOException {
        InputStream inputStream = onwindowlayoutchanged.ag$a;
        onwindowlayoutchanged.ag$a = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public static void values(onWindowLayoutChanged onwindowlayoutchanged) {
        int i = (64 - onwindowlayoutchanged.toString) & 7;
        if (i != 0 && ah$a(onwindowlayoutchanged, i) != 0) {
            throw new BrotliRuntimeException("Corrupted padding bits");
        }
    }

    static int valueOf(onWindowLayoutChanged onwindowlayoutchanged) {
        return (onwindowlayoutchanged.values ? (onwindowlayoutchanged.HaptikSDK$a + 3) >> 2 : 1024) - onwindowlayoutchanged.HaptikSDK$c;
    }

    public static void ag$a(onWindowLayoutChanged onwindowlayoutchanged, byte[] bArr, int i, int i2) {
        if ((onwindowlayoutchanged.toString & 7) != 0) {
            throw new BrotliRuntimeException("Unaligned copyBytes");
        }
        while (true) {
            int i3 = onwindowlayoutchanged.toString;
            if (i3 == 64 || i2 == 0) {
                break;
            }
            bArr[i] = (byte) (onwindowlayoutchanged.ah$a >>> i3);
            onwindowlayoutchanged.toString = i3 + 8;
            i2--;
            i++;
        }
        if (i2 == 0) {
            return;
        }
        int min = Math.min(valueOf(onwindowlayoutchanged), i2 >> 2);
        if (min > 0) {
            int i4 = min << 2;
            System.arraycopy(onwindowlayoutchanged.valueOf, onwindowlayoutchanged.HaptikSDK$c << 2, bArr, i, i4);
            i += i4;
            i2 -= i4;
            onwindowlayoutchanged.HaptikSDK$c += min;
        }
        if (i2 == 0) {
            return;
        }
        if (valueOf(onwindowlayoutchanged) <= 0) {
            while (i2 > 0) {
                try {
                    int read = onwindowlayoutchanged.ag$a.read(bArr, i, i2);
                    if (read == -1) {
                        throw new BrotliRuntimeException("Unexpected end of input");
                    }
                    i += read;
                    i2 -= read;
                } catch (IOException e) {
                    throw new BrotliRuntimeException("Failed to read input", e);
                }
            }
            return;
        }
        toString(onwindowlayoutchanged);
        while (i2 != 0) {
            long j = onwindowlayoutchanged.ah$a;
            int i5 = onwindowlayoutchanged.toString;
            bArr[i] = (byte) (j >>> i5);
            onwindowlayoutchanged.toString = i5 + 8;
            i2--;
            i++;
        }
        toString(onwindowlayoutchanged, false);
    }
}
