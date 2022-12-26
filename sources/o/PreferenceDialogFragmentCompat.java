package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import o.showIme;
/* loaded from: classes7.dex */
public interface PreferenceDialogFragmentCompat extends showIme.values {
    int ag$a();

    void ah$a();

    valueOf ah$b();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(valueOf valueof);

    void valueOf();

    /* loaded from: classes5.dex */
    public class Api30Impl {
        public static int values(View view, int i, int i2) {
            return toString(view.getContext(), i, i2);
        }

        public static int toString(Context context, int i, int i2) {
            TypedValue setinitialexpandedchildrencount = setInitialExpandedChildrenCount.toString(context, i);
            return setinitialexpandedchildrencount != null ? setinitialexpandedchildrencount.data : i2;
        }

        public static int ag$a(int i, int i2, float f) {
            return androidx.core.graphics.ColorUtils.compositeColors(androidx.core.graphics.ColorUtils.setAlphaComponent(i2, Math.round(Color.alpha(i2) * f)), i);
        }

        public static int ah$a(int i, int i2) {
            return androidx.core.graphics.ColorUtils.compositeColors(i2, i);
        }

        public static int values(int i, int i2) {
            return androidx.core.graphics.ColorUtils.setAlphaComponent(i, (Color.alpha(i) * i2) / 255);
        }

        public static boolean valueOf(int i) {
            return i != 0 && androidx.core.graphics.ColorUtils.calculateLuminance(i) > 0.5d;
        }
    }

    /* loaded from: classes7.dex */
    public static class valueOf {
        public float ag$a;
        public float toString;
        public float values;

        /* JADX INFO: Access modifiers changed from: private */
        public valueOf() {
        }

        public valueOf(float f, float f2, float f3) {
            this.values = f;
            this.toString = f2;
            this.ag$a = f3;
        }

        public valueOf(valueOf valueof) {
            this(valueof.values, valueof.toString, valueof.ag$a);
        }

        public void values(float f, float f2, float f3) {
            this.values = f;
            this.toString = f2;
            this.ag$a = f3;
        }

        public void ah$a(valueOf valueof) {
            values(valueof.values, valueof.toString, valueof.ag$a);
        }

        public boolean values() {
            return this.ag$a == Float.MAX_VALUE;
        }
    }

    /* loaded from: classes7.dex */
    public static class values extends Property<PreferenceDialogFragmentCompat, Integer> {
        public static final Property<PreferenceDialogFragmentCompat, Integer> values = new values("circularRevealScrimColor");

        private values(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: toString */
        public Integer get(PreferenceDialogFragmentCompat preferenceDialogFragmentCompat) {
            return Integer.valueOf(preferenceDialogFragmentCompat.ag$a());
        }

        @Override // android.util.Property
        /* renamed from: toString */
        public void set(PreferenceDialogFragmentCompat preferenceDialogFragmentCompat, Integer num) {
            preferenceDialogFragmentCompat.setCircularRevealScrimColor(num.intValue());
        }
    }
}
