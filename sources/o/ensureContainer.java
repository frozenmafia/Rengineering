package o;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import o.getInEpicenterView;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public class ensureContainer<T extends View, U extends BaseViewManagerInterface<T> & getInEpicenterView<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public ensureContainer(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1937389126:
                if (str.equals("homeIndicatorHidden")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1853558344:
                if (str.equals("gestureEnabled")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1734097646:
                if (str.equals("hideKeyboardOnSwipe")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1322084375:
                if (str.equals("navigationBarHidden")) {
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
            case -1150711358:
                if (str.equals("stackPresentation")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1047235902:
                if (str.equals("activityState")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -973702878:
                if (str.equals("statusBarColor")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -958765200:
                if (str.equals("statusBarStyle")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -577711652:
                if (str.equals("stackAnimation")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -462720700:
                if (str.equals("navigationBarColor")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -257141968:
                if (str.equals("replaceAnimation")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -166356101:
                if (str.equals("preventNativeDismiss")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 17337291:
                if (str.equals("statusBarHidden")) {
                    c = TokenParser.CR;
                    break;
                }
                c = 65535;
                break;
            case 129956386:
                if (str.equals("fullScreenSwipeEnabled")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 187703999:
                if (str.equals("gestureResponseDistance")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 227582404:
                if (str.equals("screenOrientation")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 425064969:
                if (str.equals("transitionDuration")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1082157413:
                if (str.equals("swipeDirection")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1110843912:
                if (str.equals("customAnimationOnSwipe")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1387359683:
                if (str.equals("statusBarAnimation")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1729091548:
                if (str.equals("nativeBackButtonDismissalEnabled")) {
                    c = 21;
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
                ((getInEpicenterView) this.mViewManager).setHomeIndicatorHidden(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 1:
                ((getInEpicenterView) this.mViewManager).setGestureEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 2:
                ((getInEpicenterView) this.mViewManager).setHideKeyboardOnSwipe(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 3:
                ((getInEpicenterView) this.mViewManager).setNavigationBarHidden(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 4:
                ((getInEpicenterView) this.mViewManager).setStatusBarTranslucent(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 5:
                ((getInEpicenterView) this.mViewManager).setStackPresentation(t, (String) obj);
                return;
            case 6:
                ((getInEpicenterView) this.mViewManager).setActivityState(t, obj == null ? -1.0f : ((Double) obj).floatValue());
                return;
            case 7:
                ((getInEpicenterView) this.mViewManager).setStatusBarColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case '\b':
                ((getInEpicenterView) this.mViewManager).setStatusBarStyle(t, obj != null ? (String) obj : null);
                return;
            case '\t':
                ((getInEpicenterView) this.mViewManager).setStackAnimation(t, (String) obj);
                return;
            case '\n':
                ((getInEpicenterView) this.mViewManager).setNavigationBarColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 11:
                ((getInEpicenterView) this.mViewManager).setReplaceAnimation(t, (String) obj);
                return;
            case '\f':
                ((getInEpicenterView) this.mViewManager).setPreventNativeDismiss(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case '\r':
                ((getInEpicenterView) this.mViewManager).setStatusBarHidden(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 14:
                ((getInEpicenterView) this.mViewManager).setFullScreenSwipeEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 15:
                ((getInEpicenterView) this.mViewManager).setGestureResponseDistance(t, (ReadableMap) obj);
                return;
            case 16:
                ((getInEpicenterView) this.mViewManager).setScreenOrientation(t, obj != null ? (String) obj : null);
                return;
            case 17:
                ((getInEpicenterView) this.mViewManager).setTransitionDuration(t, obj == null ? androidx.databinding.library.baseAdapters.BR.rowsObj : ((Double) obj).intValue());
                return;
            case 18:
                ((getInEpicenterView) this.mViewManager).setSwipeDirection(t, (String) obj);
                return;
            case 19:
                ((getInEpicenterView) this.mViewManager).setCustomAnimationOnSwipe(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 20:
                ((getInEpicenterView) this.mViewManager).setStatusBarAnimation(t, obj != null ? (String) obj : null);
                return;
            case 21:
                ((getInEpicenterView) this.mViewManager).setNativeBackButtonDismissalEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
