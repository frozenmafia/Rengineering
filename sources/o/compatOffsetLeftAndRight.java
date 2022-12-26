package o;

import android.view.View;
/* loaded from: classes3.dex */
public final class compatOffsetLeftAndRight {
    public static final void valueOf(View view) {
        runAnimators.ag$a(view, "page");
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        view.setEnabled(false);
    }

    public static final void ah$a(View view, float f) {
        runAnimators.ag$a(view, "page");
        float f2 = 1.0f;
        if (f < -1.0f) {
            f = -1.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha((f <= -1.0f || f >= 1.0f) ? 0.0f : 0.0f);
        view.setEnabled(false);
        view.setCameraDistance(view.getWidth() * 20);
        view.setPivotX(f < 0.0f ? view.getWidth() : 0.0f);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(f * 90.0f);
    }
}
