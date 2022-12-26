package o;

import android.os.Handler;
import android.os.Message;
import com.appsamurai.storyly.exoplayer2.core.ExoPlaybackException;
import o.computeFirstMatchIndex;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class setOnExitAnimationListener$ag$a implements computeFirstMatchIndex.values, Handler.Callback {
    final /* synthetic */ setOnExitAnimationListener ag$a;
    private final Handler ah$a;

    public setOnExitAnimationListener$ag$a(setOnExitAnimationListener setonexitanimationlistener, computeFirstMatchIndex computefirstmatchindex) {
        this.ag$a = setonexitanimationlistener;
        Handler ah$a = getElevationDegrees.ah$a((Handler.Callback) this);
        this.ah$a = ah$a;
        computefirstmatchindex.toString(this, ah$a);
    }

    @Override // o.computeFirstMatchIndex.values
    public void ah$a(computeFirstMatchIndex computefirstmatchindex, long j, long j2) {
        if (getElevationDegrees.HaptikSDK$b < 30) {
            this.ah$a.sendMessageAtFrontOfQueue(Message.obtain(this.ah$a, 0, (int) (j >> 32), (int) j));
            return;
        }
        ah$a(j);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        ah$a(getElevationDegrees.ah$a(message.arg1, message.arg2));
        return true;
    }

    private void ah$a(long j) {
        if (this != this.ag$a.ah$a) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            this.ag$a.onExtraCallback();
            return;
        }
        try {
            this.ag$a.ah$a(j);
        } catch (ExoPlaybackException e) {
            this.ag$a.ah$a(e);
        }
    }
}
