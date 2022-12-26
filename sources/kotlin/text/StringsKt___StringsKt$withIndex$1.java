package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Visibility;
/* loaded from: classes7.dex */
public final class StringsKt___StringsKt$withIndex$1 extends Lambda implements Styleable.ArcMotion<Iterator<? extends Character>> {
    final /* synthetic */ CharSequence $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StringsKt___StringsKt$withIndex$1(CharSequence charSequence) {
        super(0);
        this.$this_withIndex = charSequence;
    }

    @Override // o.Styleable.ArcMotion
    public final Iterator<? extends Character> invoke() {
        return Visibility.Mode.valueOf(this.$this_withIndex);
    }
}
