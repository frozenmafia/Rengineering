package o;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
/* loaded from: classes4.dex */
public class saveAllState {
    private int ah$a = -1;
    private boolean values = false;
    private ColorFilter valueOf = null;
    private int toString = -1;
    private int ag$a = -1;

    public void toString(int i) {
        this.ah$a = i;
    }

    public void ah$a(ColorFilter colorFilter) {
        this.valueOf = colorFilter;
        this.values = colorFilter != null;
    }

    public void ag$a(boolean z) {
        this.toString = z ? 1 : 0;
    }

    public void valueOf(boolean z) {
        this.ag$a = z ? 1 : 0;
    }

    public void values(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i = this.ah$a;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.values) {
            drawable.setColorFilter(this.valueOf);
        }
        int i2 = this.toString;
        if (i2 != -1) {
            drawable.setDither(i2 != 0);
        }
        int i3 = this.ag$a;
        if (i3 != -1) {
            drawable.setFilterBitmap(i3 != 0);
        }
    }
}
