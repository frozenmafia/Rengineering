package o;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import o.DiffUtil;
import o.ItemTouchHelper;
/* loaded from: classes7.dex */
public class backingData implements midPoint<endAnimation, endAnimation> {
    private static final java.util.logging.Logger toString = java.util.logging.Logger.getLogger(backingData.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class toString implements endAnimation {
        private final DiffUtil.Callback<endAnimation> toString;

        private toString(DiffUtil.Callback<endAnimation> callback) {
            this.toString = callback;
        }

        @Override // o.endAnimation
        public byte[] ah$a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return ItemTouchHelper.RecoverAnimation.ah$a(this.toString.ah$a().values(), this.toString.ah$a().valueOf().ah$a(bArr, bArr2));
        }

        @Override // o.endAnimation
        public byte[] values(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (DiffUtil$Callback$ah$a<endAnimation> diffUtil$Callback$ah$a : this.toString.toString(copyOfRange)) {
                    try {
                        return diffUtil$Callback$ah$a.valueOf().values(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        java.util.logging.Logger logger = backingData.toString;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            for (DiffUtil$Callback$ah$a<endAnimation> diffUtil$Callback$ah$a2 : this.toString.valueOf()) {
                try {
                    return diffUtil$Callback$ah$a2.valueOf().values(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    backingData() {
    }

    @Override // o.midPoint
    /* renamed from: toString */
    public endAnimation valueOf(DiffUtil.Callback<endAnimation> callback) throws GeneralSecurityException {
        return new toString(callback);
    }

    @Override // o.midPoint
    public Class<endAnimation> valueOf() {
        return endAnimation.class;
    }

    @Override // o.midPoint
    public Class<endAnimation> ag$a() {
        return endAnimation.class;
    }
}
