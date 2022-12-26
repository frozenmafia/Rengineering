package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import o.PreferenceFragmentCompat;
import o.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback;
/* loaded from: classes7.dex */
public abstract class addItemFromInflater<S extends PreferenceFragmentCompat.OnPreferenceStartFragmentCallback> {
    S valueOf;
    protected addPreference values;

    public abstract int ag$a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void toString(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void valueOf(Canvas canvas, Paint paint, float f, float f2, int i);

    public abstract int values();

    abstract void values(Canvas canvas, float f);

    public addItemFromInflater(S s) {
        this.valueOf = s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void toString(addPreference addpreference) {
        this.values = addpreference;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf(Canvas canvas, float f) {
        this.valueOf.ah$a();
        values(canvas, f);
    }
}
