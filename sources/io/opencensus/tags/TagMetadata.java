package io.opencensus.tags;
/* loaded from: classes7.dex */
public abstract class TagMetadata {
    TagMetadata() {
    }

    /* loaded from: classes7.dex */
    public enum TagTtl {
        NO_PROPAGATION(0),
        UNLIMITED_PROPAGATION(-1);
        
        private final int hops;

        TagTtl(int i) {
            this.hops = i;
        }
    }
}
