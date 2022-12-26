package o;

import android.content.res.Resources;
import android.util.Log;
import o.FoldingFeature;
/* loaded from: classes8.dex */
public class access$windowLayoutComponentClass {
    final Resources HaptikSDK$a;
    public String HaptikSDK$b;
    public boolean HaptikSDK$c;
    int ag$a;
    Class<?> ah$a;
    final access$foldingFeatureClass ah$b;
    final int toString;
    FoldingFeature.State.Companion valueOf;
    final int values;

    public int toString(Throwable th) {
        Integer access_foldingfeatureclass = this.ah$b.toString(th);
        if (access_foldingfeatureclass != null) {
            return access_foldingfeatureclass.intValue();
        }
        String str = FoldingFeature.State.Companion.toString;
        Log.d(str, "No specific message ressource ID found for " + th);
        return this.toString;
    }

    public FoldingFeature.State.Companion valueOf() {
        FoldingFeature.State.Companion companion = this.valueOf;
        return companion != null ? companion : FoldingFeature.State.Companion.ah$a();
    }
}
