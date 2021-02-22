package hu.javadev.xpfarm.buildtower;

import java.util.ArrayList;
import java.util.List;

public class TowerBuilder {

    public List<String> build(int numberOfLevels) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < numberOfLevels; i++) {
            result.add("*");
        }
        return result;
    }

}
