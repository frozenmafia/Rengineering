package o;

import com.app.dream11.contest.winningbreakup.WinningItemVM;
import o.DrawerArrowDrawable;
/* loaded from: classes2.dex */
public final /* synthetic */ class setVerticalMirror implements getAlwaysExpand {
    public static final /* synthetic */ setVerticalMirror ah$a = new setVerticalMirror();

    private /* synthetic */ setVerticalMirror() {
    }

    @Override // o.getAlwaysExpand
    public final void onItemBind(m mVar, int i, Object obj) {
        DrawerArrowDrawable.ArrowDirection.values(mVar, i, (WinningItemVM) obj);
    }
}
