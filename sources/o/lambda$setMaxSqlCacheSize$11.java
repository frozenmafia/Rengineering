package o;
/* loaded from: classes5.dex */
public final class lambda$setMaxSqlCacheSize$11 {
    private final int toString;
    private final int valueOf;

    public int ag$a() {
        return this.toString;
    }

    public int ah$a() {
        return this.valueOf;
    }

    public boolean equals(Object obj) {
        if (obj instanceof lambda$setMaxSqlCacheSize$11) {
            lambda$setMaxSqlCacheSize$11 lambda_setmaxsqlcachesize_11 = (lambda$setMaxSqlCacheSize$11) obj;
            return this.toString == lambda_setmaxsqlcachesize_11.toString && this.valueOf == lambda_setmaxsqlcachesize_11.valueOf;
        }
        return false;
    }

    public int hashCode() {
        return (this.toString * 32713) + this.valueOf;
    }

    public String toString() {
        return this.toString + "x" + this.valueOf;
    }
}
