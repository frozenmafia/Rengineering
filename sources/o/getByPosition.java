package o;

import o.TileList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class getByPosition {
    private static final TileList.Tile<?> toString = new ViewBoundsCheck();
    private static final TileList.Tile<?> ag$a = values();

    getByPosition() {
    }

    private static TileList.Tile<?> values() {
        try {
            return (TileList.Tile) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TileList.Tile<?> valueOf() {
        TileList.Tile<?> tile = ag$a;
        if (tile != null) {
            return tile;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
