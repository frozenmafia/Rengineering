package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class getFOLD {
    final SafeWindowLayoutComponentProvider ag$a;
    final Object ah$a;
    volatile boolean toString = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getFOLD(Object obj, SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider) {
        this.ah$a = obj;
        this.ag$a = safeWindowLayoutComponentProvider;
    }

    public boolean equals(Object obj) {
        if (obj instanceof getFOLD) {
            getFOLD getfold = (getFOLD) obj;
            if (this.ah$a == getfold.ah$a && this.ag$a.equals(getfold.ag$a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.ah$a.hashCode() + this.ag$a.ah$a.hashCode();
    }
}
