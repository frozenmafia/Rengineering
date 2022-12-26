package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public final class bx extends FilterInputStream {
    private long[] AFInAppEventParameterName;
    private short AFInAppEventType;
    private long[] AFKeystoreWrapper;
    private int AppsFlyer2dXConversionCallback;
    private int getLevel;
    private int init;
    private byte[] valueOf;
    private final int values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public bx(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        super(inputStream);
        this.init = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.values = min;
        this.valueOf = new byte[min];
        this.AFKeystoreWrapper = new long[4];
        this.AFInAppEventParameterName = new long[4];
        this.AppsFlyer2dXConversionCallback = min;
        this.getLevel = min;
        this.AFKeystoreWrapper = ca.values(i ^ i4, min ^ i4);
        this.AFInAppEventParameterName = ca.values(i2 ^ i4, i3 ^ i4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventType();
        int i = this.AppsFlyer2dXConversionCallback;
        if (i >= this.getLevel) {
            return -1;
        }
        byte[] bArr = this.valueOf;
        this.AppsFlyer2dXConversionCallback = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFInAppEventType();
            int i5 = this.AppsFlyer2dXConversionCallback;
            if (i5 >= this.getLevel) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.valueOf;
            this.AppsFlyer2dXConversionCallback = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFInAppEventType();
        return this.getLevel - this.AppsFlyer2dXConversionCallback;
    }

    private void AFInAppEventParameterName() {
        long[] jArr = this.AFKeystoreWrapper;
        long[] jArr2 = this.AFInAppEventParameterName;
        short s = this.AFInAppEventType;
        long j = jArr[s % 4];
        int i = (s + 2) % 4;
        long j2 = jArr2[i];
        int i2 = (s + 3) % 4;
        jArr2[i2] = ((jArr[i2] * 2147483085) + jArr2[i]) / 2147483647L;
        jArr[i2] = ((j * 2147483085) + j2) % 2147483647L;
        for (int i3 = 0; i3 < this.values; i3++) {
            byte[] bArr = this.valueOf;
            bArr[i3] = (byte) (bArr[i3] ^ ((this.AFKeystoreWrapper[this.AFInAppEventType] >> (i3 << 3)) & 255));
        }
        this.AFInAppEventType = (short) ((this.AFInAppEventType + 1) % 4);
    }

    private int AFInAppEventType() throws IOException {
        int i;
        if (this.init == Integer.MAX_VALUE) {
            this.init = ((FilterInputStream) this).in.read();
        }
        if (this.AppsFlyer2dXConversionCallback == this.values) {
            byte[] bArr = this.valueOf;
            int i2 = this.init;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.valueOf, i3, this.values - i3);
                if (read <= 0) {
                    break;
                }
                i3 += read;
            } while (i3 < this.values);
            if (i3 < this.values) {
                throw new IllegalStateException("unexpected block size");
            }
            AFInAppEventParameterName();
            int read2 = ((FilterInputStream) this).in.read();
            this.init = read2;
            this.AppsFlyer2dXConversionCallback = 0;
            if (read2 < 0) {
                int i4 = this.values;
                i = i4 - (this.valueOf[i4 - 1] & 255);
            } else {
                i = this.values;
            }
            this.getLevel = i;
        }
        return this.getLevel;
    }
}
