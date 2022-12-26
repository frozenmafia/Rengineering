package o;

import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
/* loaded from: classes.dex */
public interface SupportSQLiteQueryBuilder<T> extends SlidingPaneLayout.SimplePanelSlideListener<T> {
    boolean isDisposed();

    void setCancellable(AppInitializer appInitializer);

    void setDisposable(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2);
}
