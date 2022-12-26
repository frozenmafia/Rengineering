package androidx.window.layout;

import o.getTargetTypes;
/* loaded from: classes6.dex */
public interface FoldingFeature extends DisplayFeature {
    OcclusionType getOcclusionType();

    Orientation getOrientation();

    State getState();

    boolean isSeparating();

    /* loaded from: classes6.dex */
    public static final class OcclusionType {
        private final String description;
        public static final Companion Companion = new Companion(null);
        public static final OcclusionType NONE = new OcclusionType("NONE");
        public static final OcclusionType FULL = new OcclusionType("FULL");

        private OcclusionType(String str) {
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
        }
    }

    /* loaded from: classes6.dex */
    public static final class Orientation {
        private final String description;
        public static final Companion Companion = new Companion(null);
        public static final Orientation VERTICAL = new Orientation("VERTICAL");
        public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL");

        private Orientation(String str) {
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
        }
    }

    /* loaded from: classes6.dex */
    public static final class State {
        public static final Companion Companion = new Companion(null);
        public static final State FLAT = new State("FLAT");
        public static final State HALF_OPENED = new State("HALF_OPENED");
        private final String description;

        private State(String str) {
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
        }
    }
}
