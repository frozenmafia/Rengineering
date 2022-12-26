package o;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class addRecyclerListener implements Closeable {
    private static final java.util.logging.Logger values = java.util.logging.Logger.getLogger(addRecyclerListener.class.getName());
    private final RandomAccessFile HaptikSDK$b;
    private addRecyclerListener$ah$a ag$a;
    private int ah$a;
    private addRecyclerListener$ah$a invoke;
    private final byte[] toString = new byte[16];
    int valueOf;

    /* loaded from: classes7.dex */
    public interface valueOf {
        void toString(InputStream inputStream, int i) throws IOException;
    }

    public addRecyclerListener(File file) throws IOException {
        if (!file.exists()) {
            ag$a(file);
        }
        this.HaptikSDK$b = ah$a(file);
        HaptikSDK$b();
    }

    private static void valueOf(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static void ah$a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            valueOf(bArr, i, i2);
            i += 4;
        }
    }

    private static int ah$a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private void HaptikSDK$b() throws IOException {
        this.HaptikSDK$b.seek(0L);
        this.HaptikSDK$b.readFully(this.toString);
        int ah$a = ah$a(this.toString, 0);
        this.valueOf = ah$a;
        if (ah$a > this.HaptikSDK$b.length()) {
            throw new IOException("File is truncated. Expected length: " + this.valueOf + ", Actual length: " + this.HaptikSDK$b.length());
        }
        this.ah$a = ah$a(this.toString, 4);
        int ah$a2 = ah$a(this.toString, 8);
        int ah$a3 = ah$a(this.toString, 12);
        this.ag$a = ag$a(ah$a2);
        this.invoke = ag$a(ah$a3);
    }

    private void ah$a(int i, int i2, int i3, int i4) throws IOException {
        ah$a(this.toString, i, i2, i3, i4);
        this.HaptikSDK$b.seek(0L);
        this.HaptikSDK$b.write(this.toString);
    }

    private addRecyclerListener$ah$a ag$a(int i) throws IOException {
        if (i == 0) {
            return addRecyclerListener$ah$a.valueOf;
        }
        this.HaptikSDK$b.seek(i);
        return new addRecyclerListener$ah$a(i, this.HaptikSDK$b.readInt());
    }

    private static void ag$a(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile ah$a = ah$a(file2);
        try {
            ah$a.setLength(android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            ah$a.seek(0L);
            byte[] bArr = new byte[16];
            ah$a(bArr, 4096, 0, 0, 0);
            ah$a.write(bArr);
            ah$a.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            ah$a.close();
            throw th;
        }
    }

    private static RandomAccessFile ah$a(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toString(int i) {
        int i2 = this.valueOf;
        return i < i2 ? i : (i + 16) - i2;
    }

    private void toString(int i, byte[] bArr, int i2, int i3) throws IOException {
        int addrecyclerlistener = toString(i);
        int i4 = this.valueOf;
        if (addrecyclerlistener + i3 <= i4) {
            this.HaptikSDK$b.seek(addrecyclerlistener);
            this.HaptikSDK$b.write(bArr, i2, i3);
            return;
        }
        int i5 = i4 - addrecyclerlistener;
        this.HaptikSDK$b.seek(addrecyclerlistener);
        this.HaptikSDK$b.write(bArr, i2, i5);
        this.HaptikSDK$b.seek(16L);
        this.HaptikSDK$b.write(bArr, i2 + i5, i3 - i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$a(int i, byte[] bArr, int i2, int i3) throws IOException {
        int addrecyclerlistener = toString(i);
        int i4 = this.valueOf;
        if (addrecyclerlistener + i3 <= i4) {
            this.HaptikSDK$b.seek(addrecyclerlistener);
            this.HaptikSDK$b.readFully(bArr, i2, i3);
            return;
        }
        int i5 = i4 - addrecyclerlistener;
        this.HaptikSDK$b.seek(addrecyclerlistener);
        this.HaptikSDK$b.readFully(bArr, i2, i5);
        this.HaptikSDK$b.seek(16L);
        this.HaptikSDK$b.readFully(bArr, i2 + i5, i3 - i5);
    }

    public void valueOf(byte[] bArr) throws IOException {
        toString(bArr, 0, bArr.length);
    }

    public void toString(byte[] bArr, int i, int i2) throws IOException {
        synchronized (this) {
            valueOf(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            values(i2);
            boolean ag$a = ag$a();
            addRecyclerListener$ah$a addrecyclerlistener_ah_a = new addRecyclerListener$ah$a(ag$a ? 16 : toString(this.invoke.ag$a + 4 + this.invoke.toString), i2);
            valueOf(this.toString, 0, i2);
            toString(addrecyclerlistener_ah_a.ag$a, this.toString, 0, 4);
            toString(addrecyclerlistener_ah_a.ag$a + 4, bArr, i, i2);
            ah$a(this.valueOf, this.ah$a + 1, ag$a ? addrecyclerlistener_ah_a.ag$a : this.ag$a.ag$a, addrecyclerlistener_ah_a.ag$a);
            this.invoke = addrecyclerlistener_ah_a;
            this.ah$a++;
            if (ag$a) {
                this.ag$a = addrecyclerlistener_ah_a;
            }
        }
    }

    public int ah$a() {
        if (this.ah$a == 0) {
            return 16;
        }
        if (this.invoke.ag$a >= this.ag$a.ag$a) {
            return (this.invoke.ag$a - this.ag$a.ag$a) + 4 + this.invoke.toString + 16;
        }
        return (((this.invoke.ag$a + 4) + this.invoke.toString) + this.valueOf) - this.ag$a.ag$a;
    }

    private int HaptikSDK$a() {
        return this.valueOf - ah$a();
    }

    public boolean ag$a() {
        boolean z;
        synchronized (this) {
            z = this.ah$a == 0;
        }
        return z;
    }

    private void values(int i) throws IOException {
        int i2 = i + 4;
        int HaptikSDK$a = HaptikSDK$a();
        if (HaptikSDK$a >= i2) {
            return;
        }
        int i3 = this.valueOf;
        do {
            HaptikSDK$a += i3;
            i3 <<= 1;
        } while (HaptikSDK$a < i2);
        valueOf(i3);
        int addrecyclerlistener = toString(this.invoke.ag$a + 4 + this.invoke.toString);
        if (addrecyclerlistener < this.ag$a.ag$a) {
            FileChannel channel = this.HaptikSDK$b.getChannel();
            channel.position(this.valueOf);
            long j = addrecyclerlistener - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        if (this.invoke.ag$a < this.ag$a.ag$a) {
            int i4 = (this.valueOf + this.invoke.ag$a) - 16;
            ah$a(i3, this.ah$a, this.ag$a.ag$a, i4);
            this.invoke = new addRecyclerListener$ah$a(i4, this.invoke.toString);
        } else {
            ah$a(i3, this.ah$a, this.ag$a.ag$a, this.invoke.ag$a);
        }
        this.valueOf = i3;
    }

    private void valueOf(int i) throws IOException {
        this.HaptikSDK$b.setLength(i);
        this.HaptikSDK$b.getChannel().force(true);
    }

    public void ah$a(valueOf valueof) throws IOException {
        synchronized (this) {
            int i = this.ag$a.ag$a;
            for (int i2 = 0; i2 < this.ah$a; i2++) {
                addRecyclerListener$ah$a ag$a = ag$a(i);
                valueof.toString(new values(ag$a), ag$a.toString);
                i = toString(ag$a.ag$a + 4 + ag$a.toString);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T valueOf(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public final class values extends InputStream {
        private int ag$a;
        private int ah$a;

        private values(addRecyclerListener$ah$a addrecyclerlistener_ah_a) {
            this.ah$a = addRecyclerListener.this.toString(addrecyclerlistener_ah_a.ag$a + 4);
            this.ag$a = addrecyclerlistener_ah_a.toString;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            addRecyclerListener.valueOf(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.ag$a;
            if (i3 > 0) {
                if (i2 > i3) {
                    i2 = i3;
                }
                addRecyclerListener.this.ah$a(this.ah$a, bArr, i, i2);
                this.ah$a = addRecyclerListener.this.toString(this.ah$a + i2);
                this.ag$a -= i2;
                return i2;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.ag$a == 0) {
                return -1;
            }
            addRecyclerListener.this.HaptikSDK$b.seek(this.ah$a);
            int read = addRecyclerListener.this.HaptikSDK$b.read();
            this.ah$a = addRecyclerListener.this.toString(this.ah$a + 1);
            this.ag$a--;
            return read;
        }
    }

    public void valueOf() throws IOException {
        synchronized (this) {
            if (ag$a()) {
                throw new NoSuchElementException();
            }
            if (this.ah$a == 1) {
                values();
            } else {
                int addrecyclerlistener = toString(this.ag$a.ag$a + 4 + this.ag$a.toString);
                ah$a(addrecyclerlistener, this.toString, 0, 4);
                int ah$a = ah$a(this.toString, 0);
                ah$a(this.valueOf, this.ah$a - 1, addrecyclerlistener, this.invoke.ag$a);
                this.ah$a--;
                this.ag$a = new addRecyclerListener$ah$a(addrecyclerlistener, ah$a);
            }
        }
    }

    public void values() throws IOException {
        synchronized (this) {
            ah$a(4096, 0, 0, 0);
            this.ah$a = 0;
            this.ag$a = addRecyclerListener$ah$a.valueOf;
            this.invoke = addRecyclerListener$ah$a.valueOf;
            if (this.valueOf > 4096) {
                valueOf(4096);
            }
            this.valueOf = 4096;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.HaptikSDK$b.close();
        }
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.valueOf);
        sb.append(", size=");
        sb.append(this.ah$a);
        sb.append(", first=");
        sb.append(this.ag$a);
        sb.append(", last=");
        sb.append(this.invoke);
        sb.append(", element lengths=[");
        try {
            ah$a(new valueOf() { // from class: o.addRecyclerListener.5
                boolean toString = true;

                @Override // o.addRecyclerListener.valueOf
                public void toString(InputStream inputStream, int i) throws IOException {
                    if (this.toString) {
                        this.toString = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e) {
            values.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
