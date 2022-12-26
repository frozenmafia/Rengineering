package o;

import androidx.core.splashscreen.SplashScreen;
import com.app.dream11.dream11.SplashActivity;
import com.app.dream11.dream11.UTMParams;
import com.app.dream11.utils.NameValuePair;
import java.util.List;
/* loaded from: classes3.dex */
public final /* synthetic */ class ShareTarget implements SplashScreen.KeepOnScreenCondition {
    public static final /* synthetic */ ShareTarget values = new ShareTarget();

    /* loaded from: classes3.dex */
    public interface EncodingType {
        void valueOf(int i, Object obj);
    }

    private /* synthetic */ ShareTarget() {
    }

    @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
    public final boolean shouldKeepOnScreen() {
        return SplashActivity.values();
    }

    /* loaded from: classes.dex */
    public final class Params {
        public static final Params ag$a = new Params();

        private Params() {
        }
    }

    /* loaded from: classes.dex */
    public class FileFormField {
        private static FileFormField valueOf;
        private static final Object values = new Object();
        private final findRealOwner ag$a;
        private UTMParams ah$a = (UTMParams) values().toString("utm_pref_key_new", UTMParams.class);

        private FileFormField(findRealOwner findrealowner) {
            this.ag$a = findrealowner;
        }

        public static FileFormField values(findRealOwner findrealowner) {
            if (valueOf == null) {
                synchronized (values) {
                    if (valueOf == null) {
                        valueOf = new FileFormField(findrealowner);
                    }
                }
            }
            return valueOf;
        }

        public UTMParams ah$a() {
            return this.ah$a;
        }

        public void values(UTMParams uTMParams) {
            if (uTMParams != null) {
                this.ah$a = uTMParams;
                values().values("utm_pref_key_new", uTMParams);
            }
        }

        public void ag$a() {
            this.ah$a = null;
            values().HaptikSDK$b("utm_pref_key_new");
        }

        private findRealOwner values() {
            return this.ag$a;
        }

        public String valueOf() {
            StringBuilder sb = new StringBuilder("");
            if (ah$a() == null || ah$a().getNamedValuePair() == null) {
                return sb.toString();
            }
            List<NameValuePair> namedValuePair = ah$a().getNamedValuePair();
            for (int i = 0; i < namedValuePair.size(); i++) {
                NameValuePair nameValuePair = namedValuePair.get(i);
                sb.append(nameValuePair.getName());
                sb.append("=");
                sb.append(nameValuePair.getValue());
                if (i < namedValuePair.size() - 1) {
                    sb.append("&");
                }
            }
            return sb.toString();
        }
    }
}
