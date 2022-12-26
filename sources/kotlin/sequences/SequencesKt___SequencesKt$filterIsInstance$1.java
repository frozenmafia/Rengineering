package kotlin.sequences;

import com.apxor.androidsdk.core.ce.Constants;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class SequencesKt___SequencesKt$filterIsInstance$1 extends Lambda implements Styleable.ChangeBounds<Object, Boolean> {
    public static final SequencesKt___SequencesKt$filterIsInstance$1 INSTANCE = new SequencesKt___SequencesKt$filterIsInstance$1();

    public SequencesKt___SequencesKt$filterIsInstance$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(Object obj) {
        runAnimators.values(3, Constants.REGEX);
        return Boolean.valueOf(obj instanceof Object);
    }
}
