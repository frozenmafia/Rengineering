package o;

import com.google.firebase.database.tubesock.WebSocket;
import com.google.firebase.database.tubesock.WebSocketException;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
/* loaded from: classes7.dex */
public class ignoreView {
    private WebSocket HaptikSDK$a;
    private getTransformedBoundingBox$ah$a valueOf;
    private DataInputStream toString = null;
    private isSmoothScrolling values = null;
    private byte[] ah$a = new byte[112];
    private volatile boolean ag$a = false;

    public ignoreView(WebSocket webSocket) {
        this.HaptikSDK$a = null;
        this.HaptikSDK$a = webSocket;
    }

    public void valueOf(DataInputStream dataInputStream) {
        this.toString = dataInputStream;
    }

    public void values() {
        int ignoreview;
        byte[] bArr;
        boolean z;
        this.values = this.HaptikSDK$a.invoke();
        while (!this.ag$a) {
            try {
                ignoreview = toString(this.ah$a, 0, 1) + 0;
                bArr = this.ah$a;
                z = (bArr[0] & 128) != 0;
            } catch (WebSocketException e) {
                ag$a(e);
            } catch (SocketTimeoutException unused) {
            } catch (IOException e2) {
                ag$a(new WebSocketException("IO Error", e2));
            }
            if ((bArr[0] & 112) != 0) {
                throw new WebSocketException("Invalid frame received");
            }
            byte b2 = (byte) (bArr[0] & 15);
            int ignoreview2 = ignoreview + toString(bArr, ignoreview, 1);
            byte[] bArr2 = this.ah$a;
            byte b3 = bArr2[1];
            long j = 0;
            if (b3 < 126) {
                j = b3;
            } else if (b3 == 126) {
                toString(bArr2, ignoreview2, 2);
                byte[] bArr3 = this.ah$a;
                j = ((bArr3[2] & 255) << 8) | (bArr3[3] & 255);
            } else if (b3 == Byte.MAX_VALUE) {
                j = values(this.ah$a, (ignoreview2 + toString(bArr2, ignoreview2, 8)) - 8);
            }
            int i = (int) j;
            byte[] bArr4 = new byte[i];
            toString(bArr4, 0, i);
            if (b2 == 8) {
                this.HaptikSDK$a.ah$b();
            } else if (b2 != 10) {
                if (b2 != 1 && b2 != 2 && b2 != 9 && b2 != 0) {
                    throw new WebSocketException("Unsupported opcode: " + ((int) b2));
                }
                values(z, b2, bArr4);
            }
        }
    }

    private void values(boolean z, byte b2, byte[] bArr) {
        if (b2 == 9) {
            if (z) {
                ah$a(bArr);
                return;
            }
            throw new WebSocketException("PING must not fragment across frames");
        }
        getTransformedBoundingBox$ah$a gettransformedboundingbox_ah_a = this.valueOf;
        if (gettransformedboundingbox_ah_a != null && b2 != 0) {
            throw new WebSocketException("Failed to continue outstanding frame");
        }
        if (gettransformedboundingbox_ah_a == null && b2 == 0) {
            throw new WebSocketException("Received continuing frame, but there's nothing to continue");
        }
        if (gettransformedboundingbox_ah_a == null) {
            this.valueOf = getTransformedBoundingBox.ag$a(b2);
        }
        if (!this.valueOf.ag$a(bArr)) {
            throw new WebSocketException("Failed to decode frame");
        }
        if (z) {
            isItemPrefetchEnabled ah$a = this.valueOf.ah$a();
            this.valueOf = null;
            if (ah$a == null) {
                throw new WebSocketException("Failed to decode whole message");
            }
            this.values.toString(ah$a);
        }
    }

    private void ah$a(byte[] bArr) {
        if (bArr.length <= 125) {
            this.HaptikSDK$a.valueOf(bArr);
            return;
        }
        throw new WebSocketException("PING frame too long");
    }

    private long values(byte[] bArr, int i) {
        return (bArr[i + 0] << 56) + ((bArr[i + 1] & 255) << 48) + ((bArr[i + 2] & 255) << 40) + ((bArr[i + 3] & 255) << 32) + ((bArr[i + 4] & 255) << 24) + ((bArr[i + 5] & 255) << 16) + ((bArr[i + 6] & 255) << 8) + ((bArr[i + 7] & 255) << 0);
    }

    private int toString(byte[] bArr, int i, int i2) throws IOException {
        this.toString.readFully(bArr, i, i2);
        return i2;
    }

    public void ah$a() {
        this.ag$a = true;
    }

    private void ag$a(WebSocketException webSocketException) {
        ah$a();
        this.HaptikSDK$a.values(webSocketException);
    }
}
