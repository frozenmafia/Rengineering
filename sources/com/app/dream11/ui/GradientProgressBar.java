package com.app.dream11.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.content.ContextCompat;
import com.app.dream11Pro.R;
/* loaded from: classes3.dex */
public class GradientProgressBar extends ProgressBar {
    private Context values;

    public GradientProgressBar(Context context) {
        super(context);
        toString(context);
    }

    public GradientProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16973855);
        toString(context);
    }

    public GradientProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 16973855);
        toString(context);
    }

    private void toString(Context context) {
        this.values = context;
        setBackgroundColor(context.getResources().getColor(R.color.res_0x7f0605e4));
        setProgressDrawable(context.getResources().getDrawable(R.drawable.gradient_progress_clip));
    }

    public static void setBackgroundColor(ProgressBar progressBar, int i) {
        if (progressBar != null) {
            progressBar.setBackgroundColor(i);
        }
    }

    public static void setProgressDrawable(ProgressBar progressBar, int i) {
        if (progressBar != null) {
            progressBar.setProgressDrawable(ContextCompat.getDrawable(progressBar.getContext(), i));
        }
    }

    public static void setProgressColor(ProgressBar progressBar, int i) {
        if (progressBar != null) {
            progressBar.setProgressDrawable(new ColorDrawable(i));
        }
    }

    public static void setProgress(ProgressBar progressBar, int i) {
        if (progressBar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                progressBar.setProgress(i, true);
            } else {
                progressBar.setProgress(i);
            }
        }
    }
}
