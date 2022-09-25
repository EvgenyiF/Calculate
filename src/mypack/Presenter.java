package mypack;

import java.io.IOException;

public class Presenter {
    public static void start() throws IOException {
        View view = new View();
        view.view();

    }
}
