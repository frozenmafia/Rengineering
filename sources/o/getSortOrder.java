package o;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
/* loaded from: classes6.dex */
public class getSortOrder extends Reader {
    protected InputStream HaptikSDK$a;
    protected int HaptikSDK$b;
    protected final boolean HaptikSDK$c;
    protected char[] HaptikSDK$d;
    protected int ag$a;
    protected int ah$a;
    protected int ah$b;
    protected char invoke = 0;
    protected byte[] toString;
    protected final boolean valueOf;
    protected final onStopLoading values;

    public getSortOrder(onStopLoading onstoploading, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this.values = onstoploading;
        this.HaptikSDK$a = inputStream;
        this.toString = bArr;
        this.ah$b = i;
        this.HaptikSDK$b = i2;
        this.valueOf = z;
        this.HaptikSDK$c = inputStream != null;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.HaptikSDK$a;
        if (inputStream != null) {
            this.HaptikSDK$a = null;
            ah$a();
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this.HaptikSDK$d == null) {
            this.HaptikSDK$d = new char[1];
        }
        if (read(this.HaptikSDK$d, 0, 1) < 1) {
            return -1;
        }
        return this.HaptikSDK$d[0];
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.toString == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            valueOf(cArr, i, i2);
        }
        int i7 = i2 + i;
        char c = this.invoke;
        if (c != 0) {
            i3 = i + 1;
            cArr[i] = c;
            this.invoke = (char) 0;
        } else {
            int i8 = this.HaptikSDK$b - this.ah$b;
            if (i8 < 4 && !ag$a(i8)) {
                if (i8 == 0) {
                    return -1;
                }
                toString(this.HaptikSDK$b - this.ah$b, 4);
            }
            i3 = i;
        }
        int i9 = this.HaptikSDK$b;
        while (i3 < i7) {
            int i10 = this.ah$b;
            if (this.valueOf) {
                byte[] bArr = this.toString;
                i4 = (bArr[i10] << 8) | (bArr[i10 + 1] & 255);
                i5 = (bArr[i10 + 3] & 255) | ((bArr[i10 + 2] & 255) << 8);
            } else {
                byte[] bArr2 = this.toString;
                int i11 = (bArr2[i10] & 255) | ((bArr2[i10 + 1] & 255) << 8);
                i4 = (bArr2[i10 + 3] << 8) | (bArr2[i10 + 2] & 255);
                i5 = i11;
            }
            this.ah$b = i10 + 4;
            if (i4 != 0) {
                int i12 = 65535 & i4;
                int i13 = i5 | ((i12 - 1) << 16);
                if (i12 > 16) {
                    toString(i13, i3 - i, String.format(" (above 0x%08x)", 1114111));
                }
                i6 = i3 + 1;
                cArr[i3] = (char) ((i13 >> 10) + 55296);
                if (i6 >= i7) {
                    this.invoke = (char) i13;
                    i3 = i6;
                    break;
                }
                i5 = (i13 & AnalyticsListener.EVENT_DRM_KEYS_LOADED) | 56320;
                i3 = i6;
            }
            i6 = i3 + 1;
            cArr[i3] = (char) i5;
            if (this.ah$b > i9 - 4) {
                i3 = i6;
                break;
            }
            i3 = i6;
        }
        int i14 = i3 - i;
        this.ah$a += i14;
        return i14;
    }

    private void toString(int i, int i2) throws IOException {
        int i3 = this.ag$a;
        int i4 = this.ah$a;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + i4 + ", byte #" + (i3 + i) + ")");
    }

    private void toString(int i, int i2, String str) throws IOException {
        int i3 = this.ag$a;
        int i4 = this.ah$b;
        int i5 = this.ah$a;
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid UTF-32 character 0x");
        sb.append(Integer.toHexString(i));
        sb.append(str);
        sb.append(" at char #");
        sb.append(i5 + i2);
        sb.append(", byte #");
        sb.append((i3 + i4) - 1);
        sb.append(")");
        throw new CharConversionException(sb.toString());
    }

    private boolean ag$a(int i) throws IOException {
        int read;
        this.ag$a += this.HaptikSDK$b - i;
        if (i > 0) {
            int i2 = this.ah$b;
            if (i2 > 0) {
                byte[] bArr = this.toString;
                System.arraycopy(bArr, i2, bArr, 0, i);
                this.ah$b = 0;
            }
            this.HaptikSDK$b = i;
        } else {
            this.ah$b = 0;
            InputStream inputStream = this.HaptikSDK$a;
            int read2 = inputStream == null ? -1 : inputStream.read(this.toString);
            if (read2 < 1) {
                this.HaptikSDK$b = 0;
                if (read2 < 0) {
                    if (this.HaptikSDK$c) {
                        ah$a();
                    }
                    return false;
                }
                ag$a();
            }
            this.HaptikSDK$b = read2;
        }
        while (true) {
            int i3 = this.HaptikSDK$b;
            if (i3 >= 4) {
                return true;
            }
            InputStream inputStream2 = this.HaptikSDK$a;
            if (inputStream2 == null) {
                read = -1;
            } else {
                byte[] bArr2 = this.toString;
                read = inputStream2.read(bArr2, i3, bArr2.length - i3);
            }
            if (read < 1) {
                if (read < 0) {
                    if (this.HaptikSDK$c) {
                        ah$a();
                    }
                    toString(this.HaptikSDK$b, 4);
                }
                ag$a();
            }
            this.HaptikSDK$b += read;
        }
    }

    private void ah$a() {
        byte[] bArr = this.toString;
        if (bArr != null) {
            this.toString = null;
            this.values.valueOf(bArr);
        }
    }

    private void valueOf(char[] cArr, int i, int i2) throws IOException {
        throw new ArrayIndexOutOfBoundsException("read(buf," + i + "," + i2 + "), cbuf[" + cArr.length + "]");
    }

    private void ag$a() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }
}
