package o;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import com.app.dream11.core.service.PermissionEnum;
import com.app.dream11.dream11.DreamApplication;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public class addItem {
    private static setItem ag$a;
    private static getStateDrawableIndex ah$a = new getStateDrawableIndex(addItem.class);
    private static final ArrayList<String> values = new ArrayList<>(Arrays.asList("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"));

    public static void toString(Activity activity, int i, String[] strArr, int[] iArr) {
        if (ag$a != null) {
            if (Build.VERSION.SDK_INT >= 30 && Environment.isExternalStorageManager()) {
                ag$a.values(i);
            } else if (iArr.length == 1 && iArr[0] == 0) {
                Log.d("Permission", "Success for " + i);
                ag$a.values(i);
            } else {
                Log.d("Permission", "Failure for " + i);
                if (strArr != null && strArr.length > 0) {
                    ag$a.toString(ag$a(activity, strArr[0]));
                } else {
                    ag$a.toString(false);
                }
            }
            ag$a = null;
        }
    }

    public static void ag$a(String str, setItem setitem, Activity activity, int i) {
        ag$a = setitem;
        if (loadFont.valueOf && loadFont.a(str)) {
            ag$a.toString(true);
        } else if (Build.VERSION.SDK_INT >= 30 && ag$a(str)) {
            if (androidx.core.app.ActivityCompat.checkSelfPermission(activity, str) != 0) {
                androidx.core.app.ActivityCompat.requestPermissions(activity, new String[]{str}, i);
            } else {
                ag$a.values(i);
            }
        } else {
            Log.d("askPermission", "askPermission: ");
            if (!loadFont.valueOf && Build.VERSION.SDK_INT >= 30 && str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                if (values(str)) {
                    ah$a(str);
                    try {
                        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                        intent.addCategory("android.intent.category.DEFAULT");
                        intent.setData(Uri.parse(String.format("package:%s", activity.getApplicationContext().getPackageName())));
                        activity.startActivityForResult(intent, i);
                        return;
                    } catch (Exception unused) {
                        Intent intent2 = new Intent();
                        intent2.setAction("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
                        activity.startActivityForResult(intent2, i);
                        return;
                    }
                }
                ag$a.ag$a();
            } else if (androidx.core.app.ActivityCompat.checkSelfPermission(activity, str) != 0) {
                if (androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(activity, str)) {
                    androidx.core.app.ActivityCompat.requestPermissions(activity, new String[]{str}, i);
                } else if (values(str)) {
                    ah$a(str);
                    androidx.core.app.ActivityCompat.requestPermissions(activity, new String[]{str}, i);
                } else {
                    ag$a.ag$a();
                }
            } else {
                ag$a.values(i);
            }
        }
    }

    private static boolean ag$a(String str) {
        return "android.permission.ACCESS_FINE_LOCATION".equals(str) || "android.permission.ACCESS_COARSE_LOCATION".equals(str);
    }

    public static boolean ag$a(Activity activity, String str) {
        return toString(str) ? (androidx.core.app.ActivityCompat.checkSelfPermission(activity, str) == 0 || androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(activity, str)) ? false : true : (androidx.core.app.ActivityCompat.checkSelfPermission(activity, str) == 0 || androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(activity, str) || values(str)) ? false : true;
    }

    private static boolean toString(String str) {
        return values.contains(str);
    }

    public static boolean valueOf(Activity activity, String str) {
        try {
            return androidx.core.app.ActivityCompat.checkSelfPermission(activity, str) == 0;
        } catch (Exception e) {
            ah$a.valueOf("Exception while checking Permission", e);
            return false;
        }
    }

    public static PermissionEnum ah$a(Activity activity, String str) {
        try {
            if (androidx.core.app.ActivityCompat.checkSelfPermission(activity, str) == 0) {
                return PermissionEnum.SUCCESS;
            }
            if (ag$a(activity, str)) {
                return PermissionEnum.FAILED;
            }
            return PermissionEnum.PREVIOUSLY_DISABLED;
        } catch (Exception e) {
            ah$a.valueOf("Exception while checking Permission", e);
            return PermissionEnum.FAILED;
        }
    }

    private static boolean values(String str) {
        findRealOwner ak$a = DreamApplication.valueOf().ak$a();
        return ak$a.values("PERMISSION" + str, "true").equals("true");
    }

    private static void ah$a(String str) {
        findRealOwner ak$a = DreamApplication.valueOf().ak$a();
        ak$a.ah$a("PERMISSION" + str, com.facebook.hermes.intl.Constants.CASEFIRST_FALSE);
    }
}
