package o;

import android.content.Context;
import android.net.Uri;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.interactive.InteractiveRequestRecord;
import java.util.UUID;
/* loaded from: classes.dex */
public abstract class ag$a {
    protected final onRetainCustomNonConfigurationInstance<?, ?, ?, ?> ah$a;
    protected final String valueOf = UUID.randomUUID().toString();
    private int toString = 0;

    public ag$a(onRetainCustomNonConfigurationInstance<?, ?, ?, ?> onretaincustomnonconfigurationinstance) {
        this.ah$a = onretaincustomnonconfigurationinstance;
    }

    public void HaptikSDK$a() {
        onRetainCustomNonConfigurationInstance<?, ?, ?, ?> onretaincustomnonconfigurationinstance = this.ah$a;
        if (onretaincustomnonconfigurationinstance != null) {
            onretaincustomnonconfigurationinstance.HaptikSDK$d().ah$a(valueOf());
        }
    }

    public boolean HaptikSDK$b() {
        return this.toString < ag$a();
    }

    public int ag$a() {
        return 1;
    }

    public abstract boolean ag$a(Uri uri, Context context);

    public abstract String ah$a(Context context) throws AuthError;

    public onRetainCustomNonConfigurationInstance<?, ?, ?, ?> ah$a() {
        return this.ah$a;
    }

    public void ah$b() {
        this.toString++;
    }

    public InteractiveRequestRecord valueOf() {
        return new InteractiveRequestRecord(this.valueOf, this.ah$a.HaptikSDK$c());
    }

    public String values() {
        return this.valueOf;
    }
}
