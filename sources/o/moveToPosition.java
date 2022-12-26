package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.VirtualView;
/* loaded from: classes5.dex */
class moveToPosition extends VirtualView {
    @Override // com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
    }

    @Override // com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        return null;
    }

    @Override // com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        return -1;
    }

    @Override // com.horcrux.svg.VirtualView
    public boolean isResponsible() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public moveToPosition(ReactContext reactContext) {
        super(reactContext);
    }
}
