package o;

import android.graphics.RectF;
import com.theartofdev.edmodo.cropper.CropImageOptions;
import com.theartofdev.edmodo.cropper.CropImageView;
import com.theartofdev.edmodo.cropper.CropWindowMoveHandler;
/* loaded from: classes5.dex */
public final class decryptKey {
    private float HaptikSDK$a;
    private float HaptikSDK$b;
    private float HaptikSDK$c;
    private float ag$a;
    private float ah$a;
    private float ah$b;
    private float invoke;
    private float valueOf;
    private final RectF toString = new RectF();
    private final RectF values = new RectF();
    private float getInitSettings = 1.0f;
    private float getSignupData = 1.0f;

    private static boolean ag$a(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f5 && f2 > f4 && f2 < f6;
    }

    public RectF HaptikSDK$c() {
        this.values.set(this.toString);
        return this.values;
    }

    public float ag$a() {
        return Math.max(this.invoke, this.HaptikSDK$b / this.getInitSettings);
    }

    public float values() {
        return Math.max(this.HaptikSDK$a, this.ah$b / this.getSignupData);
    }

    public float ah$a() {
        return Math.min(this.HaptikSDK$c, this.ah$a / this.getInitSettings);
    }

    public float valueOf() {
        return Math.min(this.valueOf, this.ag$a / this.getSignupData);
    }

    public float invoke() {
        return this.getInitSettings;
    }

    public float ah$b() {
        return this.getSignupData;
    }

    public void ag$a(int i, int i2) {
        this.HaptikSDK$b = i;
        this.ah$b = i2;
    }

    public void toString(int i, int i2) {
        this.ah$a = i;
        this.ag$a = i2;
    }

    public void toString(float f, float f2, float f3, float f4) {
        this.HaptikSDK$c = f;
        this.valueOf = f2;
        this.getInitSettings = f3;
        this.getSignupData = f4;
    }

    public void ag$a(CropImageOptions cropImageOptions) {
        this.invoke = cropImageOptions.asInterface;
        this.HaptikSDK$a = cropImageOptions.ICustomTabsCallback$Stub;
        this.HaptikSDK$b = cropImageOptions.setDefaultImpl;
        this.ah$b = cropImageOptions.asBinder;
        this.ah$a = cropImageOptions.onNavigationEvent;
        this.ag$a = cropImageOptions.onRelationshipValidationResult;
    }

    public void ah$a(RectF rectF) {
        this.toString.set(rectF);
    }

    public boolean HaptikSDK$a() {
        return this.toString.width() >= 100.0f && this.toString.height() >= 100.0f;
    }

    public CropWindowMoveHandler values(float f, float f2, float f3, CropImageView.CropShape cropShape) {
        CropWindowMoveHandler.Type valueOf;
        if (cropShape == CropImageView.CropShape.OVAL) {
            valueOf = toString(f, f2);
        } else {
            valueOf = valueOf(f, f2, f3);
        }
        if (valueOf != null) {
            return new CropWindowMoveHandler(valueOf, this, f, f2);
        }
        return null;
    }

    private CropWindowMoveHandler.Type valueOf(float f, float f2, float f3) {
        if (values(f, f2, this.toString.left, this.toString.top, f3)) {
            return CropWindowMoveHandler.Type.TOP_LEFT;
        }
        if (values(f, f2, this.toString.right, this.toString.top, f3)) {
            return CropWindowMoveHandler.Type.TOP_RIGHT;
        }
        if (values(f, f2, this.toString.left, this.toString.bottom, f3)) {
            return CropWindowMoveHandler.Type.BOTTOM_LEFT;
        }
        if (values(f, f2, this.toString.right, this.toString.bottom, f3)) {
            return CropWindowMoveHandler.Type.BOTTOM_RIGHT;
        }
        if (ag$a(f, f2, this.toString.left, this.toString.top, this.toString.right, this.toString.bottom) && HaptikSDK$b()) {
            return CropWindowMoveHandler.Type.CENTER;
        }
        if (ah$a(f, f2, this.toString.left, this.toString.right, this.toString.top, f3)) {
            return CropWindowMoveHandler.Type.TOP;
        }
        if (ah$a(f, f2, this.toString.left, this.toString.right, this.toString.bottom, f3)) {
            return CropWindowMoveHandler.Type.BOTTOM;
        }
        if (toString(f, f2, this.toString.left, this.toString.top, this.toString.bottom, f3)) {
            return CropWindowMoveHandler.Type.LEFT;
        }
        if (toString(f, f2, this.toString.right, this.toString.top, this.toString.bottom, f3)) {
            return CropWindowMoveHandler.Type.RIGHT;
        }
        if (!ag$a(f, f2, this.toString.left, this.toString.top, this.toString.right, this.toString.bottom) || HaptikSDK$b()) {
            return null;
        }
        return CropWindowMoveHandler.Type.CENTER;
    }

    private CropWindowMoveHandler.Type toString(float f, float f2) {
        float width = this.toString.width() / 6.0f;
        float f3 = this.toString.left;
        float f4 = this.toString.left;
        float height = this.toString.height() / 6.0f;
        float f5 = this.toString.top + height;
        float f6 = this.toString.top + (height * 5.0f);
        if (f < f3 + width) {
            if (f2 < f5) {
                return CropWindowMoveHandler.Type.TOP_LEFT;
            }
            if (f2 < f6) {
                return CropWindowMoveHandler.Type.LEFT;
            }
            return CropWindowMoveHandler.Type.BOTTOM_LEFT;
        } else if (f < f4 + (width * 5.0f)) {
            if (f2 < f5) {
                return CropWindowMoveHandler.Type.TOP;
            }
            if (f2 < f6) {
                return CropWindowMoveHandler.Type.CENTER;
            }
            return CropWindowMoveHandler.Type.BOTTOM;
        } else if (f2 < f5) {
            return CropWindowMoveHandler.Type.TOP_RIGHT;
        } else {
            if (f2 < f6) {
                return CropWindowMoveHandler.Type.RIGHT;
            }
            return CropWindowMoveHandler.Type.BOTTOM_RIGHT;
        }
    }

    private static boolean values(float f, float f2, float f3, float f4, float f5) {
        return Math.abs(f - f3) <= f5 && Math.abs(f2 - f4) <= f5;
    }

    private static boolean ah$a(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f4 && Math.abs(f2 - f5) <= f6;
    }

    private static boolean toString(float f, float f2, float f3, float f4, float f5, float f6) {
        return Math.abs(f - f3) <= f6 && f2 > f4 && f2 < f5;
    }

    private boolean HaptikSDK$b() {
        return !HaptikSDK$a();
    }
}
