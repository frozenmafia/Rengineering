package o;

import o.CoordinatorLayout;
/* loaded from: classes3.dex */
public final /* synthetic */ class resolveAnchorView implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ resolveAnchorView valueOf = new resolveAnchorView();

    private /* synthetic */ resolveAnchorView() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Integer invoke;
        invoke = CoordinatorLayout.DispatchChangeEvent.invoke((CoordinatorLayout.HierarchyChangeListener) obj);
        return invoke;
    }
}
