package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import o.rotationXBy;
/* loaded from: classes3.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {
    private final rotationXBy ag$a;
    private volatile byte[] ah$a;
    private int invoke;
    private int toString;
    private int valueOf;
    private int values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    public RecyclableBufferedInputStream(InputStream inputStream, rotationXBy rotationxby) {
        this(inputStream, rotationxby, 65536);
    }

    RecyclableBufferedInputStream(InputStream inputStream, rotationXBy rotationxby, int i) {
        super(inputStream);
        this.valueOf = -1;
        this.ag$a = rotationxby;
        this.ah$a = (byte[]) rotationxby.ah$a(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i;
        int i2;
        int available;
        synchronized (this) {
            InputStream inputStream = this.in;
            if (this.ah$a == null || inputStream == null) {
                throw valueOf();
            }
            i = this.toString;
            i2 = this.invoke;
            available = inputStream.available();
        }
        return (i - i2) + available;
    }

    private static IOException valueOf() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public void ah$a() {
        synchronized (this) {
            this.values = this.ah$a.length;
        }
    }

    public void ag$a() {
        synchronized (this) {
            if (this.ah$a != null) {
                this.ag$a.ag$a(this.ah$a);
                this.ah$a = null;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.ah$a != null) {
            this.ag$a.ag$a(this.ah$a);
            this.ah$a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    private int valueOf(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.valueOf;
        if (i != -1) {
            int i2 = this.invoke;
            int i3 = this.values;
            if (i2 - i < i3) {
                if (i == 0 && i3 > bArr.length && this.toString == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.ag$a.ah$a(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.ah$a = bArr2;
                    this.ag$a.ag$a(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.invoke - this.valueOf;
                this.invoke = i4;
                this.valueOf = 0;
                this.toString = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.invoke;
                if (read > 0) {
                    i5 += read;
                }
                this.toString = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.valueOf = -1;
            this.invoke = 0;
            this.toString = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
            this.values = Math.max(this.values, i);
            this.valueOf = this.invoke;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        synchronized (this) {
            byte[] bArr = this.ah$a;
            InputStream inputStream = this.in;
            if (bArr == null || inputStream == null) {
                throw valueOf();
            }
            if (this.invoke < this.toString || valueOf(inputStream, bArr) != -1) {
                if (bArr != this.ah$a && (bArr = this.ah$a) == null) {
                    throw valueOf();
                }
                int i = this.toString;
                int i2 = this.invoke;
                if (i - i2 > 0) {
                    this.invoke = i2 + 1;
                    return bArr[i2] & 255;
                }
                return -1;
            }
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        synchronized (this) {
            byte[] bArr2 = this.ah$a;
            if (bArr2 == null) {
                throw valueOf();
            }
            if (i2 == 0) {
                return 0;
            }
            InputStream inputStream = this.in;
            if (inputStream == null) {
                throw valueOf();
            }
            int i5 = this.invoke;
            int i6 = this.toString;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.invoke += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.valueOf == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else if (valueOf(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                } else {
                    if (bArr2 != this.ah$a && (bArr2 = this.ah$a) == null) {
                        throw valueOf();
                    }
                    int i8 = this.toString;
                    int i9 = this.invoke;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.invoke += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        synchronized (this) {
            if (this.ah$a == null) {
                throw new IOException("Stream is closed");
            }
            int i = this.valueOf;
            if (-1 == i) {
                throw new InvalidMarkException("Mark has been invalidated, pos: " + this.invoke + " markLimit: " + this.values);
            }
            this.invoke = i;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        synchronized (this) {
            if (j < 1) {
                return 0L;
            }
            byte[] bArr = this.ah$a;
            if (bArr == null) {
                throw valueOf();
            }
            InputStream inputStream = this.in;
            if (inputStream == null) {
                throw valueOf();
            }
            int i = this.toString;
            int i2 = this.invoke;
            if (i - i2 >= j) {
                this.invoke = (int) (i2 + j);
                return j;
            }
            long j2 = i - i2;
            this.invoke = i;
            if (this.valueOf != -1 && j <= this.values) {
                if (valueOf(inputStream, bArr) == -1) {
                    return j2;
                }
                int i3 = this.toString;
                int i4 = this.invoke;
                if (i3 - i4 >= j - j2) {
                    this.invoke = (int) ((i4 + j) - j2);
                    return j;
                }
                long j3 = i3;
                long j4 = i4;
                this.invoke = i3;
                return (j2 + j3) - j4;
            }
            long skip = inputStream.skip(j - j2);
            if (skip > 0) {
                this.valueOf = -1;
            }
            return j2 + skip;
        }
    }

    /* loaded from: classes3.dex */
    static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        InvalidMarkException(String str) {
            super(str);
        }
    }
}
