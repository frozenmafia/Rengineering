package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
/* loaded from: classes5.dex */
public class isMigrationRequired extends AutoClosingRoomOpenHelperFactory {
    private float HaptikSDK$a;
    private float ag$a;
    private float ah$a;
    private int toString;
    private float valueOf;
    private String values;

    public isMigrationRequired(ReactContext reactContext) {
        super(reactContext);
    }

    @ReactProp(name = "minX")
    public void setMinX(float f) {
        this.ah$a = f;
        invalidate();
    }

    @ReactProp(name = "minY")
    public void setMinY(float f) {
        this.ag$a = f;
        invalidate();
    }

    @ReactProp(name = "vbWidth")
    public void setVbWidth(float f) {
        this.HaptikSDK$a = f;
        invalidate();
    }

    @ReactProp(name = "vbHeight")
    public void setVbHeight(float f) {
        this.valueOf = f;
        invalidate();
    }

    @ReactProp(name = "align")
    public void setAlign(String str) {
        this.values = str;
        invalidate();
    }

    @ReactProp(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.toString = i;
        invalidate();
    }

    @Override // o.AutoClosingRoomOpenHelperFactory, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        saveDefinition();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(Canvas canvas, Paint paint, float f, float f2, float f3) {
        if (this.values != null) {
            canvas.concat(DelegatingOpenHelper.ah$a(new RectF(this.ah$a * this.mScale, this.ag$a * this.mScale, (this.ah$a + this.HaptikSDK$a) * this.mScale, (this.ag$a + this.valueOf) * this.mScale), new RectF(0.0f, 0.0f, f2, f3), this.values, this.toString));
            super.draw(canvas, paint, f);
        }
    }
}
