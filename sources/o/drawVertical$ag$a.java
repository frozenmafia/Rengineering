package o;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import o.DiffUtil;
import o.ItemTouchHelper;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class drawVertical$ag$a implements calculateDiff {
    private final DiffUtil.Callback<calculateDiff> ag$a;
    private final byte[] valueOf;

    private drawVertical$ag$a(DiffUtil.Callback<calculateDiff> callback) {
        this.valueOf = new byte[]{0};
        this.ag$a = callback;
    }

    @Override // o.calculateDiff
    public byte[] valueOf(byte[] bArr) throws GeneralSecurityException {
        if (this.ag$a.ah$a().ah$a().equals(OutputPrefixType.LEGACY)) {
            return ItemTouchHelper.RecoverAnimation.ah$a(this.ag$a.ah$a().values(), this.ag$a.ah$a().valueOf().valueOf(ItemTouchHelper.RecoverAnimation.ah$a(bArr, this.valueOf)));
        }
        return ItemTouchHelper.RecoverAnimation.ah$a(this.ag$a.ah$a().values(), this.ag$a.ah$a().valueOf().valueOf(bArr));
    }

    @Override // o.calculateDiff
    public void valueOf(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        java.util.logging.Logger logger;
        if (bArr.length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        for (DiffUtil$Callback$ah$a<calculateDiff> diffUtil$Callback$ah$a : this.ag$a.toString(copyOf)) {
            try {
                if (diffUtil$Callback$ah$a.ah$a().equals(OutputPrefixType.LEGACY)) {
                    diffUtil$Callback$ah$a.valueOf().valueOf(copyOfRange, ItemTouchHelper.RecoverAnimation.ah$a(bArr2, this.valueOf));
                    return;
                } else {
                    diffUtil$Callback$ah$a.valueOf().valueOf(copyOfRange, bArr2);
                    return;
                }
            } catch (GeneralSecurityException e) {
                logger = drawVertical.ag$a;
                logger.info("tag prefix matches a key, but cannot verify: " + e);
            }
        }
        for (DiffUtil$Callback$ah$a<calculateDiff> diffUtil$Callback$ah$a2 : this.ag$a.valueOf()) {
            try {
                diffUtil$Callback$ah$a2.valueOf().valueOf(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
