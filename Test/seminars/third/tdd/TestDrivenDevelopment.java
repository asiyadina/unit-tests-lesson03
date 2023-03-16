package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestDrivenDevelopment {

    /**
     * Нужно написать (TDD) класс MoodAnalyser, который оценивает фразы по настроению
     */
    @Test
    void testMoodAnalysisHappy() {
        ModuleLay er moduleLayer = new ModuleLayer();
        String str = "хорошее настроение";
        assertThat(testMoodAnalyser.analyze(str).isEqualTo("Happy"));
    }
    @Test
    void testMoodAnalysisSad() {
        ModuleLay er moduleLayer = new ModuleLayer();
        String str = "плохое настроение";
        assertThat(testMoodAnalyser.analyze(str).isEqualTo("sad"));
    }
    @Test
    void testMoodAnalysisSoso() {
        ModuleLay er moduleLayer = new ModuleLayer();
        String str = "нейтральное настроение";
        assertThat(testMoodAnalyser.analyze(str).isEqualTo("so so"));
    }

}