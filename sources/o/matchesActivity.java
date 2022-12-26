package o;

import java.util.List;
import o.ActivityRule;
/* loaded from: classes5.dex */
public class matchesActivity {
    public static <T> void toString(androidx.viewpager.widget.ViewPager viewPager, m<? super T> mVar, List list, ActivityRule<T> activityRule, ActivityRule.toString<T> tostring) {
        if (mVar != null) {
            ActivityRule<T> activityRule2 = (ActivityRule) viewPager.getAdapter();
            if (activityRule == null) {
                activityRule = activityRule2 == null ? new ActivityRule<>() : activityRule2;
            }
            activityRule.valueOf(mVar);
            activityRule.ah$a(list);
            activityRule.values(tostring);
            if (activityRule2 != activityRule) {
                viewPager.setAdapter(activityRule);
                return;
            }
            return;
        }
        viewPager.setAdapter(null);
    }
}
