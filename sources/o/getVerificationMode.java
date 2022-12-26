package o;

import com.sendbird.android.constant.StringSet;
import java.util.LinkedHashMap;
import java.util.Map;
import o.ViewPager2;
/* loaded from: classes5.dex */
public final class getVerificationMode {
    private final Map<String, updatePageAccessibilityActions> values = new LinkedHashMap();

    public final updatePageAccessibilityActions toString(String str, updatePageAccessibilityActions updatepageaccessibilityactions) {
        runAnimators.ag$a(str, StringSet.key);
        runAnimators.ag$a(updatepageaccessibilityactions, "element");
        return this.values.put(str, updatepageaccessibilityactions);
    }

    public final ViewPager2.SavedState valueOf() {
        return new ViewPager2.SavedState(this.values);
    }
}
