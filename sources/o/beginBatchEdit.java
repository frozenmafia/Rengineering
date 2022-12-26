package o;

import android.app.Activity;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public interface beginBatchEdit extends getRw2Attributes {
    void values(Activity activity, String str, String str2, int i, ArrayList<String> arrayList);

    /* loaded from: classes4.dex */
    public static final class toString {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void toString(beginBatchEdit beginbatchedit, Activity activity, String str, String str2, int i, ArrayList arrayList, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: charge");
            }
            ArrayList<String> arrayList2 = arrayList;
            if ((i2 & 16) != 0) {
                arrayList2 = null;
            }
            beginbatchedit.values(activity, str, str2, i, arrayList2);
        }
    }
}
