package o;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import o.WindowInsetsAnimationControllerCompat;
/* loaded from: classes3.dex */
public class getCurrentInsets extends WindowInsetsAnimationControlListenerCompat {
    private static final byte[] ag$a = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(valueOf);

    @Override // o.getDescendants
    public int hashCode() {
        return 1572326941;
    }

    @Override // o.WindowInsetsAnimationControlListenerCompat
    protected Bitmap values(scaleXBy scalexby, Bitmap bitmap, int i, int i2) {
        return WindowInsetsAnimationControllerCompat.Impl.ag$a(scalexby, bitmap, i, i2);
    }

    @Override // o.getDescendants
    public boolean equals(Object obj) {
        return obj instanceof getCurrentInsets;
    }

    @Override // o.getDescendants
    public void ag$a(MessageDigest messageDigest) {
        messageDigest.update(ag$a);
    }
}
