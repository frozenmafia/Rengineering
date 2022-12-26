package o;
/* loaded from: classes5.dex */
public final class getOnNavigateToScreenListener implements getNextId {
    private static final Object valueOf = new Object();
    private volatile Object ag$a = valueOf;
    private volatile getNextId toString;

    private getOnNavigateToScreenListener(getNextId getnextid) {
        this.toString = getnextid;
    }

    @Override // o.getNextId
    public final Object valueOf() {
        Object obj = this.ag$a;
        Object obj2 = valueOf;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.ag$a;
                if (obj == obj2) {
                    obj = this.toString.valueOf();
                    Object obj3 = this.ag$a;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.ag$a = obj;
                    this.toString = null;
                }
            }
        }
        return obj;
    }

    public static getNextId valueOf(getNextId getnextid) {
        getnextid.getClass();
        return getnextid instanceof getOnNavigateToScreenListener ? getnextid : new getOnNavigateToScreenListener(getnextid);
    }
}
