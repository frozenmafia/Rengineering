package o;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
/* loaded from: classes4.dex */
public class getMaxScrollX {
    public static AccessibilityRecordCompat values(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, isScrollable isscrollable, createWrapper createwrapper) {
        AccessibilityRecordCompat setmaxscrollx;
        if (new getBeforeText(context, cleverTapInstanceConfig, isscrollable).ah$b()) {
            setmaxscrollx = new getMaxScrollY(cleverTapInstanceConfig);
        } else {
            setmaxscrollx = new setMaxScrollX(context, cleverTapInstanceConfig, isscrollable, createwrapper);
        }
        cleverTapInstanceConfig.valueOf("ON_USER_LOGIN", "Repo provider: " + setmaxscrollx.getClass().getSimpleName());
        return setmaxscrollx;
    }
}
