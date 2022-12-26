package o;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import o.chooseImpl;
/* loaded from: classes4.dex */
public class canHandleAll<T extends View, U extends BaseViewManagerInterface<T> & chooseImpl<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public canHandleAll(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1001078227:
                if (str.equals(androidx.core.app.NotificationCompat.CATEGORY_PROGRESS)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -877170387:
                if (str.equals(ViewProps.TEST_ID)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -676876213:
                if (str.equals("typeAttr")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 94842723:
                if (str.equals("color")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 633138363:
                if (str.equals("indeterminate")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1118509918:
                if (str.equals("animating")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1804741442:
                if (str.equals("styleAttr")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                ((chooseImpl) this.mViewManager).setProgress(t, obj == null ? 0.0d : ((Double) obj).doubleValue());
                return;
            case 1:
                ((chooseImpl) this.mViewManager).setTestID(t, obj == null ? "" : (String) obj);
                return;
            case 2:
                ((chooseImpl) this.mViewManager).setTypeAttr(t, obj != null ? (String) obj : null);
                return;
            case 3:
                ((chooseImpl) this.mViewManager).setColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 4:
                ((chooseImpl) this.mViewManager).setIndeterminate(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 5:
                ((chooseImpl) this.mViewManager).setAnimating(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 6:
                ((chooseImpl) this.mViewManager).setStyleAttr(t, obj != null ? (String) obj : null);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
