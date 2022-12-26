package o;

import android.view.View;
import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import com.app.dream11.social.ui.customviews.UserTeamCardComponent;
/* loaded from: classes2.dex */
public abstract class setTickMark extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected setOnlyAlertOnce ah$a;
    @androidx.databinding.Bindable
    protected MatchStatus toString;
    public final UserTeamCardComponent valueOf;

    /* JADX INFO: Access modifiers changed from: protected */
    public setTickMark(Object obj, View view, int i, UserTeamCardComponent userTeamCardComponent) {
        super(obj, view, i);
        this.valueOf = userTeamCardComponent;
    }
}
