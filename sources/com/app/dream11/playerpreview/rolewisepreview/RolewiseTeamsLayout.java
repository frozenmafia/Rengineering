package com.app.dream11.playerpreview.rolewisepreview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.BindingAdapter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.edit;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class RolewiseTeamsLayout extends LinearLayout {
    public static final RolewiseTeamsLayout$ag$a ag$a = new RolewiseTeamsLayout$ag$a(null);
    public Map<Integer, View> toString;

    @BindingAdapter({"app:rolewiseTeams"})
    public static final void setList(RolewiseTeamsLayout rolewiseTeamsLayout, List<edit.Cdefault> list) {
        ag$a.ag$a(rolewiseTeamsLayout, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RolewiseTeamsLayout(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RolewiseTeamsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.toString = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RolewiseTeamsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.toString = new LinkedHashMap();
    }
}
