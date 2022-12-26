package kotlin.text;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes7.dex */
public final class StringsKt___StringsKt$windowedSequence$2 extends Lambda implements Styleable.ChangeBounds<Integer, R> {
    final /* synthetic */ int $size;
    final /* synthetic */ CharSequence $this_windowedSequence;
    final /* synthetic */ Styleable.ChangeBounds<CharSequence, R> $transform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StringsKt___StringsKt$windowedSequence$2(int i, CharSequence charSequence, Styleable.ChangeBounds<? super CharSequence, ? extends R> changeBounds) {
        super(1);
        this.$size = i;
        this.$this_windowedSequence = charSequence;
        this.$transform = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [R, java.lang.Object] */
    public final R invoke(int i) {
        int i2 = this.$size + i;
        if (i2 < 0 || i2 > this.$this_windowedSequence.length()) {
            i2 = this.$this_windowedSequence.length();
        }
        return this.$transform.invoke(this.$this_windowedSequence.subSequence(i, i2));
    }
}
