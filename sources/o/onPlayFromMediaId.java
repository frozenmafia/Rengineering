package o;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
/* loaded from: classes.dex */
public class onPlayFromMediaId extends Paint {
    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public onPlayFromMediaId() {
    }

    public onPlayFromMediaId(int i) {
        super(i);
    }

    public onPlayFromMediaId(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public onPlayFromMediaId(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        int max;
        int max2;
        if (Build.VERSION.SDK_INT < 30) {
            int color = getColor();
            max2 = Math.max(0, Math.min(255, i));
            setColor((max2 << 24) | (color & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK));
            return;
        }
        max = Math.max(0, Math.min(255, i));
        super.setAlpha(max);
    }
}
