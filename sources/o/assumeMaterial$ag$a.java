package o;

import android.content.res.TypedArray;
import o.assumeMaterial$ag$a;
/* loaded from: classes.dex */
public abstract class assumeMaterial$ag$a<T extends assumeMaterial$ag$a<T>> {
    final assumeMaterial valueOf = new assumeMaterial();

    protected abstract T valueOf();

    public T valueOf(TypedArray typedArray) {
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_clip_to_children)) {
            values(typedArray.getBoolean(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_clip_to_children, this.valueOf.HaptikSDK$c));
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_auto_start)) {
            ag$a(typedArray.getBoolean(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_auto_start, this.valueOf.toString));
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_base_alpha)) {
            values(typedArray.getFloat(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_base_alpha, 0.3f));
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_highlight_alpha)) {
            toString(typedArray.getFloat(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_highlight_alpha, 1.0f));
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_duration)) {
            valueOf(typedArray.getInt(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_duration, (int) this.valueOf.ah$a));
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_repeat_count)) {
            valueOf(typedArray.getInt(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_repeat_count, this.valueOf.aj$a));
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_repeat_delay)) {
            ag$a(typedArray.getInt(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_repeat_delay, (int) this.valueOf.ak));
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_repeat_mode)) {
            ah$a(typedArray.getInt(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_repeat_mode, this.valueOf.isLogoutPending));
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_direction)) {
            int i = typedArray.getInt(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_direction, this.valueOf.ah$b);
            if (i == 1) {
                values(1);
            } else if (i == 2) {
                values(2);
            } else if (i != 3) {
                values(0);
            } else {
                values(3);
            }
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_shape)) {
            if (typedArray.getInt(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_shape, this.valueOf.onXdkEvent) != 1) {
                HaptikSDK$c(0);
            } else {
                HaptikSDK$c(1);
            }
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_dropoff)) {
            ah$a(typedArray.getFloat(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_dropoff, this.valueOf.HaptikSDK$b));
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_fixed_width)) {
            toString(typedArray.getDimensionPixelSize(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_fixed_width, this.valueOf.HaptikWebView));
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_fixed_height)) {
            ag$a(typedArray.getDimensionPixelSize(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_fixed_height, this.valueOf.invoke));
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_intensity)) {
            ag$a(typedArray.getFloat(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_intensity, this.valueOf.getInitSettings));
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_width_ratio)) {
            ah$b(typedArray.getFloat(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_width_ratio, this.valueOf.ICustomTabsCallback));
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_height_ratio)) {
            valueOf(typedArray.getFloat(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_height_ratio, this.valueOf.getSignupData));
        }
        if (typedArray.hasValue(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_tilt)) {
            HaptikSDK$b(typedArray.getFloat(ActionBarDrawerToggle$SlideDrawable$ah$a.ShimmerFrameLayout_shimmer_tilt, this.valueOf.a));
        }
        return valueOf();
    }

    public T values(int i) {
        this.valueOf.ah$b = i;
        return valueOf();
    }

    public T HaptikSDK$c(int i) {
        this.valueOf.onXdkEvent = i;
        return valueOf();
    }

    public T toString(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Given invalid width: " + i);
        }
        this.valueOf.HaptikWebView = i;
        return valueOf();
    }

    public T ag$a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Given invalid height: " + i);
        }
        this.valueOf.invoke = i;
        return valueOf();
    }

    public T ah$b(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Given invalid width ratio: " + f);
        }
        this.valueOf.ICustomTabsCallback = f;
        return valueOf();
    }

    public T valueOf(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Given invalid height ratio: " + f);
        }
        this.valueOf.getSignupData = f;
        return valueOf();
    }

    public T ag$a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Given invalid intensity value: " + f);
        }
        this.valueOf.getInitSettings = f;
        return valueOf();
    }

    public T ah$a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Given invalid dropoff value: " + f);
        }
        this.valueOf.HaptikSDK$b = f;
        return valueOf();
    }

    public T HaptikSDK$b(float f) {
        this.valueOf.a = f;
        return valueOf();
    }

    public T values(float f) {
        assumeMaterial assumematerial = this.valueOf;
        assumematerial.values = (((int) (ag$a(0.0f, 1.0f, f) * 255.0f)) << 24) | (assumematerial.values & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK);
        return valueOf();
    }

    public T toString(float f) {
        assumeMaterial assumematerial = this.valueOf;
        assumematerial.HaptikSDK$e = (((int) (ag$a(0.0f, 1.0f, f) * 255.0f)) << 24) | (assumematerial.HaptikSDK$e & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK);
        return valueOf();
    }

    public T values(boolean z) {
        this.valueOf.HaptikSDK$c = z;
        return valueOf();
    }

    public T ag$a(boolean z) {
        this.valueOf.toString = z;
        return valueOf();
    }

    public T valueOf(int i) {
        this.valueOf.aj$a = i;
        return valueOf();
    }

    public T ah$a(int i) {
        this.valueOf.isLogoutPending = i;
        return valueOf();
    }

    public T ag$a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Given a negative repeat delay: " + j);
        }
        this.valueOf.ak = j;
        return valueOf();
    }

    public T valueOf(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Given a negative duration: " + j);
        }
        this.valueOf.ah$a = j;
        return valueOf();
    }

    public assumeMaterial ag$a() {
        this.valueOf.ag$a();
        this.valueOf.values();
        return this.valueOf;
    }

    private static float ag$a(float f, float f2, float f3) {
        return Math.min(f2, Math.max(f, f3));
    }
}
