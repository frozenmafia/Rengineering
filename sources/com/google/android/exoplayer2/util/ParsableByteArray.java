package com.google.android.exoplayer2.util;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import o.addUpdateOp;
/* loaded from: classes5.dex */
public final class ParsableByteArray {
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    public ParsableByteArray(int i) {
        this.data = new byte[i];
        this.limit = i;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
    }

    public void reset(int i) {
        reset(capacity() < i ? new byte[i] : this.data, i);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void reset(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
        this.position = 0;
    }

    public void ensureCapacity(int i) {
        if (i > capacity()) {
            this.data = Arrays.copyOf(this.data, i);
        }
    }

    public int bytesLeft() {
        return this.limit - this.position;
    }

    public int limit() {
        return this.limit;
    }

    public void setLimit(int i) {
        Assertions.checkArgument(i >= 0 && i <= this.data.length);
        this.limit = i;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int i) {
        Assertions.checkArgument(i >= 0 && i <= this.limit);
        this.position = i;
    }

    public byte[] getData() {
        return this.data;
    }

    public int capacity() {
        return this.data.length;
    }

    public void skipBytes(int i) {
        setPosition(this.position + i);
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i) {
        readBytes(parsableBitArray.data, 0, i);
        parsableBitArray.setPosition(0);
    }

    public void readBytes(byte[] bArr, int i, int i2) {
        System.arraycopy(this.data, this.position, bArr, i, i2);
        this.position += i2;
    }

    public void readBytes(ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.data, this.position, i);
        this.position += i;
    }

    public int peekUnsignedByte() {
        return this.data[this.position] & 255;
    }

    public char peekChar() {
        byte[] bArr = this.data;
        int i = this.position;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int readUnsignedByte() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & 255;
    }

    public int readUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b2 = bArr[i];
        this.position = i2 + 1;
        return (bArr[i2] & 255) | ((b2 & 255) << 8);
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b2 = bArr[i];
        this.position = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b2 & 255);
    }

    public short readShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b2 = bArr[i];
        this.position = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b2 & 255) << 8));
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b2 = bArr[i];
        this.position = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (b2 & 255));
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.position = i3;
        byte b3 = bArr[i2];
        this.position = i3 + 1;
        return (bArr[i3] & 255) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    public int readInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.position = i3;
        byte b3 = bArr[i2];
        this.position = i3 + 1;
        return (bArr[i3] & 255) | (((b2 & 255) << 24) >> 8) | ((b3 & 255) << 8);
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.position = i3;
        byte b3 = bArr[i2];
        this.position = i3 + 1;
        return ((bArr[i3] & 255) << 16) | (b2 & 255) | ((b3 & 255) << 8);
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.position = i3;
        byte b3 = bArr[i2];
        this.position = i3 + 1;
        return ((bArr[i3] & 255) << 16) | (b2 & 255) | ((b3 & 255) << 8);
    }

    public long readUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        long j = bArr[i];
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        this.position = i4;
        long j3 = bArr[i3];
        this.position = i4 + 1;
        return (bArr[i4] & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        long j = bArr[i];
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        this.position = i4;
        long j3 = bArr[i3];
        this.position = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public int readInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.position = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.position = i4;
        byte b4 = bArr[i3];
        this.position = i4 + 1;
        return (bArr[i4] & 255) | ((b2 & 255) << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8);
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.position = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.position = i4;
        byte b4 = bArr[i3];
        this.position = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b2 & 255) | ((b3 & 255) << 8) | ((b4 & 255) << 16);
    }

    public long readLong() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        long j = bArr[i];
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        this.position = i4;
        long j3 = bArr[i3];
        int i5 = i4 + 1;
        this.position = i5;
        long j4 = bArr[i4];
        int i6 = i5 + 1;
        this.position = i6;
        long j5 = bArr[i5];
        int i7 = i6 + 1;
        this.position = i7;
        long j6 = bArr[i6];
        int i8 = i7 + 1;
        this.position = i8;
        this.position = i8 + 1;
        return (255 & bArr[i8]) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((bArr[i7] & 255) << 8);
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        long j = bArr[i];
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        this.position = i4;
        long j3 = bArr[i3];
        int i5 = i4 + 1;
        this.position = i5;
        long j4 = bArr[i4];
        int i6 = i5 + 1;
        this.position = i6;
        long j5 = bArr[i5];
        int i7 = i6 + 1;
        this.position = i7;
        long j6 = bArr[i6];
        int i8 = i7 + 1;
        this.position = i8;
        this.position = i8 + 1;
        return ((255 & bArr[i8]) << 56) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((bArr[i7] & 255) << 48);
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.position = i3;
        byte b3 = bArr[i2];
        this.position = i3 + 2;
        return (b3 & 255) | ((b2 & 255) << 8);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedIntToInt() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new IllegalStateException("Top bit not zero: " + readInt);
    }

    public int readLittleEndianUnsignedIntToInt() {
        int readLittleEndianInt = readLittleEndianInt();
        if (readLittleEndianInt >= 0) {
            return readLittleEndianInt;
        }
        throw new IllegalStateException("Top bit not zero: " + readLittleEndianInt);
    }

    public long readUnsignedLongToLong() {
        long readLong = readLong();
        if (readLong >= 0) {
            return readLong;
        }
        throw new IllegalStateException("Top bit not zero: " + readLong);
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public String readString(int i) {
        return readString(i, addUpdateOp.HaptikSDK$a);
    }

    public String readString(int i, Charset charset) {
        String str = new String(this.data, this.position, i, charset);
        this.position += i;
        return str;
    }

    public String readNullTerminatedString(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.position;
        int i3 = (i2 + i) - 1;
        String fromUtf8Bytes = Util.fromUtf8Bytes(this.data, i2, (i3 >= this.limit || this.data[i3] != 0) ? i : i - 1);
        this.position += i;
        return fromUtf8Bytes;
    }

    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public String readDelimiterTerminatedString(char c) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.position;
        while (i < this.limit && this.data[i] != c) {
            i++;
        }
        byte[] bArr = this.data;
        int i2 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr, i2, i - i2);
        this.position = i;
        if (i < this.limit) {
            this.position = i + 1;
        }
        return fromUtf8Bytes;
    }

    public String readLine() {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.position;
        while (i < this.limit && !Util.isLinebreak(this.data[i])) {
            i++;
        }
        int i2 = this.position;
        if (i - i2 >= 3) {
            byte[] bArr = this.data;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.position = i2 + 3;
            }
        }
        byte[] bArr2 = this.data;
        int i3 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr2, i3, i - i3);
        this.position = i;
        int i4 = this.limit;
        if (i == i4) {
            return fromUtf8Bytes;
        }
        byte[] bArr3 = this.data;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.position = i5;
            if (i5 == i4) {
                return fromUtf8Bytes;
            }
        }
        int i6 = this.position;
        if (bArr3[i6] == 10) {
            this.position = i6 + 1;
        }
        return fromUtf8Bytes;
    }

    public long readUtf8EncodedLong() {
        int i;
        int i2;
        byte b2;
        int i3;
        long j = this.data[this.position];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i2 = 7 - i4;
            } else if (i4 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            if ((this.data[this.position + i] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (b2 & 63);
        }
        this.position += i2;
        return j;
    }
}
