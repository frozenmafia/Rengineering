package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.FacebookButtonBase;
import com.facebook.share.model.ShareContent;
import o.DefaultSpecialEffectsController;
import o.isStateAtLeast;
/* loaded from: classes4.dex */
public abstract class ShareButtonBase extends FacebookButtonBase {
    private ShareContent ah$a;
    private boolean toString;
    private DefaultSpecialEffectsController.AnonymousClass4.AnonymousClass1 valueOf;
    private int values;

    protected abstract ShareDialog HaptikSDK$a();

    /* JADX INFO: Access modifiers changed from: protected */
    public ShareButtonBase(Context context, AttributeSet attributeSet, int i, String str, String str2) {
        super(context, attributeSet, i, 0, str, str2);
        this.values = 0;
        this.toString = false;
        this.values = isInEditMode() ? 0 : valueOf();
        ag$a(false);
    }

    public ShareContent getInitSettings() {
        return this.ah$a;
    }

    public void setShareContent(ShareContent shareContent) {
        this.ah$a = shareContent;
        if (this.toString) {
            return;
        }
        ag$a(HaptikSDK$c());
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.toString = true;
    }

    @Override // com.facebook.FacebookButtonBase
    public int HaptikSDK$b() {
        return this.values;
    }

    @Override // com.facebook.FacebookButtonBase
    public void toString(Context context, AttributeSet attributeSet, int i, int i2) {
        super.toString(context, attributeSet, i, i2);
        ah$a(getSignupData());
    }

    protected boolean HaptikSDK$c() {
        return HaptikSDK$a().valueOf((ShareDialog) getInitSettings());
    }

    protected View.OnClickListener getSignupData() {
        return new View.OnClickListener() { // from class: com.facebook.share.widget.ShareButtonBase.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (isStateAtLeast.values(this)) {
                    return;
                }
                try {
                    ShareButtonBase.this.ah$a(view);
                    ShareButtonBase.this.HaptikSDK$a().ag$a(ShareButtonBase.this.getInitSettings());
                } catch (Throwable th) {
                    isStateAtLeast.values(th, this);
                }
            }
        };
    }

    private void ag$a(boolean z) {
        setEnabled(z);
        this.toString = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DefaultSpecialEffectsController.AnonymousClass4.AnonymousClass1 HaptikSDK$d() {
        return this.valueOf;
    }
}
