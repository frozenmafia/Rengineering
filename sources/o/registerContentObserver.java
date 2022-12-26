package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.RenderableView;
/* loaded from: classes5.dex */
public class registerContentObserver extends AutoClosingRoomOpenHelperFactory {
    @Override // o.AutoClosingRoomOpenHelperFactory, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        return -1;
    }

    @Override // com.horcrux.svg.VirtualView
    public boolean isResponsible() {
        return false;
    }

    @Override // com.horcrux.svg.RenderableView
    public void mergeProperties(RenderableView renderableView) {
    }

    @Override // o.AutoClosingRoomOpenHelperFactory, com.horcrux.svg.RenderableView
    public void resetProperties() {
    }

    public registerContentObserver(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // o.AutoClosingRoomOpenHelperFactory, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        FragmentActivity.ah$a("ReactNative", "RNSVG: ClipPath can't be drawn, it should be defined as a child component for `Defs` ");
    }

    @Override // o.AutoClosingRoomOpenHelperFactory, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        getSvgView().defineClipPath(this, this.mName);
    }
}
