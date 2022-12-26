package o;

import android.view.LayoutInflater;
import android.view.View;
import com.app.dream11.chat.chatlist.contestinvitebottomsheet.ContestInviteChallengeCtaVM;
import com.app.dream11.social.challangecta.ContestInviteDMChallengeCTAComponent;
/* loaded from: classes3.dex */
public abstract class hasValue extends androidx.databinding.ViewDataBinding {
    public final ContestInviteDMChallengeCTAComponent ag$a;
    @androidx.databinding.Bindable
    protected ContestInviteChallengeCtaVM ah$a;

    public abstract void values(ContestInviteChallengeCtaVM contestInviteChallengeCtaVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public hasValue(Object obj, View view, int i, ContestInviteDMChallengeCTAComponent contestInviteDMChallengeCTAComponent) {
        super(obj, view, i);
        this.ag$a = contestInviteDMChallengeCTAComponent;
    }

    public static hasValue valueOf(LayoutInflater layoutInflater) {
        return ah$a(layoutInflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static hasValue ah$a(LayoutInflater layoutInflater, Object obj) {
        return (hasValue) androidx.databinding.ViewDataBinding.inflateInternal(layoutInflater, com.app.dream11Pro.R.layout.res_0x7f0d02e4, null, false, obj);
    }
}
