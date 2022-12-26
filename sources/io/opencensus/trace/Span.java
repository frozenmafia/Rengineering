package io.opencensus.trace;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes7.dex */
public abstract class Span {
    private static final Map<String, Object> values = Collections.emptyMap();
    private static final Set<Options> ag$a = Collections.unmodifiableSet(EnumSet.noneOf(Options.class));

    /* loaded from: classes7.dex */
    public enum Kind {
        SERVER,
        CLIENT
    }

    /* loaded from: classes7.dex */
    public enum Options {
        RECORD_EVENTS
    }
}
