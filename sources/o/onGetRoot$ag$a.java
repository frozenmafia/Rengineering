package o;

import android.content.Context;
import android.graphics.RectF;
import android.widget.OverScroller;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class onGetRoot$ag$a implements Runnable {
    private int ag$a;
    private int ah$a;
    private final OverScroller toString;
    final /* synthetic */ onGetRoot values;

    public onGetRoot$ag$a(onGetRoot ongetroot, Context context) {
        this.values = ongetroot;
        this.toString = new OverScroller(context);
    }

    public void values() {
        this.toString.forceFinished(true);
    }

    public void values(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        RectF ah$a = this.values.ah$a();
        if (ah$a == null) {
            return;
        }
        int round = Math.round(-ah$a.left);
        float f = i;
        if (f < ah$a.width()) {
            i6 = Math.round(ah$a.width() - f);
            i5 = 0;
        } else {
            i5 = round;
            i6 = i5;
        }
        int round2 = Math.round(-ah$a.top);
        float f2 = i2;
        if (f2 < ah$a.height()) {
            i8 = Math.round(ah$a.height() - f2);
            i7 = 0;
        } else {
            i7 = round2;
            i8 = i7;
        }
        this.ah$a = round;
        this.ag$a = round2;
        if (round == i6 && round2 == i8) {
            return;
        }
        this.toString.fling(round, round2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.toString.isFinished() && this.toString.computeScrollOffset()) {
            int currX = this.toString.getCurrX();
            int currY = this.toString.getCurrY();
            this.values.asInterface.postTranslate(this.ah$a - currX, this.ag$a - currY);
            this.values.getSignupData();
            this.ah$a = currX;
            this.ag$a = currY;
            hasDuplicatedItems.valueOf(this.values.HaptikSDK$d, this);
        }
    }
}
