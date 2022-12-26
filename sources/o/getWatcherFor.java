package o;
/* loaded from: classes4.dex */
public final /* synthetic */ class getWatcherFor implements FrameworkSQLiteStatement {
    public final /* synthetic */ isWatcher valueOf;

    public /* synthetic */ getWatcherFor(isWatcher iswatcher) {
        this.valueOf = iswatcher;
    }

    @Override // o.FrameworkSQLiteStatement
    public final void accept(Object obj) {
        isWatcher.valueOf(this.valueOf, (Throwable) obj);
    }
}
