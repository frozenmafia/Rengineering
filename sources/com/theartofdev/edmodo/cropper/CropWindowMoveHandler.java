package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import o.decryptKey;
/* loaded from: classes5.dex */
public final class CropWindowMoveHandler {
    private static final Matrix ag$a = new Matrix();
    private final Type HaptikSDK$b;
    private final PointF HaptikSDK$c = new PointF();
    private final float ah$a;
    private final float toString;
    private final float valueOf;
    private final float values;

    /* loaded from: classes5.dex */
    public enum Type {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    private static float ah$a(float f, float f2, float f3, float f4) {
        return (f3 - f) / (f4 - f2);
    }

    public CropWindowMoveHandler(Type type, decryptKey decryptkey, float f, float f2) {
        this.HaptikSDK$b = type;
        this.toString = decryptkey.ag$a();
        this.valueOf = decryptkey.values();
        this.ah$a = decryptkey.ah$a();
        this.values = decryptkey.valueOf();
        toString(decryptkey.HaptikSDK$c(), f, f2);
    }

    public void ah$a(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3, boolean z, float f4) {
        float f5 = f + this.HaptikSDK$c.x;
        float f6 = f2 + this.HaptikSDK$c.y;
        if (this.HaptikSDK$b == Type.CENTER) {
            ah$a(rectF, f5, f6, rectF2, i, i2, f3);
        } else if (z) {
            ah$a(rectF, f5, f6, rectF2, i, i2, f3, f4);
        } else {
            valueOf(rectF, f5, f6, rectF2, i, i2, f3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.theartofdev.edmodo.cropper.CropWindowMoveHandler$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ag$a;

        static {
            int[] iArr = new int[Type.values().length];
            ag$a = iArr;
            try {
                iArr[Type.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ag$a[Type.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ag$a[Type.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ag$a[Type.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ag$a[Type.LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ag$a[Type.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ag$a[Type.RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ag$a[Type.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ag$a[Type.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private void toString(RectF rectF, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = 0.0f;
        switch (AnonymousClass1.ag$a[this.HaptikSDK$b.ordinal()]) {
            case 1:
                f7 = rectF.left - f;
                f3 = rectF.top;
                f6 = f3 - f2;
                this.HaptikSDK$c.x = f7;
                this.HaptikSDK$c.y = f6;
                return;
            case 2:
                f7 = rectF.right - f;
                f3 = rectF.top;
                f6 = f3 - f2;
                this.HaptikSDK$c.x = f7;
                this.HaptikSDK$c.y = f6;
                return;
            case 3:
                f7 = rectF.left - f;
                f3 = rectF.bottom;
                f6 = f3 - f2;
                this.HaptikSDK$c.x = f7;
                this.HaptikSDK$c.y = f6;
                return;
            case 4:
                f7 = rectF.right - f;
                f3 = rectF.bottom;
                f6 = f3 - f2;
                this.HaptikSDK$c.x = f7;
                this.HaptikSDK$c.y = f6;
                return;
            case 5:
                f4 = rectF.left;
                f5 = f4 - f;
                f7 = f5;
                f6 = 0.0f;
                this.HaptikSDK$c.x = f7;
                this.HaptikSDK$c.y = f6;
                return;
            case 6:
                f3 = rectF.top;
                f6 = f3 - f2;
                this.HaptikSDK$c.x = f7;
                this.HaptikSDK$c.y = f6;
                return;
            case 7:
                f4 = rectF.right;
                f5 = f4 - f;
                f7 = f5;
                f6 = 0.0f;
                this.HaptikSDK$c.x = f7;
                this.HaptikSDK$c.y = f6;
                return;
            case 8:
                f3 = rectF.bottom;
                f6 = f3 - f2;
                this.HaptikSDK$c.x = f7;
                this.HaptikSDK$c.y = f6;
                return;
            case 9:
                f7 = rectF.centerX() - f;
                f3 = rectF.centerY();
                f6 = f3 - f2;
                this.HaptikSDK$c.x = f7;
                this.HaptikSDK$c.y = f6;
                return;
            default:
                f5 = 0.0f;
                f7 = f5;
                f6 = 0.0f;
                this.HaptikSDK$c.x = f7;
                this.HaptikSDK$c.y = f6;
                return;
        }
    }

    private void ah$a(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3) {
        float centerX = f - rectF.centerX();
        float centerY = f2 - rectF.centerY();
        if (rectF.left + centerX < 0.0f || rectF.right + centerX > i || rectF.left + centerX < rectF2.left || rectF.right + centerX > rectF2.right) {
            centerX /= 1.05f;
            this.HaptikSDK$c.x -= centerX / 2.0f;
        }
        if (rectF.top + centerY < 0.0f || rectF.bottom + centerY > i2 || rectF.top + centerY < rectF2.top || rectF.bottom + centerY > rectF2.bottom) {
            centerY /= 1.05f;
            this.HaptikSDK$c.y -= centerY / 2.0f;
        }
        rectF.offset(centerX, centerY);
        ag$a(rectF, rectF2, f3);
    }

    private void valueOf(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3) {
        switch (AnonymousClass1.ag$a[this.HaptikSDK$b.ordinal()]) {
            case 1:
                values(rectF, f2, rectF2, f3, 0.0f, false, false);
                ag$a(rectF, f, rectF2, f3, 0.0f, false, false);
                return;
            case 2:
                values(rectF, f2, rectF2, f3, 0.0f, false, false);
                ah$a(rectF, f, rectF2, i, f3, 0.0f, false, false);
                return;
            case 3:
                values(rectF, f2, rectF2, i2, f3, 0.0f, false, false);
                ag$a(rectF, f, rectF2, f3, 0.0f, false, false);
                return;
            case 4:
                values(rectF, f2, rectF2, i2, f3, 0.0f, false, false);
                ah$a(rectF, f, rectF2, i, f3, 0.0f, false, false);
                return;
            case 5:
                ag$a(rectF, f, rectF2, f3, 0.0f, false, false);
                return;
            case 6:
                values(rectF, f2, rectF2, f3, 0.0f, false, false);
                return;
            case 7:
                ah$a(rectF, f, rectF2, i, f3, 0.0f, false, false);
                return;
            case 8:
                values(rectF, f2, rectF2, i2, f3, 0.0f, false, false);
                return;
            default:
                return;
        }
    }

    private void ah$a(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3, float f4) {
        switch (AnonymousClass1.ag$a[this.HaptikSDK$b.ordinal()]) {
            case 1:
                if (ah$a(f, f2, rectF.right, rectF.bottom) < f4) {
                    values(rectF, f2, rectF2, f3, f4, true, false);
                    valueOf(rectF, f4);
                    return;
                }
                ag$a(rectF, f, rectF2, f3, f4, true, false);
                ag$a(rectF, f4);
                return;
            case 2:
                if (ah$a(rectF.left, f2, f, rectF.bottom) < f4) {
                    values(rectF, f2, rectF2, f3, f4, false, true);
                    ah$a(rectF, f4);
                    return;
                }
                ah$a(rectF, f, rectF2, i, f3, f4, true, false);
                ag$a(rectF, f4);
                return;
            case 3:
                if (ah$a(f, rectF.top, rectF.right, f2) < f4) {
                    values(rectF, f2, rectF2, i2, f3, f4, true, false);
                    valueOf(rectF, f4);
                    return;
                }
                ag$a(rectF, f, rectF2, f3, f4, false, true);
                toString(rectF, f4);
                return;
            case 4:
                if (ah$a(rectF.left, rectF.top, f, f2) < f4) {
                    values(rectF, f2, rectF2, i2, f3, f4, false, true);
                    ah$a(rectF, f4);
                    return;
                }
                ah$a(rectF, f, rectF2, i, f3, f4, false, true);
                toString(rectF, f4);
                return;
            case 5:
                ag$a(rectF, f, rectF2, f3, f4, true, true);
                valueOf(rectF, rectF2, f4);
                return;
            case 6:
                values(rectF, f2, rectF2, f3, f4, true, true);
                toString(rectF, rectF2, f4);
                return;
            case 7:
                ah$a(rectF, f, rectF2, i, f3, f4, true, true);
                valueOf(rectF, rectF2, f4);
                return;
            case 8:
                values(rectF, f2, rectF2, i2, f3, f4, true, true);
                toString(rectF, rectF2, f4);
                return;
            default:
                return;
        }
    }

    private void ag$a(RectF rectF, RectF rectF2, float f) {
        if (rectF.left < rectF2.left + f) {
            rectF.offset(rectF2.left - rectF.left, 0.0f);
        }
        if (rectF.top < rectF2.top + f) {
            rectF.offset(0.0f, rectF2.top - rectF.top);
        }
        if (rectF.right > rectF2.right - f) {
            rectF.offset(rectF2.right - rectF.right, 0.0f);
        }
        if (rectF.bottom > rectF2.bottom - f) {
            rectF.offset(0.0f, rectF2.bottom - rectF.bottom);
        }
    }

    private void ag$a(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < 0.0f) {
            f /= 1.05f;
            this.HaptikSDK$c.x -= f / 1.1f;
        }
        if (f < rectF2.left) {
            this.HaptikSDK$c.x -= (f - rectF2.left) / 2.0f;
        }
        if (f - rectF2.left < f2) {
            f = rectF2.left;
        }
        if (rectF.right - f < this.toString) {
            f = rectF.right - this.toString;
        }
        if (rectF.right - f > this.ah$a) {
            f = rectF.right - this.ah$a;
        }
        if (f - rectF2.left < f2) {
            f = rectF2.left;
        }
        if (f3 > 0.0f) {
            float f4 = (rectF.right - f) / f3;
            if (f4 < this.valueOf) {
                f = Math.max(rectF2.left, rectF.right - (this.valueOf * f3));
                f4 = (rectF.right - f) / f3;
            }
            if (f4 > this.values) {
                f = Math.max(rectF2.left, rectF.right - (this.values * f3));
                f4 = (rectF.right - f) / f3;
            }
            if (z && z2) {
                f = Math.max(f, Math.max(rectF2.left, rectF.right - (rectF2.height() * f3)));
            } else {
                if (z && rectF.bottom - f4 < rectF2.top) {
                    f = Math.max(rectF2.left, rectF.right - ((rectF.bottom - rectF2.top) * f3));
                    f4 = (rectF.right - f) / f3;
                }
                if (z2 && rectF.top + f4 > rectF2.bottom) {
                    f = Math.max(f, Math.max(rectF2.left, rectF.right - ((rectF2.bottom - rectF.top) * f3)));
                }
            }
        }
        rectF.left = f;
    }

    private void ah$a(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float f4 = i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.HaptikSDK$c.x -= (f - f4) / 1.1f;
        }
        if (f > rectF2.right) {
            this.HaptikSDK$c.x -= (f - rectF2.right) / 2.0f;
        }
        if (rectF2.right - f < f2) {
            f = rectF2.right;
        }
        if (f - rectF.left < this.toString) {
            f = rectF.left + this.toString;
        }
        if (f - rectF.left > this.ah$a) {
            f = rectF.left + this.ah$a;
        }
        if (rectF2.right - f < f2) {
            f = rectF2.right;
        }
        if (f3 > 0.0f) {
            float f5 = (f - rectF.left) / f3;
            if (f5 < this.valueOf) {
                f = Math.min(rectF2.right, rectF.left + (this.valueOf * f3));
                f5 = (f - rectF.left) / f3;
            }
            if (f5 > this.values) {
                f = Math.min(rectF2.right, rectF.left + (this.values * f3));
                f5 = (f - rectF.left) / f3;
            }
            if (z && z2) {
                f = Math.min(f, Math.min(rectF2.right, rectF.left + (rectF2.height() * f3)));
            } else {
                if (z && rectF.bottom - f5 < rectF2.top) {
                    f = Math.min(rectF2.right, rectF.left + ((rectF.bottom - rectF2.top) * f3));
                    f5 = (f - rectF.left) / f3;
                }
                if (z2 && rectF.top + f5 > rectF2.bottom) {
                    f = Math.min(f, Math.min(rectF2.right, rectF.left + ((rectF2.bottom - rectF.top) * f3)));
                }
            }
        }
        rectF.right = f;
    }

    private void values(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < 0.0f) {
            f /= 1.05f;
            this.HaptikSDK$c.y -= f / 1.1f;
        }
        if (f < rectF2.top) {
            this.HaptikSDK$c.y -= (f - rectF2.top) / 2.0f;
        }
        if (f - rectF2.top < f2) {
            f = rectF2.top;
        }
        if (rectF.bottom - f < this.valueOf) {
            f = rectF.bottom - this.valueOf;
        }
        if (rectF.bottom - f > this.values) {
            f = rectF.bottom - this.values;
        }
        if (f - rectF2.top < f2) {
            f = rectF2.top;
        }
        if (f3 > 0.0f) {
            float f4 = (rectF.bottom - f) * f3;
            if (f4 < this.toString) {
                f = Math.max(rectF2.top, rectF.bottom - (this.toString / f3));
                f4 = (rectF.bottom - f) * f3;
            }
            if (f4 > this.ah$a) {
                f = Math.max(rectF2.top, rectF.bottom - (this.ah$a / f3));
                f4 = (rectF.bottom - f) * f3;
            }
            if (z && z2) {
                f = Math.max(f, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f3)));
            } else {
                if (z && rectF.right - f4 < rectF2.left) {
                    f = Math.max(rectF2.top, rectF.bottom - ((rectF.right - rectF2.left) / f3));
                    f4 = (rectF.bottom - f) * f3;
                }
                if (z2 && rectF.left + f4 > rectF2.right) {
                    f = Math.max(f, Math.max(rectF2.top, rectF.bottom - ((rectF2.right - rectF.left) / f3)));
                }
            }
        }
        rectF.top = f;
    }

    private void values(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float f4 = i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.HaptikSDK$c.y -= (f - f4) / 1.1f;
        }
        if (f > rectF2.bottom) {
            this.HaptikSDK$c.y -= (f - rectF2.bottom) / 2.0f;
        }
        if (rectF2.bottom - f < f2) {
            f = rectF2.bottom;
        }
        if (f - rectF.top < this.valueOf) {
            f = rectF.top + this.valueOf;
        }
        if (f - rectF.top > this.values) {
            f = rectF.top + this.values;
        }
        if (rectF2.bottom - f < f2) {
            f = rectF2.bottom;
        }
        if (f3 > 0.0f) {
            float f5 = (f - rectF.top) * f3;
            if (f5 < this.toString) {
                f = Math.min(rectF2.bottom, rectF.top + (this.toString / f3));
                f5 = (f - rectF.top) * f3;
            }
            if (f5 > this.ah$a) {
                f = Math.min(rectF2.bottom, rectF.top + (this.ah$a / f3));
                f5 = (f - rectF.top) * f3;
            }
            if (z && z2) {
                f = Math.min(f, Math.min(rectF2.bottom, rectF.top + (rectF2.width() / f3)));
            } else {
                if (z && rectF.right - f5 < rectF2.left) {
                    f = Math.min(rectF2.bottom, rectF.top + ((rectF.right - rectF2.left) / f3));
                    f5 = (f - rectF.top) * f3;
                }
                if (z2 && rectF.left + f5 > rectF2.right) {
                    f = Math.min(f, Math.min(rectF2.bottom, rectF.top + ((rectF2.right - rectF.left) / f3)));
                }
            }
        }
        rectF.bottom = f;
    }

    private void valueOf(RectF rectF, float f) {
        rectF.left = rectF.right - (rectF.height() * f);
    }

    private void ag$a(RectF rectF, float f) {
        rectF.top = rectF.bottom - (rectF.width() / f);
    }

    private void ah$a(RectF rectF, float f) {
        rectF.right = rectF.left + (rectF.height() * f);
    }

    private void toString(RectF rectF, float f) {
        rectF.bottom = rectF.top + (rectF.width() / f);
    }

    private void toString(RectF rectF, RectF rectF2, float f) {
        rectF.inset((rectF.width() - (rectF.height() * f)) / 2.0f, 0.0f);
        if (rectF.left < rectF2.left) {
            rectF.offset(rectF2.left - rectF.left, 0.0f);
        }
        if (rectF.right > rectF2.right) {
            rectF.offset(rectF2.right - rectF.right, 0.0f);
        }
    }

    private void valueOf(RectF rectF, RectF rectF2, float f) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f)) / 2.0f);
        if (rectF.top < rectF2.top) {
            rectF.offset(0.0f, rectF2.top - rectF.top);
        }
        if (rectF.bottom > rectF2.bottom) {
            rectF.offset(0.0f, rectF2.bottom - rectF.bottom);
        }
    }
}
