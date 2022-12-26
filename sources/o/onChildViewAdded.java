package o;

import o.CoordinatorLayout;
/* loaded from: classes3.dex */
public final /* synthetic */ class onChildViewAdded implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ onChildViewAdded valueOf = new onChildViewAdded();

    private /* synthetic */ onChildViewAdded() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean ah$b;
        ah$b = CoordinatorLayout.DispatchChangeEvent.ah$b((CoordinatorLayout.HierarchyChangeListener) obj);
        return ah$b;
    }
}
