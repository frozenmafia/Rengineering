package kotlin.text;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TransitionPropagation;
import o.Visibility;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class StringsKt__StringsKt$splitToSequence$1 extends Lambda implements Styleable.ChangeBounds<TransitionPropagation, String> {
    final /* synthetic */ CharSequence $this_splitToSequence;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$splitToSequence$1(CharSequence charSequence) {
        super(1);
        this.$this_splitToSequence = charSequence;
    }

    @Override // o.Styleable.ChangeBounds
    public final String invoke(TransitionPropagation transitionPropagation) {
        runAnimators.ag$a(transitionPropagation, "it");
        return Visibility.Mode.ag$a(this.$this_splitToSequence, transitionPropagation);
    }
}
