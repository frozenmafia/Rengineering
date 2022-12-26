package io.opencensus.trace;

import java.util.Collections;
import java.util.Map;
/* loaded from: classes7.dex */
public abstract class Link {
    private static final Map<String, Object> ah$a = Collections.emptyMap();

    /* loaded from: classes7.dex */
    public enum Type {
        CHILD_LINKED_SPAN,
        PARENT_LINKED_SPAN
    }

    Link() {
    }
}
