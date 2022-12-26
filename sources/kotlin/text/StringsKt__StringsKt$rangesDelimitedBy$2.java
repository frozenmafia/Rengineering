package kotlin.text;

import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.WindowIdImpl;
import o.getReparent;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class StringsKt__StringsKt$rangesDelimitedBy$2 extends Lambda implements Transition<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
    final /* synthetic */ List<String> $delimitersList;
    final /* synthetic */ boolean $ignoreCase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$rangesDelimitedBy$2(List<String> list, boolean z) {
        super(2);
        this.$delimitersList = list;
        this.$ignoreCase = z;
    }

    @Override // o.Transition
    public /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        return invoke(charSequence, num.intValue());
    }

    public final Pair<Integer, Integer> invoke(CharSequence charSequence, int i) {
        Pair ah$a;
        runAnimators.ag$a(charSequence, "$this$$receiver");
        ah$a = WindowIdImpl.ah$a(charSequence, (Collection<String>) this.$delimitersList, i, this.$ignoreCase, false);
        if (ah$a != null) {
            return getReparent.toString(ah$a.getFirst(), Integer.valueOf(((String) ah$a.getSecond()).length()));
        }
        return null;
    }
}
