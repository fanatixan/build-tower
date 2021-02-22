package hu.javadev.xpfarm.buildtower;

import java.util.ArrayList;
import java.util.List;

public class TowerBuilder {

    public List<String> build(int numberOfLevels) {
        final int width = numberOfLevels * 2 - 1;
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= numberOfLevels; i++) {
            final int levelWidth = i * (i + 1) / 2;
            final int marginWidth = (width - levelWidth) / 2;
            final String level = " ".repeat(marginWidth) + "*".repeat(levelWidth) + " ".repeat(marginWidth);
            result.add(level);
        }
        return result;
    }

}
