package o;

import android.view.MotionEvent;
import android.view.View;
import com.app.dream11.teamselection.lineupsplayer.CreateTeamLineUpsBottomSheet;
/* loaded from: classes3.dex */
public final /* synthetic */ class setUri implements View.OnTouchListener {
    public static final /* synthetic */ setUri ag$a = new setUri();

    private /* synthetic */ setUri() {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean valueOf;
        valueOf = CreateTeamLineUpsBottomSheet.valueOf(view, motionEvent);
        return valueOf;
    }
}
