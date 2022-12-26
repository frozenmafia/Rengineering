package com.app.dream11.teamselection.newcreateteam;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;
import com.app.dream11.core.service.graphql.api.fragment.PlayerLineupStatus;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11Pro.R;
import o.SuggestionHintConstants;
import o.getFinalX;
/* loaded from: classes3.dex */
public class LineupStatusComponent extends LinearLayout {
    PlayerLineupStatus.LineupStatus ah$a;
    SuggestionHintConstants values;

    public LineupStatusComponent(Context context) {
        super(context);
        ah$a();
    }

    public LineupStatusComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ah$a();
    }

    public LineupStatusComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ah$a();
    }

    private void ah$a() {
        SuggestionHintConstants suggestionHintConstants = (SuggestionHintConstants) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.res_0x7f0d0358, this, false);
        this.values = suggestionHintConstants;
        addView(suggestionHintConstants.getRoot());
    }

    public static void setLineupStatus(LineupStatusComponent lineupStatusComponent, PlayerLineupStatus.LineupStatus lineupStatus) {
        lineupStatusComponent.toString(lineupStatus);
    }

    private void toString(PlayerLineupStatus.LineupStatus lineupStatus) {
        this.ah$a = lineupStatus;
        if (lineupStatus != null) {
            this.values.valueOf(new valueOf(getFinalX.values(getContext(), lineupStatus.getText()), lineupStatus.getColor()));
        } else {
            this.values.valueOf(null);
        }
    }

    public static void setLineupTextColor(CustomTextView customTextView, String str) {
        if (str != null) {
            try {
                customTextView.setTextColor(Color.parseColor(str));
                return;
            } catch (IllegalArgumentException unused) {
                customTextView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                return;
            }
        }
        customTextView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
    }

    /* loaded from: classes3.dex */
    public static class valueOf {
        public final String toString;
        public final String valueOf;

        public valueOf(String str, String str2) {
            this.toString = str;
            this.valueOf = str2;
        }
    }
}
