package o;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import o.WindowInsetsAnimationControllerCompat;
/* loaded from: classes3.dex */
public class getCurrentAlpha extends WindowInsetsAnimationControlListenerCompat {
    private static final byte[] toString = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(valueOf);

    @Override // o.getDescendants
    public int hashCode() {
        return -670243078;
    }

    @Override // o.WindowInsetsAnimationControlListenerCompat
    protected Bitmap values(scaleXBy scalexby, Bitmap bitmap, int i, int i2) {
        return WindowInsetsAnimationControllerCompat.Impl.toString(scalexby, bitmap, i, i2);
    }

    @Override // o.getDescendants
    public boolean equals(Object obj) {
        return obj instanceof getCurrentAlpha;
    }

    @Override // o.getDescendants
    public void ag$a(MessageDigest messageDigest) {
        messageDigest.update(toString);
    }
}
