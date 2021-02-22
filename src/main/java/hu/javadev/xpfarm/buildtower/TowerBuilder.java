package hu.javadev.xpfarm.buildtower;

import java.util.ArrayList;
import java.util.List;

public class TowerBuilder {

    public List<String> build(int numberOfLevels) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= numberOfLevels; i++) {
            final String level = level(numberOfLevels, i);
            result.add(level);
        }
        return result;
    }

    private String level(int numberOfLevels, int level) {
        return " ".repeat(marginWidth(numberOfLevels, level)) + "*".repeat(levelWidth(level)) + " ".repeat(marginWidth(numberOfLevels, level));
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
