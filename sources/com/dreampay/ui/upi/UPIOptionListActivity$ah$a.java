package com.dreampay.ui.upi;

import android.content.Context;
import android.content.Intent;
import com.dreampay.commons.constants.Constants;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class UPIOptionListActivity$ah$a {
    public /* synthetic */ UPIOptionListActivity$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private UPIOptionListActivity$ah$a() {
    }

    public final Intent valueOf(Context context, String str, String str2) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        Intent intent = new Intent(context, UPIOptionListActivity.class);
        intent.putExtra(Constants.Navigation.BASE_64_OF_REQUEST, str);
        intent.putExtra(Constants.Navigation.CHECKSUM, str2);
        return intent;
    }
}
