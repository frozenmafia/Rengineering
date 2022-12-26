package o;

import android.view.MotionEvent;
import android.view.View;
import com.app.dream11.contest.QuickJoinBottomSheet;
/* loaded from: classes.dex */
public final /* synthetic */ class getLocalNightMode implements View.OnTouchListener {
    public static final /* synthetic */ getLocalNightMode valueOf = new getLocalNightMode();

    private /* synthetic */ getLocalNightMode() {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean valueOf2;
        valueOf2 = QuickJoinBottomSheet.valueOf(view, motionEvent);
        return valueOf2;
    }
}
