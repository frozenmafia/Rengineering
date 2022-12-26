package com.google.common.base;

import java.io.Serializable;
import o.hasPendingUpdates;
import o.markViewHoldersUpdated;
import o.recycleUpdateOp;
/* loaded from: classes7.dex */
final class FunctionalEquivalence<F, T> extends Equivalence<F> implements Serializable {
    private static final long serialVersionUID = 0;
    private final hasPendingUpdates<? super F, ? extends T> function;
    private final Equivalence<T> resultEquivalence;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FunctionalEquivalence(hasPendingUpdates<? super F, ? extends T> haspendingupdates, Equivalence<T> equivalence) {
        this.function = (hasPendingUpdates) markViewHoldersUpdated.toString(haspendingupdates);
        this.resultEquivalence = (Equivalence) markViewHoldersUpdated.toString(equivalence);
    }

    @Override // com.google.common.base.Equivalence
    protected boolean doEquivalent(F f, F f2) {
        return this.resultEquivalence.equivalent(this.function.apply(f), this.function.apply(f2));
    }

    @Override // com.google.common.base.Equivalence
    protected int doHash(F f) {
        return this.resultEquivalence.hash(this.function.apply(f));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionalEquivalence) {
            FunctionalEquivalence functionalEquivalence = (FunctionalEquivalence) obj;
            return this.function.equals(functionalEquivalence.function) && this.resultEquivalence.equals(functionalEquivalence.resultEquivalence);
        }
        return false;
    }

    public int hashCode() {
        return recycleUpdateOp.valueOf(this.function, this.resultEquivalence);
    }

    public String toString() {
        String valueOf = String.valueOf(this.resultEquivalence);
        String valueOf2 = String.valueOf(this.function);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
