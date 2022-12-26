package o;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes7.dex */
public class swapAdapter extends Reader {
    private List<String> ah$b;
    private boolean ah$a = false;
    private int valueOf;
    private int values = this.valueOf;
    private int HaptikSDK$a;
    private int toString = this.HaptikSDK$a;
    private boolean ag$a = false;

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    public swapAdapter() {
        this.ah$b = null;
        this.ah$b = new ArrayList();
    }

    public void toString(String str) {
        if (this.ag$a) {
            throw new IllegalStateException("Trying to add string after reading");
        }
        if (str.length() > 0) {
            this.ah$b.add(str);
        }
    }

    public void valueOf() {
        if (this.ag$a) {
            throw new IllegalStateException("Trying to freeze frozen StringListReader");
        }
        this.ag$a = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.ah$b) {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        this.valueOf = this.values;
        this.HaptikSDK$a = this.toString;
    }

    private String values() {
        if (this.HaptikSDK$a < this.ah$b.size()) {
            return this.ah$b.get(this.HaptikSDK$a);
        }
        return null;
    }

    private int ah$a() {
        String values = values();
        if (values == null) {
            return 0;
        }
        return values.length() - this.valueOf;
    }

    private void ag$a() throws IOException {
        if (this.ah$a) {
            throw new IOException("Stream already closed");
        }
        if (!this.ag$a) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    private long toString(long j) {
        long j2 = 0;
        while (this.HaptikSDK$a < this.ah$b.size() && j2 < j) {
            long j3 = j - j2;
            long ah$a = ah$a();
            if (j3 < ah$a) {
                this.valueOf = (int) (this.valueOf + j3);
                j2 += j3;
            } else {
                j2 += ah$a;
                this.valueOf = 0;
                this.HaptikSDK$a++;
            }
        }
        return j2;
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws IOException {
        ag$a();
        int remaining = charBuffer.remaining();
        String values = values();
        int i = 0;
        while (remaining > 0 && values != null) {
            int min = Math.min(values.length() - this.valueOf, remaining);
            int i2 = this.valueOf;
            charBuffer.put(this.ah$b.get(this.HaptikSDK$a), i2, i2 + min);
            remaining -= min;
            i += min;
            toString(min);
            values = values();
        }
        if (i > 0 || values != null) {
            return i;
        }
        return -1;
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        ag$a();
        String values = values();
        if (values == null) {
            return -1;
        }
        char charAt = values.charAt(this.valueOf);
        toString(1L);
        return charAt;
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        ag$a();
        return toString(j);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        ag$a();
        return true;
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
        ag$a();
        this.values = this.valueOf;
        this.toString = this.HaptikSDK$a;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        ag$a();
        String values = values();
        int i3 = 0;
        while (values != null && i3 < i2) {
            int min = Math.min(ah$a(), i2 - i3);
            int i4 = this.valueOf;
            values.getChars(i4, i4 + min, cArr, i + i3);
            i3 += min;
            toString(min);
            values = values();
        }
        if (i3 > 0 || values != null) {
            return i3;
        }
        return -1;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ag$a();
        this.ah$a = true;
    }
}
