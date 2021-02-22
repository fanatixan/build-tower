package hu.javadev.xpfarm.buildtower;

import java.util.ArrayList;
import java.util.List;

public class TowerBuilder {

    public List<String> build(int numberOfLevels) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= numberOfLevels; i++) {
            final int marginWidth = toMarginWidth(numberOfLevels, i);
            final String level = " ".repeat(marginWidth) + "*".repeat(toLevelWidth(i)) + " ".repeat(marginWidth);
            result.add(level);
        }
        return result;
    }

    private int toMarginWidth(int numberOfLevels, int level) {
        return (toWidth(numberOfLevels) - toLevelWidth(level)) / 2;
    }

    private int toLevelWidth(int level) {
        return level * (level + 1) / 2;
    }

    private int toWidth(int numberOfLevels) {
        return numberOfLevels * 2 - 1;
    }

}
