package com.dreampay.ui.commons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.material.textfield.TextInputEditText;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class SecureEditText extends TextInputEditText {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureEditText(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        ag$a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        ag$a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        ag$a();
    }

    /* loaded from: classes6.dex */
    public static final class values implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            runAnimators.ag$a(actionMode, "actionMode");
            runAnimators.ag$a(menuItem, "item");
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            runAnimators.ag$a(actionMode, "actionMode");
            runAnimators.ag$a(menu, "menu");
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            runAnimators.ag$a(actionMode, "actionMode");
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            runAnimators.ag$a(actionMode, "actionMode");
            runAnimators.ag$a(menu, "menu");
            return false;
        }

        values() {
        }
    }

    private final void ag$a() {
        setCustomSelectionActionModeCallback(new values());
        setLongClickable(false);
        setTextIsSelectable(false);
    }
}
