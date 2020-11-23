package module01.lesson9_string.string;

/**
 * Класс StringBuilderClass	
 *
 * @author Kamila Meshcheryakova	
 * created 02.08.2020	
 */
public class StringBuilderClass {
    public static void main(String[] args) {
        // 6.2. Методы StringBuilder те же, что и у StringBuffer	

        /* Удалить символ	
        deleteCharAt (int index): удаляет символ с указанным индексом index	
         */
        StringBuilder strCh = new StringBuilder();
        strCh.append("ADC-DRF");
        strCh.deleteCharAt(3);
        System.out.println("strCh= " + strCh);  // strCh= ADCDRF	

        /* Заменить подстроку	
        replace (int begin, int end, String str): удаляет символы из строки, начиная с индекса begin  до индекса end-1	
        и вставляет вместо них строку str	
         */
        StringBuilder strCh2 = new StringBuilder();
        strCh2.append("ADC-DRF");
        String str3 = "- буквы английского алфавита";
        strCh2.replace(3, 7, str3);
        System.out.println("strCh= " + strCh2);  // strCh2 =ADC- буквы английского алфавита	

        /* Обратный порядок в строке	
        reverse(): меняет порядок в StringBuffer на обратный	
         */
        StringBuilder builder = new StringBuilder("ABCDEFGHJKLMN");
        System.out.println(builder.reverse().toString()); // NMLKJHGFEDCBA	

        // substring(): обрезает строку по заданным индексам	
        StringBuilder builder1 = new StringBuilder(builder);
        System.out.println(builder1.substring(3,8)); // KJHGF	
    }
}