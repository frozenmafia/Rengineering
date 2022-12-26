package o;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
/* loaded from: classes6.dex */
public final class onReset extends Writer {
    private OutputStream ag$a;
    private final onStopLoading ah$a;
    private int invoke;
    private int toString;
    private byte[] valueOf;
    private final int values;

    public onReset(onStopLoading onstoploading, OutputStream outputStream) {
        this.ah$a = onstoploading;
        this.ag$a = outputStream;
        byte[] ah$a = onstoploading.ah$a();
        this.valueOf = ah$a;
        this.values = ah$a.length - 4;
        this.toString = 0;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.ag$a;
        if (outputStream != null) {
            int i = this.toString;
            if (i > 0) {
                outputStream.write(this.valueOf, 0, i);
                this.toString = 0;
            }
            OutputStream outputStream2 = this.ag$a;
            this.ag$a = null;
            byte[] bArr = this.valueOf;
            if (bArr != null) {
                this.valueOf = null;
                this.ah$a.values(bArr);
            }
            outputStream2.close();
            int i2 = this.invoke;
            this.invoke = 0;
            if (i2 > 0) {
                ah$a(i2);
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.ag$a;
        if (outputStream != null) {
            int i = this.toString;
            if (i > 0) {
                outputStream.write(this.valueOf, 0, i);
                this.toString = 0;
            }
            this.ag$a.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write(cArr[i]);
                return;
            }
            return;
        }
        if (this.invoke > 0) {
            i2--;
            write(values(cArr[i]));
            i++;
        }
        int i3 = this.toString;
        byte[] bArr = this.valueOf;
        int i4 = this.values;
        int i5 = i2 + i;
        while (i < i5) {
            if (i3 >= i4) {
                this.ag$a.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            char c = cArr[i];
            if (c < 128) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) c;
                int i8 = i5 - i6;
                int i9 = i4 - i7;
                int i10 = i8 > i9 ? i9 : i8;
                i = i6;
                i3 = i7;
                while (i < i10 + i6) {
                    int i11 = i + 1;
                    c = cArr[i];
                    if (c >= 128) {
                        i6 = i11;
                    } else {
                        bArr[i3] = (byte) c;
                        i = i11;
                        i3++;
                    }
                }
                continue;
            }
            if (c < 2048) {
                int i12 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 = i12 + 1;
                bArr[i12] = (byte) ((c & '?') | 128);
            } else if (c < 55296 || c > 57343) {
                int i13 = i3 + 1;
                bArr[i3] = (byte) ((c >> '\f') | 224);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((c >> 6) & 63) | 128);
                bArr[i14] = (byte) ((c & '?') | 128);
                i3 = i14 + 1;
            } else {
                if (c > 56319) {
                    this.toString = i3;
                    ah$a(c);
                }
                this.invoke = c;
                if (i6 >= i5) {
                    break;
                }
                i = i6 + 1;
                int values = values(cArr[i6]);
                if (values > 1114111) {
                    this.toString = i3;
                    ah$a(values);
                }
                int i15 = i3 + 1;
                bArr[i3] = (byte) ((values >> 18) | 240);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((values >> 12) & 63) | 128);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((values >> 6) & 63) | 128);
                i3 = i17 + 1;
                bArr[i17] = (byte) ((values & 63) | 128);
            }
            i = i6;
        }
        this.toString = i3;
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        int i2;
        if (this.invoke > 0) {
            i = values(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                ah$a(i);
            }
            this.invoke = i;
            return;
        }
        int i3 = this.toString;
        if (i3 >= this.values) {
            this.ag$a.write(this.valueOf, 0, i3);
            this.toString = 0;
        }
        if (i < 128) {
            byte[] bArr = this.valueOf;
            int i4 = this.toString;
            this.toString = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this.toString;
        if (i < 2048) {
            byte[] bArr2 = this.valueOf;
            int i6 = i5 + 1;
            bArr2[i5] = (byte) ((i >> 6) | 192);
            i2 = i6 + 1;
            bArr2[i6] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.valueOf;
            int i7 = i5 + 1;
            bArr3[i5] = (byte) ((i >> 12) | 224);
            int i8 = i7 + 1;
            bArr3[i7] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i8] = (byte) ((i & 63) | 128);
            i2 = i8 + 1;
        } else {
            if (i > 1114111) {
                ah$a(i);
            }
            byte[] bArr4 = this.valueOf;
            int i9 = i5 + 1;
            bArr4[i5] = (byte) ((i >> 18) | 240);
            int i10 = i9 + 1;
            bArr4[i9] = (byte) (((i >> 12) & 63) | 128);
            int i11 = i10 + 1;
            bArr4[i10] = (byte) (((i >> 6) & 63) | 128);
            i2 = i11 + 1;
            bArr4[i11] = (byte) ((i & 63) | 128);
        }
        this.toString = i2;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write(str.charAt(i));
                return;
            }
            return;
        }
        if (this.invoke > 0) {
            i2--;
            write(values(str.charAt(i)));
            i++;
        }
        int i3 = this.toString;
        byte[] bArr = this.valueOf;
        int i4 = this.values;
        int i5 = i2 + i;
        while (i < i5) {
            if (i3 >= i4) {
                this.ag$a.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) charAt;
                int i8 = i5 - i6;
                int i9 = i4 - i7;
                int i10 = i8 > i9 ? i9 : i8;
                i = i6;
                i3 = i7;
                while (i < i10 + i6) {
                    int i11 = i + 1;
                    charAt = str.charAt(i);
                    if (charAt >= 128) {
                        i6 = i11;
                    } else {
                        bArr[i3] = (byte) charAt;
                        i = i11;
                        i3++;
                    }
                }
                continue;
            }
            if (charAt < 2048) {
                int i12 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i3 = i12 + 1;
                bArr[i12] = (byte) ((charAt & '?') | 128);
            } else if (charAt < 55296 || charAt > 57343) {
                int i13 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> '\f') | 224);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((charAt >> 6) & 63) | 128);
                bArr[i14] = (byte) ((charAt & '?') | 128);
                i3 = i14 + 1;
            } else {
                if (charAt > 56319) {
                    this.toString = i3;
                    ah$a(charAt);
                }
                this.invoke = charAt;
                if (i6 >= i5) {
                    break;
                }
                i = i6 + 1;
                int values = values(str.charAt(i6));
                if (values > 1114111) {
                    this.toString = i3;
                    ah$a(values);
                }
                int i15 = i3 + 1;
                bArr[i3] = (byte) ((values >> 18) | 240);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((values >> 12) & 63) | 128);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((values >> 6) & 63) | 128);
                i3 = i17 + 1;
                bArr[i17] = (byte) ((values & 63) | 128);
            }
            i = i6;
        }
        this.toString = i3;
    }

    protected int values(int i) throws IOException {
        int i2 = this.invoke;
        this.invoke = 0;
        if (i < 56320 || i > 57343) {
            throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i) + "; illegal combination");
        }
        return ((i2 - 55296) << 10) + 65536 + (i - 56320);
    }

    protected static void ah$a(int i) throws IOException {
        throw new IOException(toString(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String toString(int i) {
        if (i > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627";
        } else if (i < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output";
        } else if (i <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")";
        } else {
            return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")";
        }
    }
}
