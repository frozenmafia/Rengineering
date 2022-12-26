package com.app.dream11.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.databinding.BindingAdapter;
import com.app.dream11.ui.ComponentBlueTooltip$ah$a;
import com.app.dream11Pro.R;
import com.google.android.gms.analytics.ecommerce.Promotion;
import o.Styleable;
import o.getTargetTypes;
import o.runAnimators;
import o.setAnimationMatrix;
import o.setIntents;
/* loaded from: classes3.dex */
public final class ComponentBlueTooltip$ah$a {
    public /* synthetic */ ComponentBlueTooltip$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private ComponentBlueTooltip$ah$a() {
    }

    @BindingAdapter({"blueTooltipData"})
    public final void toString(ComponentBlueTooltip componentBlueTooltip, setIntents setintents) {
        if (componentBlueTooltip == null) {
            return;
        }
        componentBlueTooltip.setTooltipVM(setintents);
    }

    @BindingAdapter({"arrowTranslationX"})
    public final void ah$a(ComponentBlueTooltip componentBlueTooltip, final View view) {
        final View view2;
        if (view == null || componentBlueTooltip == null || (view2 = componentBlueTooltip.findViewById(R.id.pointerView)) == null) {
            view2 = null;
        } else {
            view2.setVisibility(0);
            view2.post(new Runnable() { // from class: o.ShortcutInfoCompatSaver
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentBlueTooltip$ah$a.values(view, view2);
                }
            });
        }
        if (view2 == null) {
            View findViewById = componentBlueTooltip != null ? componentBlueTooltip.findViewById(R.id.pointerView) : null;
            if (findViewById == null) {
                return;
            }
            findViewById.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(View view, View view2) {
        runAnimators.ag$a(view, "$anchor");
        runAnimators.ag$a(view2, "$this_apply");
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        view2.setTranslationX((rect.left + (view.getWidth() / 2)) - (view2.getWidth() / 2));
    }

    @BindingAdapter({"onClickClose"})
    public final void valueOf(View view, final Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        runAnimators.ag$a(view, Promotion.ACTION_VIEW);
        view.setOnClickListener(new View.OnClickListener() { // from class: o.setPersons
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ComponentBlueTooltip$ah$a.ah$a(Styleable.ArcMotion.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ah$a(Styleable.ArcMotion arcMotion, View view) {
        if (arcMotion == null) {
            return;
        }
        arcMotion.invoke();
    }
}
