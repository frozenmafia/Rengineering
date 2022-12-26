package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
@Deprecated
/* loaded from: classes7.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    private AnimatorSet ag$a;

    protected abstract AnimatorSet values(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    public boolean valueOf(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.ag$a;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet values = values(view, view2, z, z3);
        this.ag$a = values;
        values.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.ExpandableTransformationBehavior.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.this.ag$a = null;
            }
        });
        this.ag$a.start();
        if (!z2) {
            this.ag$a.end();
        }
        return true;
    }
}
