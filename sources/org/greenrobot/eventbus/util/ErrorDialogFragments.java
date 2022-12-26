package org.greenrobot.eventbus.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
/* loaded from: classes8.dex */
public class ErrorDialogFragments {
    public static int ah$a;
    public static Class<?> toString;

    public static Dialog valueOf(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(bundle.getString("de.greenrobot.eventbus.errordialog.title"));
        builder.setMessage(bundle.getString("de.greenrobot.eventbus.errordialog.message"));
        int i = ah$a;
        if (i != 0) {
            builder.setIcon(i);
        }
        builder.setPositiveButton(17039370, onClickListener);
        return builder.create();
    }

    public static void valueOf(DialogInterface dialogInterface, int i, Activity activity, Bundle bundle) {
        Class<?> cls = toString;
        if (cls != null) {
            try {
                ErrorDialogManager.valueOf.ah$a.valueOf().ag$a(cls.newInstance());
            } catch (Exception e) {
                throw new RuntimeException("Event cannot be constructed", e);
            }
        }
        if (!bundle.getBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", false) || activity == null) {
            return;
        }
        activity.finish();
    }

    /* loaded from: classes8.dex */
    public static class Honeycomb extends DialogFragment implements DialogInterface.OnClickListener {
        @Override // android.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            return ErrorDialogFragments.valueOf(getActivity(), getArguments(), this);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ErrorDialogFragments.valueOf(dialogInterface, i, getActivity(), getArguments());
        }
    }

    /* loaded from: classes8.dex */
    public static class Support extends androidx.fragment.app.DialogFragment implements DialogInterface.OnClickListener {
        @Override // androidx.fragment.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            return ErrorDialogFragments.valueOf(getActivity(), getArguments(), this);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ErrorDialogFragments.valueOf(dialogInterface, i, getActivity(), getArguments());
        }
    }
}
