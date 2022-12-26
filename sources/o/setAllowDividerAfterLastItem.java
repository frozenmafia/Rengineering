package o;

import android.content.Context;
import o.PreferenceFragment;
/* loaded from: classes7.dex */
public class setAllowDividerAfterLastItem extends androidx.appcompat.view.menu.SubMenuBuilder {
    public setAllowDividerAfterLastItem(Context context, PreferenceFragment.DividerDecoration dividerDecoration, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        super(context, dividerDecoration, menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((androidx.appcompat.view.menu.MenuBuilder) getParentMenu()).onItemsChanged(z);
    }
}
