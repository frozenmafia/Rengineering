package o;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class performPause {
    public static final performPause valueOf = new performPause();
    private static final List<Class<? extends View>> values = reserveEndViewTransition.valueOf(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    private performPause() {
    }

    public static final JSONObject toString(View view, View view2) {
        if (isStateAtLeast.values(performPause.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(view, Promotion.ACTION_VIEW);
            runAnimators.ag$a(view2, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            toString(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            getSharedElementTargetNames getsharedelementtargetnames = getSharedElementTargetNames.valueOf;
            for (View view3 : getSharedElementTargetNames.toString(view)) {
                jSONArray.put(toString(view3, view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            isStateAtLeast.values(th, performPause.class);
            return null;
        }
    }

    public static final void toString(View view, JSONObject jSONObject) {
        if (isStateAtLeast.values(performPause.class)) {
            return;
        }
        try {
            runAnimators.ag$a(view, Promotion.ACTION_VIEW);
            runAnimators.ag$a(jSONObject, "json");
            try {
                getSharedElementTargetNames getsharedelementtargetnames = getSharedElementTargetNames.valueOf;
                String HaptikSDK$b = getSharedElementTargetNames.HaptikSDK$b(view);
                getSharedElementTargetNames getsharedelementtargetnames2 = getSharedElementTargetNames.valueOf;
                String HaptikSDK$c = getSharedElementTargetNames.HaptikSDK$c(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                getSharedElementTargetNames getsharedelementtargetnames3 = getSharedElementTargetNames.valueOf;
                jSONObject.put("classtypebitmask", getSharedElementTargetNames.ag$a(view));
                if (HaptikSDK$b.length() > 0) {
                    jSONObject.put("text", HaptikSDK$b);
                }
                if (HaptikSDK$c.length() > 0) {
                    jSONObject.put("hint", HaptikSDK$c);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, performPause.class);
        }
    }

    public static final List<View> valueOf(View view) {
        if (isStateAtLeast.values(performPause.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(view, Promotion.ACTION_VIEW);
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> cls : values) {
                if (cls.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            getSharedElementTargetNames getsharedelementtargetnames = getSharedElementTargetNames.valueOf;
            for (View view2 : getSharedElementTargetNames.toString(view)) {
                arrayList.addAll(valueOf(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            isStateAtLeast.values(th, performPause.class);
            return null;
        }
    }

    public static final String ag$a(View view) {
        if (isStateAtLeast.values(performPause.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(view, "hostView");
            getSharedElementTargetNames getsharedelementtargetnames = getSharedElementTargetNames.valueOf;
            String HaptikSDK$b = getSharedElementTargetNames.HaptikSDK$b(view);
            if (HaptikSDK$b.length() > 0) {
                return HaptikSDK$b;
            }
            String join = TextUtils.join(com.dreampay.commons.constants.Constants.WHITE_SPACE, valueOf.values(view));
            runAnimators.ah$a(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th) {
            isStateAtLeast.values(th, performPause.class);
            return null;
        }
    }

    private final List<String> values(View view) {
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            getSharedElementTargetNames getsharedelementtargetnames = getSharedElementTargetNames.valueOf;
            for (View view2 : getSharedElementTargetNames.toString(view)) {
                getSharedElementTargetNames getsharedelementtargetnames2 = getSharedElementTargetNames.valueOf;
                String HaptikSDK$b = getSharedElementTargetNames.HaptikSDK$b(view2);
                if (HaptikSDK$b.length() > 0) {
                    arrayList.add(HaptikSDK$b);
                }
                arrayList.addAll(values(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }
}
