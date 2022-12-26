package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
/* loaded from: classes7.dex */
public class getSliderFadeColor {
    public static void ag$a(Context context, String str, String str2) {
        splitViewPositions splitviewpositions;
        splitViewPositions splitviewpositions2;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(easypay.manager.Constants.EASYPAY_NEW_PREFERENCE_FILE, 0);
            String string = sharedPreferences.getString(easypay.manager.Constants.EASY_PAY_CONFIG_BANK_LIST_KEY, "");
            Gson gson = new Gson();
            if (!TextUtils.isEmpty(str)) {
                canSlide canslide = (canSlide) gson.ah$a(str, canSlide.class);
                if (canslide != null && canslide.values() != null && !TextUtils.isEmpty(canslide.ah$a()) && canslide.values().intValue() != 403 && !canslide.ah$a().contains("Bank name is not supported")) {
                    if (canslide.ag$a() != null) {
                        canslide.ag$a().ah$a(str2);
                    }
                    if (TextUtils.isEmpty(string)) {
                        splitviewpositions2 = new splitViewPositions();
                        splitviewpositions2.ag$a().add(canslide.ag$a());
                    } else {
                        splitviewpositions2 = (splitViewPositions) gson.ah$a(string, splitViewPositions.class);
                        if (splitviewpositions2 != null) {
                            int i = 0;
                            while (true) {
                                if (i >= splitviewpositions2.ag$a().size()) {
                                    i = -1;
                                    break;
                                } else if (canslide.ag$a().equals(splitviewpositions2.ag$a().get(i))) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            if (i != -1) {
                                splitviewpositions2.ag$a().set(i, canslide.ag$a());
                            } else if (splitviewpositions2.ag$a().size() < 5) {
                                splitviewpositions2.ag$a().add(canslide.ag$a());
                            } else {
                                splitviewpositions2.ag$a().remove(splitviewpositions2.ag$a().size() - 1);
                                splitviewpositions2.ag$a().add(0, canslide.ag$a());
                            }
                        }
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString(easypay.manager.Constants.EASY_PAY_CONFIG_BANK_LIST_KEY, new Gson().ag$a(splitviewpositions2));
                    edit.putString(easypay.manager.Constants.EASY_PAY_CONFIG_PREF_KEY, new Gson().ag$a(canslide.ag$a()));
                    edit.apply();
                }
            } else if (!TextUtils.isEmpty(string) && (splitviewpositions = (splitViewPositions) gson.ah$a(string, splitViewPositions.class)) != null) {
                for (int i2 = 0; i2 < splitviewpositions.ag$a().size(); i2++) {
                    measureChildHeight measurechildheight = splitviewpositions.ag$a().get(i2);
                    if (measurechildheight.values().equals(str2)) {
                        SharedPreferences.Editor edit2 = sharedPreferences.edit();
                        edit2.putString(easypay.manager.Constants.EASY_PAY_CONFIG_PREF_KEY, new Gson().ag$a(measurechildheight));
                        edit2.apply();
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            getCoveredFadeColor.ag$a("EXCEPTION", e);
        }
    }

    public static String valueOf(Context context, String str, String str2, String str3) {
        splitViewPositions splitviewpositions;
        try {
            String string = context.getSharedPreferences(easypay.manager.Constants.EASYPAY_NEW_PREFERENCE_FILE, 0).getString(easypay.manager.Constants.EASY_PAY_CONFIG_BANK_LIST_KEY, "");
            Gson gson = new Gson();
            if (TextUtils.isEmpty(string) || (splitviewpositions = (splitViewPositions) gson.ah$a(string, splitViewPositions.class)) == null) {
                return "";
            }
            for (int i = 0; i < splitviewpositions.ag$a().size(); i++) {
                measureChildHeight measurechildheight = splitviewpositions.ag$a().get(i);
                if ((str + str2 + str3).equals(measurechildheight.toString())) {
                    return measurechildheight.values();
                }
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            getCoveredFadeColor.ag$a("EXCEPTION", e);
            return "";
        }
    }
}
