package arrow.core.extensions;

import arrow.core.extensions.SequenceKAlternative$many$1;
import java.util.Iterator;
import o.Transition;
/* loaded from: classes6.dex */
public final class SequenceKAlternative$many$1$values$ah$a implements Iterator<A>, Transition.ArrayListManager {
    final /* synthetic */ SequenceKAlternative$many$1.values ag$a;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SequenceKAlternative$many$1$values$ah$a(SequenceKAlternative$many$1.values valuesVar) {
        this.ag$a = valuesVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [A, java.lang.Object] */
    @Override // java.util.Iterator
    public A next() {
        return this.ag$a.ag$a;
    }
}
