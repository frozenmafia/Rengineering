package o;

import com.bugsnag.android.ErrorType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.ViewCompat;
/* loaded from: classes6.dex */
class offsetLeftAndRight {
    private final setImportantForAccessibility valueOf;
    private final ViewCompat.AnonymousClass4 values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public offsetLeftAndRight(ViewCompat.AnonymousClass4 anonymousClass4, setImportantForAccessibility setimportantforaccessibility) {
        this.values = anonymousClass4;
        this.valueOf = setimportantforaccessibility;
    }

    public paneTitleProperty ah$a(Map<String, Object> map) {
        String str = (String) setNextClusterForwardId.valueOf(map, "type");
        ArrayList arrayList = new ArrayList();
        for (Map<String, Object> map2 : (List) setNextClusterForwardId.valueOf(map, "stacktrace")) {
            arrayList.add(this.values.toString(map2));
        }
        return new paneTitleProperty(new performReceiveContent((String) setNextClusterForwardId.valueOf(map, "errorClass"), (String) setNextClusterForwardId.toString(map, "errorMessage"), new ViewCompat.AnonymousClass2(arrayList), ErrorType.valueOf(str.toUpperCase(Locale.US))), this.valueOf);
    }
}
