package o;

import o.getCipher;
import o.onAuthenticationError;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class getCipher$ah$a<T> {
    private boolean ag$a;
    public final T toString;
    private onAuthenticationError.toString valueOf = new onAuthenticationError.toString();
    private boolean values;

    public getCipher$ah$a(T t) {
        this.toString = t;
    }

    public void ah$a(getCipher.toString<T> tostring) {
        this.ag$a = true;
        if (this.values) {
            tostring.valueOf(this.toString, this.valueOf.values());
        }
    }

    public void toString(int i, getCipher$ag$a<T> getcipher_ag_a) {
        if (this.ag$a) {
            return;
        }
        if (i != -1) {
            this.valueOf.ah$a(i);
        }
        this.values = true;
        getcipher_ag_a.ag$a(this.toString);
    }

    public void values(getCipher.toString<T> tostring) {
        if (this.ag$a || !this.values) {
            return;
        }
        onAuthenticationError values = this.valueOf.values();
        this.valueOf = new onAuthenticationError.toString();
        this.values = false;
        tostring.valueOf(this.toString, values);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.toString.equals(((getCipher$ah$a) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }
}
