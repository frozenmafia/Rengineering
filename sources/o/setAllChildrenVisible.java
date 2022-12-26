package o;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.zip.Deflater;
/* loaded from: classes7.dex */
public class setAllChildrenVisible implements UIBlock {
    private static final String ah$a = "ViewShot";
    private final int HaptikSDK$a;
    private final File HaptikSDK$b;
    private final String HaptikSDK$c;
    private final ReactApplicationContext HaptikSDK$d;
    private final double HaptikSDK$e;
    private final String HaptikWebView;
    private final Integer ah$b;
    private final int getInitSettings;
    private final Boolean getSignupData;
    private final Promise invoke;
    private final Integer isLogoutPending;
    private final Activity valueOf;
    private static byte[] values = new byte[65536];
    private static final Object toString = new Object();
    private static final Set<Bitmap> ag$a = Collections.newSetFromMap(new WeakHashMap());

    /* loaded from: classes.dex */
    public @interface toString {
        public static final Bitmap.CompressFormat[] ag$a = {Bitmap.CompressFormat.JPEG, Bitmap.CompressFormat.PNG, Bitmap.CompressFormat.WEBP};
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends A, A> T ag$a(A a) {
        return a;
    }

    public setAllChildrenVisible(int i, String str, int i2, double d, Integer num, Integer num2, File file, String str2, Boolean bool, ReactApplicationContext reactApplicationContext, Activity activity, Promise promise) {
        this.getInitSettings = i;
        this.HaptikSDK$c = str;
        this.HaptikSDK$a = i2;
        this.HaptikSDK$e = d;
        this.isLogoutPending = num;
        this.ah$b = num2;
        this.HaptikSDK$b = file;
        this.HaptikWebView = str2;
        this.getSignupData = bool;
        this.HaptikSDK$d = reactApplicationContext;
        this.valueOf = activity;
        this.invoke = promise;
    }

    @Override // com.facebook.react.uimanager.UIBlock
    public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
        View resolveView;
        int i = this.getInitSettings;
        if (i == -1) {
            resolveView = this.valueOf.getWindow().getDecorView().findViewById(16908290);
        } else {
            resolveView = nativeViewHierarchyManager.resolveView(i);
        }
        if (resolveView == null) {
            String str = ah$a;
            Log.e(str, "No view found with reactTag: " + this.getInitSettings, new AssertionError());
            Promise promise = this.invoke;
            promise.reject("E_UNABLE_TO_SNAPSHOT", "No view found with reactTag: " + this.getInitSettings);
            return;
        }
        try {
            setAllChildrenVisible$ag$a setallchildrenvisible_ag_a = new setAllChildrenVisible$ag$a(values);
            setallchildrenvisible_ag_a.values(ah$a(resolveView));
            values = setallchildrenvisible_ag_a.ah$a();
            if ("tmpfile".equals(this.HaptikWebView) && -1 == this.HaptikSDK$a) {
                values(resolveView);
            } else if ("tmpfile".equals(this.HaptikWebView) && -1 != this.HaptikSDK$a) {
                invoke(resolveView);
            } else {
                if (!"base64".equals(this.HaptikWebView) && !"zip-base64".equals(this.HaptikWebView)) {
                    if ("data-uri".equals(this.HaptikWebView)) {
                        ag$a(resolveView);
                    }
                }
                toString(resolveView);
            }
        } catch (Throwable th) {
            Log.e(ah$a, "Failed to capture view snapshot", th);
            this.invoke.reject("E_UNABLE_TO_SNAPSHOT", "Failed to capture view snapshot");
        }
    }

    private void invoke(View view) throws IOException {
        ag$a(view, new FileOutputStream(this.HaptikSDK$b));
        this.invoke.resolve(Uri.fromFile(this.HaptikSDK$b).toString());
    }

    private void values(View view) throws IOException {
        String uri = Uri.fromFile(this.HaptikSDK$b).toString();
        FileOutputStream fileOutputStream = new FileOutputStream(this.HaptikSDK$b);
        setAllChildrenVisible$ag$a setallchildrenvisible_ag_a = new setAllChildrenVisible$ag$a(values);
        Point ag$a2 = ag$a(view, setallchildrenvisible_ag_a);
        values = setallchildrenvisible_ag_a.ah$a();
        int size = setallchildrenvisible_ag_a.size();
        fileOutputStream.write(String.format(Locale.US, "%d:%d|", Integer.valueOf(ag$a2.x), Integer.valueOf(ag$a2.y)).getBytes(Charset.forName("US-ASCII")));
        fileOutputStream.write(values, 0, size);
        fileOutputStream.close();
        this.invoke.resolve(uri);
    }

    private void ag$a(View view) throws IOException {
        setAllChildrenVisible$ag$a setallchildrenvisible_ag_a = new setAllChildrenVisible$ag$a(values);
        ag$a(view, setallchildrenvisible_ag_a);
        values = setallchildrenvisible_ag_a.ah$a();
        String encodeToString = Base64.encodeToString(values, 0, setallchildrenvisible_ag_a.size(), 2);
        String str = "jpg".equals(this.HaptikSDK$c) ? "jpeg" : this.HaptikSDK$c;
        Promise promise = this.invoke;
        promise.resolve("data:image/" + str + ";base64," + encodeToString);
    }

