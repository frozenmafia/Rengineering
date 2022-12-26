package o;

import android.graphics.Bitmap;
import o.setTextSelection;
/* loaded from: classes4.dex */
public class setTouchDelegateInfo implements setTextSelection.values {
    @Override // o.setTextSelection.values
    public Bitmap ag$a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // o.setTextSelection.values
    public byte[] ag$a(int i) {
        return new byte[i];
    }

    @Override // o.setTextSelection.values
    public int[] ah$a(int i) {
        return new int[i];
    }
}
