package o;

import com.facebook.react.modules.core.ReactChoreographer;
import o.containsActiveFragment;
/* loaded from: classes4.dex */
class containsActiveFragment$ag$a extends burpActive$ag$a {
    final /* synthetic */ containsActiveFragment ag$a;

    private containsActiveFragment$ag$a(containsActiveFragment containsactivefragment) {
        this.ag$a = containsactivefragment;
    }

    @Override // o.burpActive$ag$a
    public void doFrame(long j) {
        if (!containsActiveFragment.toString(this.ag$a).get() || containsActiveFragment.ag$a(this.ag$a).get()) {
            if (containsActiveFragment.ah$a(this.ag$a) != null) {
                containsActiveFragment.ah$a(this.ag$a).ag$a();
            }
            containsActiveFragment containsactivefragment = this.ag$a;
            containsActiveFragment.ah$a(containsactivefragment, new containsActiveFragment.valueOf(j));
            containsActiveFragment.values(this.ag$a).runOnJSQueueThread(containsActiveFragment.ah$a(this.ag$a));
            containsActiveFragment.valueOf(this.ag$a).valueOf(ReactChoreographer.CallbackType.IDLE_EVENT, this);
        }
    }
}
