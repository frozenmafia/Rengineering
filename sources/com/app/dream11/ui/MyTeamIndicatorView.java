package com.app.dream11.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.app.dream11.dream11.DreamApplication;
import com.app.dream11Pro.R;
import o.getM;
/* loaded from: classes6.dex */
public class MyTeamIndicatorView extends RelativeLayout {
    private int ag$a;
    @BindView
    TextView textNumLeagues;
    @BindView
    CustomTextView title;

    public MyTeamIndicatorView(Context context) {
        super(context);
        this.ag$a = -1;
        ag$a();
    }

    public MyTeamIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ag$a = -1;
        ag$a();
    }

    public MyTeamIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ag$a = -1;
        ag$a();
    }

    private void ag$a() {
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        ButterKnife.ag$a(this, LayoutInflater.from(getContext()).inflate(R.layout.res_0x7f0d030f, (ViewGroup) this, true));
        valueOf();
    }

    public void setNumLeagues(int i) {
        this.ag$a = i;
        valueOf();
    }

    private void valueOf() {
        this.title.setText(getResources().getString(R.string.res_0x7f12087d).toUpperCase());
        this.title.setTypeface(getM.toString(getContext(), DreamApplication.values().getString(R.string.res_0x7f12000e)));
        this.textNumLeagues.setText(String.valueOf(this.ag$a));
        if (this.ag$a < 0) {
            this.textNumLeagues.setVisibility(0);
            this.textNumLeagues.setText("...");
        } else {
            this.textNumLeagues.setVisibility(0);
        }
        if (this.textNumLeagues.getVisibility() == 0) {
            this.textNumLeagues.setTextColor(getContext().getResources().getColor(R.color.res_0x7f0605d5));
        }
    }
}
