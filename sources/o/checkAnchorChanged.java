package o;

import o.CoordinatorLayout;
/* loaded from: classes3.dex */
public final /* synthetic */ class checkAnchorChanged implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ checkAnchorChanged ag$a = new checkAnchorChanged();

    private /* synthetic */ checkAnchorChanged() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean initSettings;
        initSettings = CoordinatorLayout.DispatchChangeEvent.getInitSettings((CoordinatorLayout.HierarchyChangeListener) obj);
        return initSettings;
    }
}
