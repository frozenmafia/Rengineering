package o;

import o.SharedPreferencesCompat;
import o.edit;
/* loaded from: classes3.dex */
public final /* synthetic */ class UnusedAppRestrictionsBackportService implements getAlwaysExpand {
    public static final /* synthetic */ UnusedAppRestrictionsBackportService ag$a = new UnusedAppRestrictionsBackportService();

    /* renamed from: o.UnusedAppRestrictionsBackportService$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class AnonymousClass1 implements FrameworkSQLiteOpenHelperFactory {
        public static final /* synthetic */ AnonymousClass1 valueOf = new AnonymousClass1();

        private /* synthetic */ AnonymousClass1() {
        }

        @Override // o.FrameworkSQLiteOpenHelperFactory
        public final Object apply(Object obj) {
            String ah$b;
            ah$b = edit.Cdefault.ah$b((UnusedAppRestrictionsBackportCallback) obj);
            return ah$b;
        }
    }

    private /* synthetic */ UnusedAppRestrictionsBackportService() {
    }

    @Override // o.getAlwaysExpand
    public final void onItemBind(m mVar, int i, Object obj) {
        SharedPreferencesCompat.EditorCompat.Helper.ag$a(mVar, i, (edit) obj);
    }
}
