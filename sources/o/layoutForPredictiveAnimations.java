package o;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* loaded from: classes7.dex */
public final class layoutForPredictiveAnimations extends setDefaultSwipeDirs {
    @Override // o.setDefaultSwipeDirs, o.endAnimation
    public /* bridge */ /* synthetic */ byte[] ah$a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.ah$a(bArr, bArr2);
    }

    @Override // o.setDefaultSwipeDirs, o.endAnimation
    public /* bridge */ /* synthetic */ byte[] values(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.values(bArr, bArr2);
    }

    public layoutForPredictiveAnimations(byte[] bArr) throws InvalidKeyException {
        super(bArr);
    }

    @Override // o.setDefaultSwipeDirs
    onDown toString(byte[] bArr, int i) throws InvalidKeyException {
        return new recycleByLayoutState(bArr, i);
    }
}
