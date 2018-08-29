/**
 * Outputs a vertical Sine wave to the console.
 * 
 * @author Michael McMullin.
 *
 */
public class SineWaveV1 {
    public static void main(String[] args) {
        for (double x = 0; x < 4 * Math.PI; x += 0.1) {
            System.out.println(getGraphLine(Math.sin(x)));
        }
    }

    public static final int COLUMNS = 80;

    /**
     * Draw a single line to the console.
     * 
     * @param value
     *            Number between -1 and 1
     * @return
     */
    public static String getGraphLine(double value) {
        int spaces = (int) ((value + 1) * (COLUMNS - 1)) / 2;
        String output = "";
        
        for (int i = 0; i < spaces; i++) {
            output += " ";
        }
        return output + "#";
    }
}
