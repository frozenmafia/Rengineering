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
public class requery extends RenderableView {
    private SVGLength ah$a;
    private SVGLength valueOf;
    private SVGLength values;

    public requery(ReactContext reactContext) {
        super(reactContext);
    }

    @ReactProp(name = "cx")
    public void setCx(Dynamic dynamic) {
        this.values = SVGLength.ag$a(dynamic);
        invalidate();
    }

    @ReactProp(name = "cy")
    public void setCy(Dynamic dynamic) {
        this.ah$a = SVGLength.ag$a(dynamic);
        invalidate();
    }

    @ReactProp(name = "r")
    public void setR(Dynamic dynamic) {
        this.valueOf = SVGLength.ag$a(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        path.addCircle((float) relativeOnWidth(this.values), (float) relativeOnHeight(this.ah$a), (float) relativeOnOther(this.valueOf), Path.Direction.CW);
        return path;
    }
}
