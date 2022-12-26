package o;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import o.WindowInsetsAnimationControllerCompat;
/* loaded from: classes3.dex */
public class getWindowInsetsAnimationCompat extends WindowInsetsAnimationControlListenerCompat {
    private static final byte[] ah$a = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(valueOf);

    @Override // o.getDescendants
    public int hashCode() {
        return -599754482;
    }

    @Override // o.WindowInsetsAnimationControlListenerCompat
    protected Bitmap values(scaleXBy scalexby, Bitmap bitmap, int i, int i2) {
        return WindowInsetsAnimationControllerCompat.Impl.values(scalexby, bitmap, i, i2);
    }

    @Override // o.getDescendants
    public boolean equals(Object obj) {
        return obj instanceof getWindowInsetsAnimationCompat;
    }

    @Override // o.getDescendants
    public void ag$a(MessageDigest messageDigest) {
        messageDigest.update(ah$a);
    }
}
