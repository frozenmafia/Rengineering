package com.app.dream11.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.dream11.core.ErrorActionEnum;
import com.app.dream11.model.ErrorMessage;
import com.app.dream11Pro.R;
import o.StateListDrawable;
import o.createPopup;
import o.getOptionalIconsVisible;
/* loaded from: classes2.dex */
public class D11ErrorFrameLayout extends FrameLayout {
    private View HaptikSDK$c;
    TextView ag$a;
    private boolean ah$a;
    private View toString;
    TextView valueOf;
    private ImageView values;

    protected boolean values(StateListDrawable.StateListState stateListState) {
        return false;
    }

    public D11ErrorFrameLayout(Context context) {
        super(context);
        this.HaptikSDK$c = null;
        this.ah$a = false;
        ag$a();
    }

    public D11ErrorFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.HaptikSDK$c = null;
        this.ah$a = false;
        ag$a();
    }

    public D11ErrorFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.HaptikSDK$c = null;
        this.ah$a = false;
        ag$a();
    }

    public final void setErrorResponse(StateListDrawable.StateListState stateListState) {
        if (stateListState != null) {
            getOptionalIconsVisible.toString(stateListState.values(), stateListState.ag$a());
        }
        if (stateListState == null || values(stateListState)) {
            return;
        }
        createPopup.values(getContext(), R.drawable.generic_error, this.values);
        switch (AnonymousClass4.toString[stateListState.ah$a().ordinal()]) {
            case 1:
                ah$a(false);
                valueOf(false);
                return;
            case 2:
            case 3:
            case 4:
                getOptionalIconsVisible.ah$a().ah$a(values(), stateListState);
                return;
            case 5:
                if (this.toString != null) {
                    ah$a(false);
                    valueOf(true);
                    this.toString.setVisibility(0);
                    return;
                }
                getOptionalIconsVisible.ah$a().ah$a(values(), stateListState);
                return;
            case 6:
                if (!this.ah$a) {
                    if (this.toString != null) {
                        ah$a(false);
                        valueOf(true);
                        return;
                    }
                    getOptionalIconsVisible.ah$a().ah$a(values(), stateListState);
                    return;
                }
                getOptionalIconsVisible.ah$a().ah$a(values(), stateListState);
                return;
            case 7:
                if (!this.ah$a) {
                    if (this.toString != null) {
                        ah$a(false);
                        valueOf(true);
                        TextView textView = this.valueOf;
                        if (textView != null) {
                            textView.setText(((ErrorMessage) stateListState.valueOf()).getTitle());
                        }
                        this.ag$a.setText(((ErrorMessage) stateListState.valueOf()).getMessage());
                        createPopup.values(getContext(), R.drawable.generic_error, this.values);
                        return;
                    }
                    getOptionalIconsVisible.ah$a().ah$a(values(), stateListState);
                    return;
                }
                getOptionalIconsVisible.ah$a().ah$a(values(), stateListState);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.ui.D11ErrorFrameLayout$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] toString;

        static {
            int[] iArr = new int[ErrorActionEnum.values().length];
            toString = iArr;
            try {
                iArr[ErrorActionEnum.HIDE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                toString[ErrorActionEnum.SHOW_ERROR_MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                toString[ErrorActionEnum.SHOW_LOGOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                toString[ErrorActionEnum.SHOW_LOGIN_ERROR_DIALOG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                toString[ErrorActionEnum.SHOW_ERROR_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                toString[ErrorActionEnum.SHOW_ERROR_STATE_IF_NO_DATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                toString[ErrorActionEnum.SITE_MAINTENANCE_SHOW_ERROR_STATE_IF_NO_DATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public final void setErrorView(View view) {
        this.toString = view;
        ah$b();
        View view2 = this.toString;
        if (view2 != null) {
            view2.setTag(R.string.res_0x7f120012, getResources().getString(R.string.res_0x7f120012));
            addView(this.toString);
        }
    }

    public final void setRootViewForSnackbar(View view) {
        this.HaptikSDK$c = view;
    }

    public final void setNewErrorView() {
        View view = this.toString;
        if (view != null) {
            removeView(view);
        }
        View inflate = inflate(getContext(), R.layout.res_0x7f0d02f9, null);
        this.toString = inflate;
        inflate.setTag(R.string.res_0x7f120012, getResources().getString(R.string.res_0x7f120012));
        addView(this.toString);
        this.valueOf = (TextView) this.toString.findViewById(R.id.res_0x7f0a0cf7);
        this.ag$a = (TextView) this.toString.findViewById(R.id.desc);
        this.values = (ImageView) this.toString.findViewById(R.id.img);
        valueOf(false);
    }

    private View values() {
        View view = this.HaptikSDK$c;
        return view == null ? getRootView() : view;
    }

    public final void ah$a() {
        this.ah$a = true;
        ah$a(true);
        valueOf(false);
    }

    public final void valueOf() {
        this.ah$a = false;
        ah$a(false);
        valueOf(false);
    }

    public final void HaptikSDK$a() {
        this.ah$a = false;
        ah$a(true);
        valueOf(false);
    }

    protected void ah$a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (z) {
                getChildAt(i).setVisibility(0);
            } else {
                getChildAt(i).setVisibility(8);
            }
        }
    }

    protected void valueOf(boolean z) {
        View view = this.toString;
        if (view != null) {
            if (z) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
    }

    protected void ah$b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getTag(R.string.res_0x7f120012) != null) {
                removeViewAt(i);
            }
        }
    }

    private void ag$a() {
        View inflate = inflate(getContext(), R.layout.res_0x7f0d01f5, null);
        this.toString = inflate;
        inflate.setTag(R.string.res_0x7f120012, getResources().getString(R.string.res_0x7f120012));
        addView(this.toString);
        this.valueOf = (TextView) this.toString.findViewById(R.id.res_0x7f0a0cf7);
        this.ag$a = (TextView) this.toString.findViewById(R.id.desc);
        this.values = (ImageView) this.toString.findViewById(R.id.img);
        valueOf(false);
    }
}
