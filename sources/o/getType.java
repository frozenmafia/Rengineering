package o;

import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.app.dream11.core.ui.ImageStackView;
import com.dream11.design.textview.D11TextView;
import java.io.PrintStream;
import java.util.logging.Level;
/* loaded from: classes3.dex */
public abstract class getType extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$c;
    @androidx.databinding.Bindable
    protected updateVisibility ag$a;
    public final LinearLayout ah$a;
    public final ImageView toString;
    public final ImageStackView valueOf;
    @androidx.databinding.Bindable
    protected Integer values;

    public abstract void valueOf(Integer num);

    public abstract void valueOf(updateVisibility updatevisibility);

    /* JADX INFO: Access modifiers changed from: protected */
    public getType(Object obj, View view, int i, ImageStackView imageStackView, ImageView imageView, LinearLayout linearLayout, D11TextView d11TextView) {
        super(obj, view, i);
        this.valueOf = imageStackView;
        this.toString = imageView;
        this.ah$a = linearLayout;
        this.HaptikSDK$c = d11TextView;
    }

    /* loaded from: classes5.dex */
    public interface window_release {
        void ag$a(Level level, String str);

        void values(Level level, String str, Throwable th);

        /* loaded from: classes5.dex */
        public static class valueOf implements window_release {
            @Override // o.getType.window_release
            public void ag$a(Level level, String str) {
                PrintStream printStream = System.out;
                printStream.println("[" + level + "] " + str);
            }

            @Override // o.getType.window_release
            public void values(Level level, String str, Throwable th) {
                PrintStream printStream = System.out;
                printStream.println("[" + level + "] " + str);
                th.printStackTrace(System.out);
            }
        }

        /* loaded from: classes5.dex */
        public static class toString {
            public static window_release ah$a() {
                if (getHINGE.values() && valueOf() != null) {
                    return new getHINGE("EventBus");
                }
                return new valueOf();
            }

            static Object valueOf() {
                try {
                    return Looper.getMainLooper();
                } catch (RuntimeException unused) {
                    return null;
                }
            }
        }
    }
}
