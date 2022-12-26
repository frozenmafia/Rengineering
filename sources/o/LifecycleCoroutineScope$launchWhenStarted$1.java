package o;

import com.fancode.livestream.LiveStreamActivity;
/* loaded from: classes6.dex */
public final /* synthetic */ class LifecycleCoroutineScope$launchWhenStarted$1 implements androidx.activity.result.ActivityResultCallback {
    public static final /* synthetic */ LifecycleCoroutineScope$launchWhenStarted$1 ag$a = new LifecycleCoroutineScope$launchWhenStarted$1();

    private /* synthetic */ LifecycleCoroutineScope$launchWhenStarted$1() {
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        LiveStreamActivity.toString((onActivityPreDestroyed) obj);
    }
}
