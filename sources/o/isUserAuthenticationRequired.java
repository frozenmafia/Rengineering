package o;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import droidninja.filepicker.FilePickerActivity;
import droidninja.filepicker.utils.Orientation;
/* loaded from: classes5.dex */
public class isUserAuthenticationRequired {
    private final Bundle toString = new Bundle();

    public static isUserAuthenticationRequired ah$a() {
        return new isUserAuthenticationRequired();
    }

    public isUserAuthenticationRequired toString(int i) {
        isStrongBoxBacked.valueOf().valueOf(i);
        return this;
    }

    public isUserAuthenticationRequired ah$a(int i) {
        isStrongBoxBacked.valueOf().ag$a(i);
        return this;
    }

    public isUserAuthenticationRequired toString(boolean z) {
        isStrongBoxBacked.valueOf().ag$a(z);
        return this;
    }

    public isUserAuthenticationRequired values(Orientation orientation) {
        isStrongBoxBacked.valueOf().valueOf(orientation);
        return this;
    }

    public void values(androidx.fragment.app.Fragment fragment, int i) {
        this.toString.putInt("EXTRA_PICKER_TYPE", 17);
        ag$a(fragment, i);
    }

    public void toString(androidx.fragment.app.Fragment fragment, int i) {
        this.toString.putInt("EXTRA_PICKER_TYPE", 18);
        ag$a(fragment, i);
    }

    private void ag$a(androidx.fragment.app.Fragment fragment, int i) {
        if (Build.VERSION.SDK_INT >= 23 && androidx.core.content.ContextCompat.checkSelfPermission(fragment.getContext(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Toast.makeText(fragment.getContext(), fragment.getContext().getResources().getString(MasterKey$1$HaptikSDK$b.permission_filepicker_rationale), 0).show();
            return;
        }
        isStrongBoxBacked valueOf = isStrongBoxBacked.valueOf();
        valueOf.ah$a(fragment.getContext().getApplicationContext().getPackageName() + ".droidninja.filepicker.provider");
        Intent intent = new Intent(fragment.getActivity(), FilePickerActivity.class);
        intent.putExtras(this.toString);
        fragment.startActivityForResult(intent, i);
    }
}
