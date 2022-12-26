package o;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;
import java.util.Stack;
/* loaded from: classes7.dex */
public final class setCoveredFadeColor {
    public static final Matrix ag$a = new Matrix();

    public static int valueOf(String str, String str2) {
        int i = 0;
        while (str2.length() > 0) {
            int indexOf = str2.indexOf("\n");
            int min = Math.min(str2.length(), Math.min(indexOf < 0 ? 200 : indexOf + 1, 200));
            Log.d(str, String.format(Locale.US, "%02d: %s", Integer.valueOf(i), str2.substring(0, min)));
            str2 = str2.substring(min);
            i++;
        }
        return i;
    }

    public static String ag$a(Activity activity) {
        View findViewById = activity.findViewById(16908290);
        if (findViewById == null) {
            return "Activity [" + activity.getClass().getSimpleName() + "] is not initialized yet. ";
        }
        return toString(findViewById);
    }

    private static String toString(View view) {
        StringBuilder sb = new StringBuilder(8192);
        sb.append("\n");
        Resources resources = view.getResources();
        Stack stack = new Stack();
        stack.push(androidx.core.util.Pair.create("", view));
        while (!stack.empty()) {
            androidx.core.util.Pair pair = (androidx.core.util.Pair) stack.pop();
            View view2 = (View) pair.second;
            String str = (String) pair.first;
            boolean z = stack.empty() || !str.equals(((androidx.core.util.Pair) stack.peek()).first);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(str);
            sb2.append(z ? "└── " : "├── ");
            sb.append(sb2.toString() + view2.getClass().getSimpleName() + ah$a(resources, view2));
            sb.append("\n");
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(z ? "    " : "│   ");
                    stack.push(androidx.core.util.Pair.create(sb3.toString(), viewGroup.getChildAt(childCount)));
                }
            }
        }
        return sb.toString();
    }

    private static String ah$a(Resources resources, View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(com.dreampay.commons.constants.Constants.WHITE_SPACE);
        sb.append("id=");
        sb.append(view.getId());
        sb.append(valueOf(resources, view));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            sb.append(", V--");
        } else if (visibility == 4) {
            sb.append(", -I-");
        } else if (visibility == 8) {
            sb.append(", --G");
        } else {
            sb.append(", ---");
        }
        if (!view.getMatrix().equals(ag$a)) {
            sb.append(", ");
            sb.append("matrix=");
            sb.append(view.getMatrix().toShortString());
            if (0.0f != view.getRotation() || 0.0f != view.getRotationX() || 0.0f != view.getRotationY()) {
                sb.append(", rotate=[");
                sb.append(view.getRotation());
                sb.append(",");
                sb.append(view.getRotationX());
                sb.append(",");
                sb.append(view.getRotationY());
                sb.append("]");
                if (view.getWidth() / 2 != view.getPivotX() || view.getHeight() / 2 != view.getPivotY()) {
                    sb.append(", pivot=[");
                    sb.append(view.getPivotX());
                    sb.append(",");
                    sb.append(view.getPivotY());
                    sb.append("]");
                }
            }
            if (Build.VERSION.SDK_INT >= 21 && (0.0f != view.getTranslationX() || 0.0f != view.getTranslationY() || 0.0f != view.getTranslationZ())) {
                sb.append(", translate=[");
                sb.append(view.getTranslationX());
                sb.append(",");
                sb.append(view.getTranslationY());
                sb.append(",");
                sb.append(view.getTranslationZ());
                sb.append("]");
            }
            if (1.0f != view.getScaleX() || 1.0f != view.getScaleY()) {
                sb.append(", scale=[");
                sb.append(view.getScaleX());
                sb.append(",");
                sb.append(view.getScaleY());
                sb.append("]");
            }
        }
        if (view.getPaddingStart() != 0 || view.getPaddingTop() != 0 || view.getPaddingEnd() != 0 || view.getPaddingBottom() != 0) {
            sb.append(", ");
            sb.append("padding=[");
            sb.append(view.getPaddingStart());
            sb.append(",");
            sb.append(view.getPaddingTop());
            sb.append(",");
            sb.append(view.getPaddingEnd());
            sb.append(",");
            sb.append(view.getPaddingBottom());
            sb.append("]");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.leftMargin != 0 || marginLayoutParams.topMargin != 0 || marginLayoutParams.rightMargin != 0 || marginLayoutParams.bottomMargin != 0) {
                sb.append(", ");
                sb.append("margin=[");
                sb.append(marginLayoutParams.leftMargin);
                sb.append(",");
                sb.append(marginLayoutParams.topMargin);
                sb.append(",");
                sb.append(marginLayoutParams.rightMargin);
                sb.append(",");
                sb.append(marginLayoutParams.bottomMargin);
                sb.append("]");
            }
        }
        sb.append(", position=[");
        sb.append(view.getLeft());
        sb.append(",");
        sb.append(view.getTop());
        sb.append("]");
        sb.append(", size=[");
        sb.append(view.getWidth());
        sb.append(",");
        sb.append(view.getHeight());
        sb.append("]");
        if (view instanceof TextView) {
            sb.append(", text=\"");
            sb.append(((TextView) view).getText());
            sb.append("\"");
        }
        return sb.toString();
    }

    private static String valueOf(Resources resources, View view) {
        if (resources == null) {
            return "";
        }
        try {
            return " / " + resources.getResourceEntryName(view.getId());
        } catch (Throwable unused) {
            return "";
        }
    }
}
