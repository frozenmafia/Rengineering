package o;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.logging.Level;
/* loaded from: classes5.dex */
final class ExtensionInterfaceCompat extends getPlaceholderIntent {
    private final Socket ag$a;

    /* loaded from: classes5.dex */
    public final class ExtensionCallbackInterface {
        public static final byte[] toString(String str) {
            int i;
            int i2;
            char charAt;
            runAnimators.ag$a(str, "$this$commonAsUtf8ToByteArray");
            byte[] bArr = new byte[str.length() * 4];
            int length = str.length();
            int i3 = 0;
            while (i3 < length) {
                char charAt2 = str.charAt(i3);
                if (runAnimators.toString(charAt2, 128) >= 0) {
                    int length2 = str.length();
                    int i4 = i3;
                    while (i3 < length2) {
                        char charAt3 = str.charAt(i3);
                        if (runAnimators.toString(charAt3, 128) < 0) {
                            bArr[i4] = (byte) charAt3;
                            i3++;
                            i4++;
                            while (i3 < length2 && runAnimators.toString(str.charAt(i3), 128) < 0) {
                                bArr[i4] = (byte) str.charAt(i3);
                                i3++;
                                i4++;
                            }
                        } else {
                            if (runAnimators.toString(charAt3, 2048) < 0) {
                                int i5 = i4 + 1;
                                bArr[i4] = (byte) ((charAt3 >> 6) | 192);
                                i = i5 + 1;
                                bArr[i5] = (byte) ((charAt3 & '?') | 128);
                            } else if (55296 > charAt3 || 57343 < charAt3) {
                                int i6 = i4 + 1;
                                bArr[i4] = (byte) ((charAt3 >> '\f') | 224);
                                int i7 = i6 + 1;
                                bArr[i6] = (byte) (((charAt3 >> 6) & 63) | 128);
                                i = i7 + 1;
                                bArr[i7] = (byte) ((charAt3 & '?') | 128);
                            } else if (runAnimators.toString(charAt3, 56319) > 0 || length2 <= (i2 = i3 + 1) || 56320 > (charAt = str.charAt(i2)) || 57343 < charAt) {
                                i = i4 + 1;
                                bArr[i4] = 63;
                            } else {
                                int charAt4 = ((charAt3 << '\n') + str.charAt(i2)) - 56613888;
                                int i8 = i4 + 1;
                                bArr[i4] = (byte) ((charAt4 >> 18) | 240);
                                int i9 = i8 + 1;
                                bArr[i8] = (byte) (((charAt4 >> 12) & 63) | 128);
                                int i10 = i9 + 1;
                                bArr[i9] = (byte) (((charAt4 >> 6) & 63) | 128);
                                i = i10 + 1;
                                bArr[i10] = (byte) ((charAt4 & 63) | 128);
                                i3 += 2;
                                i4 = i;
                            }
                            i3++;
                            i4 = i;
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr, i4);
                    runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                    return copyOf;
                }
                bArr[i3] = (byte) charAt2;
                i3++;
            }
            byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
            runAnimators.ah$a(copyOf2, "java.util.Arrays.copyOf(this, newSize)");
            return copyOf2;
        }
    }

    public ExtensionInterfaceCompat(Socket socket) {
        runAnimators.ag$a(socket, "socket");
        this.ag$a = socket;
    }

    @Override // o.getPlaceholderIntent
    protected IOException toString(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // o.getPlaceholderIntent
    protected void valueOf() {
        try {
            this.ag$a.close();
        } catch (AssertionError e) {
            if (parseSplitXml.ag$a(e)) {
                java.util.logging.Logger ah$a = isInMultiWindowMode.ah$a();
                Level level = Level.WARNING;
                ah$a.log(level, "Failed to close timed out socket " + this.ag$a, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            java.util.logging.Logger ah$a2 = isInMultiWindowMode.ah$a();
            Level level2 = Level.WARNING;
            ah$a2.log(level2, "Failed to close timed out socket " + this.ag$a, (Throwable) e2);
        }
    }
}
