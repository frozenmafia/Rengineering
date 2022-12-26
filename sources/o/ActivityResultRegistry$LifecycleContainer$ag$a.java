package o;

import com.apollographql.apollo.api.ResponseField;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ActivityResultRegistry$LifecycleContainer$ag$a {
    private ActivityResultRegistry$LifecycleContainer$ag$a() {
    }

    public /* synthetic */ ActivityResultRegistry$LifecycleContainer$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ag$a(ResponseField responseField, Object obj) {
        if (responseField.ah$a() || obj != null) {
            return;
        }
        setCanRemoveViews setcanremoveviews = setCanRemoveViews.ah$a;
        String format = String.format("Mandatory response field `%s` resolved with null value", Arrays.copyOf(new Object[]{responseField.HaptikSDK$b()}, 1));
        runAnimators.ah$a(format, "java.lang.String.format(format, *args)");
        throw new NullPointerException(format);
    }
}
