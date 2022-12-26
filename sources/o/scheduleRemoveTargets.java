package o;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
/* loaded from: classes4.dex */
public class scheduleRemoveTargets extends FrameLayout {
    private ProgressBar ag$a;
    private double ah$a;
    private Integer toString;
    private boolean valueOf;
    private boolean values;

    public scheduleRemoveTargets(Context context) {
        super(context);
        this.values = true;
        this.valueOf = true;
    }

    public void setStyle(String str) {
        ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.ag$a = createProgressBar;
        createProgressBar.setMax(1000);
        removeAllViews();
        addView(this.ag$a, new ViewGroup.LayoutParams(-1, -1));
    }

    public void setColor(Integer num) {
        this.toString = num;
    }

    public void setIndeterminate(boolean z) {
        this.values = z;
    }

    public void setProgress(double d) {
        this.ah$a = d;
    }

    public void setAnimating(boolean z) {
        this.valueOf = z;
    }

    public void valueOf() {
        ProgressBar progressBar = this.ag$a;
        if (progressBar == null) {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
        progressBar.setIndeterminate(this.values);
        ah$a(this.ag$a);
        this.ag$a.setProgress((int) (this.ah$a * 1000.0d));
        if (this.valueOf) {
            this.ag$a.setVisibility(0);
        } else {
            this.ag$a.setVisibility(4);
        }
    }

    private void ah$a(ProgressBar progressBar) {
        Drawable progressDrawable;
        if (progressBar.isIndeterminate()) {
            progressDrawable = progressBar.getIndeterminateDrawable();
        } else {
            progressDrawable = progressBar.getProgressDrawable();
        }
        if (progressDrawable == null) {
            return;
        }
        Integer num = this.toString;
        if (num != null) {
            progressDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            progressDrawable.clearColorFilter();
        }
    }
}
