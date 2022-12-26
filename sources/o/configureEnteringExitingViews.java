package o;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import o.configureTransitionsReordered;
/* loaded from: classes4.dex */
public class configureEnteringExitingViews<T extends View, U extends BaseViewManagerInterface<T> & configureTransitionsReordered<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public configureEnteringExitingViews(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1742453971:
                if (str.equals("thumbColor")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1609594047:
                if (str.equals(ViewProps.ENABLED)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -287374307:
                if (str.equals("trackTintColor")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3551:
                if (str.equals(ViewProps.ON)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 111972721:
                if (str.equals("value")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1084662482:
                if (str.equals("trackColorForFalse")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1912319986:
                if (str.equals("thumbTintColor")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2113632767:
                if (str.equals("trackColorForTrue")) {
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
                ((configureTransitionsReordered) this.mViewManager).setThumbColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 1:
                ((configureTransitionsReordered) this.mViewManager).setEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 2:
                ((configureTransitionsReordered) this.mViewManager).setTrackTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 3:
                ((configureTransitionsReordered) this.mViewManager).setOn(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 4:
                ((configureTransitionsReordered) this.mViewManager).setValue(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 5:
                ((configureTransitionsReordered) this.mViewManager).setDisabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 6:
                ((configureTransitionsReordered) this.mViewManager).setTrackColorForFalse(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 7:
                ((configureTransitionsReordered) this.mViewManager).setThumbTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case '\b':
                ((configureTransitionsReordered) this.mViewManager).setTrackColorForTrue(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            ((configureTransitionsReordered) this.mViewManager).setNativeValue(t, readableArray.getBoolean(0));
        }
    }
}
