package o;

import android.graphics.Point;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
/* loaded from: classes4.dex */
public class removeTarget extends LayoutShadowNode {
    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        super.addChildAt(reactShadowNodeImpl, i);
        Point values = mergeTransitionsTogether.values(getThemedContext());
        reactShadowNodeImpl.setStyleWidth(values.x);
        reactShadowNodeImpl.setStyleHeight(values.y);
    }
}
