package com.app.dream11.teamselection.newcreateteam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.teamselection.newcreateteam.ComponentSpecialPlayer;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11Pro.R;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AnyRes;
import o.getExternalCacheDirs;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ComponentSpecialPlayer extends FrameLayout {
    private ViewDataBinding HaptikSDK$a;
    private boolean ag$a;
    private getExternalCacheDirs ah$a;
    private int ah$b;
    private String invoke;
    private valueOf toString;
    public Map<Integer, View> valueOf;
    private boolean values;

    /* loaded from: classes3.dex */
    public interface valueOf {
        void values(getExternalCacheDirs getexternalcachedirs);
    }

    public View ag$a(int i) {
        Map<Integer, View> map = this.valueOf;
        View view = map.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            if (findViewById == null) {
                return null;
            }
            map.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentSpecialPlayer(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
        this.ah$b = (int) getResources().getDimension(R.dimen.res_0x7f070538);
        this.invoke = "";
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.res_0x7f0d01a7, null, false);
        runAnimators.ah$a(inflate, "inflate(LayoutInflater.f…cial_player, null, false)");
        this.HaptikSDK$a = inflate;
        addView(inflate.getRoot());
        setOnClickListener(new View.OnClickListener() { // from class: o.getDataResultsFromIntent
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComponentSpecialPlayer.ah$a(ComponentSpecialPlayer.this, view);
            }
        });
        int i = this.ah$b;
        ((FrameLayout) ag$a(AnyRes.values.flSpecialPlayerCircle)).setLayoutParams(new LinearLayout.LayoutParams(i, i));
    }

    public final void setRadiusHeight(int i) {
        this.ah$b = i;
    }

    public final void setPlayerRoleClickListener(valueOf valueof) {
        this.toString = valueof;
    }

    public final void setSharedTeamRole(boolean z) {
        this.ag$a = z;
    }

    public final void setPlayerSelectionRate(String str) {
        runAnimators.ag$a(str, "value");
        this.invoke = str;
        this.HaptikSDK$a.setVariable(375, str);
    }

    public final void setRoleSelected(boolean z) {
        CustomTextView customTextView;
        int i;
        this.values = z;
        if (z) {
            customTextView = (CustomTextView) ag$a(AnyRes.values.tvSpecialPlayerSelected);
            i = 0;
        } else {
            customTextView = (CustomTextView) ag$a(AnyRes.values.tvSpecialPlayerSelected);
            i = 8;
        }
        customTextView.setVisibility(i);
    }

    public final void setViewDataBinding(ViewDataBinding viewDataBinding) {
        runAnimators.ag$a(viewDataBinding, "<set-?>");
        this.HaptikSDK$a = viewDataBinding;
    }

    public final void setPlayerRole(getExternalCacheDirs getexternalcachedirs) {
        if (getexternalcachedirs != null) {
            this.ah$a = getexternalcachedirs;
            this.HaptikSDK$a.setVariable(305, getexternalcachedirs);
            this.HaptikSDK$a.setVariable(183, Boolean.valueOf(this.ag$a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ah$a(ComponentSpecialPlayer componentSpecialPlayer, View view) {
        runAnimators.ag$a(componentSpecialPlayer, "this$0");
        valueOf valueof = componentSpecialPlayer.toString;
        if (valueof == null) {
            return;
        }
        getExternalCacheDirs getexternalcachedirs = componentSpecialPlayer.ah$a;
        runAnimators.toString(getexternalcachedirs);
        valueof.values(getexternalcachedirs);
    }
}
