package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.VirtualView;
/* loaded from: classes5.dex */
public class moveToNext extends moveToPosition {
    @Override // o.moveToPosition, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
    }

    public moveToNext(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}
