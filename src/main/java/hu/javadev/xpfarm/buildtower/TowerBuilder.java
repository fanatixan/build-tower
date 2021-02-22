package hu.javadev.xpfarm.buildtower;

import java.util.ArrayList;
import java.util.List;

public class TowerBuilder {

    public List<String> build(int numberOfLevels) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= numberOfLevels; i++) {
            final int marginWidth = (toWidth(numberOfLevels) - toLevelWidth(i)) / 2;
            final String level = " ".repeat(marginWidth) + "*".repeat(toLevelWidth(i)) + " ".repeat(marginWidth);
            result.add(level);
        }
        return result;
    }

    private int toLevelWidth(int level) {
        return level * (level + 1) / 2;
    }

    private int toWidth(int numberOfLevels) {
        return numberOfLevels * 2 - 1;
    }

}
