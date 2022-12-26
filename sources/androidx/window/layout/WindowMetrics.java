package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class WindowMetrics {
    private final Bounds _bounds;

    public WindowMetrics(Bounds bounds) {
        runAnimators.ag$a(bounds, "_bounds");
        this._bounds = bounds;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowMetrics(Rect rect) {
        this(new Bounds(rect));
        runAnimators.ag$a(rect, "bounds");
    }

    public final Rect getBounds() {
        return this._bounds.toRect();
    }

    public String toString() {
        return "WindowMetrics { bounds: " + getBounds() + " }";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !runAnimators.values(getClass(), obj.getClass())) {
            return false;
        }
        return runAnimators.values(this._bounds, ((WindowMetrics) obj)._bounds);
    }

    public int hashCode() {
        return this._bounds.hashCode();
    }
}
