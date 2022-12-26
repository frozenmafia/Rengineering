package o;

import android.view.MotionEvent;
import android.view.View;
import com.app.dream11.contest.ChooseTeamBottomSheet;
/* loaded from: classes.dex */
public final /* synthetic */ class getCustomView implements View.OnTouchListener {
    public static final /* synthetic */ getCustomView ah$a = new getCustomView();

    private /* synthetic */ getCustomView() {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean ah$a2;
        ah$a2 = ChooseTeamBottomSheet.ah$a(view, motionEvent);
        return ah$a2;
    }
}
