package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import java.util.Objects;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class HardwareFoldingFeature implements FoldingFeature {
    public static final Companion Companion = new Companion(null);
    private final Bounds featureBounds;
    private final FoldingFeature.State state;
    private final Type type;

    public HardwareFoldingFeature(Bounds bounds, Type type, FoldingFeature.State state) {
        runAnimators.ag$a(bounds, "featureBounds");
        runAnimators.ag$a(type, "type");
        runAnimators.ag$a(state, "state");
        this.featureBounds = bounds;
        this.type = type;
        this.state = state;
        Companion.validateFeatureBounds$window_release(bounds);
    }

    public final Type getType$window_release() {
        return this.type;
    }

    @Override // androidx.window.layout.FoldingFeature
    public FoldingFeature.State getState() {
        return this.state;
    }

    @Override // androidx.window.layout.DisplayFeature
    public Rect getBounds() {
        return this.featureBounds.toRect();
    }

    @Override // androidx.window.layout.FoldingFeature
    public boolean isSeparating() {
        return runAnimators.values(this.type, Type.Companion.getHINGE()) || (runAnimators.values(this.type, Type.Companion.getFOLD()) && runAnimators.values(getState(), FoldingFeature.State.HALF_OPENED));
    }

    @Override // androidx.window.layout.FoldingFeature
    public FoldingFeature.OcclusionType getOcclusionType() {
        if (this.featureBounds.getWidth() == 0 || this.featureBounds.getHeight() == 0) {
            return FoldingFeature.OcclusionType.NONE;
        }
        return FoldingFeature.OcclusionType.FULL;
    }

    @Override // androidx.window.layout.FoldingFeature
    public FoldingFeature.Orientation getOrientation() {
        if (this.featureBounds.getWidth() > this.featureBounds.getHeight()) {
            return FoldingFeature.Orientation.HORIZONTAL;
        }
        return FoldingFeature.Orientation.VERTICAL;
    }

    public String toString() {
        return ((Object) "HardwareFoldingFeature") + " { " + this.featureBounds + ", type=" + this.type + ", state=" + getState() + " }";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (runAnimators.values(getClass(), obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
            HardwareFoldingFeature hardwareFoldingFeature = (HardwareFoldingFeature) obj;
            return runAnimators.values(this.featureBounds, hardwareFoldingFeature.featureBounds) && runAnimators.values(this.type, hardwareFoldingFeature.type) && runAnimators.values(getState(), hardwareFoldingFeature.getState());
        }
        return false;
    }

    public int hashCode() {
        return (((this.featureBounds.hashCode() * 31) + this.type.hashCode()) * 31) + getState().hashCode();
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final void validateFeatureBounds$window_release(Bounds bounds) {
            runAnimators.ag$a(bounds, "bounds");
            boolean z = true;
            if (!((bounds.getWidth() == 0 && bounds.getHeight() == 0) ? false : true)) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (bounds.getLeft() != 0 && bounds.getTop() != 0) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Type {
        public static final Companion Companion = new Companion(null);
        private static final Type FOLD = new Type("FOLD");
        private static final Type HINGE = new Type("HINGE");
        private final String description;

        private Type(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }

        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(getTargetTypes gettargettypes) {
                this();
            }

            private Companion() {
            }

            public final Type getFOLD() {
                return Type.FOLD;
            }

            public final Type getHINGE() {
                return Type.HINGE;
            }
        }
    }
}
