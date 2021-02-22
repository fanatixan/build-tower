package hu.javadev.xpfarm.buildtower;

import java.util.ArrayList;
import java.util.List;

public class TowerBuilder {

    public List<String> build(int numberOfLevels) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= numberOfLevels; i++) {
            final int marginWidth = marginWidth(numberOfLevels, i);
            final String level = " ".repeat(marginWidth) + "*".repeat(levelWidth(i)) + " ".repeat(marginWidth);
            result.add(level);
        }
        return result;
    }

    private int marginWidth(int numberOfLevels, int level) {
        return (width(numberOfLevels) - levelWidth(level)) / 2;
    }

    private int levelWidth(int level) {
        return level * (level + 1) / 2;
    }

    private int width(int numberOfLevels) {
        return numberOfLevels * 2 - 1;
    }

}
