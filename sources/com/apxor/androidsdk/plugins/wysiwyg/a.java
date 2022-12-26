package com.apxor.androidsdk.plugins.wysiwyg;

import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class a {
    private boolean a;

    /* renamed from: b  reason: collision with root package name */
    private Object f404b;
    private Field c;
    private Field d;

    /* loaded from: classes6.dex */
    public static class b {
        final View a;

        /* renamed from: b  reason: collision with root package name */
        final WindowManager.LayoutParams f405b;

        private b(View view, WindowManager.LayoutParams layoutParams) {
            this.a = view;
            this.f405b = layoutParams;
        }
    }

    private void b() {
        this.a = true;
        String str = Build.VERSION.SDK_INT > 16 ? "android.view.WindowManagerGlobal" : "android.view.WindowManagerImpl";
        String str2 = Build.VERSION.SDK_INT > 16 ? "getInstance" : "getDefault";
        try {
            Class<?> cls = Class.forName(str);
            this.f404b = cls.getMethod(str2, new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mViews");
            this.c = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("mParams");
            this.d = declaredField2;
            declaredField2.setAccessible(true);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<b> a() {
        Field field;
        List list;
        List list2;
        if (!this.a) {
            b();
        }
        Object obj = this.f404b;
        if (obj == null || (field = this.c) == null || this.d == null) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT < 19) {
                list = Arrays.asList((View[]) field.get(obj));
                list2 = Arrays.asList((WindowManager.LayoutParams[]) this.d.get(this.f404b));
            } else {
                list = (List) field.get(obj);
                list2 = (List) this.d.get(this.f404b);
            }
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!(((View) list.get(i)) instanceof d)) {
                    arrayList.add(new b((View) list.get(i), (WindowManager.LayoutParams) list2.get(i)));
                }
            }
            return arrayList;
        } catch (IllegalAccessException | RuntimeException unused) {
            return null;
        }
    }
}
