public class CountingSheeps {
    public static void main(String[] args) {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        System.out.println(countSheep(array1));

    }
    public static int countSheep(Boolean[] arrayOfSheeps){
        
//        Question : https://www.codewars.com/kata/54edbc7200b811e956000556/java

        int totalSheeps = 0;

        for (Boolean sheep : arrayOfSheeps) {
            if(sheep != null && sheep){
                totalSheeps++;
            }
        }

        return totalSheeps;
    }
}
