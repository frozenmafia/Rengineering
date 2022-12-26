package o;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.swmansion.gesturehandler.GestureHandler;
import o.FtsTableInfo;
/* loaded from: classes5.dex */
public final class copyAndClose extends GestureHandler<copyAndClose> {
    private float HaptikSDK$a;
    private double HaptikSDK$b;
    private FtsTableInfo HaptikSDK$c;
    private float invoke;
    private double valueOf;
    private float values = Float.NaN;
    private float toString = Float.NaN;
    private final FtsTableInfo.toString ag$a = new FtsTableInfo.toString() { // from class: o.copyAndClose$ag$a
        @Override // o.FtsTableInfo.toString
        public void ah$a(FtsTableInfo ftsTableInfo) {
            runAnimators.ag$a(ftsTableInfo, "detector");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            copyAndClose.this.HaptikSDK$b(false);
        }

        @Override // o.FtsTableInfo.toString
        public boolean ag$a(FtsTableInfo ftsTableInfo) {
            float f;
            float f2;
            runAnimators.ag$a(ftsTableInfo, "detector");
            double receiveFile = copyAndClose.this.receiveFile();
            copyAndClose copyandclose = copyAndClose.this;
            copyandclose.valueOf = copyandclose.receiveFile() * ftsTableInfo.ag$a();
            long HaptikSDK$b = ftsTableInfo.HaptikSDK$b();
            if (HaptikSDK$b > 0) {
                copyAndClose copyandclose2 = copyAndClose.this;
                copyandclose2.HaptikSDK$b = (copyandclose2.receiveFile() - receiveFile) / HaptikSDK$b;
            }
            f = copyAndClose.this.HaptikSDK$a;
            float abs = Math.abs(f - ftsTableInfo.values());
            f2 = copyAndClose.this.invoke;
            if (abs < f2 || copyAndClose.this.ak$a() != 2) {
                return true;
            }
            copyAndClose.this.ah$b();
            return true;
        }

        @Override // o.FtsTableInfo.toString
        public boolean toString(FtsTableInfo ftsTableInfo) {
            runAnimators.ag$a(ftsTableInfo, "detector");
            copyAndClose.this.HaptikSDK$a = ftsTableInfo.values();
            return true;
        }
    };

    public final double receiveFile() {
        return this.valueOf;
    }

    public final double newSessionWithExtras() {
        return this.HaptikSDK$b;
    }

    public final float extraCommand() {
        return this.values;
    }

    public final float newSession() {
        return this.toString;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf(MotionEvent motionEvent, MotionEvent motionEvent2) {
        runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        runAnimators.ag$a(motionEvent2, "sourceEvent");
        if (ak$a() == 0) {
            View onPostMessage = onPostMessage();
            runAnimators.toString(onPostMessage);
            Context context = onPostMessage.getContext();
            ICustomTabsService();
            this.HaptikSDK$c = new FtsTableInfo(context, this.ag$a);
            this.invoke = ViewConfiguration.get(context).getScaledTouchSlop();
            HaptikSDK$a();
        }
        FtsTableInfo ftsTableInfo = this.HaptikSDK$c;
        if (ftsTableInfo != null) {
            ftsTableInfo.ag$a(motionEvent2);
        }
        FtsTableInfo ftsTableInfo2 = this.HaptikSDK$c;
        if (ftsTableInfo2 != null) {
            PointF ah$a = ah$a(new PointF(ftsTableInfo2.valueOf(), ftsTableInfo2.ah$a()));
            this.values = ah$a.x;
            this.toString = ah$a.y;
        }
        int pointerCount = motionEvent2.getPointerCount();
        if (motionEvent2.getActionMasked() == 6) {
            pointerCount--;
        }
        if (ak$a() == 4 && pointerCount < 2) {
            HaptikWebView();
        } else if (motionEvent2.getActionMasked() == 1) {
            getSignupData();
        }
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf(boolean z) {
        if (ak$a() != 4) {
            ICustomTabsService();
        }
        super.valueOf(z);
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void values() {
        this.HaptikSDK$c = null;
        this.values = Float.NaN;
        this.toString = Float.NaN;
        ICustomTabsService();
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void ICustomTabsService() {
        this.HaptikSDK$b = 0.0d;
        this.valueOf = 1.0d;
    }
}
