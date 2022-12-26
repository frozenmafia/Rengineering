package o;

import o.withEndAction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class withEndAction$ah$a implements yBy {
    private Class<?> ag$a;
    private final withEndAction.valueOf valueOf;
    int values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public withEndAction$ah$a(withEndAction.valueOf valueof) {
        this.valueOf = valueof;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(int i, Class<?> cls) {
        this.values = i;
        this.ag$a = cls;
    }

    public boolean equals(Object obj) {
        if (obj instanceof withEndAction$ah$a) {
            withEndAction$ah$a withendaction_ah_a = (withEndAction$ah$a) obj;
            if (this.values == withendaction_ah_a.values && this.ag$a == withendaction_ah_a.ag$a) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Key{size=" + this.values + "array=" + this.ag$a + '}';
    }

    @Override // o.yBy
    public void values() {
        this.valueOf.ag$a(this);
    }

    public int hashCode() {
        int i = this.values;
        Class<?> cls = this.ag$a;
        return (i * 31) + (cls != null ? cls.hashCode() : 0);
    }
}
