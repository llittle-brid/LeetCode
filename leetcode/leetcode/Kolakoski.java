import java.util.*;

public class Kolakoski {
    public static void main(String[] args) {
        Scanner fin=new Scanner(System.in);
        int n=fin.nextInt(),m=fin.nextInt();
        Queue<Integer> queue=new LinkedList<>();
        for (int i=0;i<m;i++)
        {
          queue.add(fin.nextInt());
        }
        List<Integer> lazyList=new LinkedList<>();
        List<Integer> fastList=new LinkedList<>();
        int num=queue.peek();
        lazyList.add(num);
        while (n>0)
        {
            int time=lazyList.get(lazyList.size()-1);
            num=queue.remove();
            for (int i=0;i<time;i++)
            {
                fastList.add(num);
                if (n--!=0)
                System.out.println(num);
                else break;
            }
            if(fastList.size()!=lazyList.size())
            lazyList.add(fastList.get(lazyList.size()));
            else {lazyList.add(num=queue.remove());}
            queue.add(num);

        }
    }
}
