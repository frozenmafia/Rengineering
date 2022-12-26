package o;

import com.sendbird.android.constant.StringSet;
import kotlin.TypeCastException;
import o.ComponentActivity;
/* loaded from: classes.dex */
public interface onLaunch$ah$a extends onLaunch {
    <E extends onLaunch$ah$a> E ag$a(onLaunch$ag$a<E> onlaunch_ag_a);

    onLaunch$ag$a<?> values();

    /* loaded from: classes.dex */
    public static final class toString {
        /* JADX WARN: Multi-variable type inference failed */
        public static <E extends onLaunch$ah$a> E ag$a(onLaunch$ah$a onlaunch_ah_a, onLaunch$ag$a<E> onlaunch_ag_a) {
            runAnimators.valueOf(onlaunch_ag_a, StringSet.key);
            if (runAnimators.values(onlaunch_ah_a.values(), onlaunch_ag_a)) {
                if (onlaunch_ah_a != 0) {
                    return onlaunch_ah_a;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            }
            return null;
        }

        public static onLaunch toString(onLaunch$ah$a onlaunch_ah_a, onLaunch$ag$a<?> onlaunch_ag_a) {
            runAnimators.valueOf(onlaunch_ag_a, StringSet.key);
            boolean values = runAnimators.values(onlaunch_ah_a.values(), onlaunch_ag_a);
            onLaunch onlaunch = onlaunch_ah_a;
            if (values) {
                onlaunch = ComponentActivity.AnonymousClass3.ah$a;
            }
            return onlaunch;
        }
    }
}
