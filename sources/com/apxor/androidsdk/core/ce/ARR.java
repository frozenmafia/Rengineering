package com.apxor.androidsdk.core.ce;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.apxor.androidsdk.core.SDKController;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.PatternSyntaxException;
/* loaded from: classes3.dex */
public class ARR {
    private static final ARR a = new ARR();

    /* renamed from: b  reason: collision with root package name */
    private boolean f210b;
    private Object c;
    private Field d;
    private Field e;

    /* loaded from: classes3.dex */
    public static class Model {
        public final WindowManager.LayoutParams param;
        public final View view;

        private Model(View view, WindowManager.LayoutParams layoutParams) {
            this.view = view;
            this.param = layoutParams;
        }
    }

    private int a(String str) {
        return Integer.parseInt(str.replaceAll("[\\W\\w-]*_", "").replaceAll("<", "").replaceAll(">", ""));
    }

    private static View a(View view, String str) {
        String a2 = a(view);
        if (a2 == null || !a2.equals(str)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View a3 = a(viewGroup.getChildAt(i), str);
                    if (a3 != null) {
                        return a3;
                    }
                }
                return null;
            }
            return null;
        }
        return view;
    }

    private static View a(View view, String str, String str2, int i) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == 105) {
            if (str.equals("i")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 112) {
            if (str.equals(TtmlNode.TAG_P)) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 116) {
            if (hashCode == 3371 && str.equals("it")) {
                c = 3;
            }
            c = 65535;
        } else {
            if (str.equals("t")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    View findViewById = view.getRootView().findViewById(16908290);
                    if (findViewById != null) {
                        return findViewByPath(findViewById, str2);
                    }
                    return null;
                }
                View findViewById2 = view.getRootView().findViewById(i);
                if (findViewById2 != null && findViewById2.getVisibility() == 0) {
                    return findViewById2;
                }
            }
            return view.getRootView().findViewWithTag(str2);
        }
        return view.getRootView().findViewById(i);
    }

    private static String a(View view) {
        Object tag = view.getTag(R.id.view_tag_native_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    private void a() {
        this.f210b = true;
        int i = Build.VERSION.SDK_INT;
        String str = i > 16 ? "android.view.WindowManagerGlobal" : "android.view.WindowManagerImpl";
        String str2 = i > 16 ? "getInstance" : "getDefault";
        try {
            Class<?> cls = Class.forName(str);
            this.c = cls.getMethod(str2, new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mViews");
            this.d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("mParams");
            this.e = declaredField2;
            declaredField2.setAccessible(true);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
    }

    public static Pair<View, ViewGroup> findTargetView(int i, String str, String str2) {
        View view;
        View view2;
        List<Model> list = getInstance().getList();
        boolean isRNApp = SDKController.getInstance().isRNApp();
        ViewGroup viewGroup = null;
        if (list != null) {
            view = null;
            for (int size = list.size() - 1; size >= 0; size--) {
                View view3 = list.get(size).view;
                if (!isRNApp) {
                    view2 = a(view3, str2, str, i);
                    if (view2 != null && view2.getVisibility() == 0) {
                        viewGroup = (ViewGroup) view3;
                        break;
                    }
                    view = view2;
                } else if (str2.equals("") || str2.equals("t")) {
                    view2 = a(view3.getRootView(), str);
                    if (view2 != null) {
                        viewGroup = (ViewGroup) view3;
                        break;
                    }
                    view = view2;
                } else {
                    view2 = a(view3, str2, str, i);
                    if (view2 != null && view2.getVisibility() == 0) {
                        viewGroup = (ViewGroup) view3;
                        break;
                    }
                    view = view2;
                }
            }
        } else {
            view = null;
        }
        view2 = view;
        return new Pair<>(view2, viewGroup);
    }

    public static View findViewByPath(View view, String str) {
        try {
            return getInstance().find(view, str.trim(), str.endsWith(">"));
        } catch (NumberFormatException | PatternSyntaxException | Exception unused) {
            return null;
        }
    }

    public static ARR getInstance() {
        return a;
    }

    public View find(View view, String str, boolean z) {
        String str2;
        String str3;
        boolean z2;
        View view2;
        int i;
        String str4 = "";
        if (view == null || str.length() == 0) {
            return null;
        }
        String str5 = str.split("#")[0];
        boolean isRNApp = SDKController.getInstance().isRNApp();
        int indexOf = str5.indexOf("_");
        int lastIndexOf = str5.lastIndexOf("_");
        int lastIndexOf2 = str5.lastIndexOf(">");
        if (str5.startsWith("[apx_") || !(indexOf == -1 || lastIndexOf == -1 || indexOf == lastIndexOf)) {
            try {
                str2 = new String(Base64.decode(str5.substring(0, indexOf), 8)).replaceAll("\n", "");
            } catch (Exception unused) {
                str2 = "";
            }
            try {
                Integer.parseInt(str5.substring(indexOf + 1, lastIndexOf));
            } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
            }
            if (lastIndexOf2 == -1 || str5.substring(lastIndexOf2).length() <= 1) {
                str3 = "";
                z2 = false;
            } else {
                str3 = str5.substring(lastIndexOf2 + 4);
                z2 = true;
            }
            if (isRNApp && str5.startsWith("[apx_") && str5.endsWith("_apx]")) {
                String substring = str5.substring(str5.indexOf("[apx_") + 5, str5.indexOf("_apx]"));
                View a2 = a(view, substring);
                if (a2 == null) {
                    return null;
                }
                if (str.contains("#")) {
                    str4 = str.replaceFirst("\\[apx_" + substring + "_apx]#", "");
                }
                return str4.length() == 0 ? a2 : find(a2, str4, z);
            }
            if (!view.getClass().getSimpleName().equals(str2)) {
                view2 = null;
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int a3 = str5.contains("<") ? a(str5) : 0;
                View childAt = viewGroup.getChildAt(a3);
                if (childAt != null || viewGroup.getChildCount() >= 1) {
                    if (isRNApp) {
                        if (childAt == null && a3 - 1 >= 0) {
                            childAt = viewGroup.getChildAt(i);
                        } else if ((childAt instanceof ViewGroup) && ((ViewGroup) childAt).getChildCount() == 0 && viewGroup.getChildCount() > 0) {
                            childAt = viewGroup.getChildAt(a3 + 1);
                        }
                    }
                    if (str.contains("#")) {
                        str4 = str.replaceFirst(str5 + "#", "");
                    }
                    View find = find(childAt, str4, z);
                    return (find == null && z) ? childAt : find;
                }
                return null;
            } else {
                view2 = null;
                if (!z2) {
                    return view;
                }
                CharSequence text = view instanceof TextView ? ((TextView) view).getText() : view instanceof ImageView ? view.getContentDescription() : null;
                if (text != null && !TextUtils.isEmpty(text) && ContextEvaluator.getInstance().compareStrings(str3, text.toString(), Constants.REGEX)) {
                    return view;
                }
            }
            return view2;
        }
        return null;
    }

    public List<Model> getList() {
        Field field;
        List list;
        List list2;
        if (!this.f210b) {
            a();
        }
        Object obj = this.c;
        if (obj == null || (field = this.d) == null || this.e == null) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT < 19) {
                list = Arrays.asList((View[]) field.get(obj));
                list2 = Arrays.asList((WindowManager.LayoutParams[]) this.e.get(this.c));
            } else {
                list = (List) field.get(obj);
                list2 = (List) this.e.get(this.c);
            }
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new Model((View) list.get(i), (WindowManager.LayoutParams) list2.get(i)));
            }
            return arrayList;
        } catch (IllegalAccessException | RuntimeException unused) {
            return null;
        }
    }
}
