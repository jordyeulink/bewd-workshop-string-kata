public class StringCalculator {

    public int add(String numbers){
        int som = 0;
        if(numbers != "") {
            String[] stringlist = numbers.split(",");
            for (String string : stringlist) {
                som += Integer.parseInt(string);
            }
            return som;
        } else {
            return 0;
        }
    }
}
