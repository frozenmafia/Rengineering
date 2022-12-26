package com.google.common.hash;

import java.io.Serializable;
import java.util.zip.Checksum;
import o.ConcatAdapter;
import o.addAdapter;
import o.markViewHoldersUpdated;
import o.onEnteredHiddenState;
import o.onLeftHiddenState;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ChecksumHashFunction extends onEnteredHiddenState implements Serializable {
    private static final long serialVersionUID = 0;
    private final int bits;
    private final addAdapter<? extends Checksum> checksumSupplier;
    private final String toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChecksumHashFunction(addAdapter<? extends Checksum> addadapter, int i, String str) {
        this.checksumSupplier = (addAdapter) markViewHoldersUpdated.toString(addadapter);
        markViewHoldersUpdated.values(i == 32 || i == 64, "bits (%s) must be either 32 or 64", i);
        this.bits = i;
        this.toString = (String) markViewHoldersUpdated.toString(str);
    }

    public int bits() {
        return this.bits;
    }

    @Override // o.ChildHelper.Callback
    public ConcatAdapter newHasher() {
        return new toString(this.checksumSupplier.get());
    }

    public String toString() {
        return this.toString;
    }

    /* loaded from: classes7.dex */
    final class toString extends onLeftHiddenState {
        private final Checksum ag$a;

        private toString(Checksum checksum) {
            this.ag$a = (Checksum) markViewHoldersUpdated.toString(checksum);
        }

        @Override // o.onLeftHiddenState
        public void ag$a(byte b2) {
            this.ag$a.update(b2);
        }

        @Override // o.onLeftHiddenState
        public void valueOf(byte[] bArr, int i, int i2) {
            this.ag$a.update(bArr, i, i2);
        }

        @Override // o.ConcatAdapter
        public HashCode ag$a() {
            long value = this.ag$a.getValue();
            if (ChecksumHashFunction.this.bits == 32) {
                return HashCode.fromInt((int) value);
            }
            return HashCode.fromLong(value);
        }
    }
}
