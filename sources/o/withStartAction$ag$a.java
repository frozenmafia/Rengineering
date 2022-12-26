package o;

import android.graphics.Bitmap;
import o.WindowInsetsControllerCompat;
import o.withStartAction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class withStartAction$ag$a implements yBy {
    private final withStartAction.valueOf ag$a;
    int ah$a;
    private Bitmap.Config valueOf;

    public withStartAction$ag$a(withStartAction.valueOf valueof) {
        this.ag$a = valueof;
    }

    public void toString(int i, Bitmap.Config config) {
        this.ah$a = i;
        this.valueOf = config;
    }

    @Override // o.yBy
    public void values() {
        this.ag$a.ag$a(this);
    }

    public String toString() {
        return withStartAction.values(this.ah$a, this.valueOf);
    }

    public boolean equals(Object obj) {
        if (obj instanceof withStartAction$ag$a) {
            withStartAction$ag$a withstartaction_ag_a = (withStartAction$ag$a) obj;
            if (this.ah$a == withstartaction_ag_a.ah$a && WindowInsetsControllerCompat.Impl30.AnonymousClass1.ah$a(this.valueOf, withstartaction_ag_a.valueOf)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.ah$a;
        Bitmap.Config config = this.valueOf;
        return (i * 31) + (config != null ? config.hashCode() : 0);
    }
}
