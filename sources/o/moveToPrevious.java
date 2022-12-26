package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.SVGLength;
/* loaded from: classes5.dex */
public class moveToPrevious extends RenderableView {
    private SVGLength ag$a;
    private SVGLength ah$a;
    private SVGLength valueOf;
    private SVGLength values;

    public moveToPrevious(ReactContext reactContext) {
        super(reactContext);
    }

    @ReactProp(name = "cx")
    public void setCx(Dynamic dynamic) {
        this.valueOf = SVGLength.ag$a(dynamic);
        invalidate();
    }

    @ReactProp(name = "cy")
    public void setCy(Dynamic dynamic) {
        this.values = SVGLength.ag$a(dynamic);
        invalidate();
    }

    @ReactProp(name = "rx")
    public void setRx(Dynamic dynamic) {
        this.ag$a = SVGLength.ag$a(dynamic);
        invalidate();
    }

    @ReactProp(name = "ry")
    public void setRy(Dynamic dynamic) {
        this.ah$a = SVGLength.ag$a(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.valueOf);
        double relativeOnHeight = relativeOnHeight(this.values);
        double relativeOnWidth2 = relativeOnWidth(this.ag$a);
        double relativeOnHeight2 = relativeOnHeight(this.ah$a);
        path.addOval(new RectF((float) (relativeOnWidth - relativeOnWidth2), (float) (relativeOnHeight - relativeOnHeight2), (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2)), Path.Direction.CW);
        return path;
    }
}
