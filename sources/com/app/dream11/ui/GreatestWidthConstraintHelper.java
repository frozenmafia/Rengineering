package com.app.dream11.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.Map;
import o.addTransitionInternal;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class GreatestWidthConstraintHelper extends ConstraintHelper {
    public Map<Integer, View> ag$a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GreatestWidthConstraintHelper(Context context) {
        this(context, null, 0, 6, null);
        runAnimators.ag$a(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GreatestWidthConstraintHelper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        runAnimators.ag$a(context, "context");
    }

    public /* synthetic */ GreatestWidthConstraintHelper(Context context, AttributeSet attributeSet, int i, int i2, getTargetTypes gettargettypes) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GreatestWidthConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        this.ag$a = new LinkedHashMap();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostMeasure(ConstraintLayout constraintLayout) {
        runAnimators.ag$a(constraintLayout, TtmlNode.RUBY_CONTAINER);
        int maxWidth = constraintLayout.getMaxWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i = this.mCount;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            ConstraintWidget viewWidget = constraintLayout.getViewWidget(constraintLayout.getViewById(this.mIds[i3]));
            if (viewWidget.getWidth() > i2) {
                i2 = viewWidget.getWidth();
            }
        }
        int ag$a = addTransitionInternal.ag$a(i2, (maxWidth - paddingLeft) - paddingRight);
        int i4 = this.mCount;
        for (int i5 = 0; i5 < i4; i5++) {
            View viewById = constraintLayout.getViewById(this.mIds[i5]);
            ConstraintWidget viewWidget2 = constraintLayout.getViewWidget(viewById);
            if (viewWidget2.getWidth() != ag$a) {
                viewWidget2.setWidth(ag$a);
                if (viewById instanceof TextView) {
                    TextView textView = (TextView) viewById;
                    if (textView.getGravity() != 0) {
                        int gravity = textView.getGravity();
                        textView.setGravity(0);
                        textView.setGravity(gravity);
                    }
                }
            }
        }
    }
}
