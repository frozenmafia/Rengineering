package o;
/* loaded from: classes7.dex */
public final class storeOriginals<T, R> extends groupBy<R> {
    final FrameworkSQLiteOpenHelperFactory<? super T, ? extends R> ag$a;
    final having<? extends T> ah$a;

    @Override // o.groupBy
    protected void toString(appendClause<? super R> appendclause) {
        this.ah$a.values(new storeOriginals$ah$a(appendclause, this.ag$a));
    }
}
