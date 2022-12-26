package o;

import com.app.dream11.social.challangecta.ChallengeCTAComponent;
/* loaded from: classes3.dex */
public final class addRemoteInput {
    @androidx.databinding.BindingAdapter({"challangeCtaData"})
    public static final void toString(ChallengeCTAComponent challengeCTAComponent, setSemanticAction setsemanticaction) {
        if (setsemanticaction == null || challengeCTAComponent == null) {
            return;
        }
        challengeCTAComponent.setData(setsemanticaction);
    }
}
