package com.google.common.hash;

import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.ChildHelper;
import o.ConcatAdapter;
import o.countOnesBefore;
import o.onEnteredHiddenState;
/* loaded from: classes7.dex */
final class Murmur3_128HashFunction extends onEnteredHiddenState implements Serializable {
    private static final long serialVersionUID = 0;
    private final int seed;
    static final ChildHelper.Callback MURMUR3_128 = new Murmur3_128HashFunction(0);
    static final ChildHelper.Callback GOOD_FAST_HASH_128 = new Murmur3_128HashFunction(Hashing.valueOf);

    public int bits() {
        return 128;
    }

    Murmur3_128HashFunction(int i) {
        this.seed = i;
    }

    @Override // o.ChildHelper.Callback
    public ConcatAdapter newHasher() {
        final int i = this.seed;
        return new countOnesBefore(i) { // from class: com.google.common.hash.Murmur3_128HashFunction$ag$a
            private long ag$a;
            private long ah$a;
            private int toString;

            private static long toString(long j) {
                long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
                long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
                return j3 ^ (j3 >>> 33);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(16);
                long j = i;
                this.ag$a = j;
                this.ah$a = j;
                this.toString = 0;
            }

            @Override // o.countOnesBefore
            public void valueOf(ByteBuffer byteBuffer) {
                ag$a(byteBuffer.getLong(), byteBuffer.getLong());
                this.toString += 16;
            }

            private void ag$a(long j, long j2) {
                long values = values(j) ^ this.ag$a;
                this.ag$a = values;
                long rotateLeft = Long.rotateLeft(values, 27);
                this.ag$a = rotateLeft;
                long j3 = this.ah$a;
                long j4 = rotateLeft + j3;
                this.ag$a = j4;
                this.ag$a = (j4 * 5) + 1390208809;
                long ah$a = ah$a(j2) ^ j3;
                this.ah$a = ah$a;
                long rotateLeft2 = Long.rotateLeft(ah$a, 31);
                this.ah$a = rotateLeft2;
                long j5 = rotateLeft2 + this.ag$a;
                this.ah$a = j5;
                this.ah$a = (j5 * 5) + 944331445;
            }

            @Override // o.countOnesBefore
            public void ag$a(ByteBuffer byteBuffer) {
                long j;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long unsignedBytes;
                long j7;
                long j8;
                long j9;
                long j10;
                long j11;
                long j12;
                long j13;
                this.toString += byteBuffer.remaining();
                long j14 = 0;
                switch (byteBuffer.remaining()) {
                    case 1:
                        j = 0;
                        unsignedBytes = UnsignedBytes.toString(byteBuffer.get(0)) ^ j;
                        this.ag$a ^= values(unsignedBytes);
                        this.ah$a ^= ah$a(j14);
                        return;
                    case 2:
                        j2 = 0;
                        j = j2 ^ (UnsignedBytes.toString(byteBuffer.get(1)) << 8);
                        unsignedBytes = UnsignedBytes.toString(byteBuffer.get(0)) ^ j;
                        this.ag$a ^= values(unsignedBytes);
                        this.ah$a ^= ah$a(j14);
                        return;
                    case 3:
                        j3 = 0;
                        j2 = j3 ^ (UnsignedBytes.toString(byteBuffer.get(2)) << 16);
                        j = j2 ^ (UnsignedBytes.toString(byteBuffer.get(1)) << 8);
                        unsignedBytes = UnsignedBytes.toString(byteBuffer.get(0)) ^ j;
                        this.ag$a ^= values(unsignedBytes);
                        this.ah$a ^= ah$a(j14);
                        return;
                    case 4:
                        j4 = 0;
                        j3 = j4 ^ (UnsignedBytes.toString(byteBuffer.get(3)) << 24);
                        j2 = j3 ^ (UnsignedBytes.toString(byteBuffer.get(2)) << 16);
                        j = j2 ^ (UnsignedBytes.toString(byteBuffer.get(1)) << 8);
                        unsignedBytes = UnsignedBytes.toString(byteBuffer.get(0)) ^ j;
                        this.ag$a ^= values(unsignedBytes);
                        this.ah$a ^= ah$a(j14);
                        return;
                    case 5:
                        j5 = 0;
                        j4 = j5 ^ (UnsignedBytes.toString(byteBuffer.get(4)) << 32);
                        j3 = j4 ^ (UnsignedBytes.toString(byteBuffer.get(3)) << 24);
                        j2 = j3 ^ (UnsignedBytes.toString(byteBuffer.get(2)) << 16);
                        j = j2 ^ (UnsignedBytes.toString(byteBuffer.get(1)) << 8);
                        unsignedBytes = UnsignedBytes.toString(byteBuffer.get(0)) ^ j;
                        this.ag$a ^= values(unsignedBytes);
                        this.ah$a ^= ah$a(j14);
                        return;
                    case 6:
                        j6 = 0;
                        j5 = (UnsignedBytes.toString(byteBuffer.get(5)) << 40) ^ j6;
                        j4 = j5 ^ (UnsignedBytes.toString(byteBuffer.get(4)) << 32);
                        j3 = j4 ^ (UnsignedBytes.toString(byteBuffer.get(3)) << 24);
                        j2 = j3 ^ (UnsignedBytes.toString(byteBuffer.get(2)) << 16);
                        j = j2 ^ (UnsignedBytes.toString(byteBuffer.get(1)) << 8);
                        unsignedBytes = UnsignedBytes.toString(byteBuffer.get(0)) ^ j;
                        this.ag$a ^= values(unsignedBytes);
                        this.ah$a ^= ah$a(j14);
                        return;
                    case 7:
                        j6 = (UnsignedBytes.toString(byteBuffer.get(6)) << 48) ^ 0;
                        j5 = (UnsignedBytes.toString(byteBuffer.get(5)) << 40) ^ j6;
                        j4 = j5 ^ (UnsignedBytes.toString(byteBuffer.get(4)) << 32);
                        j3 = j4 ^ (UnsignedBytes.toString(byteBuffer.get(3)) << 24);
                        j2 = j3 ^ (UnsignedBytes.toString(byteBuffer.get(2)) << 16);
                        j = j2 ^ (UnsignedBytes.toString(byteBuffer.get(1)) << 8);
                        unsignedBytes = UnsignedBytes.toString(byteBuffer.get(0)) ^ j;
                        this.ag$a ^= values(unsignedBytes);
                        this.ah$a ^= ah$a(j14);
                        return;
                    case 8:
                        j7 = 0;
                        unsignedBytes = byteBuffer.getLong() ^ 0;
                        j14 = j7;
                        this.ag$a ^= values(unsignedBytes);
                        this.ah$a ^= ah$a(j14);
                        return;
                    case 9:
                        j8 = 0;
                        j7 = j8 ^ UnsignedBytes.toString(byteBuffer.get(8));
                        unsignedBytes = byteBuffer.getLong() ^ 0;
                        j14 = j7;
                        this.ag$a ^= values(unsignedBytes);
                        this.ah$a ^= ah$a(j14);
                        return;
                    case 10:
                        j9 = 0;
                        j8 = j9 ^ (UnsignedBytes.toString(byteBuffer.get(9)) << 8);
                        j7 = j8 ^ UnsignedBytes.toString(byteBuffer.get(8));
                        unsignedBytes = byteBuffer.getLong() ^ 0;
                        j14 = j7;
                        this.ag$a ^= values(unsignedBytes);
                        this.ah$a ^= ah$a(j14);
                        return;
                    case 11:
                        j10 = 0;
                        j9 = j10 ^ (UnsignedBytes.toString(byteBuffer.get(10)) << 16);
                        j8 = j9 ^ (UnsignedBytes.toString(byteBuffer.get(9)) << 8);
                        j7 = j8 ^ UnsignedBytes.toString(byteBuffer.get(8));
                        unsignedBytes = byteBuffer.getLong() ^ 0;
                        j14 = j7;
                        this.ag$a ^= values(unsignedBytes);
                        this.ah$a ^= ah$a(j14);
                        return;
                    case 12:
                        j11 = 0;
                        j10 = j11 ^ (UnsignedBytes.toString(byteBuffer.get(11)) << 24);
                        j9 = j10 ^ (UnsignedBytes.toString(byteBuffer.get(10)) << 16);
                        j8 = j9 ^ (UnsignedBytes.toString(byteBuffer.get(9)) << 8);
                        j7 = j8 ^ UnsignedBytes.toString(byteBuffer.get(8));
                        unsignedBytes = byteBuffer.getLong() ^ 0;
                        j14 = j7;
                        this.ag$a ^= values(unsignedBytes);
                        this.ah$a ^= ah$a(j14);
                        return;
                    case 13:
                        j12 = 0;
                        j11 = j12 ^ (UnsignedBytes.toString(byteBuffer.get(12)) << 32);
                        j10 = j11 ^ (UnsignedBytes.toString(byteBuffer.get(11)) << 24);
                        j9 = j10 ^ (UnsignedBytes.toString(byteBuffer.get(10)) << 16);
                        j8 = j9 ^ (UnsignedBytes.toString(byteBuffer.get(9)) << 8);
                        j7 = j8 ^ UnsignedBytes.toString(byteBuffer.get(8));
                        unsignedBytes = byteBuffer.getLong() ^ 0;
                        j14 = j7;
                        this.ag$a ^= values(unsignedBytes);
                        this.ah$a ^= ah$a(j14);
                        return;
                    case 14:
                        j13 = 0;
                        j12 = (UnsignedBytes.toString(byteBuffer.get(13)) << 40) ^ j13;
                        j11 = j12 ^ (UnsignedBytes.toString(byteBuffer.get(12)) << 32);
                        j10 = j11 ^ (UnsignedBytes.toString(byteBuffer.get(11)) << 24);
                        j9 = j10 ^ (UnsignedBytes.toString(byteBuffer.get(10)) << 16);
                        j8 = j9 ^ (UnsignedBytes.toString(byteBuffer.get(9)) << 8);
                        j7 = j8 ^ UnsignedBytes.toString(byteBuffer.get(8));
                        unsignedBytes = byteBuffer.getLong() ^ 0;
                        j14 = j7;
                        this.ag$a ^= values(unsignedBytes);
                        this.ah$a ^= ah$a(j14);
                        return;
                    case 15:
                        j13 = (UnsignedBytes.toString(byteBuffer.get(14)) << 48) ^ 0;
                        j12 = (UnsignedBytes.toString(byteBuffer.get(13)) << 40) ^ j13;
                        j11 = j12 ^ (UnsignedBytes.toString(byteBuffer.get(12)) << 32);
                        j10 = j11 ^ (UnsignedBytes.toString(byteBuffer.get(11)) << 24);
                        j9 = j10 ^ (UnsignedBytes.toString(byteBuffer.get(10)) << 16);
                        j8 = j9 ^ (UnsignedBytes.toString(byteBuffer.get(9)) << 8);
                        j7 = j8 ^ UnsignedBytes.toString(byteBuffer.get(8));
                        unsignedBytes = byteBuffer.getLong() ^ 0;
                        j14 = j7;
                        this.ag$a ^= values(unsignedBytes);
                        this.ah$a ^= ah$a(j14);
                        return;
                    default:
                        throw new AssertionError("Should never get here.");
                }
            }

            @Override // o.countOnesBefore
            public HashCode ah$a() {
                long j = this.ag$a;
                long j2 = this.toString;
                long j3 = j ^ j2;
                this.ag$a = j3;
                long j4 = j2 ^ this.ah$a;
                this.ah$a = j4;
                long j5 = j3 + j4;
                this.ag$a = j5;
                this.ah$a = j4 + j5;
                this.ag$a = toString(j5);
                long murmur3_128HashFunction$ag$a = toString(this.ah$a);
                this.ah$a = murmur3_128HashFunction$ag$a;
                long j6 = this.ag$a + murmur3_128HashFunction$ag$a;
                this.ag$a = j6;
                this.ah$a = murmur3_128HashFunction$ag$a + j6;
                return HashCode.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.ag$a).putLong(this.ah$a).array());
            }

            private static long values(long j) {
                return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
            }

            private static long ah$a(long j) {
                return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
            }
        };
    }

    public String toString() {
        int i = this.seed;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Hashing.murmur3_128(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Murmur3_128HashFunction) && this.seed == ((Murmur3_128HashFunction) obj).seed;
    }

    public int hashCode() {
        return getClass().hashCode() ^ this.seed;
    }
}
