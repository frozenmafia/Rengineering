package o;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import java.util.HashMap;
import org.json.JSONObject;
/* loaded from: classes4.dex */
class getRowSpan implements View.OnClickListener {
    private final int HaptikSDK$c;
    private final CTInboxMessage ag$a;
    private boolean ah$a;
    private androidx.viewpager.widget.ViewPager ah$b;
    private final String toString;
    private final CTInboxListViewFragment valueOf;
    private JSONObject values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getRowSpan(int i, CTInboxMessage cTInboxMessage, String str, JSONObject jSONObject, CTInboxListViewFragment cTInboxListViewFragment, boolean z) {
        this.HaptikSDK$c = i;
        this.ag$a = cTInboxMessage;
        this.toString = str;
        this.valueOf = cTInboxListViewFragment;
        this.values = jSONObject;
        this.ah$a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getRowSpan(int i, CTInboxMessage cTInboxMessage, String str, CTInboxListViewFragment cTInboxListViewFragment, androidx.viewpager.widget.ViewPager viewPager, boolean z) {
        this.HaptikSDK$c = i;
        this.ag$a = cTInboxMessage;
        this.toString = str;
        this.valueOf = cTInboxListViewFragment;
        this.ah$b = viewPager;
        this.ah$a = z;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        androidx.viewpager.widget.ViewPager viewPager = this.ah$b;
        if (viewPager != null) {
            CTInboxListViewFragment cTInboxListViewFragment = this.valueOf;
            if (cTInboxListViewFragment != null) {
                cTInboxListViewFragment.ah$a(this.HaptikSDK$c, viewPager.getCurrentItem(), this.ah$a);
            }
        } else if (this.toString != null && this.values != null) {
            if (this.valueOf != null) {
                if (this.ag$a.invoke().get(0).ah$b(this.values).equalsIgnoreCase("copy") && this.valueOf.getActivity() != null) {
                    toString(this.valueOf.getActivity());
                }
                this.valueOf.toString(this.HaptikSDK$c, this.toString, this.values, values(this.ag$a), this.ah$a);
            }
        } else {
            CTInboxListViewFragment cTInboxListViewFragment2 = this.valueOf;
            if (cTInboxListViewFragment2 != null) {
                cTInboxListViewFragment2.toString(this.HaptikSDK$c, null, null, null, this.ah$a);
            }
        }
    }

    private void toString(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        ClipData newPlainText = ClipData.newPlainText(this.toString, this.ag$a.invoke().get(0).values(this.values));
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
            Toast.makeText(context, "Text Copied to Clipboard", 0).show();
        }
    }

    private HashMap<String, String> values(CTInboxMessage cTInboxMessage) {
        if (cTInboxMessage == null || cTInboxMessage.invoke() == null || cTInboxMessage.invoke().get(0) == null || !"kv".equalsIgnoreCase(cTInboxMessage.invoke().get(0).ah$b(this.values))) {
            return null;
        }
        return cTInboxMessage.invoke().get(0).ag$a(this.values);
    }
}
