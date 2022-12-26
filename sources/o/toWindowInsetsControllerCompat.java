package o;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
/* loaded from: classes3.dex */
public class toWindowInsetsControllerCompat implements setSystemBarsBehavior<Drawable> {
    private isAppearanceLightStatusBars ag$a;
    private final boolean ah$a;
    private final int valueOf;

    /* JADX INFO: Access modifiers changed from: protected */
    public toWindowInsetsControllerCompat(int i, boolean z) {
        this.valueOf = i;
        this.ah$a = z;
    }

    @Override // o.setSystemBarsBehavior
    public removeOnControllableInsetsChangedListener<Drawable> valueOf(DataSource dataSource, boolean z) {
        if (dataSource == DataSource.MEMORY_CACHE) {
            return setAppearanceLightStatusBars.ah$a();
        }
        return values();
    }

    private removeOnControllableInsetsChangedListener<Drawable> values() {
        if (this.ag$a == null) {
            this.ag$a = new isAppearanceLightStatusBars(this.valueOf, this.ah$a);
        }
        return this.ag$a;
    }
}
