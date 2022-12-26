package o;

import android.view.MotionEvent;
import android.view.View;
import com.app.dream11.contest.winningbreakup.WinningBreakupBottomSheet;
/* loaded from: classes2.dex */
public final /* synthetic */ class setDirection implements View.OnTouchListener {
    public static final /* synthetic */ setDirection ah$a = new setDirection();

    private /* synthetic */ setDirection() {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean values;
        values = WinningBreakupBottomSheet.values(view, motionEvent);
        return values;
    }
}
