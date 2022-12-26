package o;

import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes4.dex */
public final /* synthetic */ class detachFragment implements View.OnTouchListener {
    public static final /* synthetic */ detachFragment ag$a = new detachFragment();

    private /* synthetic */ detachFragment() {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean begintransaction;
        begintransaction = beginTransaction.toString(view, motionEvent);
        return begintransaction;
    }
}
