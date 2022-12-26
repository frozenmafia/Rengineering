package com.app.dream11.ui.stepview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.stepview.HorizontalStepsViewIndicator;
import com.app.dream11Pro.R;
import java.util.List;
/* loaded from: classes3.dex */
public class HorizontalStepView extends LinearLayout implements HorizontalStepsViewIndicator.toString {
    private int HaptikSDK$c;
    public HorizontalStepsViewIndicator ag$a;
    private int ah$a;
    private List<String> ah$b;
    private int toString;
    private int valueOf;
    private RelativeLayout values;

    public HorizontalStepView(Context context) {
        this(context, null);
    }

    public HorizontalStepView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalStepView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.HaptikSDK$c = ContextCompat.getColor(getContext(), R.color.res_0x7f0605d3);
        this.valueOf = ContextCompat.getColor(getContext(), R.color.res_0x7f0605d3);
        this.ah$a = 10;
        valueOf();
    }

    private void valueOf() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.res_0x7f0d0497, this);
        HorizontalStepsViewIndicator horizontalStepsViewIndicator = (HorizontalStepsViewIndicator) inflate.findViewById(R.id.steps_indicator);
        this.ag$a = horizontalStepsViewIndicator;
        horizontalStepsViewIndicator.setOnDrawListener(this);
        this.values = (RelativeLayout) inflate.findViewById(R.id.rl_text_container);
    }

    public HorizontalStepView valueOf(List<String> list) {
        this.ah$b = list;
        this.ag$a.setStepNum(list.size());
        return this;
    }

    public HorizontalStepView toString(int i) {
        this.toString = i;
        this.ag$a.setComplectingPosition(i);
        return this;
    }

    public HorizontalStepView ag$a(int i, boolean z) {
        this.toString = i;
        this.ag$a.setComplectingPosition(i, z);
        return this;
    }

    public HorizontalStepView ag$a(int i) {
        this.HaptikSDK$c = i;
        return this;
    }

    public HorizontalStepView valueOf(int i) {
        this.valueOf = i;
        return this;
    }

    public HorizontalStepView ah$a(int i) {
        this.ag$a.setUnCompletedLineColor(i);
        return this;
    }

    public HorizontalStepsViewIndicator values() {
        return this.ag$a;
    }

    public HorizontalStepView values(int i) {
        this.ag$a.setCompletedLineColor(i);
        return this;
    }

    public HorizontalStepView values(Drawable drawable) {
        this.ag$a.setDefaultIcon(drawable);
        return this;
    }

    public HorizontalStepView toString(Drawable drawable) {
        this.ag$a.setCompleteIcon(drawable);
        return this;
    }

    public HorizontalStepView ag$a(Drawable drawable) {
        this.ag$a.setAttentionIcon(drawable);
        return this;
    }

    public HorizontalStepView invoke(int i) {
        if (i > 0) {
            this.ah$a = i;
        }
        return this;
    }

    @Override // com.app.dream11.ui.stepview.HorizontalStepsViewIndicator.toString
    public void ah$a() {
        RelativeLayout relativeLayout = this.values;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            List<Float> valueOf = this.ag$a.valueOf();
            if (this.ah$b == null || valueOf == null || valueOf.size() <= 0) {
                return;
            }
            for (int i = 0; i < this.ah$b.size(); i++) {
                CustomTextView customTextView = new CustomTextView(getContext(), getContext().getResources().getString(R.string.res_0x7f12000e));
                customTextView.setTextSize(2, this.ah$a);
                customTextView.setText(this.ah$b.get(i));
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                customTextView.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = customTextView.getMeasuredWidth();
                if (i == 0) {
                    customTextView.setX(valueOf.get(i).floatValue() - this.ag$a.ah$a());
                } else if (i == 1) {
                    customTextView.setX(valueOf.get(i).floatValue() - (measuredWidth - (measuredWidth / 2)));
                } else {
                    customTextView.setX((valueOf.get(i).floatValue() - measuredWidth) + this.ag$a.ah$a());
                }
                customTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                customTextView.setGravity(GravityCompat.END);
                if (i <= this.toString) {
                    customTextView.setTextColor(this.valueOf);
                } else {
                    customTextView.setTextColor(this.HaptikSDK$c);
                }
                this.values.addView(customTextView);
            }
        }
    }
}
