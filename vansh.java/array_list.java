import java.util.ArrayList;
import java.util.Scanner;

public class array_list {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
// Syntax
ArrayList<Integer> list = new ArrayList<>(1);
// add values
list.add(56);
System.out.println(list);
list.set(0, 100);
list.remove(0);
System.out.println(list);

for(int i=0;i<5;i++)
list.add(s.nextInt());
for(int j=0; j<5;j++)
System.out.print(list.get(j)+" ");
}
// list[index] will not work here
}
