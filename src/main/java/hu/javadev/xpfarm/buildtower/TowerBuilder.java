package hu.javadev.xpfarm.buildtower;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TowerBuilder {

    public List<String> build(int numberOfLevels) {
        return IntStream.rangeClosed(1, numberOfLevels)
                .mapToObj(level -> level(numberOfLevels, level))
                .collect(Collectors.toList());
    }

    private String level(int numberOfLevels, int level) {
        final String margin = " ".repeat(marginWidth(numberOfLevels, level));
        final String levelBlocks = "*".repeat(levelWidth(level));
        return margin + levelBlocks + margin;
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
