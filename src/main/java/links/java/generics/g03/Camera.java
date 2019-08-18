package links.java.generics.g03;

import org.jetbrains.annotations.NotNull;

public class Camera extends Product<Camera> {
    int pixels;

    @Override
    int subCompare(@NotNull Camera camera) {
        return Integer.compare(this.pixels, camera.pixels);
    }
}
