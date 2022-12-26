package o;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import o.retainValues;
/* loaded from: classes4.dex */
public class setViewVisibility<T extends View, U extends BaseViewManagerInterface<T> & retainValues<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public setViewVisibility(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        if (str.equals("type")) {
            ((retainValues) this.mViewManager).setType(t, (String) obj);
        } else {
            super.setProperty(t, str, obj);
        }
    }
}
