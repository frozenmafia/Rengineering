package o;

import o.FragmentStateAdapter;
/* loaded from: classes5.dex */
public abstract class registerOnPageChangeCallback extends onLmPerformAccessibilityAction<String> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.onLmPerformAccessibilityAction
    /* renamed from: HaptikSDK$d */
    public final String HaptikSDK$e(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i) {
        runAnimators.ag$a(dataSetChangeObserver, "<this>");
        return valueOf(ah$b(dataSetChangeObserver, i));
    }

    protected final String valueOf(String str) {
        runAnimators.ag$a(str, "nestedName");
        String A_ = A_();
        if (A_ == null) {
            A_ = "";
        }
        return ah$a(A_, str);
    }

    protected String ah$b(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i) {
        runAnimators.ag$a(dataSetChangeObserver, "desc");
        return dataSetChangeObserver.ah$a(i);
    }

    protected String ah$a(String str, String str2) {
        runAnimators.ag$a(str, "parentName");
        runAnimators.ag$a(str2, "childName");
        if (str.length() == 0) {
            return str2;
        }
        return str + '.' + str2;
    }
}
