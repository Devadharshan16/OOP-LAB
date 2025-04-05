import mathutils.PatternGenerator;

public class TestPatternGenerator {
    public static void main(String[] args) {
        PatternGenerator generator = new PatternGenerator();

        System.out.println("Pyramid Pattern:");
        generator.generatePyramid(5);

        System.out.println("\nReverse Pyramid Pattern:");
        generator.generateReversePyramid(5);

        System.out.println("\nNumber Triangle Pattern:");
        generator.generateNumberTriangle(5);
    }
}
