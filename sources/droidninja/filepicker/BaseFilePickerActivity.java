package droidninja.filepicker;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import droidninja.filepicker.utils.Orientation;
import o.MasterKey$1$ag$a;
import o.isStrongBoxBacked;
/* loaded from: classes5.dex */
public abstract class BaseFilePickerActivity extends AppCompatActivity {
    protected abstract void valueOf();

    /* JADX INFO: Access modifiers changed from: protected */
    public void values(Bundle bundle, int i) {
        super.onCreate(bundle);
        setTheme(isStrongBoxBacked.valueOf().HaptikWebView());
        setContentView(i);
        setSupportActionBar((Toolbar) findViewById(MasterKey$1$ag$a.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Orientation HaptikSDK$a = isStrongBoxBacked.valueOf().HaptikSDK$a();
        if (HaptikSDK$a == Orientation.PORTRAIT_ONLY) {
            setRequestedOrientation(1);
        } else if (HaptikSDK$a == Orientation.LANDSCAPE_ONLY) {
            setRequestedOrientation(0);
        }
        valueOf();
    }
}
