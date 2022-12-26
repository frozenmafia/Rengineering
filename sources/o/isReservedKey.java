package o;

import com.wheelpicker.LoopView;
import java.util.TimerTask;
/* loaded from: classes5.dex */
public final class isReservedKey extends TimerTask {
    final float ag$a;
    final LoopView ah$a;
    float values = 2.14748365E9f;

    public isReservedKey(LoopView loopView, float f) {
        this.ah$a = loopView;
        this.ag$a = f;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        LoopView loopView;
        LoopView loopView2;
        if (this.values == 2.14748365E9f) {
            if (Math.abs(this.ag$a) > 2000.0f) {
                if (this.ag$a > 0.0f) {
                    this.values = 2000.0f;
                } else {
                    this.values = -2000.0f;
                }
            } else {
                this.values = this.ag$a;
            }
        }
        if (Math.abs(this.values) >= 0.0f && Math.abs(this.values) <= 20.0f) {
            this.ah$a.ah$a();
            this.ah$a.ah$b.sendEmptyMessage(2000);
            return;
        }
        this.ah$a.onNavigationEvent -= (int) ((this.values * 10.0f) / 1000.0f);
        if (!this.ah$a.HaptikSDK$e) {
            float f = this.ah$a.getInitSettings * this.ah$a.onXdkEvent;
            if (this.ah$a.onNavigationEvent <= ((int) ((-this.ah$a.HaptikSDK$d) * f))) {
                this.values = 40.0f;
                this.ah$a.onNavigationEvent = (int) ((-loopView2.HaptikSDK$d) * f);
            } else if (this.ah$a.onNavigationEvent >= ((int) (((this.ah$a.valueOf.size() - 1) - this.ah$a.HaptikSDK$d) * f))) {
                this.ah$a.onNavigationEvent = (int) (((loopView.valueOf.size() - 1) - this.ah$a.HaptikSDK$d) * f);
                this.values = -40.0f;
            }
        }
        float f2 = this.values;
        if (f2 < 0.0f) {
            this.values = f2 + 20.0f;
        } else {
            this.values = f2 - 20.0f;
        }
        this.ah$a.ah$b.sendEmptyMessage(1000);
    }
}
