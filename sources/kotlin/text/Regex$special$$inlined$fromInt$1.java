package kotlin.text;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes7.dex */
public final class Regex$special$$inlined$fromInt$1 extends Lambda implements Styleable.ChangeBounds<RegexOption, Boolean> {
    final /* synthetic */ int $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Regex$special$$inlined$fromInt$1(int i) {
        super(1);
        this.$value = i;
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(RegexOption regexOption) {
        RegexOption regexOption2 = regexOption;
        return Boolean.valueOf((this.$value & regexOption2.getMask()) == regexOption2.getValue());
    }
}
