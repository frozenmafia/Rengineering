package o;

import android.content.Context;
import java.util.List;
import o.Styleable;
/* loaded from: classes3.dex */
public final class instantiateActivity {
    public static final AppComponentFactory values(Context context, List<setAlarmClock> list, Styleable.ChangeBounds<? super AppComponentFactory$ah$a, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(list, "listOfReaction");
        runAnimators.ag$a(changeBounds, "init");
        AppComponentFactory$ah$a appComponentFactory$ah$a = new AppComponentFactory$ah$a(context, list);
        changeBounds.invoke(appComponentFactory$ah$a);
        return appComponentFactory$ah$a.values();
    }
}
