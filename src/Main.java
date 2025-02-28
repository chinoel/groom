import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Random random = new Random();

        int randomNumber1 = random.nextInt(20, 45);
        System.out.println(randomNumber1);

        int randomNumber2 = random.nextInt(-128, 127);
        System.out.println(randomNumber2);
    }
}
