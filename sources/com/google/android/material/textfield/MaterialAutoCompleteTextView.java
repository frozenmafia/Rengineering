package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import o.Preference;
import o.Preference$BaseSavedState$HaptikSDK$e;
import o.PreferenceFragment;
import o.createItem;
/* loaded from: classes7.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    private final ListPopupWindow ag$a;
    private final AccessibilityManager ah$a;
    private final Rect toString;

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Preference.BaseSavedState.values.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(createItem.valueOf(context, attributeSet, i, 0), attributeSet, i);
        this.toString = new Rect();
        Context context2 = getContext();
        TypedArray scrollToPreferenceObserver = PreferenceFragment.ScrollToPreferenceObserver.toString(context2, attributeSet, Preference.BaseSavedState.getSignupData.MaterialAutoCompleteTextView, i, Preference$BaseSavedState$HaptikSDK$e.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (scrollToPreferenceObserver.hasValue(Preference.BaseSavedState.getSignupData.MaterialAutoCompleteTextView_android_inputType) && scrollToPreferenceObserver.getInt(Preference.BaseSavedState.getSignupData.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.ah$a = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.ag$a = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.textfield.MaterialAutoCompleteTextView.5
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                MaterialAutoCompleteTextView.this.ah$a(i2 < 0 ? MaterialAutoCompleteTextView.this.ag$a.getSelectedItem() : MaterialAutoCompleteTextView.this.getAdapter().getItem(i2));
                AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i2 < 0) {
                        view = MaterialAutoCompleteTextView.this.ag$a.getSelectedView();
                        i2 = MaterialAutoCompleteTextView.this.ag$a.getSelectedItemPosition();
                        j = MaterialAutoCompleteTextView.this.ag$a.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.ag$a.getListView(), view, i2, j);
                }
                MaterialAutoCompleteTextView.this.ag$a.dismiss();
            }
        });
        scrollToPreferenceObserver.recycle();
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.ah$a;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.ag$a.show();
        } else {
            super.showDropDown();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.ag$a.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout ah$a = ah$a();
        if (ah$a != null && ah$a.extraCallbackWithResult() && super.getHint() == null && PreferenceFragment.AnonymousClass3.valueOf()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout ah$a = ah$a();
        if (ah$a != null && ah$a.extraCallbackWithResult()) {
            return ah$a.HaptikSDK$d();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), ag$a()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    private int ag$a() {
        ListAdapter adapter = getAdapter();
        TextInputLayout ah$a = ah$a();
        int i = 0;
        if (adapter == null || ah$a == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.ag$a.getSelectedItemPosition()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = adapter.getView(max, view, ah$a);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i = Math.max(i, view.getMeasuredWidth());
        }
        Drawable background = this.ag$a.getBackground();
        if (background != null) {
            background.getPadding(this.toString);
            i += this.toString.left + this.toString.right;
        }
        return i + ah$a.HaptikSDK$b().getMeasuredWidth();
    }

    private TextInputLayout ah$a() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T extends ListAdapter & Filterable> void ah$a(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }
}
