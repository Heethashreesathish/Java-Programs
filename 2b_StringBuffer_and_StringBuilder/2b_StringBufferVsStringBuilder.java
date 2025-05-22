/*Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/
public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        final int iterations = 10000;
        String text = "AIET";

        // StringBuffer Test
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }

        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");

        // StringBuilder Test
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }

        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

        // Justification
        System.out.println();
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder (rare case).");
        }

        System.out.println("Note: StringBuilder is generally faster because it is not synchronized, unlike StringBuffer which is thread-safe (synchronized).");
    }
}
