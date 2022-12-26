package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import o.LiveData;
/* loaded from: classes6.dex */
public final class createGeneratedAdapter extends HasDefaultViewModelProviderFactory {
    private final int HaptikSDK$a;
    private final String HaptikSDK$b;
    private final String HaptikSDK$c;
    public createGeneratedAdapter$ag$a ah$a;
    private final values invoke;
    private final Context toString;
    private String valueOf;
    private String values;

    @Override // com.fancode.core.ui.androidhelpers.adapters.BaseAdapter
    public int values() {
        return 1;
    }

    public createGeneratedAdapter(Context context, int i) {
        runAnimators.ag$a(context, "context");
        this.toString = context;
        this.HaptikSDK$a = i;
        this.valueOf = "https://fancode.com";
        this.values = "https://fancode.zendesk.com";
        this.HaptikSDK$c = "https://fancode.com/terms-conditions";
        String str = this.values;
        this.HaptikSDK$b = str + "/hc/en-us";
        this.invoke = new values();
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public final String ag$a() {
        return this.HaptikSDK$b;
    }

    public final createGeneratedAdapter$ag$a invoke() {
        createGeneratedAdapter$ag$a creategeneratedadapter_ag_a = this.ah$a;
        if (creategeneratedadapter_ag_a != null) {
            return creategeneratedadapter_ag_a;
        }
        runAnimators.valueOf("linkSecHandler");
        return null;
    }

    public final void toString(createGeneratedAdapter$ag$a creategeneratedadapter_ag_a) {
        runAnimators.ag$a(creategeneratedadapter_ag_a, "<set-?>");
        this.ah$a = creategeneratedadapter_ag_a;
    }

    @Override // o.HasDefaultViewModelProviderFactory
    public void ag$a(androidx.databinding.ViewDataBinding viewDataBinding, int i) {
        LiveData liveData = new LiveData();
        liveData.valueOf(this.invoke);
        if (viewDataBinding != null) {
            viewDataBinding.setVariable(enforceMainThreadIfNeeded.HaptikSDK$a, liveData);
        }
        if (viewDataBinding != null) {
            viewDataBinding.setVariable(enforceMainThreadIfNeeded.valueOf, liveData.ag$a());
        }
        if (viewDataBinding != null) {
            viewDataBinding.setVariable(enforceMainThreadIfNeeded.getSignupData, Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void valueOf(String str, Context context) {
        Uri parse = Uri.parse(str);
        runAnimators.ah$a(parse, "parse(url)");
        context.startActivity(new Intent("android.intent.action.VIEW", parse));
    }

    /* loaded from: classes6.dex */
    public static final class values implements LiveData.valueOf {
        values() {
        }

        @Override // o.LiveData.valueOf
        public void values(LiveData liveData, int i) {
            runAnimators.ag$a(liveData, "edge");
            createGeneratedAdapter creategeneratedadapter = createGeneratedAdapter.this;
            creategeneratedadapter.valueOf(creategeneratedadapter.HaptikSDK$b(), createGeneratedAdapter.this.toString);
            createGeneratedAdapter.this.invoke().valueOf();
        }

        @Override // o.LiveData.valueOf
        public void toString(LiveData liveData, int i) {
            runAnimators.ag$a(liveData, "edge");
            createGeneratedAdapter creategeneratedadapter = createGeneratedAdapter.this;
            creategeneratedadapter.valueOf(creategeneratedadapter.ag$a(), createGeneratedAdapter.this.toString);
            createGeneratedAdapter.this.invoke().ag$a();
        }
    }

    @Override // com.fancode.core.ui.androidhelpers.adapters.BaseAdapter
    public int values(int i) {
        return this.HaptikSDK$a;
    }
}
