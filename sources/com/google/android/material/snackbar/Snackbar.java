package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import o.Preference;
import o.Preference$BaseSavedState$HaptikSDK$b;
import o.access$getOnBackPressedCallback$p;
/* loaded from: classes5.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private boolean HaptikSDK$a;
    private final AccessibilityManager invoke;
    private static final int[] values = {Preference.BaseSavedState.values.snackbarButtonStyle};
    private static final int[] ag$a = {Preference.BaseSavedState.values.snackbarButtonStyle, Preference.BaseSavedState.values.snackbarTextViewStyle};

    private Snackbar(Context context, ViewGroup viewGroup, View view, access$getOnBackPressedCallback$p access_getonbackpressedcallback_p) {
        super(context, viewGroup, view, access_getonbackpressedcallback_p);
        this.invoke = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void HaptikSDK$d() {
        super.HaptikSDK$d();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void ah$a() {
        super.ah$a();
    }

    public static Snackbar valueOf(View view, CharSequence charSequence, int i) {
        return toString(null, view, charSequence, i);
    }

    private static Snackbar toString(Context context, View view, CharSequence charSequence, int i) {
        ViewGroup snackbar = toString(view);
        if (snackbar == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = snackbar.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(ah$a(context) ? Preference$BaseSavedState$HaptikSDK$b.mtrl_layout_snackbar_include : Preference$BaseSavedState$HaptikSDK$b.design_layout_snackbar_include, snackbar, false);
        Snackbar snackbar2 = new Snackbar(context, snackbar, snackbarContentLayout, snackbarContentLayout);
        snackbar2.valueOf(charSequence);
        snackbar2.ag$a(i);
        return snackbar2;
    }

    private static boolean ah$a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ag$a);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    private static ViewGroup toString(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public Snackbar valueOf(CharSequence charSequence) {
        ((SnackbarContentLayout) this.toString.getChildAt(0)).values().setText(charSequence);
        return this;
    }

    public Snackbar toString(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button ah$a = ((SnackbarContentLayout) this.toString.getChildAt(0)).ah$a();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            ah$a.setVisibility(8);
            ah$a.setOnClickListener(null);
            this.HaptikSDK$a = false;
        } else {
            this.HaptikSDK$a = true;
            ah$a.setVisibility(0);
            ah$a.setText(charSequence);
            ah$a.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.snackbar.Snackbar.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onClickListener.onClick(view);
                    Snackbar.this.toString(1);
                }
            });
        }
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int invoke() {
        int invoke = super.invoke();
        if (invoke == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.invoke.getRecommendedTimeoutMillis(invoke, (this.HaptikSDK$a ? 4 : 0) | 1 | 2);
        } else if (this.HaptikSDK$a && this.invoke.isTouchExplorationEnabled()) {
            return -2;
        } else {
            return invoke;
        }
    }

    public Snackbar valueOf(int i) {
        ((SnackbarContentLayout) this.toString.getChildAt(0)).ah$a().setTextColor(i);
        return this;
    }

    /* loaded from: classes7.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = getMeasuredWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }
}
