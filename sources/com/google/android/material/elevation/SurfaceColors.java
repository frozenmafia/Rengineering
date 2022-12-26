package com.google.android.material.elevation;

import android.content.Context;
import o.Preference;
import o.Preference$BaseSavedState$ah$a;
import o.PreferenceDialogFragmentCompat;
import o.scrollToPreference;
/* loaded from: classes7.dex */
public enum SurfaceColors {
    SURFACE_0(Preference$BaseSavedState$ah$a.m3_sys_elevation_level0),
    SURFACE_1(Preference$BaseSavedState$ah$a.m3_sys_elevation_level1),
    SURFACE_2(Preference$BaseSavedState$ah$a.m3_sys_elevation_level2),
    SURFACE_3(Preference$BaseSavedState$ah$a.m3_sys_elevation_level3),
    SURFACE_4(Preference$BaseSavedState$ah$a.m3_sys_elevation_level4),
    SURFACE_5(Preference$BaseSavedState$ah$a.m3_sys_elevation_level5);
    
    private final int elevationResId;

    SurfaceColors(int i) {
        this.elevationResId = i;
    }

    public int getColor(Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }

    public static int getColorForElevation(Context context, float f) {
        return new scrollToPreference(context).valueOf(PreferenceDialogFragmentCompat.Api30Impl.toString(context, Preference.BaseSavedState.values.colorSurface, 0), f);
    }
}
