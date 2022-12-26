package o;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public final class setAppearanceLightNavigationBars implements getDescendants {
    private final int ah$a;
    private final getDescendants values;

    public static getDescendants valueOf(Context context) {
        return new setAppearanceLightNavigationBars(context.getResources().getConfiguration().uiMode & 48, showForType.values(context));
    }

    private setAppearanceLightNavigationBars(int i, getDescendants getdescendants) {
        this.ah$a = i;
        this.values = getdescendants;
    }

    @Override // o.getDescendants
    public boolean equals(Object obj) {
        if (obj instanceof setAppearanceLightNavigationBars) {
            setAppearanceLightNavigationBars setappearancelightnavigationbars = (setAppearanceLightNavigationBars) obj;
            if (this.ah$a == setappearancelightnavigationbars.ah$a && this.values.equals(setappearancelightnavigationbars.values)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.getDescendants
    public int hashCode() {
        int values;
        values = WindowInsetsControllerCompat.Impl30.AnonymousClass1.values(r0 == null ? 0 : this.values.hashCode(), this.ah$a);
        return values;
    }

    @Override // o.getDescendants
    public void ag$a(MessageDigest messageDigest) {
        this.values.ag$a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.ah$a).array());
    }
}
