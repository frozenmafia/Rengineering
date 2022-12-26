package o;

import com.app.dream11.model.FbLoginResult;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.performShortcut;
/* loaded from: classes2.dex */
final class performShortcut$ah$a implements FrameworkSQLiteDatabase.AnonymousClass2 {
    private SupportSQLiteOpenHelper.Factory<? super FbLoginResult> toString;
    private boolean valueOf;
    private performShortcut.values values;

    private performShortcut$ah$a(performShortcut.values valuesVar, SupportSQLiteOpenHelper.Factory<? super FbLoginResult> factory) {
        this.valueOf = false;
        this.values = valuesVar;
        this.toString = factory;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        this.values.ag$a((SupportSQLiteOpenHelper.Factory) this.toString);
        this.valueOf = true;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.valueOf;
    }
}
