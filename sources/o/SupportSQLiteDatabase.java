package o;

import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
/* loaded from: classes5.dex */
public interface SupportSQLiteDatabase<T> extends SlidingPaneLayout.SimplePanelSlideListener<T> {
    boolean isCancelled();

    void setDisposable(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2);
}
