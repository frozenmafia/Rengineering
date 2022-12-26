package com.google.common.hash;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import o.ConcatAdapter;
import o.markViewHoldersUpdated;
import o.onEnteredHiddenState;
import o.onLeftHiddenState;
/* loaded from: classes7.dex */
final class MessageDigestHashFunction extends onEnteredHiddenState implements Serializable {
    private final int bytes;
    private final MessageDigest prototype;
    private final boolean supportsClone;
    private final String toString;

    MessageDigestHashFunction(String str, String str2) {
        MessageDigest messageDigest = getMessageDigest(str);
        this.prototype = messageDigest;
        this.bytes = messageDigest.getDigestLength();
        this.toString = (String) markViewHoldersUpdated.toString(str2);
        this.supportsClone = supportsClone(messageDigest);
    }

    MessageDigestHashFunction(String str, int i, String str2) {
        this.toString = (String) markViewHoldersUpdated.toString(str2);
        MessageDigest messageDigest = getMessageDigest(str);
        this.prototype = messageDigest;
        int digestLength = messageDigest.getDigestLength();
        markViewHoldersUpdated.ag$a(i >= 4 && i <= digestLength, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.bytes = i;
        this.supportsClone = supportsClone(messageDigest);
    }

    private static boolean supportsClone(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public int bits() {
        return this.bytes * 8;
    }

    public String toString() {
        return this.toString;
    }

    private static MessageDigest getMessageDigest(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    @Override // o.ChildHelper.Callback
    public ConcatAdapter newHasher() {
        if (this.supportsClone) {
            try {
                return new values((MessageDigest) this.prototype.clone(), this.bytes);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new values(getMessageDigest(this.prototype.getAlgorithm()), this.bytes);
    }

    /* loaded from: classes7.dex */
    static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final String algorithmName;
        private final int bytes;
        private final String toString;

        private SerializedForm(String str, int i, String str2) {
            this.algorithmName = str;
            this.bytes = i;
            this.toString = str2;
        }

        private Object readResolve() {
            return new MessageDigestHashFunction(this.algorithmName, this.bytes, this.toString);
        }
    }

    Object writeReplace() {
        return new SerializedForm(this.prototype.getAlgorithm(), this.bytes, this.toString);
    }

    /* loaded from: classes7.dex */
    static final class values extends onLeftHiddenState {
        private boolean ag$a;
        private final int toString;
        private final MessageDigest values;

        private values(MessageDigest messageDigest, int i) {
            this.values = messageDigest;
            this.toString = i;
        }

        @Override // o.onLeftHiddenState
        public void ag$a(byte b2) {
            valueOf();
            this.values.update(b2);
        }

        @Override // o.onLeftHiddenState
        public void valueOf(byte[] bArr, int i, int i2) {
            valueOf();
            this.values.update(bArr, i, i2);
        }

        @Override // o.onLeftHiddenState
        public void toString(ByteBuffer byteBuffer) {
            valueOf();
            this.values.update(byteBuffer);
        }

        private void valueOf() {
            markViewHoldersUpdated.ah$a(!this.ag$a, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // o.ConcatAdapter
        public HashCode ag$a() {
            valueOf();
            this.ag$a = true;
            if (this.toString == this.values.getDigestLength()) {
                return HashCode.fromBytesNoCopy(this.values.digest());
            }
            return HashCode.fromBytesNoCopy(Arrays.copyOf(this.values.digest(), this.toString));
        }
    }
}
