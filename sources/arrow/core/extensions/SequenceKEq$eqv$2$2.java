package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class SequenceKEq$eqv$2$2 extends Lambda implements Styleable.ChangeBounds<Boolean, Boolean> {
    public static final SequenceKEq$eqv$2$2 INSTANCE = new SequenceKEq$eqv$2$2();

    SequenceKEq$eqv$2$2() {
        super(1);
    }

    public final boolean invoke(boolean z) {
        return !z;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ Boolean invoke(Boolean bool) {
        return Boolean.valueOf(invoke(bool.booleanValue()));
    }
}
