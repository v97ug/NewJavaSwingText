package code.keydown;

public class KeyDown {
    private static boolean releaseUp = true;
    private static boolean releaseDown = true;

    public static boolean isUp() {
        if (Key.up) {
            if (releaseUp) {
                releaseUp = false;
                return true;
            } else {
                return false;
            }
        } else {
            releaseUp = true;
            return false;
        }
    }

    public static boolean isDown() {
        if (Key.down) {
            if (releaseDown) {
                releaseDown = false;
                return true;
            } else {
                return false;
            }
        } else {
            releaseDown = true;
            return false;
        }
    }
}
