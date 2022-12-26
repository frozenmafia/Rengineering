package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import o.Styleable;
import o.Transition;
import o.invalidateChildInParent;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class MenuKt {
    public static final MenuItem get(Menu menu, int i) {
        runAnimators.ag$a(menu, "<this>");
        MenuItem item = menu.getItem(i);
        runAnimators.ah$a(item, "getItem(index)");
        return item;
    }

    public static final boolean contains(Menu menu, MenuItem menuItem) {
        runAnimators.ag$a(menu, "<this>");
        runAnimators.ag$a(menuItem, "item");
        int size = menu.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (runAnimators.values(menu.getItem(i), menuItem)) {
                    return true;
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        runAnimators.ag$a(menu, "<this>");
        runAnimators.ag$a(menuItem, "item");
        menu.removeItem(menuItem.getItemId());
    }

    public static final int getSize(Menu menu) {
        runAnimators.ag$a(menu, "<this>");
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        runAnimators.ag$a(menu, "<this>");
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(Menu menu) {
        runAnimators.ag$a(menu, "<this>");
        return menu.size() != 0;
    }

    public static final void forEach(Menu menu, Styleable.ChangeBounds<? super MenuItem, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(menu, "<this>");
        runAnimators.ag$a(changeBounds, "action");
        int size = menu.size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            MenuItem item = menu.getItem(i);
            runAnimators.ah$a(item, "getItem(index)");
            changeBounds.invoke(item);
            if (i2 >= size) {
                return;
            }
            i = i2;
        }
    }

    public static final void forEachIndexed(Menu menu, Transition<? super Integer, ? super MenuItem, setAnimationMatrix> transition) {
        runAnimators.ag$a(menu, "<this>");
        runAnimators.ag$a(transition, "action");
        int size = menu.size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            MenuItem item = menu.getItem(i);
            runAnimators.ah$a(item, "getItem(index)");
            transition.invoke(Integer.valueOf(i), item);
            if (i2 >= size) {
                return;
            }
            i = i2;
        }
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        runAnimators.ag$a(menu, "<this>");
        return new MenuKt$iterator$1(menu);
    }

    public static final invalidateChildInParent<MenuItem> getChildren(final Menu menu) {
        runAnimators.ag$a(menu, "<this>");
        return new invalidateChildInParent<MenuItem>() { // from class: androidx.core.view.MenuKt$children$1
            @Override // o.invalidateChildInParent
            public Iterator<MenuItem> iterator() {
                return MenuKt.iterator(menu);
            }
        };
    }
}
