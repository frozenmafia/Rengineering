package o;

import java.io.InputStream;
import java.net.URL;
import o.WindowInsetsAnimationCompat;
import o.getUpperBound;
/* loaded from: classes3.dex */
public class forwardToViewIfNeeded implements getUpperBound<URL, InputStream> {
    private final getUpperBound<WindowInsetsAnimationCompat.BoundsCompat, InputStream> ag$a;

    @Override // o.getUpperBound
    /* renamed from: valueOf */
    public boolean toString(URL url) {
        return true;
    }

    public forwardToViewIfNeeded(getUpperBound<WindowInsetsAnimationCompat.BoundsCompat, InputStream> getupperbound) {
        this.ag$a = getupperbound;
    }

    @Override // o.getUpperBound
    public getUpperBound.valueOf<InputStream> ah$a(URL url, int i, int i2, setMargins setmargins) {
        return this.ag$a.ah$a(new WindowInsetsAnimationCompat.BoundsCompat(url), i, i2, setmargins);
    }
}
