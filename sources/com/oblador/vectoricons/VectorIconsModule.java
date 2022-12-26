package com.oblador.vectoricons;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import o.FragmentTransitionImpl;
/* loaded from: classes5.dex */
public class VectorIconsModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "RNVectorIconsModule";
    private static final Map<String, Typeface> sTypefaceCache = new HashMap();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public VectorIconsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    protected String createGlyphImagePath(String str, String str2, Integer num, Integer num2) throws IOException, FileNotFoundException {
        Throwable th;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        File cacheDir = reactApplicationContext.getCacheDir();
        String str3 = cacheDir.getAbsolutePath() + "/";
        float f = reactApplicationContext.getResources().getDisplayMetrics().density;
        StringBuilder sb = new StringBuilder();
        sb.append("@");
        int i = (int) f;
        sb.append(f == ((float) i) ? Integer.toString(i) : Float.toString(f));
        sb.append("x");
        String sb2 = sb.toString();
        int round = Math.round(num.intValue() * f);
        String str4 = str3 + Integer.toString((str + ":" + str2 + ":" + num2).hashCode(), 32) + "_" + Integer.toString(num.intValue()) + sb2 + ".png";
        String str5 = "file://" + str4;
        File file = new File(str4);
        if (file.exists()) {
            return str5;
        }
        FileOutputStream fileOutputStream = null;
        Typeface values = FragmentTransitionImpl.AnonymousClass3.values().values(str, 0, reactApplicationContext.getAssets());
        Paint paint = new Paint();
        paint.setTypeface(values);
        paint.setColor(num2.intValue());
        paint.setTextSize(round);
        paint.setAntiAlias(true);
        paint.getTextBounds(str2, 0, str2.length(), new Rect());
        Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawText(str2, 0, round - ((int) paint.getFontMetrics().bottom), paint);
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
                return str5;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @ReactMethod
    public void getImageForFont(String str, String str2, Integer num, Integer num2, Promise promise) {
        try {
            promise.resolve(createGlyphImagePath(str, str2, num, num2));
        } catch (Throwable th) {
            promise.reject("E_UNKNOWN_ERROR", th);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getImageForFontSync(String str, String str2, Integer num, Integer num2) {
        try {
            return createGlyphImagePath(str, str2, num, num2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
