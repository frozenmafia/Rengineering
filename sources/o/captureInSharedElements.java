package o;

import android.view.View;
import com.BV.LinearGradient.LinearGradientManager;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.sendbird.android.constant.StringSet;
import o.configureTransitionsOrdered;
/* loaded from: classes4.dex */
public class captureInSharedElements<T extends View, U extends BaseViewManagerInterface<T> & configureTransitionsOrdered<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public captureInSharedElements(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals(ViewProps.ENABLED)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1354842768:
                if (str.equals(LinearGradientManager.PROP_COLORS)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -885150488:
                if (str.equals("progressBackgroundColor")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -416037467:
                if (str.equals("progressViewOffset")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -321826009:
                if (str.equals("refreshing")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3530753:
                if (str.equals(StringSet.size)) {
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
            ((configureTransitionsOrdered) this.mViewManager).setEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
        } else if (c == 1) {
            ((configureTransitionsOrdered) this.mViewManager).setColors(t, (ReadableArray) obj);
        } else if (c == 2) {
            ((configureTransitionsOrdered) this.mViewManager).setProgressBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
        } else if (c == 3) {
            ((configureTransitionsOrdered) this.mViewManager).setProgressViewOffset(t, obj == null ? 0.0f : ((Double) obj).floatValue());
        } else if (c == 4) {
            ((configureTransitionsOrdered) this.mViewManager).setRefreshing(t, obj != null ? ((Boolean) obj).booleanValue() : false);
        } else if (c == 5) {
            ((configureTransitionsOrdered) this.mViewManager).setSize(t, (String) obj);
        } else {
            super.setProperty(t, str, obj);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeRefreshing")) {
            ((configureTransitionsOrdered) this.mViewManager).setNativeRefreshing(t, readableArray.getBoolean(0));
        }
    }
}
