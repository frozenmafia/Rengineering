package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
/* loaded from: classes5.dex */
public final class smoothSlideClosed {
    public static RectF values(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], iArr[0] + view.getMeasuredWidth(), iArr[1] + view.getMeasuredHeight());
    }

    public static RectF ag$a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new RectF(iArr[0], iArr[1], iArr[0] + view.getMeasuredWidth(), iArr[1] + view.getMeasuredHeight());
    }

    public static float toString(float f) {
        return f * Resources.getSystem().getDisplayMetrics().density;
    }

    public static void values(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams((int) f, view.getHeight());
        } else {
            layoutParams.width = (int) f;
        }
        view.setLayoutParams(layoutParams);
    }

    public static int valueOf(int i) {
        if (i != 17) {
            if (i != 48) {
                if (i != 80) {
                    if (i != 8388611) {
                        if (i == 8388613) {
                            return 0;
                        }
                        throw new IllegalArgumentException("Gravity must have be CENTER, START, END, TOP or BOTTOM.");
                    }
                    return 2;
                }
                return 1;
            }
            return 3;
        }
        return 1;
    }

    public static void values(View view, int i) {
        if (Build.VERSION.SDK_INT >= 11) {
            view.setX(i);
            return;
        }
        ViewGroup.MarginLayoutParams valueOf = valueOf(view);
        valueOf.leftMargin = i - view.getLeft();
        view.setLayoutParams(valueOf);
    }

    public static void ag$a(View view, int i) {
        if (Build.VERSION.SDK_INT >= 11) {
            view.setY(i);
            return;
        }
        ViewGroup.MarginLayoutParams valueOf = valueOf(view);
        valueOf.topMargin = i - view.getTop();
        view.setLayoutParams(valueOf);
    }

    private static ViewGroup.MarginLayoutParams valueOf(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return (ViewGroup.MarginLayoutParams) layoutParams;
            }
            return new ViewGroup.MarginLayoutParams(layoutParams);
        }
        return new ViewGroup.MarginLayoutParams(view.getWidth(), view.getHeight());
    }

    public static void ag$a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        } else {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void valueOf(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static int ah$a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    public static ViewGroup ah$a(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getRootView();
        return (viewGroup.getChildCount() == 1 && (viewGroup.getChildAt(0) instanceof FrameLayout)) ? (ViewGroup) viewGroup.getChildAt(0) : viewGroup;
    }
}
