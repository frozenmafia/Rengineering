package o;
/* loaded from: classes7.dex */
public abstract class newCursor<K, T> extends SimpleSQLiteQuery<T> {
    final K values;

    public newCursor(K k) {
        this.values = k;
    }
}
