package com.google.common.hash;

import java.io.Serializable;
import java.nio.ByteBuffer;
import o.ChildHelper;
import o.ConcatAdapter;
import o.countOnesBefore;
import o.markViewHoldersUpdated;
import o.onEnteredHiddenState;
/* loaded from: classes7.dex */
final class SipHashFunction extends onEnteredHiddenState implements Serializable {
    static final ChildHelper.Callback SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;
    private final int c;
    private final int d;
    private final long k0;
    private final long k1;

    public int bits() {
        return 64;
    }

    SipHashFunction(int i, int i2, long j, long j2) {
        markViewHoldersUpdated.values(i > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i);
        markViewHoldersUpdated.values(i2 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i2);
        this.c = i;
        this.d = i2;
        this.k0 = j;
        this.k1 = j2;
    }

    @Override // o.ChildHelper.Callback
    public ConcatAdapter newHasher() {
        return new values(this.c, this.d, this.k0, this.k1);
    }

    public String toString() {
        int i = this.c;
        int i2 = this.d;
        long j = this.k0;
        long j2 = this.k1;
        StringBuilder sb = new StringBuilder(81);
        sb.append("Hashing.sipHash");
        sb.append(i);
        sb.append(i2);
        sb.append("(");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof SipHashFunction) {
            SipHashFunction sipHashFunction = (SipHashFunction) obj;
            if (this.c == sipHashFunction.c && this.d == sipHashFunction.d && this.k0 == sipHashFunction.k0 && this.k1 == sipHashFunction.k1) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((getClass().hashCode() ^ this.c) ^ this.d) ^ this.k0) ^ this.k1);
    }

    /* loaded from: classes7.dex */
    static final class values extends countOnesBefore {
        private long HaptikSDK$a;
        private long HaptikSDK$b;
        private long ag$a;
        private final int ah$a;
        private long ah$b;
        private long toString;
        private long valueOf;
        private final int values;

        values(int i, int i2, long j, long j2) {
            super(8);
            this.toString = 8317987319222330741L;
            this.HaptikSDK$b = 7237128888997146477L;
            this.HaptikSDK$a = 7816392313619706465L;
            this.ah$b = 8387220255154660723L;
            this.valueOf = 0L;
            this.ag$a = 0L;
            this.values = i;
            this.ah$a = i2;
            this.toString = 8317987319222330741L ^ j;
            this.HaptikSDK$b = j2 ^ 7237128888997146477L;
            this.HaptikSDK$a = j ^ 7816392313619706465L;
            this.ah$b = j2 ^ 8387220255154660723L;
        }

        @Override // o.countOnesBefore
        public void valueOf(ByteBuffer byteBuffer) {
            this.valueOf += 8;
            toString(byteBuffer.getLong());
        }

        @Override // o.countOnesBefore
        public void ag$a(ByteBuffer byteBuffer) {
            this.valueOf += byteBuffer.remaining();
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                this.ag$a ^= (byteBuffer.get() & 255) << i;
                i += 8;
            }
        }

        @Override // o.countOnesBefore
        public HashCode ah$a() {
            long j = this.ag$a ^ (this.valueOf << 56);
            this.ag$a = j;
            toString(j);
            this.HaptikSDK$a ^= 255;
            toString(this.ah$a);
            return HashCode.fromLong(((this.toString ^ this.HaptikSDK$b) ^ this.HaptikSDK$a) ^ this.ah$b);
        }

        private void toString(long j) {
            this.ah$b ^= j;
            toString(this.values);
            this.toString = j ^ this.toString;
        }

        private void toString(int i) {
            for (int i2 = 0; i2 < i; i2++) {
                long j = this.toString;
                long j2 = this.HaptikSDK$b;
                this.toString = j + j2;
                this.HaptikSDK$a += this.ah$b;
                this.HaptikSDK$b = Long.rotateLeft(j2, 13);
                long rotateLeft = Long.rotateLeft(this.ah$b, 16);
                this.ah$b = rotateLeft;
                long j3 = this.HaptikSDK$b;
                long j4 = this.toString;
                this.HaptikSDK$b = j3 ^ j4;
                this.ah$b = rotateLeft ^ this.HaptikSDK$a;
                long rotateLeft2 = Long.rotateLeft(j4, 32);
                this.toString = rotateLeft2;
                long j5 = this.HaptikSDK$a;
                long j6 = this.HaptikSDK$b;
                this.HaptikSDK$a = j5 + j6;
                this.toString = rotateLeft2 + this.ah$b;
                this.HaptikSDK$b = Long.rotateLeft(j6, 17);
                long rotateLeft3 = Long.rotateLeft(this.ah$b, 21);
                this.ah$b = rotateLeft3;
                long j7 = this.HaptikSDK$b;
                long j8 = this.HaptikSDK$a;
                this.HaptikSDK$b = j7 ^ j8;
                this.ah$b = rotateLeft3 ^ this.toString;
                this.HaptikSDK$a = Long.rotateLeft(j8, 32);
            }
        }
    }
}
