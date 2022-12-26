package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.SVGLength;
/* loaded from: classes5.dex */
public class collate extends RenderableView {
    private SVGLength ag$a;
    private SVGLength ah$a;
    private SVGLength valueOf;
    private SVGLength values;

    public collate(ReactContext reactContext) {
        super(reactContext);
    }

    @ReactProp(name = "x1")
    public void setX1(Dynamic dynamic) {
        this.ah$a = SVGLength.ag$a(dynamic);
        invalidate();
    }

    @ReactProp(name = "y1")
    public void setY1(Dynamic dynamic) {
        this.valueOf = SVGLength.ag$a(dynamic);
        invalidate();
    }

    @ReactProp(name = "x2")
    public void setX2(Dynamic dynamic) {
        this.values = SVGLength.ag$a(dynamic);
        invalidate();
    }

    @ReactProp(name = "y2")
    public void setY2(Dynamic dynamic) {
        this.ag$a = SVGLength.ag$a(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.ah$a);
        double relativeOnHeight = relativeOnHeight(this.valueOf);
        double relativeOnWidth2 = relativeOnWidth(this.values);
        double relativeOnHeight2 = relativeOnHeight(this.ag$a);
        path.moveTo((float) relativeOnWidth, (float) relativeOnHeight);
        path.lineTo((float) relativeOnWidth2, (float) relativeOnHeight2);
        return path;
    }
}
