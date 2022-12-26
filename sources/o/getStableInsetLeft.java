package o;

import android.graphics.Bitmap;
import o.getScaledPagingTouchSlop;
/* loaded from: classes3.dex */
public final class getStableInsetLeft implements getScaledPagingTouchSlop.valueOf {
    private final rotationXBy toString;
    private final scaleXBy values;

    public getStableInsetLeft(scaleXBy scalexby, rotationXBy rotationxby) {
        this.values = scalexby;
        this.toString = rotationxby;
    }

    @Override // o.getScaledPagingTouchSlop.valueOf
    public Bitmap ah$a(int i, int i2, Bitmap.Config config) {
        return this.values.valueOf(i, i2, config);
    }

    @Override // o.getScaledPagingTouchSlop.valueOf
    public void toString(Bitmap bitmap) {
        this.values.values(bitmap);
    }

    @Override // o.getScaledPagingTouchSlop.valueOf
    public byte[] ah$a(int i) {
        rotationXBy rotationxby = this.toString;
        if (rotationxby == null) {
            return new byte[i];
        }
        return (byte[]) rotationxby.ah$a(i, byte[].class);
    }

    @Override // o.getScaledPagingTouchSlop.valueOf
    public void valueOf(byte[] bArr) {
        rotationXBy rotationxby = this.toString;
        if (rotationxby == null) {
            return;
        }
        rotationxby.ag$a(bArr);
    }

    @Override // o.getScaledPagingTouchSlop.valueOf
    public int[] ag$a(int i) {
        rotationXBy rotationxby = this.toString;
        if (rotationxby == null) {
            return new int[i];
        }
        return (int[]) rotationxby.ah$a(i, int[].class);
    }

    @Override // o.getScaledPagingTouchSlop.valueOf
    public void toString(int[] iArr) {
        rotationXBy rotationxby = this.toString;
        if (rotationxby == null) {
            return;
        }
        rotationxby.ag$a(iArr);
    }
}
