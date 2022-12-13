
import java.util.Arrays;

public class Datatype {

    public static void main(String[] args) {

        System.out.print("the sum of these number is");
        int num1 = 8;
        int num2 = 89;
        int num3 = 7;
        int sum = num1 + num2 + num3;
        System.out.println(sum);


        float myFloatNum = 5.99f;
        char myLetter = 'D';   //character
        boolean myBool = true;
        String myText = "Unshool";
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
        byte age = 15;
        //non primitive datatype
        System.out.println(age);
        String name1 = "sayam";
        String name2 = "vansh";
        String name3 = name1 + name2;
        System.out.println(name3);
        String name = "AMAN";
        System.out.println(name.charAt(0));
        String name4 = name.replace('A', 'V');
        System.out.println(name4);
        System.out.println(name.substring(0, 3));
        System.out.println(name.length());
        //ARRAYS//
        int[] marks = new int[3];
        marks[0] = 99;
        marks[1] = 88;
        marks[2] = 34;

        System.out.println(marks[2]);
        //length of array
        System.out.println(marks.length);
        //sort
        Arrays.sort(marks);
        System.out.println(marks[2]);
        //2d array
        int[][] class12 = {{97, 90, 99} , {98 , 86 ,45}};
        System.out.println(class12[0][1]);
        //CASTING



    }


    }





