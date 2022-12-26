package arrow.core.extensions;

import arrow.core.extensions.SequenceKAlternative$some$1;
import java.util.Iterator;
import o.Transition;
/* loaded from: classes6.dex */
public final class SequenceKAlternative$some$1$valueOf$ag$a implements Iterator<A>, Transition.ArrayListManager {
    final /* synthetic */ SequenceKAlternative$some$1.valueOf valueOf;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SequenceKAlternative$some$1$valueOf$ag$a(SequenceKAlternative$some$1.valueOf valueof) {
        this.valueOf = valueof;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [A, java.lang.Object] */
    @Override // java.util.Iterator
    public A next() {
        return this.valueOf.valueOf;
    }
}
