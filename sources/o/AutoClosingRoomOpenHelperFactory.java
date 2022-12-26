package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.SvgView;
import com.horcrux.svg.VirtualView;
/* loaded from: classes5.dex */
public class AutoClosingRoomOpenHelperFactory extends RenderableView {
    ReadableMap HaptikSDK$c;
    private setNotificationUri valueOf;

    public AutoClosingRoomOpenHelperFactory(ReactContext reactContext) {
        super(reactContext);
    }

    @ReactProp(name = "font")
    public void setFont(ReadableMap readableMap) {
        this.HaptikSDK$c = readableMap;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        if (this.mMatrix != null) {
            this.mMatrix.mapRect(rectF);
        }
        if (this.mTransform != null) {
            this.mTransform.mapRect(rectF);
        }
        this.valueOf = new setNotificationUri(this.mScale, rectF.width(), rectF.height());
    }

    public setNotificationUri valueOf() {
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setNotificationUri ag$a() {
        return ((AutoClosingRoomOpenHelperFactory) getTextRoot().getClass()).valueOf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a() {
        ag$a().valueOf(this, this.HaptikSDK$c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values() {
        ag$a().HaptikSDK$b();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        toString(canvas);
        clip(canvas, paint);
        toString(canvas, paint, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(Canvas canvas, Paint paint, float f) {
        ah$a();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof ColumnInfo)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!"none".equals(virtualView.mDisplay)) {
                        boolean z = virtualView instanceof RenderableView;
                        if (z) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int saveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, this.mCTM);
                        virtualView.render(canvas, paint, this.mOpacity * f);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(canvas, saveAndSetupCanvas);
                        if (z) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                }
            }
        }
        setClientRect(rectF);
        values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(Canvas canvas, Paint paint, float f) {
        super.draw(canvas, paint, f);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        if (this.mPath != null) {
            return this.mPath;
        }
        this.mPath = new Path();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof ColumnInfo) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                this.mPath.addPath(virtualView.getPath(canvas, paint), virtualView.mMatrix);
            }
        }
        return this.mPath;
    }

    public Path valueOf(Canvas canvas, Paint paint, Region.Op op) {
        Path path;
        Path path2;
        Path path3 = new Path();
        int i = 0;
        if (Build.VERSION.SDK_INT >= 19) {
            Path.Op valueOf = Path.Op.valueOf(op.name());
            while (i < getChildCount()) {
                View childAt = getChildAt(i);
                if (!(childAt instanceof ColumnInfo) && (childAt instanceof VirtualView)) {
                    VirtualView virtualView = (VirtualView) childAt;
                    Matrix matrix = virtualView.mMatrix;
                    if (virtualView instanceof AutoClosingRoomOpenHelperFactory) {
                        path2 = ((AutoClosingRoomOpenHelperFactory) virtualView).valueOf(canvas, paint, op);
                    } else {
                        path2 = virtualView.getPath(canvas, paint);
                    }
                    path2.transform(matrix);
                    path3.op(path2, valueOf);
                }
                i++;
            }
        } else {
            Region region = new Region(canvas.getClipBounds());
            Region region2 = new Region();
            while (i < getChildCount()) {
                View childAt2 = getChildAt(i);
                if (!(childAt2 instanceof ColumnInfo) && (childAt2 instanceof VirtualView)) {
                    VirtualView virtualView2 = (VirtualView) childAt2;
                    Matrix matrix2 = virtualView2.mMatrix;
                    if (virtualView2 instanceof AutoClosingRoomOpenHelperFactory) {
                        path = ((AutoClosingRoomOpenHelperFactory) virtualView2).valueOf(canvas, paint, op);
                    } else {
                        path = virtualView2.getPath(canvas, paint);
                    }
                    if (matrix2 != null) {
                        path.transform(matrix2);
                    }
                    Region region3 = new Region();
                    region3.setPath(path, region);
                    region2.op(region3, op);
                }
                i++;
            }
            path3.addPath(region2.getBoundaryPath());
        }
        return path3;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        int reactTagForTouch;
        VirtualView virtualView;
        int hitTest;
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            Path clipPath = getClipPath();
            if (clipPath != null) {
                if (this.mClipRegionPath != clipPath) {
                    this.mClipRegionPath = clipPath;
                    this.mClipBounds = new RectF();
                    clipPath.computeBounds(this.mClipBounds, true);
                    this.mClipRegion = getRegion(clipPath, this.mClipBounds);
                }
                if (!this.mClipRegion.contains(round, round2)) {
                    return -1;
                }
            }
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof VirtualView) {
                    if (!(childAt instanceof ColumnInfo) && (hitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                        return (virtualView.isResponsible() || hitTest != childAt.getId()) ? hitTest : getId();
                    }
                } else if ((childAt instanceof SvgView) && (reactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                    return reactTagForTouch;
                }
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }

    @Override // com.horcrux.svg.RenderableView
    public void resetProperties() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }
}
