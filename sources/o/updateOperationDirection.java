package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.PixelUtil;
/* loaded from: classes6.dex */
public class updateOperationDirection {
    private static final TypedValue ah$a = new TypedValue();

    public static Drawable toString(Context context, ReadableMap readableMap) {
        String string = readableMap.getString("type");
        if ("ThemeAttrAndroid".equals(string)) {
            String string2 = readableMap.getString("attribute");
            int ag$a = ag$a(context, string2);
            if (!context.getTheme().resolveAttribute(ag$a, ah$a, true)) {
                throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " with id " + ag$a + " couldn't be resolved into a drawable");
            }
            return values(readableMap, ah$a(context));
        } else if ("RippleAndroid".equals(string)) {
            return values(readableMap, valueOf(context, readableMap));
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid type for android drawable: " + string);
        }
    }

    private static int ag$a(Context context, String str) {
        SoftAssertions.assertNotNull(str);
        if ("selectableItemBackground".equals(str)) {
            return 16843534;
        }
        if ("selectableItemBackgroundBorderless".equals(str)) {
            return 16843868;
        }
        return context.getResources().getIdentifier(str, com.apxor.androidsdk.core.ce.Constants.META_ATTRIBUTES, "android");
    }

    private static Drawable ah$a(Context context) {
        return context.getResources().getDrawable(ah$a.resourceId, context.getTheme());
    }

    private static RippleDrawable valueOf(Context context, ReadableMap readableMap) {
        return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{ah$a(context, readableMap)}), null, ah$a(readableMap));
    }

    private static Drawable values(ReadableMap readableMap, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 && readableMap.hasKey("rippleRadius") && (drawable instanceof RippleDrawable)) {
            ((RippleDrawable) drawable).setRadius((int) PixelUtil.toPixelFromDIP(readableMap.getDouble("rippleRadius")));
        }
        return drawable;
    }

    private static int ah$a(Context context, ReadableMap readableMap) {
        if (readableMap.hasKey("color") && !readableMap.isNull("color")) {
            return readableMap.getInt("color");
        }
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = ah$a;
        if (theme.resolveAttribute(16843820, typedValue, true)) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn't be resolved into a drawable");
    }

    private static Drawable ah$a(ReadableMap readableMap) {
        if (readableMap.hasKey("borderless") && !readableMap.isNull("borderless") && readableMap.getBoolean("borderless")) {
            return null;
        }
        return new ColorDrawable(-1);
    }
}
