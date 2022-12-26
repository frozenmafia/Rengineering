package o;

import com.apollographql.apollo.api.ExecutionContext$plus$1;
import o.ComponentActivity;
/* loaded from: classes.dex */
public interface onLaunch {
    public static final valueOf ag$a = new valueOf(null);
    public static final onLaunch toString = ComponentActivity.AnonymousClass3.ah$a;

    <R> R ah$a(R r, Transition<? super R, ? super onLaunch$ah$a, ? extends R> transition);

    onLaunch toString(onLaunch$ag$a<?> onlaunch_ag_a);

    onLaunch valueOf(onLaunch onlaunch);

    /* loaded from: classes.dex */
    public static final class toString {
        public static onLaunch valueOf(onLaunch onlaunch, onLaunch onlaunch2) {
            runAnimators.valueOf(onlaunch2, "context");
            return onlaunch2 == ComponentActivity.AnonymousClass3.ah$a ? onlaunch : (onLaunch) onlaunch2.ah$a(onlaunch, ExecutionContext$plus$1.INSTANCE);
        }
    }

    /* loaded from: classes.dex */
    public static final class valueOf {
        private valueOf() {
        }

        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }
    }
}
