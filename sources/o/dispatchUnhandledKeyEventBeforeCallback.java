package o;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class dispatchUnhandledKeyEventBeforeCallback {
    public static final GradientDrawable toString(View view, int i, float f) {
        runAnimators.ag$a(view, "<this>");
        return ag$a(view, i, f, f, f, f);
    }

    public static final GradientDrawable ag$a(View view, int i, float f, float f2, float f3, float f4) {
        runAnimators.ag$a(view, "<this>");
        Drawable drawable = androidx.core.content.ContextCompat.getDrawable(view.getContext(), extract$ah$a.st_default_interactive_bg);
        Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) drawable).mutate();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
        return gradientDrawable;
    }
}
