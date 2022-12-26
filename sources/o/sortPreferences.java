package o;

import android.graphics.Typeface;
/* loaded from: classes5.dex */
public final class sortPreferences extends onExpandButtonClick {
    private final valueOf ag$a;
    private boolean toString;
    private final Typeface values;

    /* loaded from: classes5.dex */
    public interface valueOf {
        void toString(Typeface typeface);
    }

    public sortPreferences(valueOf valueof, Typeface typeface) {
        this.values = typeface;
        this.ag$a = valueof;
    }

    @Override // o.onExpandButtonClick
    public void ag$a(Typeface typeface, boolean z) {
        ah$a(typeface);
    }

    @Override // o.onExpandButtonClick
    public void ah$a(int i) {
        ah$a(this.values);
    }

    public void ah$a() {
        this.toString = true;
    }

    private void ah$a(Typeface typeface) {
        if (this.toString) {
            return;
        }
        this.ag$a.toString(typeface);
    }
}
