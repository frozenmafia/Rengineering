package o;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.logging.type.LogSeverity;
import java.util.ArrayList;
import o.FragmentTransitionImpl;
/* loaded from: classes4.dex */
public class createViewModelLazy extends FragmentTransitionImpl.AnonymousClass2 {
    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtual() {
        return true;
    }

    /* renamed from: o.createViewModelLazy$default  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class Cdefault {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static int ah$a(String str) {
            char c;
            if (str != null) {
                str.hashCode();
                switch (str.hashCode()) {
                    case -1039745817:
                        if (str.equals("normal")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 48625:
                        if (str.equals("100")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 49586:
                        if (str.equals("200")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 50547:
                        if (str.equals("300")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 51508:
                        if (str.equals("400")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 52469:
                        if (str.equals("500")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 53430:
                        if (str.equals("600")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 54391:
                        if (str.equals("700")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 55352:
                        if (str.equals("800")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 56313:
                        if (str.equals("900")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3029637:
                        if (str.equals(TtmlNode.BOLD)) {
                            c = '\n';
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
                    case 4:
                        return 400;
                    case 1:
                        return 100;
                    case 2:
                        return 200;
                    case 3:
                        return 300;
                    case 5:
                        return 500;
                    case 6:
                        return LogSeverity.CRITICAL_VALUE;
                    case 7:
                    case '\n':
                        return LogSeverity.ALERT_VALUE;
                    case '\b':
                        return LogSeverity.EMERGENCY_VALUE;
                    case '\t':
                        return 900;
                }
            }
            return -1;
        }

        public static int ag$a(String str) {
            if (str != null) {
                if (TtmlNode.ITALIC.equals(str)) {
                    return 2;
                }
                return "normal".equals(str) ? 0 : -1;
            }
            return -1;
        }

        public static String values(ReadableArray readableArray) {
            if (readableArray == null || readableArray.size() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < readableArray.size(); i++) {
                String string = readableArray.getString(i);
                if (string != null) {
                    string.hashCode();
                    char c = 65535;
                    switch (string.hashCode()) {
                        case -1195362251:
                            if (string.equals("proportional-nums")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1061392823:
                            if (string.equals("lining-nums")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -771984547:
                            if (string.equals("tabular-nums")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -659678800:
                            if (string.equals("oldstyle-nums")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1183323111:
                            if (string.equals("small-caps")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        arrayList.add("'pnum'");
                    } else if (c == 1) {
                        arrayList.add("'lnum'");
                    } else if (c == 2) {
                        arrayList.add("'tnum'");
                    } else if (c == 3) {
                        arrayList.add("'onum'");
                    } else if (c == 4) {
                        arrayList.add("'smcp'");
                    }
                }
            }
            return TextUtils.join(", ", arrayList);
        }

        public static Typeface ah$a(Typeface typeface, int i, int i2, String str, AssetManager assetManager) {
            FragmentViewModelLazyKt$viewModels$1 fragmentViewModelLazyKt$viewModels$1 = new FragmentViewModelLazyKt$viewModels$1(i, i2);
            if (str == null) {
                if (typeface == null) {
                    typeface = Typeface.DEFAULT;
                }
                return fragmentViewModelLazyKt$viewModels$1.valueOf(typeface);
            }
            return FragmentTransitionImpl.AnonymousClass3.values().values(str, fragmentViewModelLazyKt$viewModels$1, assetManager);
        }
    }
}
