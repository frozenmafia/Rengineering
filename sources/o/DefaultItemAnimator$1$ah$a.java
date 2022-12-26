package o;

import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
protected abstract class DefaultItemAnimator$1$ah$a<PrimitiveT, KeyT> {
    private final Class<PrimitiveT> toString;

    public abstract PrimitiveT ag$a(KeyT keyt) throws GeneralSecurityException;

    public DefaultItemAnimator$1$ah$a(Class<PrimitiveT> cls) {
        this.toString = cls;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<PrimitiveT> ah$a() {
        return this.toString;
    }
}
