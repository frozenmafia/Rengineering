package o;

import java.io.EOFException;
import java.io.IOException;
import o.dirTypeForward;
/* loaded from: classes3.dex */
public final class markAfter implements dirTypeForward {
    private final byte[] ah$a = new byte[4096];

    @Override // o.dirTypeForward
    public void ag$a(createFromIcon createfromicon) {
    }

    @Override // o.dirTypeForward
    public /* synthetic */ void toString(C$default$setContentDescription c$default$setContentDescription, int i) {
        ah$a(c$default$setContentDescription, i, 0);
    }

    @Override // o.dirTypeForward
    public /* synthetic */ int valueOf(unwrapCryptoObject unwrapcryptoobject, int i, boolean z) {
        return CharSequenceKt.values(this, unwrapcryptoobject, i, z);
    }

    @Override // o.dirTypeForward
    public void valueOf(long j, int i, int i2, int i3, dirTypeForward.toString tostring) {
    }

    @Override // o.dirTypeForward
    public int values(unwrapCryptoObject unwrapcryptoobject, int i, boolean z, int i2) throws IOException {
        int values = unwrapcryptoobject.values(this.ah$a, 0, Math.min(this.ah$a.length, i));
        if (values == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return values;
    }

    @Override // o.dirTypeForward
    public void ah$a(C$default$setContentDescription c$default$setContentDescription, int i, int i2) {
        c$default$setContentDescription.HaptikSDK$a(i);
    }
}
