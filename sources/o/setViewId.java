package o;

import android.view.View;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class setViewId {
    public int HaptikSDK$a;
    public int HaptikSDK$b;
    int HaptikSDK$c;
    public int HaptikSDK$d;
    public int HaptikWebView;
    public int ah$a;
    int getSignupData;
    public int invoke;
    float isLogoutPending;
    float onXdkEvent;
    public int toString;
    boolean valueOf;
    boolean values;
    public int getInitSettings = Integer.MAX_VALUE;
    public int a = Integer.MAX_VALUE;
    public int HaptikSDK$e = Integer.MIN_VALUE;
    public int ag$a = Integer.MIN_VALUE;
    List<Integer> ah$b = new ArrayList();

    public int valueOf() {
        return this.ah$a;
    }

    public int values() {
        return this.HaptikSDK$b;
    }

    public int ah$a() {
        return this.HaptikSDK$b - this.HaptikSDK$c;
    }

    public void ag$a(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.getInitSettings = Math.min(this.getInitSettings, (view.getLeft() - flexItem.HaptikSDK$a()) - i);
        this.a = Math.min(this.a, (view.getTop() - flexItem.HaptikSDK$b()) - i2);
        this.HaptikSDK$e = Math.max(this.HaptikSDK$e, view.getRight() + flexItem.ah$b() + i3);
        this.ag$a = Math.max(this.ag$a, view.getBottom() + flexItem.invoke() + i4);
    }
}
