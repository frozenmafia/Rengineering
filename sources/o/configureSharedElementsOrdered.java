package o;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import o.configureSharedElementsReordered;
/* loaded from: classes4.dex */
public class configureSharedElementsOrdered<T extends View, U extends BaseViewManagerInterface<T> & configureSharedElementsReordered<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public configureSharedElementsOrdered(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1851617609:
                if (str.equals("presentationStyle")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1850124175:
                if (str.equals("supportedOrientations")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1726194350:
                if (str.equals("transparent")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1618432855:
                if (str.equals("identifier")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1156137512:
                if (str.equals("statusBarTranslucent")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -795203165:
                if (str.equals("animated")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 466743410:
                if (str.equals(ViewProps.VISIBLE)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1195991583:
                if (str.equals("hardwareAccelerated")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2031205598:
                if (str.equals("animationType")) {
                    c = '\b';
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
                ((configureSharedElementsReordered) this.mViewManager).setPresentationStyle(t, (String) obj);
                return;
            case 1:
                ((configureSharedElementsReordered) this.mViewManager).setSupportedOrientations(t, (ReadableArray) obj);
                return;
            case 2:
                ((configureSharedElementsReordered) this.mViewManager).setTransparent(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 3:
                ((configureSharedElementsReordered) this.mViewManager).setIdentifier(t, obj != null ? ((Double) obj).intValue() : 0);
                return;
            case 4:
                ((configureSharedElementsReordered) this.mViewManager).setStatusBarTranslucent(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 5:
                ((configureSharedElementsReordered) this.mViewManager).setAnimated(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 6:
                ((configureSharedElementsReordered) this.mViewManager).setVisible(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 7:
                ((configureSharedElementsReordered) this.mViewManager).setHardwareAccelerated(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case '\b':
                ((configureSharedElementsReordered) this.mViewManager).setAnimationType(t, (String) obj);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
