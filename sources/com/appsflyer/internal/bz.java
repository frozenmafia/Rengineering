package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes6.dex */
public final class bz extends FilterInputStream {
    private static final short valueOf = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] AFInAppEventParameterName;
    private int AFInAppEventType;
    private byte[] AFKeystoreWrapper;
    private int AFLogger$LogLevel;
    private int AFVersionDeclaration;
    private int AppsFlyer2dXConversionCallback;
    private int getLevel;
    private int init;
    private int onAppOpenAttributionNative;
    private int onAttributionFailureNative;
    private int onDeepLinkingNative;
    private byte[] values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public bz(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        super(inputStream);
        this.AppsFlyer2dXConversionCallback = Integer.MAX_VALUE;
        this.AFKeystoreWrapper = new byte[8];
        this.AFInAppEventParameterName = new byte[8];
        this.values = new byte[8];
        this.AFInAppEventType = 8;
        this.init = 8;
        this.getLevel = Math.min(Math.max(i2, 5), 16);
        this.AFLogger$LogLevel = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.AFInAppEventParameterName, 0, 8);
        }
        long j = ((iArr[0] & 4294967295L) << 32) | (4294967295L & iArr[1]);
        if (i != 0) {
            int i4 = (int) j;
            this.AFVersionDeclaration = i4;
            this.onDeepLinkingNative = i4 * i;
            this.onAttributionFailureNative = i4 ^ i;
            this.onAppOpenAttributionNative = (int) (j >> 32);
            return;
        }
        this.AFVersionDeclaration = (int) j;
        long j2 = j >> 3;
        long j3 = valueOf;
        this.onDeepLinkingNative = (int) ((j3 * j2) >> 32);
        this.onAttributionFailureNative = (int) (j >> 32);
        this.onAppOpenAttributionNative = (int) (j2 + j3);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        values();
        int i = this.AFInAppEventType;
        if (i >= this.init) {
            return -1;
        }
        byte[] bArr = this.AFKeystoreWrapper;
        this.AFInAppEventType = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            values();
            int i5 = this.AFInAppEventType;
            if (i5 >= this.init) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.AFKeystoreWrapper;
            this.AFInAppEventType = i5 + 1;
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
        values();
        return this.init - this.AFInAppEventType;
    }

    private void AFInAppEventParameterName() {
        if (this.AFLogger$LogLevel == 3) {
            byte[] bArr = this.AFKeystoreWrapper;
            System.arraycopy(bArr, 0, this.values, 0, bArr.length);
        }
        byte[] bArr2 = this.AFKeystoreWrapper;
        int i = ((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.getLevel;
            if (i3 >= i4) {
                break;
            }
            int i5 = (i4 - i3) * valueOf;
            i2 -= ((i5 + i) ^ ((i << 4) + this.onAttributionFailureNative)) ^ ((i >>> 5) + this.onAppOpenAttributionNative);
            i -= (((i2 << 4) + this.AFVersionDeclaration) ^ (i5 + i2)) ^ ((i2 >>> 5) + this.onDeepLinkingNative);
            i3++;
        }
        byte[] bArr3 = this.AFKeystoreWrapper;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.AFLogger$LogLevel == 3) {
            for (int i6 = 0; i6 < 8; i6++) {
                byte[] bArr4 = this.AFKeystoreWrapper;
                bArr4[i6] = (byte) (bArr4[i6] ^ this.AFInAppEventParameterName[i6]);
            }
            byte[] bArr5 = this.values;
            System.arraycopy(bArr5, 0, this.AFInAppEventParameterName, 0, bArr5.length);
        }
    }

    private int values() throws IOException {
        if (this.AppsFlyer2dXConversionCallback == Integer.MAX_VALUE) {
            this.AppsFlyer2dXConversionCallback = ((FilterInputStream) this).in.read();
        }
        if (this.AFInAppEventType == 8) {
            byte[] bArr = this.AFKeystoreWrapper;
            int i = this.AppsFlyer2dXConversionCallback;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.AFKeystoreWrapper, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            AFInAppEventParameterName();
            int read2 = ((FilterInputStream) this).in.read();
            this.AppsFlyer2dXConversionCallback = read2;
            this.AFInAppEventType = 0;
            this.init = read2 < 0 ? 8 - (this.AFKeystoreWrapper[7] & 255) : 8;
        }
        return this.init;
    }
}
