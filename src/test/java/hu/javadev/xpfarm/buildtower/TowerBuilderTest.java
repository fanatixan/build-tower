package hu.javadev.xpfarm.buildtower;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TowerBuilderTest {

    private TowerBuilder towerBuilder;

    @BeforeEach
    void setup() {
        towerBuilder = new TowerBuilder();
    }

    @Test
    @DisplayName("given one level tower list should have one element")
    void givenOneLevel_build_shouldReturnOneSizeList() {
        // given
        int numberOfLevels = 1;

        // when
        List<String> tower = towerBuilder.build(numberOfLevels);

        // then
        assertThat(tower).hasSize(1);
    }

}
