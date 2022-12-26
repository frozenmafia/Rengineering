package androidx.window.layout;

import java.util.List;
import o.reserveEndViewTransition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class WindowLayoutInfo {
    private final List<DisplayFeature> displayFeatures;

    public final List<DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WindowLayoutInfo(List<? extends DisplayFeature> list) {
        runAnimators.ag$a(list, "displayFeatures");
        this.displayFeatures = list;
    }

    public String toString() {
        return reserveEndViewTransition.valueOf(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !runAnimators.values(getClass(), obj.getClass())) {
            return false;
        }
        return runAnimators.values(this.displayFeatures, ((WindowLayoutInfo) obj).displayFeatures);
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }
}
