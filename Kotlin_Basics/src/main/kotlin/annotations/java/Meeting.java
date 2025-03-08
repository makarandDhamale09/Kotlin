package annotations.java;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Meeting {
    private String title;

    public @Nullable String meetingTitle() {
        return title;
    }

    public void addTitle(@NotNull String title) {
        this.title = title;
    }

    public String titleCanBeNull(){
        return title;
    }
}
