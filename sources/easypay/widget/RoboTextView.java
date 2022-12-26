package easypay.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import easypay.manager.Constants;
import o.SidecarCompat;
/* loaded from: classes7.dex */
public class RoboTextView extends AppCompatTextView {
    public RoboTextView(Context context) {
        super(context);
    }

    public RoboTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        values(context, attributeSet);
    }

    public RoboTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        values(context, attributeSet);
    }

    private void values(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SidecarCompat.DistinctElementCallback.values.RoboTextView);
        try {
            int integer = obtainStyledAttributes.getInteger(SidecarCompat.DistinctElementCallback.values.RoboTextView_fontType, 0);
            if (integer != 0) {
                if (integer == 1) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        setTypeface(Typeface.create(Constants.FONT_FAMILY_SANS_SERIF_LIGHT, 0));
                    } else {
                        setTypeface(null, 0);
                    }
                } else if (integer == 2) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        setTypeface(Typeface.create("sans-serif", 0));
                    } else {
                        setTypeface(null, 0);
                    }
                } else if (integer == 3) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        setTypeface(Typeface.create(Constants.FONT_FAMILY_SANS_SERIF_MEDIUM, 0));
                    } else {
                        setTypeface(null, 1);
                    }
                } else if (integer == 4) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        setTypeface(Typeface.create("sans-serif", 1));
                    } else {
                        setTypeface(null, 1);
                    }
                } else if (integer != 5) {
                } else {
                    if (Build.VERSION.SDK_INT >= 14) {
                        setTypeface(Typeface.create("sans-serif", 2));
                    } else {
                        setTypeface(null, 2);
                    }
                }
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
