package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public class SplitRule extends EmbeddingRule {
    private final int layoutDirection;
    private final int minSmallestWidth;
    private final int minWidth;
    private final float splitRatio;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface LayoutDir {
    }

    public SplitRule() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public /* synthetic */ SplitRule(int i, int i2, float f, int i3, int i4, getTargetTypes gettargettypes) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0.5f : f, (i4 & 8) != 0 ? 3 : i3);
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final int getMinSmallestWidth() {
        return this.minSmallestWidth;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public final int getLayoutDirection() {
        return this.layoutDirection;
    }

    public SplitRule(int i, int i2, float f, int i3) {
        this.minWidth = i;
        this.minSmallestWidth = i2;
        this.splitRatio = f;
        this.layoutDirection = i3;
    }

    public final boolean checkParentMetrics(WindowMetrics windowMetrics) {
        runAnimators.ag$a(windowMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect bounds = Api30Impl.INSTANCE.getBounds(windowMetrics);
        return (this.minWidth == 0 || bounds.width() >= this.minWidth) && (this.minSmallestWidth == 0 || Math.min(bounds.width(), bounds.height()) >= this.minSmallestWidth);
    }

    /* loaded from: classes6.dex */
    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final Rect getBounds(WindowMetrics windowMetrics) {
            runAnimators.ag$a(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            runAnimators.ah$a(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SplitRule) {
            SplitRule splitRule = (SplitRule) obj;
            if (this.minWidth == splitRule.minWidth && this.minSmallestWidth == splitRule.minSmallestWidth) {
                return ((this.splitRatio > splitRule.splitRatio ? 1 : (this.splitRatio == splitRule.splitRatio ? 0 : -1)) == 0) && this.layoutDirection == splitRule.layoutDirection;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = this.minWidth;
        return (((((i * 31) + this.minSmallestWidth) * 31) + Float.floatToIntBits(this.splitRatio)) * 31) + this.layoutDirection;
    }
}
