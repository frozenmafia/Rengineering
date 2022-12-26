package arrow.core.extensions;

import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getReparent;
import o.postMessage;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SortedMapKSemialign$align$1$1 extends Lambda implements Styleable.ChangeBounds<postMessage<? extends A, ? extends B>, Pair<? extends K, ? extends postMessage<? extends A, ? extends B>>> {
    final /* synthetic */ Comparable $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SortedMapKSemialign$align$1$1(Comparable comparable) {
        super(1);
        this.$key = comparable;
    }

    @Override // o.Styleable.ChangeBounds
    public final Pair<K, postMessage<A, B>> invoke(postMessage<? extends A, ? extends B> postmessage) {
        runAnimators.valueOf(postmessage, "it");
        return getReparent.toString(this.$key, postmessage);
    }
}
