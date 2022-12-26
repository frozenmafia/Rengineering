package o;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.exoplayer2.offline.DownloadService;
import o.mergeTransitions;
/* loaded from: classes4.dex */
public class replaceHide<T extends View, U extends BaseViewManagerInterface<T> & mergeTransitions<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public replaceHide(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -2143114526:
                if (str.equals("rippleRadius")) {
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
            case -775297261:
                if (str.equals("rippleColor")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1387411372:
                if (str.equals("touchSoundDisabled")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1686617758:
                if (str.equals("exclusive")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1825644485:
                if (str.equals("borderless")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1984457027:
                if (str.equals(DownloadService.KEY_FOREGROUND)) {
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
                ((mergeTransitions) this.mViewManager).setRippleRadius(t, obj != null ? ((Double) obj).intValue() : 0);
                return;
            case 1:
                ((mergeTransitions) this.mViewManager).setEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 2:
                ((mergeTransitions) this.mViewManager).setRippleColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 3:
                ((mergeTransitions) this.mViewManager).setTouchSoundDisabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 4:
                ((mergeTransitions) this.mViewManager).setExclusive(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 5:
                ((mergeTransitions) this.mViewManager).setBorderless(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 6:
                ((mergeTransitions) this.mViewManager).setForeground(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
