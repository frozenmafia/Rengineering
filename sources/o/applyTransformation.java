package o;

import o.FrameworkSQLiteDatabase;
import o.FrameworkSQLiteOpenHelper;
import o.SlidingPaneLayout;
/* loaded from: classes.dex */
public final class applyTransformation extends isDraggable {
    final FrameworkSQLiteOpenHelper.OpenHelper values;

    public applyTransformation(FrameworkSQLiteOpenHelper.OpenHelper openHelper) {
        this.values = openHelper;
    }

    @Override // o.isDraggable
    protected void valueOf(SlidingPaneLayout.SavedState savedState) {
        FrameworkSQLiteDatabase.AnonymousClass2 values = isDelegate.values();
        savedState.onSubscribe(values);
        try {
            this.values.run();
            if (values.isDisposed()) {
                return;
            }
            savedState.onComplete();
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            if (!values.isDisposed()) {
                savedState.onError(th);
            } else {
                setProgressBackgroundColor.values(th);
            }
        }
    }
}
