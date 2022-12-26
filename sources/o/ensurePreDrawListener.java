package o;

import com.app.dream11.presenter.share.sendbuttoncomponent.ContestSendComponent;
/* loaded from: classes3.dex */
public final class ensurePreDrawListener {
    @androidx.databinding.BindingAdapter({"contestSendData"})
    public static final void toString(ContestSendComponent contestSendComponent, getChildRect getchildrect) {
        runAnimators.ag$a(getchildrect, "contestSendData");
        if (contestSendComponent == null) {
            return;
        }
        contestSendComponent.setContestSendData(getchildrect);
    }
}
