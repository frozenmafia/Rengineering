package o;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o.ItemTouchHelper;
/* loaded from: classes7.dex */
public class findFirstPartiallyOrCompletelyInvisibleChild implements calculateDiff {
    private final int valueOf;
    private final setDrawable values;

    public findFirstPartiallyOrCompletelyInvisibleChild(setDrawable setdrawable, int i) throws GeneralSecurityException {
        this.values = setdrawable;
        this.valueOf = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        setdrawable.toString(new byte[0], i);
    }

    @Override // o.calculateDiff
    public byte[] valueOf(byte[] bArr) throws GeneralSecurityException {
        return this.values.toString(bArr, this.valueOf);
    }

    @Override // o.calculateDiff
    public void valueOf(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!ItemTouchHelper.RecoverAnimation.values(valueOf(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
