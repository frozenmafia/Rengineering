package o;

import o.AlertController;
/* loaded from: classes.dex */
public final /* synthetic */ class resolveDialogTheme implements FrameworkSQLiteOpenHelper {
    public static final /* synthetic */ resolveDialogTheme valueOf = new resolveDialogTheme();

    private /* synthetic */ resolveDialogTheme() {
    }

    @Override // o.FrameworkSQLiteOpenHelper
    public final Object apply(Object obj, Object obj2) {
        return AlertController.RecycleListView.values((Boolean) obj, (String) obj2);
    }
}
