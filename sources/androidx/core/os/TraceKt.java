package androidx.core.os;

import o.Styleable;
import o.isTransitionRequired;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TraceKt {
    public static final <T> T trace(String str, Styleable.ArcMotion<? extends T> arcMotion) {
        runAnimators.ag$a(str, "sectionName");
        runAnimators.ag$a(arcMotion, "block");
        TraceCompat.beginSection(str);
        try {
            return arcMotion.invoke();
        } finally {
            isTransitionRequired.toString(1);
            TraceCompat.endSection();
            isTransitionRequired.values(1);
        }
    }
}