    private void toString(View view) throws IOException {
        String str;
        boolean z = -1 == this.HaptikSDK$a;
        boolean equals = "zip-base64".equals(this.HaptikWebView);
        setAllChildrenVisible$ag$a setallchildrenvisible_ag_a = new setAllChildrenVisible$ag$a(values);
        Point ag$a2 = ag$a(view, setallchildrenvisible_ag_a);
        values = setallchildrenvisible_ag_a.ah$a();
        int size = setallchildrenvisible_ag_a.size();
        String format = String.format(Locale.US, "%d:%d|", Integer.valueOf(ag$a2.x), Integer.valueOf(ag$a2.y));
        if (!z) {
            format = "";
        }
        if (equals) {
            Deflater deflater = new Deflater();
            deflater.setInput(values, 0, size);
            deflater.finish();
            setAllChildrenVisible$ag$a setallchildrenvisible_ag_a2 = new setAllChildrenVisible$ag$a(new byte[32]);
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                setallchildrenvisible_ag_a2.write(bArr, 0, deflater.deflate(bArr));
            }
            str = format + Base64.encodeToString(setallchildrenvisible_ag_a2.ah$a(), 0, setallchildrenvisible_ag_a2.size(), 2);
        } else {
            str = format + Base64.encodeToString(values, 0, size, 2);
        }
        this.invoke.resolve(str);
    }

    private List<View> valueOf(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            arrayList2.addAll(valueOf(viewGroup.getChildAt(i)));
        }
        return arrayList2;
    }

    private Point ag$a(View view, OutputStream outputStream) throws IOException {
        try {
            setCoveredFadeColor.valueOf(ah$a, setCoveredFadeColor.ag$a(this.valueOf));
            return ah$a(view, outputStream);
        } finally {
            outputStream.close();
        }
    }

    private Point ah$a(View view, OutputStream outputStream) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("Impossible to snapshot the view: view is invalid");
        }
        if (this.getSignupData.booleanValue()) {
            ScrollView scrollView = (ScrollView) view;
            int i = 0;
            for (int i2 = 0; i2 < scrollView.getChildCount(); i2++) {
                i += scrollView.getChildAt(i2).getHeight();
            }
            height = i;
        }
        Point point = new Point(width, height);
        Bitmap valueOf = valueOf(width, height);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Canvas canvas = new Canvas(valueOf);
        view.draw(canvas);
        for (View view2 : valueOf(view)) {
            if ((view2 instanceof TextureView) && view2.getVisibility() == 0) {
                TextureView textureView = (TextureView) view2;
                textureView.setOpaque(false);
                Bitmap bitmap = textureView.getBitmap(ag$a(view2.getWidth(), view2.getHeight()));
                int save = canvas.save();
                ah$a(canvas, view, view2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                canvas.restoreToCount(save);
                ag$a(bitmap);
            }
        }
        Integer num = this.isLogoutPending;
        if (num != null && this.ah$b != null && (num.intValue() != width || this.ah$b.intValue() != height)) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(valueOf, this.isLogoutPending.intValue(), this.ah$b.intValue(), true);
            ag$a(valueOf);
            valueOf = createScaledBitmap;
        }
        if (-1 == this.HaptikSDK$a && (outputStream instanceof setAllChildrenVisible$ag$a)) {
            int i3 = width * height * 4;
            setAllChildrenVisible$ag$a setallchildrenvisible_ag_a = (setAllChildrenVisible$ag$a) ag$a(outputStream);
            valueOf.copyPixelsToBuffer(setallchildrenvisible_ag_a.ag$a(i3));
            setallchildrenvisible_ag_a.values(i3);
        } else {
            valueOf.compress(toString.ag$a[this.HaptikSDK$a], (int) (this.HaptikSDK$e * 100.0d), outputStream);
        }
        ag$a(valueOf);
        return point;
    }

    private Matrix ah$a(Canvas canvas, View view, View view2) {
        Matrix matrix = new Matrix();
        LinkedList linkedList = new LinkedList();
        View view3 = view2;
        do {
            linkedList.add(view3);
            view3 = (View) view3.getParent();
        } while (view3 != view);
        Collections.reverse(linkedList);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            View view4 = (View) it.next();
            canvas.save();
            int i = 0;
            float left = view4.getLeft() + (view4 != view2 ? view4.getPaddingLeft() : 0) + view4.getTranslationX();
            int top = view4.getTop();
            if (view4 != view2) {
                i = view4.getPaddingTop();
            }
            float translationY = top + i + view4.getTranslationY();
            canvas.translate(left, translationY);
            canvas.rotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            canvas.scale(view4.getScaleX(), view4.getScaleY());
            matrix.postTranslate(left, translationY);
            matrix.postRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            matrix.postScale(view4.getScaleX(), view4.getScaleY());
        }
        return matrix;
    }

    private static int ah$a(View view) {
        return Math.min(view.getWidth() * view.getHeight() * 4, 32);
    }

    private static void ag$a(Bitmap bitmap) {
        synchronized (toString) {
            ag$a.add(bitmap);
        }
    }

    private static Bitmap valueOf(int i, int i2) {
        synchronized (toString) {
            for (Bitmap bitmap : ag$a) {
                if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                    ag$a.remove(bitmap);
                    bitmap.eraseColor(0);
                    return bitmap;
                }
            }
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
    }

    private static Bitmap ag$a(int i, int i2) {
        synchronized (toString) {
            for (Bitmap bitmap : ag$a) {
                if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                    ag$a.remove(bitmap);
                    bitmap.eraseColor(0);
                    return bitmap;
                }
            }
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
    }
}
