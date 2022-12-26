package o;

import com.google.firebase.database.tubesock.WebSocket;
import com.google.firebase.database.tubesock.WebSocketException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes7.dex */
public class layoutDecoratedWithMargins {
    private WebSocket ah$b;
    private WritableByteChannel toString;
    private BlockingQueue<ByteBuffer> valueOf;
    private final Random ah$a = new Random();
    private volatile boolean invoke = false;
    private boolean ag$a = false;
    private final Thread values = WebSocket.values().newThread(new Runnable() { // from class: o.layoutDecoratedWithMargins.3
        @Override // java.lang.Runnable
        public void run() {
            layoutDecoratedWithMargins.this.ag$a();
        }
    });

    public layoutDecoratedWithMargins(WebSocket webSocket, String str, int i) {
        isLayoutHierarchical valueOf = WebSocket.valueOf();
        Thread valueOf2 = valueOf();
        valueOf.values(valueOf2, str + "Writer-" + i);
        this.ah$b = webSocket;
        this.valueOf = new LinkedBlockingQueue();
    }

    public void ah$a(OutputStream outputStream) {
        this.toString = Channels.newChannel(outputStream);
    }

    private ByteBuffer valueOf(byte b2, boolean z, byte[] bArr) throws IOException {
        int i = z ? 6 : 2;
        int length = bArr.length;
        if (length >= 126) {
            i = length <= 65535 ? i + 2 : i + 8;
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + i);
        allocate.put((byte) (b2 | Byte.MIN_VALUE));
        if (length < 126) {
            if (z) {
                length |= 128;
            }
            allocate.put((byte) length);
        } else if (length <= 65535) {
            allocate.put((byte) (z ? 254 : 126));
            allocate.putShort((short) length);
        } else {
            allocate.put((byte) (z ? 255 : 127));
            allocate.putInt(0);
            allocate.putInt(length);
        }
        if (z) {
            byte[] values = values();
            allocate.put(values);
            for (int i2 = 0; i2 < bArr.length; i2++) {
                allocate.put((byte) (bArr[i2] ^ values[i2 % 4]));
            }
        }
        allocate.flip();
        return allocate;
    }

    private byte[] values() {
        byte[] bArr = new byte[4];
        this.ah$a.nextBytes(bArr);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1.ag$a = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void toString(byte r2, boolean r3, byte[] r4) throws java.io.IOException {
        /*
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r3 = r1.valueOf(r2, r3, r4)     // Catch: java.lang.Throwable -> L26
            boolean r4 = r1.invoke     // Catch: java.lang.Throwable -> L26
            r0 = 8
            if (r4 == 0) goto L1a
            boolean r4 = r1.ag$a     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L12
            if (r2 != r0) goto L12
            goto L1a
        L12:
            com.google.firebase.database.tubesock.WebSocketException r2 = new com.google.firebase.database.tubesock.WebSocketException     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "Shouldn't be sending"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
            throw r2     // Catch: java.lang.Throwable -> L26
        L1a:
            if (r2 != r0) goto L1f
            r2 = 1
            r1.ag$a = r2     // Catch: java.lang.Throwable -> L26
        L1f:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r1.valueOf     // Catch: java.lang.Throwable -> L26
            r2.add(r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r1)
            return
        L26:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.layoutDecoratedWithMargins.toString(byte, boolean, byte[]):void");
    }

    private void HaptikSDK$b() throws InterruptedException, IOException {
        this.toString.write(this.valueOf.take());
    }

    public void ah$a() {
        this.invoke = true;
    }

    private void values(WebSocketException webSocketException) {
        this.ah$b.values(webSocketException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag$a() {
        while (!this.invoke && !Thread.interrupted()) {
            try {
                HaptikSDK$b();
            } catch (IOException e) {
                values(new WebSocketException("IO Exception", e));
                return;
            } catch (InterruptedException unused) {
                return;
            }
        }
        for (int i = 0; i < this.valueOf.size(); i++) {
            HaptikSDK$b();
        }
    }

    public Thread valueOf() {
        return this.values;
    }
}
