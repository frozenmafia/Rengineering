package o;

import com.sendbird.android.constant.StringSet;
import o.ComponentActivity;
import o.onLaunch;
/* loaded from: classes.dex */
public final class startIntentSenderForResult implements onLaunch {
    private final onLaunch$ah$a valueOf;
    private final onLaunch values;

    public startIntentSenderForResult(onLaunch onlaunch, onLaunch$ah$a onlaunch_ah_a) {
        runAnimators.valueOf(onlaunch, "left");
        runAnimators.valueOf(onlaunch_ah_a, "element");
        this.values = onlaunch;
        this.valueOf = onlaunch_ah_a;
    }

    @Override // o.onLaunch
    public onLaunch valueOf(onLaunch onlaunch) {
        runAnimators.valueOf(onlaunch, "context");
        return onLaunch.toString.valueOf(this, onlaunch);
    }

    @Override // o.onLaunch
    public <R> R ah$a(R r, Transition<? super R, ? super onLaunch$ah$a, ? extends R> transition) {
        runAnimators.valueOf(transition, "operation");
        return transition.invoke((Object) this.values.ah$a(r, transition), this.valueOf);
    }

    @Override // o.onLaunch
    public onLaunch toString(onLaunch$ag$a<?> onlaunch_ag_a) {
        runAnimators.valueOf(onlaunch_ag_a, StringSet.key);
        if (this.valueOf.ag$a(onlaunch_ag_a) != null) {
            return this.values;
        }
        onLaunch onlaunch = this.values.toString(onlaunch_ag_a);
        return onlaunch == this.values ? this : onlaunch == ComponentActivity.AnonymousClass3.ah$a ? this.valueOf : new startIntentSenderForResult(onlaunch, this.valueOf);
    }
}
