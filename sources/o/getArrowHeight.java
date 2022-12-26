package o;

import java.util.Objects;
/* loaded from: classes.dex */
public abstract class getArrowHeight<T, R> extends SimpleSQLiteQuery<R> {
    protected final SimpleSQLiteQuery<T> valueOf;

    public getArrowHeight(SimpleSQLiteQuery<T> simpleSQLiteQuery) {
        this.valueOf = (SimpleSQLiteQuery) Objects.requireNonNull(simpleSQLiteQuery, "source is null");
    }
}
