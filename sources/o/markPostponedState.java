package o;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.facebook.react.views.view.ReactViewBackgroundDrawable;
/* loaded from: classes4.dex */
public class markPostponedState {
    private View ah$a;
    private ReactViewBackgroundDrawable toString;

    public markPostponedState(View view) {
        this.ah$a = view;
    }

    private ReactViewBackgroundDrawable valueOf() {
        if (this.toString == null) {
            this.toString = new ReactViewBackgroundDrawable(this.ah$a.getContext());
            Drawable background = this.ah$a.getBackground();
            androidx.core.view.ViewCompat.setBackground(this.ah$a, null);
            if (background == null) {
                androidx.core.view.ViewCompat.setBackground(this.ah$a, this.toString);
            } else {
                androidx.core.view.ViewCompat.setBackground(this.ah$a, new LayerDrawable(new Drawable[]{this.toString, background}));
            }
        }
        return this.toString;
    }

    public void valueOf(int i) {
        if (i == 0 && this.toString == null) {
            return;
        }
        valueOf().ah$a(i);
    }

    public void ah$a(int i, float f) {
        valueOf().valueOf(i, f);
    }

    public void toString(int i, float f, float f2) {
        valueOf().ag$a(i, f, f2);
    }

    public int values(int i) {
        return valueOf().values(i);
    }

    public void valueOf(float f) {
        valueOf().valueOf(f);
    }

    public void ag$a(float f, int i) {
        valueOf().ag$a(f, i);
    }

    public void ah$a(String str) {
        valueOf().toString(str);
    }
}
