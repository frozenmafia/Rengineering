package o;

import com.bugsnag.android.ErrorType;
import com.facebook.react.devsupport.StackTraceHelper;
import com.sendbird.android.constant.StringSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import o.ViewCompat;
/* loaded from: classes6.dex */
class setSaveFromParentEnabled {
    private final setContentChangeTypes ah$a;
    private final Collection<String> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSaveFromParentEnabled(Collection<String> collection, setContentChangeTypes setcontentchangetypes) {
        this.values = collection;
        this.ah$a = setcontentchangetypes;
    }

    public List<ViewCompat.AnonymousClass3> values(Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        for (Map<String, Object> map2 : (List) setNextClusterForwardId.valueOf(map, "nativeStack")) {
            arrayList.add(ag$a(map2, this.values));
        }
        return new ViewCompat.AnonymousClass2(arrayList).values();
    }

    private ViewCompat.AnonymousClass3 ag$a(Map<String, Object> map, Collection<String> collection) {
        String str = (String) setNextClusterForwardId.toString(map, "methodName");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = (String) setNextClusterForwardId.toString(map, com.apxor.androidsdk.core.Constants.CLASS);
        String str4 = str3 + "." + str;
        if (str3 != null) {
            str2 = str3;
            str = str4;
        }
        ViewCompat.AnonymousClass3 anonymousClass3 = new ViewCompat.AnonymousClass3(str, (String) setNextClusterForwardId.toString(map, StringSet.file), (Number) setNextClusterForwardId.toString(map, StackTraceHelper.LINE_NUMBER_KEY), ViewCompat.AnonymousClass2.values.ag$a(str2, collection));
        anonymousClass3.toString(ErrorType.ANDROID);
        return anonymousClass3;
    }
}
