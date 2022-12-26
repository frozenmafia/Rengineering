package com.app.dream11.social.ui.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.BR;
import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import com.app.dream11Pro.R;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import o.runAnimators;
import o.setOnlyAlertOnce;
/* loaded from: classes3.dex */
public final class UserTeamCardComponent extends FrameLayout {
    private setOnlyAlertOnce ag$a;
    public Map<Integer, View> toString;
    private MatchStatus valueOf;
    public ViewDataBinding values;

    public final ViewDataBinding ag$a() {
        ViewDataBinding viewDataBinding = this.values;
        if (viewDataBinding != null) {
            return viewDataBinding;
        }
        runAnimators.valueOf("databinding");
        return null;
    }

    public final void setDatabinding(ViewDataBinding viewDataBinding) {
        runAnimators.ag$a(viewDataBinding, "<set-?>");
        this.values = viewDataBinding;
    }

    public final void setUserTeamVM(setOnlyAlertOnce setonlyalertonce) {
        this.ag$a = setonlyalertonce;
        if (setonlyalertonce != null) {
            ag$a().setVariable(BR.userTeamInfo, setonlyalertonce);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserTeamCardComponent(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
        this.valueOf = MatchStatus.UNKNOWN__;
        values();
    }

    public final void setMatchStatus(MatchStatus matchStatus) {
        this.valueOf = matchStatus;
        if (matchStatus != null) {
            ag$a().setVariable(227, matchStatus);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserTeamCardComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.toString = new LinkedHashMap();
        this.valueOf = MatchStatus.UNKNOWN__;
        values();
    }

    private final void values() {
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.res_0x7f0d01ab, this, false);
        runAnimators.ah$a(inflate, "inflate(LayoutInflater.f…t_team_card, this, false)");
        setDatabinding(inflate);
        addView(ag$a().getRoot());
    }
}
