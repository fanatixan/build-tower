package hu.javadev.xpfarm.buildtower;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TowerBuilderTest {

    private TowerBuilder towerBuilder;

    @BeforeEach
    void setup() {
        towerBuilder = new TowerBuilder();
    }

    @Test
    void givenOneLevel_build_shouldReturnOneSizeList() {
        // given
        int numberOfLevels = 1;

        // when
        towerBuilder.build(numberOfLevels);
    }

}
