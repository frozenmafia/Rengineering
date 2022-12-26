package o;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
/* loaded from: classes4.dex */
public class burpActive {
    private static burpActive ah$a;
    private Choreographer valueOf = ah$a();

    public static burpActive ag$a() {
        UiThreadUtil.assertOnUiThread();
        if (ah$a == null) {
            ah$a = new burpActive();
        }
        return ah$a;
    }

    private burpActive() {
    }

    public void valueOf(burpActive$ag$a burpactive_ag_a) {
        ag$a(burpactive_ag_a.getFrameCallback());
    }

    public void toString(burpActive$ag$a burpactive_ag_a) {
        toString(burpactive_ag_a.getFrameCallback());
    }

    private Choreographer ah$a() {
        return Choreographer.getInstance();
    }

    private void ag$a(Choreographer.FrameCallback frameCallback) {
        this.valueOf.postFrameCallback(frameCallback);
    }

    private void toString(Choreographer.FrameCallback frameCallback) {
        this.valueOf.removeFrameCallback(frameCallback);
    }
}
