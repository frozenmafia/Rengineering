package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.MasterKey$1$HaptikSDK$b;
/* loaded from: classes7.dex */
public final class CropImage {
    public static void values(Activity activity) {
        activity.startActivityForResult(toString(activity), 200);
    }

    public static Intent toString(Context context) {
        return toString(context, context.getString(MasterKey$1$HaptikSDK$b.pick_image_intent_chooser_title), false, true);
    }

    public static Intent toString(Context context, CharSequence charSequence, boolean z, boolean z2) {
        Intent intent;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        if (!values(context) && z2) {
            arrayList.addAll(ag$a(context, packageManager));
        }
        List<Intent> values = values(packageManager, "android.intent.action.GET_CONTENT", z);
        if (values.size() == 0) {
            values = values(packageManager, "android.intent.action.PICK", z);
        }
        arrayList.addAll(values);
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            intent = (Intent) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        Intent createChooser = Intent.createChooser(intent, charSequence);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
        return createChooser;
    }

    public static List<Intent> ag$a(Context context, PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        Uri ag$a = ag$a(context);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (ag$a != null) {
                intent2.putExtra("output", ag$a);
            }
            arrayList.add(intent2);
        }
        return arrayList;
    }

    public static List<Intent> values(PackageManager packageManager, String str, boolean z) {
        Intent intent;
        ArrayList arrayList = new ArrayList();
        if (str == "android.intent.action.GET_CONTENT") {
            intent = new Intent(str);
        } else {
            intent = new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }
        intent.setType("image/*");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        if (!z) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Intent intent3 = (Intent) it.next();
                if (intent3.getComponent().getClassName().equals("com.android.documentsui.DocumentsActivity")) {
                    arrayList.remove(intent3);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static boolean values(Context context) {
        return Build.VERSION.SDK_INT >= 23 && ah$a(context, "android.permission.CAMERA") && context.checkSelfPermission("android.permission.CAMERA") != 0;
    }

    public static boolean ah$a(Context context, String str) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                for (String str2 : strArr) {
                    if (str2.equalsIgnoreCase(str)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static Uri ag$a(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            return Uri.fromFile(new File(externalCacheDir.getPath(), "pickImageResult.jpeg"));
        }
        return null;
    }

    public static Uri toString(Context context, Intent intent) {
        String action;
        return ((intent == null || intent.getData() == null || ((action = intent.getAction()) != null && action.equals("android.media.action.IMAGE_CAPTURE"))) || intent.getData() == null) ? ag$a(context) : intent.getData();
    }

    public static boolean valueOf(Context context, Uri uri) {
        return Build.VERSION.SDK_INT >= 23 && context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0 && toString(context, uri);
    }

    public static boolean toString(Context context, Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                openInputStream.close();
                return false;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* loaded from: classes7.dex */
    public static final class ActivityResult extends CropImageView$ag$a implements Parcelable {
        public static final Parcelable.Creator<ActivityResult> CREATOR = new Parcelable.Creator<ActivityResult>() { // from class: com.theartofdev.edmodo.cropper.CropImage.ActivityResult.2
            @Override // android.os.Parcelable.Creator
            /* renamed from: ah$a */
            public ActivityResult createFromParcel(Parcel parcel) {
                return new ActivityResult(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: toString */
            public ActivityResult[] newArray(int i) {
                return new ActivityResult[i];
            }
        };

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public ActivityResult(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i, Rect rect2, int i2) {
            super(null, uri, null, uri2, exc, fArr, rect, rect2, i, i2);
        }

        protected ActivityResult(Parcel parcel) {
            super(null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Exception) parcel.readSerializable(), parcel.createFloatArray(), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(valueOf(), i);
            parcel.writeParcelable(HaptikSDK$c(), i);
            parcel.writeSerializable(ag$a());
            parcel.writeFloatArray(ah$a());
            parcel.writeParcelable(values(), i);
            parcel.writeParcelable(HaptikSDK$a(), i);
            parcel.writeInt(invoke());
            parcel.writeInt(ah$b());
        }
    }
}
