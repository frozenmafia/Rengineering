package kotlin.text;

import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.Visibility;
import o.getReparent;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class StringsKt__StringsKt$rangesDelimitedBy$1 extends Lambda implements Transition<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
    final /* synthetic */ char[] $delimiters;
    final /* synthetic */ boolean $ignoreCase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$rangesDelimitedBy$1(char[] cArr, boolean z) {
        super(2);
        this.$delimiters = cArr;
        this.$ignoreCase = z;
    }

    @Override // o.Transition
    public /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        return invoke(charSequence, num.intValue());
    }

    public final Pair<Integer, Integer> invoke(CharSequence charSequence, int i) {
        runAnimators.ag$a(charSequence, "$this$$receiver");
        int mode = Visibility.Mode.toString(charSequence, this.$delimiters, i, this.$ignoreCase);
        if (mode < 0) {
            return null;
        }
        return getReparent.toString(Integer.valueOf(mode), 1);
    }
}
