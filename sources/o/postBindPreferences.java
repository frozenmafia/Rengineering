package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.MaterialCalendar;
import o.Preference;
import o.PreferenceGroup;
/* loaded from: classes7.dex */
public final class postBindPreferences {
    public final scrollToPreferenceInternal HaptikSDK$a;
    final scrollToPreferenceInternal HaptikSDK$b;
    final scrollToPreferenceInternal ag$a;
    public final Paint ah$a;
    final scrollToPreferenceInternal ah$b;
    final scrollToPreferenceInternal toString;
    public final scrollToPreferenceInternal valueOf;
    final scrollToPreferenceInternal values;

    public postBindPreferences(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(setInitialExpandedChildrenCount.values(context, Preference.BaseSavedState.values.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), Preference.BaseSavedState.getSignupData.MaterialCalendar);
        this.valueOf = scrollToPreferenceInternal.values(context, obtainStyledAttributes.getResourceId(Preference.BaseSavedState.getSignupData.MaterialCalendar_dayStyle, 0));
        this.ag$a = scrollToPreferenceInternal.values(context, obtainStyledAttributes.getResourceId(Preference.BaseSavedState.getSignupData.MaterialCalendar_dayInvalidStyle, 0));
        this.toString = scrollToPreferenceInternal.values(context, obtainStyledAttributes.getResourceId(Preference.BaseSavedState.getSignupData.MaterialCalendar_daySelectedStyle, 0));
        this.HaptikSDK$b = scrollToPreferenceInternal.values(context, obtainStyledAttributes.getResourceId(Preference.BaseSavedState.getSignupData.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList ah$a = PreferenceGroup.AnonymousClass1.ah$a(context, obtainStyledAttributes, Preference.BaseSavedState.getSignupData.MaterialCalendar_rangeFillColor);
        this.HaptikSDK$a = scrollToPreferenceInternal.values(context, obtainStyledAttributes.getResourceId(Preference.BaseSavedState.getSignupData.MaterialCalendar_yearStyle, 0));
        this.values = scrollToPreferenceInternal.values(context, obtainStyledAttributes.getResourceId(Preference.BaseSavedState.getSignupData.MaterialCalendar_yearSelectedStyle, 0));
        this.ah$b = scrollToPreferenceInternal.values(context, obtainStyledAttributes.getResourceId(Preference.BaseSavedState.getSignupData.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.ah$a = paint;
        paint.setColor(ah$a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
