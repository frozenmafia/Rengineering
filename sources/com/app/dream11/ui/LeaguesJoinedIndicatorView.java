package com.app.dream11.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.app.dream11Pro.R;
/* loaded from: classes6.dex */
public class LeaguesJoinedIndicatorView extends RelativeLayout {
    @BindView
    CustomTextView textNumLeagues;
    private int toString;

    public LeaguesJoinedIndicatorView(Context context) {
        super(context);
        this.toString = -1;
        ag$a();
    }

    public LeaguesJoinedIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.toString = -1;
        ag$a();
    }

    public LeaguesJoinedIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.toString = -1;
        ag$a();
    }

    private void ag$a() {
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        ButterKnife.ag$a(this, LayoutInflater.from(getContext()).inflate(R.layout.res_0x7f0d030f, (ViewGroup) this, true));
        valueOf();
    }

    public void setNumLeagues(int i) {
        this.toString = i;
        valueOf();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void valueOf() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.content.Context r1 = com.app.dream11.dream11.DreamApplication.values()
            r2 = 2131886094(0x7f12000e, float:1.9406757E38)
            java.lang.String r1 = r1.getString(r2)
            android.graphics.Typeface r0 = o.getM.toString(r0, r1)
            com.app.dream11.ui.CustomTextView r1 = r4.textNumLeagues
            r1.setTypeface(r0)
            com.app.dream11.ui.CustomTextView r0 = r4.textNumLeagues
            int r1 = r4.toString
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setText(r1)
            int r0 = r4.toString
            r1 = 0
            if (r0 <= 0) goto L2e
            com.app.dream11.ui.CustomTextView r0 = r4.textNumLeagues
            r0.setVisibility(r1)
            goto L45
        L2e:
            if (r0 != 0) goto L39
            com.app.dream11.ui.CustomTextView r0 = r4.textNumLeagues
            r0.setVisibility(r1)
            r0 = 2131231744(0x7f080400, float:1.8079578E38)
            goto L48
        L39:
            com.app.dream11.ui.CustomTextView r0 = r4.textNumLeagues
            r0.setVisibility(r1)
            com.app.dream11.ui.CustomTextView r0 = r4.textNumLeagues
            java.lang.String r1 = "..."
            r0.setText(r1)
        L45:
            r0 = 2131231469(0x7f0802ed, float:1.807902E38)
        L48:
            com.app.dream11.ui.CustomTextView r1 = r4.textNumLeagues
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L69
            com.app.dream11.ui.CustomTextView r1 = r4.textNumLeagues
            android.content.Context r2 = r4.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131101141(0x7f0605d5, float:1.7814683E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            com.app.dream11.ui.CustomTextView r1 = r4.textNumLeagues
            r1.setBackgroundResource(r0)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.ui.LeaguesJoinedIndicatorView.valueOf():void");
    }
}
