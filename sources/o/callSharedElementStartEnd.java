package o;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import o.captureOutSharedElements;
/* loaded from: classes4.dex */
public class callSharedElementStartEnd<T extends View, U extends BaseViewManagerInterface<T> & captureOutSharedElements<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public callSharedElementStartEnd(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -2082382380:
                if (str.equals("statusBarBackgroundColor")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1233873500:
                if (str.equals("drawerBackgroundColor")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -764307226:
                if (str.equals("keyboardDismissMode")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 268251989:
                if (str.equals("drawerWidth")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 695891258:
                if (str.equals("drawerPosition")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1857208703:
                if (str.equals("drawerLockMode")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            ((captureOutSharedElements) this.mViewManager).setStatusBarBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
        } else if (c == 1) {
            ((captureOutSharedElements) this.mViewManager).setDrawerBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
        } else if (c == 2) {
            ((captureOutSharedElements) this.mViewManager).setKeyboardDismissMode(t, (String) obj);
        } else if (c == 3) {
            ((captureOutSharedElements) this.mViewManager).setDrawerWidth(t, obj == null ? null : Float.valueOf(((Double) obj).floatValue()));
        } else if (c == 4) {
            ((captureOutSharedElements) this.mViewManager).setDrawerPosition(t, (String) obj);
        } else if (c == 5) {
            ((captureOutSharedElements) this.mViewManager).setDrawerLockMode(t, (String) obj);
        } else {
            super.setProperty(t, str, obj);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("closeDrawer")) {
            ((captureOutSharedElements) this.mViewManager).closeDrawer(t);
        } else if (str.equals("openDrawer")) {
            ((captureOutSharedElements) this.mViewManager).openDrawer(t);
        }
    }
}
