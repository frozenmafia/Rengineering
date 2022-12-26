package o;
/* loaded from: classes4.dex */
public class dispatchFragmentsOnCreateView implements getSupportLoaderManager {
    private static dispatchFragmentsOnCreateView toString;

    @Override // o.getSupportLoaderManager
    public void ag$a(onNewIntent onnewintent) {
    }

    public static dispatchFragmentsOnCreateView ag$a() {
        dispatchFragmentsOnCreateView dispatchfragmentsoncreateview;
        synchronized (dispatchFragmentsOnCreateView.class) {
            if (toString == null) {
                toString = new dispatchFragmentsOnCreateView();
            }
            dispatchfragmentsoncreateview = toString;
        }
        return dispatchfragmentsoncreateview;
    }
}
