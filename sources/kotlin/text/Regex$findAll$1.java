package kotlin.text;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getVisibilityChangeInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class Regex$findAll$1 extends Lambda implements Styleable.ArcMotion<getVisibilityChangeInfo> {
    final /* synthetic */ CharSequence $input;
    final /* synthetic */ int $startIndex;
    final /* synthetic */ Regex this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Regex$findAll$1(Regex regex, CharSequence charSequence, int i) {
        super(0);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$startIndex = i;
    }

    @Override // o.Styleable.ArcMotion
    public final getVisibilityChangeInfo invoke() {
        return this.this$0.find(this.$input, this.$startIndex);
    }
}
